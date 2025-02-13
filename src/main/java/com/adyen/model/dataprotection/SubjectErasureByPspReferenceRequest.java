/*
 * Adyen Data Protection API
 * Adyen Data Protection API provides a way for you to process [Subject Erasure Requests](https://gdpr-info.eu/art-17-gdpr/) as mandated in GDPR.  Use our API to submit a request to delete shopper's data, including payment details and other related information (for example, delivery address or shopper email).## Authentication Each request to the Data Protection API must be signed with an API key. Get your API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate a new API Key to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Data Protection Service API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://ca-test.adyen.com/ca/services/DataProtectionService/v1/requestSubjectErasure ```
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.dataprotection;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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
 * SubjectErasureByPspReferenceRequest
 */
@JsonPropertyOrder({
  SubjectErasureByPspReferenceRequest.JSON_PROPERTY_FORCE_ERASURE,
  SubjectErasureByPspReferenceRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  SubjectErasureByPspReferenceRequest.JSON_PROPERTY_PSP_REFERENCE
})

public class SubjectErasureByPspReferenceRequest {
  public static final String JSON_PROPERTY_FORCE_ERASURE = "forceErasure";
  private Boolean forceErasure;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public SubjectErasureByPspReferenceRequest() { 
  }

  public SubjectErasureByPspReferenceRequest forceErasure(Boolean forceErasure) {
    this.forceErasure = forceErasure;
    return this;
  }

   /**
   * Set this to **true** if you want to delete shopper-related data, even if the shopper has an existing recurring transaction. This only deletes the shopper-related data for the specific payment, but does not cancel the existing recurring transaction.
   * @return forceErasure
  **/
  @ApiModelProperty(value = "Set this to **true** if you want to delete shopper-related data, even if the shopper has an existing recurring transaction. This only deletes the shopper-related data for the specific payment, but does not cancel the existing recurring transaction.")
  @JsonProperty(JSON_PROPERTY_FORCE_ERASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForceErasure() {
    return forceErasure;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_ERASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceErasure(Boolean forceErasure) {
    this.forceErasure = forceErasure;
  }


  public SubjectErasureByPspReferenceRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * Your merchant account
   * @return merchantAccount
  **/
  @ApiModelProperty(value = "Your merchant account")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public SubjectErasureByPspReferenceRequest pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The PSP reference of the payment. We will delete all shopper-related data for this payment.
   * @return pspReference
  **/
  @ApiModelProperty(value = "The PSP reference of the payment. We will delete all shopper-related data for this payment.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  /**
   * Return true if this SubjectErasureByPspReferenceRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectErasureByPspReferenceRequest subjectErasureByPspReferenceRequest = (SubjectErasureByPspReferenceRequest) o;
    return Objects.equals(this.forceErasure, subjectErasureByPspReferenceRequest.forceErasure) &&
        Objects.equals(this.merchantAccount, subjectErasureByPspReferenceRequest.merchantAccount) &&
        Objects.equals(this.pspReference, subjectErasureByPspReferenceRequest.pspReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forceErasure, merchantAccount, pspReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectErasureByPspReferenceRequest {\n");
    sb.append("    forceErasure: ").append(toIndentedString(forceErasure)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
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
   * Create an instance of SubjectErasureByPspReferenceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubjectErasureByPspReferenceRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to SubjectErasureByPspReferenceRequest
   */
  public static SubjectErasureByPspReferenceRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SubjectErasureByPspReferenceRequest.class);
  }
/**
  * Convert an instance of SubjectErasureByPspReferenceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

