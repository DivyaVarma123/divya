
package com.mrcubes.admin.jsontopojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "modelId",
    "channel",
    "tenantId",
    "transactionId",
    "userId",
    "firstName",
    "lastName",
    "userName",
    "mobileNo",
    "desingnation",
    "primaryMailId",
    "secondaryMailId"
})
public class UserRequestPojo {

    @JsonProperty("modelId")
    private Object modelId;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("tenantId")
    private String tenantId;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("userId")
    private Object userId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("mobileNo")
    private String mobileNo;
    @JsonProperty("desingnation")
    private String desingnation;
    @JsonProperty("primaryMailId")
    private String primaryMailId;
    @JsonProperty("secondaryMailId")
    private String secondaryMailId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("modelId")
    public Object getModelId() {
        return modelId;
    }

    @JsonProperty("modelId")
    public void setModelId(Object modelId) {
        this.modelId = modelId;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("tenantId")
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("userId")
    public Object getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("mobileNo")
    public String getMobileNo() {
        return mobileNo;
    }

    @JsonProperty("mobileNo")
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @JsonProperty("desingnation")
    public String getDesingnation() {
        return desingnation;
    }

    @JsonProperty("desingnation")
    public void setDesingnation(String desingnation) {
        this.desingnation = desingnation;
    }

    @JsonProperty("primaryMailId")
    public String getPrimaryMailId() {
        return primaryMailId;
    }

    @JsonProperty("primaryMailId")
    public void setPrimaryMailId(String primaryMailId) {
        this.primaryMailId = primaryMailId;
    }

    @JsonProperty("secondaryMailId")
    public String getSecondaryMailId() {
        return secondaryMailId;
    }

    @JsonProperty("secondaryMailId")
    public void setSecondaryMailId(String secondaryMailId) {
        this.secondaryMailId = secondaryMailId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("modelId", modelId).append("channel", channel).append("tenantId", tenantId).append("transactionId", transactionId).append("userId", userId).append("firstName", firstName).append("lastName", lastName).append("userName", userName).append("mobileNo", mobileNo).append("desingnation", desingnation).append("primaryMailId", primaryMailId).append("secondaryMailId", secondaryMailId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(primaryMailId).append(lastName).append(desingnation).append(modelId).append(channel).append(mobileNo).append(userName).append(userId).append(secondaryMailId).append(transactionId).append(firstName).append(tenantId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserRequestPojo) == false) {
            return false;
        }
        UserRequestPojo rhs = ((UserRequestPojo) other);
        return new EqualsBuilder().append(primaryMailId, rhs.primaryMailId).append(lastName, rhs.lastName).append(desingnation, rhs.desingnation).append(modelId, rhs.modelId).append(channel, rhs.channel).append(mobileNo, rhs.mobileNo).append(userName, rhs.userName).append(userId, rhs.userId).append(secondaryMailId, rhs.secondaryMailId).append(transactionId, rhs.transactionId).append(firstName, rhs.firstName).append(tenantId, rhs.tenantId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
