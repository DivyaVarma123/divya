
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
    "channel",
    "transationId",
    "userName",
    "password"
})
public class LogInRequestPojo {

    @JsonProperty("modelId")
    private Object modelId;
    @JsonProperty("tenentId")
    private Object tenentId;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("transationId")
    private String transationId;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("password")
    private String password;
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

    @JsonProperty("tenentId")
    public Object getTenentId() {
        return tenentId;
    }

    @JsonProperty("tenentId")
    public void setTenentId(Object tenentId) {
        this.tenentId = tenentId;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("transationId")
    public String getTransactionId() {
        return transationId;
    }

    @JsonProperty("transationId")
    public void setTransationId(String transationId) {
        this.transationId = transationId;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
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
        return new ToStringBuilder(this).append("modelId", modelId).append("tenentId", tenentId).append("channel", channel).append("transationId", transationId).append("userName", userName).append("password", password).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(password).append(modelId).append(channel).append(transationId).append(additionalProperties).append(tenentId).append(userName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogInRequestPojo) == false) {
            return false;
        }
        LogInRequestPojo rhs = ((LogInRequestPojo) other);
        return new EqualsBuilder().append(password, rhs.password).append(modelId, rhs.modelId).append(channel, rhs.channel).append(transationId, rhs.transationId).append(additionalProperties, rhs.additionalProperties).append(tenentId, rhs.tenentId).append(userName, rhs.userName).isEquals();
    }

}
