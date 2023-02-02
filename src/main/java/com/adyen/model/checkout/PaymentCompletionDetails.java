/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.checkout.JSON;

/**
 * PaymentCompletionDetails
 */

public class PaymentCompletionDetails {
  public static final String SERIALIZED_NAME_M_D = "MD";
  @SerializedName(SERIALIZED_NAME_M_D)
  private String MD;

  public static final String SERIALIZED_NAME_PA_REQ = "PaReq";
  @SerializedName(SERIALIZED_NAME_PA_REQ)
  private String paReq;

  public static final String SERIALIZED_NAME_PA_RES = "PaRes";
  @SerializedName(SERIALIZED_NAME_PA_RES)
  private String paRes;

  public static final String SERIALIZED_NAME_BILLING_TOKEN = "billingToken";
  @SerializedName(SERIALIZED_NAME_BILLING_TOKEN)
  private String billingToken;

  public static final String SERIALIZED_NAME_CUPSECUREPLUS_SMSCODE = "cupsecureplus.smscode";
  @SerializedName(SERIALIZED_NAME_CUPSECUREPLUS_SMSCODE)
  private String cupsecureplusSmscode;

  public static final String SERIALIZED_NAME_FACILITATOR_ACCESS_TOKEN = "facilitatorAccessToken";
  @SerializedName(SERIALIZED_NAME_FACILITATOR_ACCESS_TOKEN)
  private String facilitatorAccessToken;

  public static final String SERIALIZED_NAME_ONE_TIME_PASSCODE = "oneTimePasscode";
  @SerializedName(SERIALIZED_NAME_ONE_TIME_PASSCODE)
  private String oneTimePasscode;

  public static final String SERIALIZED_NAME_ORDER_I_D = "orderID";
  @SerializedName(SERIALIZED_NAME_ORDER_I_D)
  private String orderID;

  public static final String SERIALIZED_NAME_PAYER_I_D = "payerID";
  @SerializedName(SERIALIZED_NAME_PAYER_I_D)
  private String payerID;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_PAYMENT_I_D = "paymentID";
  @SerializedName(SERIALIZED_NAME_PAYMENT_I_D)
  private String paymentID;

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "paymentStatus";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private String paymentStatus;

