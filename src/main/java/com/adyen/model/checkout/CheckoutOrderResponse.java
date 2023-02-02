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
import com.adyen.model.checkout.Amount;
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
 * CheckoutOrderResponse
 */

public class CheckoutOrderResponse {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt;

  public static final String SERIALIZED_NAME_ORDER_DATA = "orderData";
  @SerializedName(SERIALIZED_NAME_ORDER_DATA)
  private String orderData;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_REMAINING_AMOUNT = "remainingAmount";
  @SerializedName(SERIALIZED_NAME_REMAINING_AMOUNT)
  private Amount remainingAmount;

  public CheckoutOrderResponse() { 
  }

  public CheckoutOrderResponse amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public CheckoutOrderResponse expiresAt(String expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The expiry date for the order.
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The expiry date for the order.")

  public String getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public CheckoutOrderResponse orderData(String orderData) {
    
    this.orderData = orderData;
    return this;
  }

   /**
   * The encrypted order data.
   * @return orderData
  **/
  @ApiModelProperty(value = "The encrypted order data.")

  public String getOrderData() {
    return orderData;
  }


  public void setOrderData(String orderData) {
    this.orderData = orderData;
  }


  public CheckoutOrderResponse pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The &#x60;pspReference&#x60; that belongs to the order.
   * @return pspReference
  **/
  @ApiModelProperty(required = true, value = "The `pspReference` that belongs to the order.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public CheckoutOrderResponse reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The merchant reference for the order.
   * @return reference
  **/
  @ApiModelProperty(value = "The merchant reference for the order.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public CheckoutOrderResponse remainingAmount(Amount remainingAmount) {
    
    this.remainingAmount = remainingAmount;
    return this;
  }

   /**
   * Get remainingAmount
   * @return remainingAmount
  **/
  @ApiModelProperty(value = "")

  public Amount getRemainingAmount() {
    return remainingAmount;
  }


  public void setRemainingAmount(Amount remainingAmount) {
    this.remainingAmount = remainingAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutOrderResponse checkoutOrderResponse = (CheckoutOrderResponse) o;
    return Objects.equals(this.amount, checkoutOrderResponse.amount) &&
        Objects.equals(this.expiresAt, checkoutOrderResponse.expiresAt) &&
        Objects.equals(this.orderData, checkoutOrderResponse.orderData) &&
        Objects.equals(this.pspReference, checkoutOrderResponse.pspReference) &&
        Objects.equals(this.reference, checkoutOrderResponse.reference) &&
        Objects.equals(this.remainingAmount, checkoutOrderResponse.remainingAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, expiresAt, orderData, pspReference, reference, remainingAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutOrderResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    orderData: ").append(toIndentedString(orderData)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("expiresAt");
    openapiFields.add("orderData");
    openapiFields.add("pspReference");
    openapiFields.add("reference");
    openapiFields.add("remainingAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pspReference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckoutOrderResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CheckoutOrderResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutOrderResponse is not found in the empty JSON string", CheckoutOrderResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CheckoutOrderResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckoutOrderResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckoutOrderResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field expiresAt
      if (jsonObj.get("expiresAt") != null && !jsonObj.get("expiresAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiresAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiresAt").toString()));
      }
      // validate the optional field orderData
      if (jsonObj.get("orderData") != null && !jsonObj.get("orderData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderData").toString()));
      }
      // validate the optional field pspReference
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field `remainingAmount`
      if (jsonObj.getAsJsonObject("remainingAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("remainingAmount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutOrderResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutOrderResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutOrderResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutOrderResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutOrderResponse>() {
           @Override
           public void write(JsonWriter out, CheckoutOrderResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckoutOrderResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckoutOrderResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutOrderResponse
  * @throws IOException if the JSON string is invalid with respect to CheckoutOrderResponse
  */
  public static CheckoutOrderResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutOrderResponse.class);
  }

 /**
  * Convert an instance of CheckoutOrderResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

