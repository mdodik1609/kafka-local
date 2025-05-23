package com.example.consumer.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubscriberOption {

    @JsonProperty("SubscriberId")
    private String subscriberId;

    @JsonProperty("OptionId")
    private String optionId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonProperty("ActivationDate")
    private String activationDate; // Or LocalDateTime if you prefer to work with Java 8 Date/Time API

    @JsonProperty("ActivationCount")
    private Integer activationCount;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.S")
    @JsonProperty("ExpiryDate")
    private String expiryDate; // Or LocalDateTime

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonProperty("ToBeDeactivatedDate")
    private String toBeDeactivatedDate; // Or LocalDateTime

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonProperty("DeactivationDate")
    private String deactivationDate; // Or LocalDateTime

    @JsonProperty("ToBeDeactivated")
    private Boolean toBeDeactivated;

    @JsonProperty("Deactivated")
    private Boolean deactivated;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonProperty("LastCounterResetDate")
    private String lastCounterResetDate; // Or LocalDateTime

    @JsonProperty("DiscountTypeName")
    private String discountTypeName;

    @JsonProperty("DiscountTypeId")
    private Integer discountTypeId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonProperty("LastSmsNotificationDate")
    private String lastSmsNotificationDate; // Or LocalDateTime

    @JsonProperty("PendingExpirationNotificationSent")
    private Boolean pendingExpirationNotificationSent;

    @JsonProperty("PassedExpirationNotificationSent")
    private Boolean passedExpirationNotificationSent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonProperty("DelayedActivationTimestamp")
    private String delayedActivationTimestamp; // Or LocalDateTime

    @JsonProperty("SilentHandling")
    private Boolean silentHandling;

    @JsonProperty("schema_in")
    private String schemaIn;

    @JsonProperty("table")
    private String table;

    @JsonProperty("operation_type")
    private String operationType;

    @JsonProperty("operation_type_num")
    private String operationTypeNum;

    @JsonProperty("conn_str")
    private String connStr;

    @JsonProperty("start_lsn")
    private String startLsn;

    @JsonProperty("seq_value")
    private String seqValue;

    @JsonProperty("update_mask")
    private String updateMask;

    @JsonProperty("schema")
    private String schema;

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public Integer getActivationCount() {
        return activationCount;
    }

    public void setActivationCount(Integer activationCount) {
        this.activationCount = activationCount;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getToBeDeactivatedDate() {
        return toBeDeactivatedDate;
    }

    public void setToBeDeactivatedDate(String toBeDeactivatedDate) {
        this.toBeDeactivatedDate = toBeDeactivatedDate;
    }

    public String getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(String deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public Boolean getToBeDeactivated() {
        return toBeDeactivated;
    }

    public void setToBeDeactivated(Boolean toBeDeactivated) {
        this.toBeDeactivated = toBeDeactivated;
    }

    public Boolean getDeactivated() {
        return deactivated;
    }

    public void setDeactivated(Boolean deactivated) {
        this.deactivated = deactivated;
    }

    public String getLastCounterResetDate() {
        return lastCounterResetDate;
    }

    public void setLastCounterResetDate(String lastCounterResetDate) {
        this.lastCounterResetDate = lastCounterResetDate;
    }

    public String getDiscountTypeName() {
        return discountTypeName;
    }

    public void setDiscountTypeName(String discountTypeName) {
        this.discountTypeName = discountTypeName;
    }

    public Integer getDiscountTypeId() {
        return discountTypeId;
    }

    public void setDiscountTypeId(Integer discountTypeId) {
        this.discountTypeId = discountTypeId;
    }

    public String getLastSmsNotificationDate() {
        return lastSmsNotificationDate;
    }

    public void setLastSmsNotificationDate(String lastSmsNotificationDate) {
        this.lastSmsNotificationDate = lastSmsNotificationDate;
    }

    public Boolean getPendingExpirationNotificationSent() {
        return pendingExpirationNotificationSent;
    }

    public void setPendingExpirationNotificationSent(Boolean pendingExpirationNotificationSent) {
        this.pendingExpirationNotificationSent = pendingExpirationNotificationSent;
    }

    public Boolean getPassedExpirationNotificationSent() {
        return passedExpirationNotificationSent;
    }

    public void setPassedExpirationNotificationSent(Boolean passedExpirationNotificationSent) {
        this.passedExpirationNotificationSent = passedExpirationNotificationSent;
    }

    public String getDelayedActivationTimestamp() {
        return delayedActivationTimestamp;
    }

    public void setDelayedActivationTimestamp(String delayedActivationTimestamp) {
        this.delayedActivationTimestamp = delayedActivationTimestamp;
    }

    public Boolean getSilentHandling() {
        return silentHandling;
    }

    public void setSilentHandling(Boolean silentHandling) {
        this.silentHandling = silentHandling;
    }

    public String getSchemaIn() {
        return schemaIn;
    }

    public void setSchemaIn(String schemaIn) {
        this.schemaIn = schemaIn;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationTypeNum() {
        return operationTypeNum;
    }

    public void setOperationTypeNum(String operationTypeNum) {
        this.operationTypeNum = operationTypeNum;
    }

    public String getConnStr() {
        return connStr;
    }

    public void setConnStr(String connStr) {
        this.connStr = connStr;
    }

    public String getStartLsn() {
        return startLsn;
    }

    public void setStartLsn(String startLsn) {
        this.startLsn = startLsn;
    }

    public String getSeqValue() {
        return seqValue;
    }

    public void setSeqValue(String seqValue) {
        this.seqValue = seqValue;
    }

    public String getUpdateMask() {
        return updateMask;
    }

    public void setUpdateMask(String updateMask) {
        this.updateMask = updateMask;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}