  public static final String SERIALIZED_NAME_REDIRECT_RESULT = "redirectResult";
  @SerializedName(SERIALIZED_NAME_REDIRECT_RESULT)
  private String redirectResult;

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_THREE_D_S_RESULT = "threeDSResult";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_RESULT)
  private String threeDSResult;

  public static final String SERIALIZED_NAME_THREEDS2_CHALLENGE_RESULT = "threeds2.challengeResult";
  @SerializedName(SERIALIZED_NAME_THREEDS2_CHALLENGE_RESULT)
  private String threeds2ChallengeResult;

  public static final String SERIALIZED_NAME_THREEDS2_FINGERPRINT = "threeds2.fingerprint";
  @SerializedName(SERIALIZED_NAME_THREEDS2_FINGERPRINT)
  private String threeds2Fingerprint;

  public PaymentCompletionDetails() { 
  }

  public PaymentCompletionDetails MD(String MD) {
    
    this.MD = MD;
    return this;
  }

   /**
   * A payment session identifier returned by the card issuer.
   * @return MD
  **/
  @ApiModelProperty(value = "A payment session identifier returned by the card issuer.")

  public String getMD() {
    return MD;
  }


  public void setMD(String MD) {
    this.MD = MD;
  }


  public PaymentCompletionDetails paReq(String paReq) {
    
    this.paReq = paReq;
    return this;
  }

   /**
   * (3D) Payment Authentication Request data for the card issuer.
   * @return paReq
  **/
  @ApiModelProperty(value = "(3D) Payment Authentication Request data for the card issuer.")

  public String getPaReq() {
    return paReq;
  }


  public void setPaReq(String paReq) {
    this.paReq = paReq;
  }


  public PaymentCompletionDetails paRes(String paRes) {
    
    this.paRes = paRes;
    return this;
  }

   /**
   * (3D) Payment Authentication Response data by the card issuer.
   * @return paRes
  **/
  @ApiModelProperty(value = "(3D) Payment Authentication Response data by the card issuer.")

  public String getPaRes() {
    return paRes;
  }


  public void setPaRes(String paRes) {
    this.paRes = paRes;
  }


  public PaymentCompletionDetails billingToken(String billingToken) {
    
    this.billingToken = billingToken;
    return this;
  }

   /**
   * PayPal-generated token for recurring payments.
   * @return billingToken
  **/
  @ApiModelProperty(value = "PayPal-generated token for recurring payments.")

  public String getBillingToken() {
    return billingToken;
  }


  public void setBillingToken(String billingToken) {
    this.billingToken = billingToken;
  }


  public PaymentCompletionDetails cupsecureplusSmscode(String cupsecureplusSmscode) {
    
    this.cupsecureplusSmscode = cupsecureplusSmscode;
    return this;
  }

   /**
   * The SMS verification code collected from the shopper.
   * @return cupsecureplusSmscode
  **/
  @ApiModelProperty(value = "The SMS verification code collected from the shopper.")

  public String getCupsecureplusSmscode() {
    return cupsecureplusSmscode;
  }


  public void setCupsecureplusSmscode(String cupsecureplusSmscode) {
    this.cupsecureplusSmscode = cupsecureplusSmscode;
  }


  public PaymentCompletionDetails facilitatorAccessToken(String facilitatorAccessToken) {
    
    this.facilitatorAccessToken = facilitatorAccessToken;
    return this;
  }

   /**
   * PayPal-generated third party access token.
   * @return facilitatorAccessToken
  **/
  @ApiModelProperty(value = "PayPal-generated third party access token.")

  public String getFacilitatorAccessToken() {
    return facilitatorAccessToken;
  }


  public void setFacilitatorAccessToken(String facilitatorAccessToken) {
    this.facilitatorAccessToken = facilitatorAccessToken;
  }


  public PaymentCompletionDetails oneTimePasscode(String oneTimePasscode) {
    
    this.oneTimePasscode = oneTimePasscode;
    return this;
  }

   /**
   * A random number sent to the mobile phone number of the shopper to verify the payment.
   * @return oneTimePasscode
  **/
  @ApiModelProperty(value = "A random number sent to the mobile phone number of the shopper to verify the payment.")

  public String getOneTimePasscode() {
    return oneTimePasscode;
  }


  public void setOneTimePasscode(String oneTimePasscode) {
    this.oneTimePasscode = oneTimePasscode;
  }


  public PaymentCompletionDetails orderID(String orderID) {
    
    this.orderID = orderID;
    return this;
  }

   /**
   * PayPal-assigned ID for the order.
   * @return orderID
  **/
  @ApiModelProperty(value = "PayPal-assigned ID for the order.")

  public String getOrderID() {
    return orderID;
  }


  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }


  public PaymentCompletionDetails payerID(String payerID) {
    
    this.payerID = payerID;
    return this;
  }

   /**
   * PayPal-assigned ID for the payer (shopper).
   * @return payerID
  **/
  @ApiModelProperty(value = "PayPal-assigned ID for the payer (shopper).")

  public String getPayerID() {
    return payerID;
  }


  public void setPayerID(String payerID) {
    this.payerID = payerID;
  }


  public PaymentCompletionDetails payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Payload appended to the &#x60;returnURL&#x60; as a result of the redirect.
   * @return payload
  **/
  @ApiModelProperty(value = "Payload appended to the `returnURL` as a result of the redirect.")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public PaymentCompletionDetails paymentID(String paymentID) {
    
    this.paymentID = paymentID;
    return this;
  }

   /**
   * PayPal-generated ID for the payment.
   * @return paymentID
  **/
  @ApiModelProperty(value = "PayPal-generated ID for the payment.")

  public String getPaymentID() {
    return paymentID;
  }


  public void setPaymentID(String paymentID) {
    this.paymentID = paymentID;
  }


  public PaymentCompletionDetails paymentStatus(String paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Value passed from the WeChat MiniProgram &#x60;wx.requestPayment&#x60; **complete** callback. Possible values: any value starting with &#x60;requestPayment:&#x60;.
   * @return paymentStatus
  **/
  @ApiModelProperty(value = "Value passed from the WeChat MiniProgram `wx.requestPayment` **complete** callback. Possible values: any value starting with `requestPayment:`.")

  public String getPaymentStatus() {
    return paymentStatus;
  }


  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public PaymentCompletionDetails redirectResult(String redirectResult) {
    
    this.redirectResult = redirectResult;
    return this;
  }

   /**
   * The result of the redirect as appended to the &#x60;returnURL&#x60;.
   * @return redirectResult
  **/
  @ApiModelProperty(value = "The result of the redirect as appended to the `returnURL`.")

  public String getRedirectResult() {
    return redirectResult;
  }


  public void setRedirectResult(String redirectResult) {
    this.redirectResult = redirectResult;
  }


  public PaymentCompletionDetails resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Value you received from the WeChat Pay SDK.
   * @return resultCode
  **/
  @ApiModelProperty(value = "Value you received from the WeChat Pay SDK.")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public PaymentCompletionDetails threeDSResult(String threeDSResult) {
    
    this.threeDSResult = threeDSResult;
    return this;
  }

   /**
   * Base64-encoded string returned by the Component after the challenge flow. It contains the following parameters: &#x60;transStatus&#x60;, &#x60;authorisationToken&#x60;.
   * @return threeDSResult
  **/
  @ApiModelProperty(value = "Base64-encoded string returned by the Component after the challenge flow. It contains the following parameters: `transStatus`, `authorisationToken`.")

  public String getThreeDSResult() {
    return threeDSResult;
  }


  public void setThreeDSResult(String threeDSResult) {
    this.threeDSResult = threeDSResult;
  }


  public PaymentCompletionDetails threeds2ChallengeResult(String threeds2ChallengeResult) {
    
    this.threeds2ChallengeResult = threeds2ChallengeResult;
    return this;
  }

   /**
   * Base64-encoded string returned by the Component after the challenge flow. It contains the following parameter: &#x60;transStatus&#x60;.
   * @return threeds2ChallengeResult
  **/
  @ApiModelProperty(value = "Base64-encoded string returned by the Component after the challenge flow. It contains the following parameter: `transStatus`.")

  public String getThreeds2ChallengeResult() {
    return threeds2ChallengeResult;
  }


  public void setThreeds2ChallengeResult(String threeds2ChallengeResult) {
    this.threeds2ChallengeResult = threeds2ChallengeResult;
  }


  public PaymentCompletionDetails threeds2Fingerprint(String threeds2Fingerprint) {
    
    this.threeds2Fingerprint = threeds2Fingerprint;
    return this;
  }

   /**
   * Base64-encoded string returned by the Component after the challenge flow. It contains the following parameter: &#x60;threeDSCompInd&#x60;.
   * @return threeds2Fingerprint
  **/
  @ApiModelProperty(value = "Base64-encoded string returned by the Component after the challenge flow. It contains the following parameter: `threeDSCompInd`.")

  public String getThreeds2Fingerprint() {
    return threeds2Fingerprint;
  }


  public void setThreeds2Fingerprint(String threeds2Fingerprint) {
    this.threeds2Fingerprint = threeds2Fingerprint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCompletionDetails paymentCompletionDetails = (PaymentCompletionDetails) o;
    return Objects.equals(this.MD, paymentCompletionDetails.MD) &&
        Objects.equals(this.paReq, paymentCompletionDetails.paReq) &&
        Objects.equals(this.paRes, paymentCompletionDetails.paRes) &&
        Objects.equals(this.billingToken, paymentCompletionDetails.billingToken) &&
        Objects.equals(this.cupsecureplusSmscode, paymentCompletionDetails.cupsecureplusSmscode) &&
        Objects.equals(this.facilitatorAccessToken, paymentCompletionDetails.facilitatorAccessToken) &&
        Objects.equals(this.oneTimePasscode, paymentCompletionDetails.oneTimePasscode) &&
        Objects.equals(this.orderID, paymentCompletionDetails.orderID) &&
        Objects.equals(this.payerID, paymentCompletionDetails.payerID) &&
        Objects.equals(this.payload, paymentCompletionDetails.payload) &&
        Objects.equals(this.paymentID, paymentCompletionDetails.paymentID) &&
        Objects.equals(this.paymentStatus, paymentCompletionDetails.paymentStatus) &&
        Objects.equals(this.redirectResult, paymentCompletionDetails.redirectResult) &&
        Objects.equals(this.resultCode, paymentCompletionDetails.resultCode) &&
        Objects.equals(this.threeDSResult, paymentCompletionDetails.threeDSResult) &&
        Objects.equals(this.threeds2ChallengeResult, paymentCompletionDetails.threeds2ChallengeResult) &&
        Objects.equals(this.threeds2Fingerprint, paymentCompletionDetails.threeds2Fingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MD, paReq, paRes, billingToken, cupsecureplusSmscode, facilitatorAccessToken, oneTimePasscode, orderID, payerID, payload, paymentID, paymentStatus, redirectResult, resultCode, threeDSResult, threeds2ChallengeResult, threeds2Fingerprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCompletionDetails {\n");
    sb.append("    MD: ").append(toIndentedString(MD)).append("\n");
    sb.append("    paReq: ").append(toIndentedString(paReq)).append("\n");
    sb.append("    paRes: ").append(toIndentedString(paRes)).append("\n");
    sb.append("    billingToken: ").append(toIndentedString(billingToken)).append("\n");
    sb.append("    cupsecureplusSmscode: ").append(toIndentedString(cupsecureplusSmscode)).append("\n");
    sb.append("    facilitatorAccessToken: ").append(toIndentedString(facilitatorAccessToken)).append("\n");
    sb.append("    oneTimePasscode: ").append(toIndentedString(oneTimePasscode)).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    payerID: ").append(toIndentedString(payerID)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    paymentID: ").append(toIndentedString(paymentID)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    redirectResult: ").append(toIndentedString(redirectResult)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    threeDSResult: ").append(toIndentedString(threeDSResult)).append("\n");
    sb.append("    threeds2ChallengeResult: ").append(toIndentedString(threeds2ChallengeResult)).append("\n");
    sb.append("    threeds2Fingerprint: ").append(toIndentedString(threeds2Fingerprint)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("MD");
    openapiFields.add("PaReq");
    openapiFields.add("PaRes");
    openapiFields.add("billingToken");
    openapiFields.add("cupsecureplus.smscode");
    openapiFields.add("facilitatorAccessToken");
    openapiFields.add("oneTimePasscode");
    openapiFields.add("orderID");
    openapiFields.add("payerID");
    openapiFields.add("payload");
    openapiFields.add("paymentID");
    openapiFields.add("paymentStatus");
    openapiFields.add("redirectResult");
    openapiFields.add("resultCode");
    openapiFields.add("threeDSResult");
    openapiFields.add("threeds2.challengeResult");
    openapiFields.add("threeds2.fingerprint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentCompletionDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentCompletionDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentCompletionDetails is not found in the empty JSON string", PaymentCompletionDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentCompletionDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentCompletionDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field MD
      if (jsonObj.get("MD") != null && !jsonObj.get("MD").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MD` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MD").toString()));
      }
      // validate the optional field PaReq
      if (jsonObj.get("PaReq") != null && !jsonObj.get("PaReq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PaReq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PaReq").toString()));
      }
      // validate the optional field PaRes
      if (jsonObj.get("PaRes") != null && !jsonObj.get("PaRes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PaRes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PaRes").toString()));
      }
      // validate the optional field billingToken
      if (jsonObj.get("billingToken") != null && !jsonObj.get("billingToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingToken").toString()));
      }
      // validate the optional field cupsecureplus.smscode
      if (jsonObj.get("cupsecureplus.smscode") != null && !jsonObj.get("cupsecureplus.smscode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cupsecureplus.smscode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cupsecureplus.smscode").toString()));
      }
      // validate the optional field facilitatorAccessToken
      if (jsonObj.get("facilitatorAccessToken") != null && !jsonObj.get("facilitatorAccessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facilitatorAccessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facilitatorAccessToken").toString()));
      }
      // validate the optional field oneTimePasscode
      if (jsonObj.get("oneTimePasscode") != null && !jsonObj.get("oneTimePasscode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oneTimePasscode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oneTimePasscode").toString()));
      }
      // validate the optional field orderID
      if (jsonObj.get("orderID") != null && !jsonObj.get("orderID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderID").toString()));
      }
      // validate the optional field payerID
      if (jsonObj.get("payerID") != null && !jsonObj.get("payerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payerID").toString()));
      }
      // validate the optional field payload
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }
      // validate the optional field paymentID
      if (jsonObj.get("paymentID") != null && !jsonObj.get("paymentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentID").toString()));
      }
      // validate the optional field paymentStatus
      if (jsonObj.get("paymentStatus") != null && !jsonObj.get("paymentStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentStatus").toString()));
      }
      // validate the optional field redirectResult
      if (jsonObj.get("redirectResult") != null && !jsonObj.get("redirectResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectResult").toString()));
      }
      // validate the optional field resultCode
      if (jsonObj.get("resultCode") != null && !jsonObj.get("resultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
      }
      // validate the optional field threeDSResult
      if (jsonObj.get("threeDSResult") != null && !jsonObj.get("threeDSResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSResult").toString()));
      }
      // validate the optional field threeds2.challengeResult
      if (jsonObj.get("threeds2.challengeResult") != null && !jsonObj.get("threeds2.challengeResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeds2.challengeResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeds2.challengeResult").toString()));
      }
      // validate the optional field threeds2.fingerprint
      if (jsonObj.get("threeds2.fingerprint") != null && !jsonObj.get("threeds2.fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeds2.fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeds2.fingerprint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentCompletionDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentCompletionDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentCompletionDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentCompletionDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentCompletionDetails>() {
           @Override
           public void write(JsonWriter out, PaymentCompletionDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentCompletionDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentCompletionDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentCompletionDetails
  * @throws IOException if the JSON string is invalid with respect to PaymentCompletionDetails
  */
  public static PaymentCompletionDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentCompletionDetails.class);
  }

 /**
  * Convert an instance of PaymentCompletionDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

