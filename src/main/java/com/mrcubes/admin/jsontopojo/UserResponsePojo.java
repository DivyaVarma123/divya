
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
    "responseCode",
    "errorCode"
})
public class UserResponsePojo {

    @JsonProperty("modelId")
    private Object modelId;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("tenantId")
    private Object tenantId;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("responseCode")
    private String responseCode;
    @JsonProperty("errorCode")
    private Object errorCode;
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
    public Object getTenantId() {
        return tenantId;
    }

    @JsonProperty("tenantId")
    public void setTenantId(Object tenantId) {
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

    @JsonProperty("responseCode")
    public String getResponseCode() {
        return responseCode;
    }

    @JsonProperty("responseCode")
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    @JsonProperty("errorCode")
    public Object getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
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
        return new ToStringBuilder(this).append("modelId", modelId).append("channel", channel).append("tenantId", tenantId).append("transactionId", transactionId).append("responseCode", responseCode).append("errorCode", errorCode).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(modelId).append(channel).append(tenantId).append(errorCode).append(additionalProperties).append(transactionId).append(responseCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserResponsePojo) == false) {
            return false;
        }
        UserResponsePojo rhs = ((UserResponsePojo) other);
        return new EqualsBuilder().append(modelId, rhs.modelId).append(channel, rhs.channel).append(tenantId, rhs.tenantId).append(errorCode, rhs.errorCode).append(additionalProperties, rhs.additionalProperties).append(transactionId, rhs.transactionId).append(responseCode, rhs.responseCode).isEquals();
    }

}
