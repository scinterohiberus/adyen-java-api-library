/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.PaymentInstrumentNotificationData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PaymentNotificationRequest
 */
@JsonPropertyOrder({
  PaymentNotificationRequest.JSON_PROPERTY_DATA,
  PaymentNotificationRequest.JSON_PROPERTY_ENVIRONMENT,
  PaymentNotificationRequest.JSON_PROPERTY_TYPE
})

public class PaymentNotificationRequest {
  public static final String JSON_PROPERTY_DATA = "data";
  private PaymentInstrumentNotificationData data;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  /**
   * Type of webhook.
   */
  public enum TypeEnum {
    CREATED("balancePlatform.paymentInstrument.created"),
    
    UPDATED("balancePlatform.paymentInstrument.updated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public PaymentNotificationRequest() { 
  }

  public PaymentNotificationRequest data(PaymentInstrumentNotificationData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentInstrumentNotificationData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(PaymentInstrumentNotificationData data) {
    this.data = data;
  }


  public PaymentNotificationRequest environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "The environment from which the webhook originated.  Possible values: **test**, **live**.")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public PaymentNotificationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of webhook.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of webhook.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this PaymentNotificationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentNotificationRequest paymentNotificationRequest = (PaymentNotificationRequest) o;
    return Objects.equals(this.data, paymentNotificationRequest.data) &&
        Objects.equals(this.environment, paymentNotificationRequest.environment) &&
        Objects.equals(this.type, paymentNotificationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, environment, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentNotificationRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of PaymentNotificationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentNotificationRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentNotificationRequest
   */
  public static PaymentNotificationRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentNotificationRequest.class);
  }
/**
  * Convert an instance of PaymentNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

