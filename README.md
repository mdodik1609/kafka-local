# Kafka Microservices Demo

This project contains two Spring Boot microservices communicating via Apache Kafka:

- **kafka-producer**: Sends messages to a Kafka topic.
- **kafka-consumer**: Listens to the topic, transforms messages, and forwards them to another topic.

> Both services use Gradle and JDK 21.

---

## 📁 Project Structure

```
.
├── kafka-producer/         # Producer microservice
├── kafka-consumer/         # Consumer microservice
└── docker-compose.yml      # Kafka + Zookeeper services
```

---

## 🔧 Requirements

- Java 21
- Gradle (v8+)
- Docker (for Kafka setup)

---

## 🐳 Start Kafka

Use the provided Docker Compose setup:

```bash
docker-compose up -d
```

This will start:
- Kafka on `localhost:9092`
- Zookeeper on `localhost:2181`

---

## ▶️ Start the Microservices

Each microservice must be started individually from its root directory.

### Start Producer

```bash
cd kafka-producer
./gradlew bootRun
```

Runs on `http://localhost:8080`

---

### Start Consumer

```bash
cd kafka-consumer
./gradlew bootRun
```

Runs on `http://localhost:8081` *(not exposed but logs transformation)*

---

## 📤 Send a Test Message

Send a JSON message to the **producer**, which will publish it to Kafka:

```bash
curl -X POST "http://localhost:8080/api/messages" \
  -H "Content-Type: application/json" \
  -d '{
    "uuid": 1,
    "type": "UPDATE",
    "name": "Dinamo",
    "other": "other"
}'
```

---

## 🔁 What Happens

1. **Producer** sends the message to Kafka topic `demo-topic`.
2. **Consumer** listens to `demo-topic`.
3. On receiving a message, the **consumer** transforms it:
    - From:
      ```json
      { "uuid": 1, "type": "UPDATE", "name": "Dinamo", "other": "other" }
      ```
    - To:
      ```json
      { "uuid": 1, "action": "UPDATE", "firstName": "Dinamo" }
      ```
4. Then it publishes the transformed message to Kafka topic `demo-topic-core`.

You should see the transformed message logged in the **consumer** console.

---

## ✅ Verification (Optional)

To verify `demo-topic-core`, you can:
- Add a new Kafka listener in the consumer for `demo-topic-core`
- Use a Kafka UI tool like:
  - [Kafka UI](https://github.com/provectus/kafka-ui)
  - [Kafdrop](https://github.com/obsidiandynamics/kafdrop)
  - [AKHQ](https://akhq.io/)

---

## 🧹 Cleanup

To stop everything:

```bash
docker-compose down
```

---

## 📄 License

MIT
