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
 * ApplePayDetails
 */

public class ApplePayDetails {
  public static final String SERIALIZED_NAME_APPLE_PAY_TOKEN = "applePayToken";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY_TOKEN)
  private String applePayToken;

  public static final String SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID)
  private String checkoutAttemptId;

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   */
  @JsonAdapter(FundingSourceEnum.Adapter.class)
  public enum FundingSourceEnum {
    DEBIT("debit");

    private String value;

    FundingSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FundingSourceEnum fromValue(String value) {
      for (FundingSourceEnum b : FundingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FundingSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FundingSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FundingSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FundingSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FUNDING_SOURCE = "fundingSource";
  @SerializedName(SERIALIZED_NAME_FUNDING_SOURCE)
  private FundingSourceEnum fundingSource;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  @SerializedName(SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID)
  private String storedPaymentMethodId;

  /**
   * **applepay**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    APPLEPAY("applepay");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.APPLEPAY;

  public ApplePayDetails() { 
  }

  public ApplePayDetails applePayToken(String applePayToken) {
    
    this.applePayToken = applePayToken;
    return this;
  }

   /**
   * The stringified and base64 encoded &#x60;paymentData&#x60; you retrieved from the Apple framework.
   * @return applePayToken
  **/
  @ApiModelProperty(required = true, value = "The stringified and base64 encoded `paymentData` you retrieved from the Apple framework.")

  public String getApplePayToken() {
    return applePayToken;
  }


  public void setApplePayToken(String applePayToken) {
    this.applePayToken = applePayToken;
  }


  public ApplePayDetails checkoutAttemptId(String checkoutAttemptId) {
    
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public ApplePayDetails fundingSource(FundingSourceEnum fundingSource) {
    
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   * @return fundingSource
  **/
  @ApiModelProperty(value = "The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.")

  public FundingSourceEnum getFundingSource() {
    return fundingSource;
  }


  public void setFundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
  }


  public ApplePayDetails recurringDetailReference(String recurringDetailReference) {
    
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public ApplePayDetails storedPaymentMethodId(String storedPaymentMethodId) {
    
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public ApplePayDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **applepay**
   * @return type
  **/
  @ApiModelProperty(value = "**applepay**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePayDetails applePayDetails = (ApplePayDetails) o;
    return Objects.equals(this.applePayToken, applePayDetails.applePayToken) &&
        Objects.equals(this.checkoutAttemptId, applePayDetails.checkoutAttemptId) &&
        Objects.equals(this.fundingSource, applePayDetails.fundingSource) &&
        Objects.equals(this.recurringDetailReference, applePayDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, applePayDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, applePayDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applePayToken, checkoutAttemptId, fundingSource, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePayDetails {\n");
    sb.append("    applePayToken: ").append(toIndentedString(applePayToken)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("applePayToken");
    openapiFields.add("checkoutAttemptId");
    openapiFields.add("fundingSource");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("storedPaymentMethodId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applePayToken");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplePayDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplePayDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplePayDetails is not found in the empty JSON string", ApplePayDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplePayDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplePayDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplePayDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field applePayToken
      if (jsonObj.get("applePayToken") != null && !jsonObj.get("applePayToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applePayToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applePayToken").toString()));
      }
      // validate the optional field checkoutAttemptId
      if (jsonObj.get("checkoutAttemptId") != null && !jsonObj.get("checkoutAttemptId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkoutAttemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkoutAttemptId").toString()));
      }
      // ensure the field fundingSource can be parsed to an enum value
      if (jsonObj.get("fundingSource") != null) {
        if(!jsonObj.get("fundingSource").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `fundingSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundingSource").toString()));
        }
        FundingSourceEnum.fromValue(jsonObj.get("fundingSource").getAsString());
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field storedPaymentMethodId
      if (jsonObj.get("storedPaymentMethodId") != null && !jsonObj.get("storedPaymentMethodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storedPaymentMethodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storedPaymentMethodId").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplePayDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplePayDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplePayDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplePayDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplePayDetails>() {
           @Override
           public void write(JsonWriter out, ApplePayDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplePayDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplePayDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplePayDetails
  * @throws IOException if the JSON string is invalid with respect to ApplePayDetails
  */
  public static ApplePayDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplePayDetails.class);
  }

 /**
  * Convert an instance of ApplePayDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

