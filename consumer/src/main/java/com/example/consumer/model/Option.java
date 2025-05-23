package com.example.consumer.model;

public class Option {
    private String optionId;
    private String option;

    public Option() {}

    public Option(String optionId, String option) {
        this.optionId = optionId;
        this.option = option;
    }

    public String getOptionId() { return optionId; }
    public void setOptionId(String optionId) { this.optionId = optionId; }

    public String getOption() { return option; }
    public void setOption(String option) { this.option = option; }
}