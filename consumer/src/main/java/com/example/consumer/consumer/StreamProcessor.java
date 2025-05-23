package com.example.consumer.consumer;

import com.example.consumer.model.Option;
import com.example.consumer.model.Subscriber;
import com.example.consumer.model.SubscriberOption;
import com.example.consumer.model.SubscriberOptionDto;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.support.serializer.JsonSerde;

@Configuration
@EnableKafkaStreams
public class StreamProcessor {

    @Bean
    public KStream<String, SubscriberOption> process(StreamsBuilder builder) {
        JsonSerde<Subscriber> subscriberSerde = new JsonSerde<>(Subscriber.class);
        JsonSerde<Option> optionSerde = new JsonSerde<>(Option.class);
        JsonSerde<SubscriberOption> subscriberOptionSerde = new JsonSerde<>(SubscriberOption.class);
        Serde<SubscriberOptionDto> dtoSerde = new JsonSerde<>(SubscriberOptionDto.class);

        KTable<String, Subscriber> subscribers = builder.table(
                "subs_in",
                Consumed.with(Serdes.String(), subscriberSerde)
        );

        KTable<String, Option> options = builder.table(
                "opt_int",
                Consumed.with(Serdes.String(), optionSerde)
        );

        KStream<String, SubscriberOption> inputStream = builder.stream(
                "Bonbon_in",
                Consumed.with(Serdes.String(), subscriberOptionSerde)
        );

        KStream<String, Object> enriched = inputStream
                .selectKey((k, v) -> v.getSubscriberId())
                .join(subscribers, (subscriberOption, subscriber) -> {
                    SubscriberOptionDto dto = new SubscriberOptionDto();
                    dto.setSubscriberId(subscriberOption.getSubscriberId());
                    dto.setSubscription(subscriber != null ? subscriber.getSubscription() : null);
                    dto.setOption(null);
                    return dto;
                })
                .selectKey((k, dto) -> k)
                .join(options, (dto, option) -> {
                    if (option != null) {
                        dto.setOption(option.getOption());
                    }
                    return dto;
                });
        Produced produced = Produced.with(Serdes.String(), dtoSerde);
        enriched.to("cd-core-topic", produced);

        return inputStream;
    }
}
