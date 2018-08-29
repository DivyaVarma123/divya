
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
    "tenentId",
    "transactionId",
    "errorCode",
    "responCode"
})
public class LogInResponsePojo {

    @JsonProperty("modelId")
    private Integer modelId;
    @JsonProperty("tenentId")
    private Integer tenentId;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("responCode")
    private String responCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("modelId")
    public Integer getModelId() {
        return modelId;
    }

    @JsonProperty("modelId")
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @JsonProperty("tenentId")
    public Integer getTenentId() {
        return tenentId;
    }

    @JsonProperty("tenentId")
    public void setTenentId(Integer tenentId) {
        this.tenentId = tenentId;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("responCode")
    public String getResponCode() {
        return responCode;
    }

    @JsonProperty("responCode")
    public void setResponCode(String responCode) {
        this.responCode = responCode;
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
        return new ToStringBuilder(this).append("modelId", modelId).append("tenentId", tenentId).append("transactionId", transactionId).append("errorCode", errorCode).append("responCode", responCode).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responCode).append(modelId).append(errorCode).append(additionalProperties).append(tenentId).append(transactionId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogInResponsePojo) == false) {
            return false;
        }
        LogInResponsePojo rhs = ((LogInResponsePojo) other);
        return new EqualsBuilder().append(responCode, rhs.responCode).append(modelId, rhs.modelId).append(errorCode, rhs.errorCode).append(additionalProperties, rhs.additionalProperties).append(tenentId, rhs.tenentId).append(transactionId, rhs.transactionId).isEquals();
    }

}
