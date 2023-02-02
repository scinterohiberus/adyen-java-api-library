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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * CheckoutSDKAction
 */

public class CheckoutSDKAction {
  public static final String SERIALIZED_NAME_PAYMENT_DATA = "paymentData";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATA)
  private String paymentData;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TYPE = "paymentMethodType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TYPE)
  private String paymentMethodType;

  public static final String SERIALIZED_NAME_SDK_DATA = "sdkData";
  @SerializedName(SERIALIZED_NAME_SDK_DATA)
  private Map<String, String> sdkData = null;

  /**
   * The type of the action.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SDK("sdk"),
    
    WECHATPAYSDK("wechatpaySDK");

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
  private TypeEnum type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public CheckoutSDKAction() { 
  }

  public CheckoutSDKAction paymentData(String paymentData) {
    
    this.paymentData = paymentData;
    return this;
  }

   /**
   * A value that must be submitted to the &#x60;/payments/details&#x60; endpoint to verify this payment.
   * @return paymentData
  **/
  @ApiModelProperty(value = "A value that must be submitted to the `/payments/details` endpoint to verify this payment.")

  public String getPaymentData() {
    return paymentData;
  }


  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  public CheckoutSDKAction paymentMethodType(String paymentMethodType) {
    
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Specifies the payment method.
   * @return paymentMethodType
  **/
  @ApiModelProperty(value = "Specifies the payment method.")

  public String getPaymentMethodType() {
    return paymentMethodType;
  }


  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public CheckoutSDKAction sdkData(Map<String, String> sdkData) {
    
    this.sdkData = sdkData;
    return this;
  }

  public CheckoutSDKAction putSdkDataItem(String key, String sdkDataItem) {
    if (this.sdkData == null) {
      this.sdkData = new HashMap<>();
    }
    this.sdkData.put(key, sdkDataItem);
    return this;
  }

   /**
   * The data to pass to the SDK.
   * @return sdkData
  **/
  @ApiModelProperty(value = "The data to pass to the SDK.")

  public Map<String, String> getSdkData() {
    return sdkData;
  }


  public void setSdkData(Map<String, String> sdkData) {
    this.sdkData = sdkData;
  }


  public CheckoutSDKAction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the action.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the action.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CheckoutSDKAction url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Specifies the URL to redirect to.
   * @return url
  **/
  @ApiModelProperty(value = "Specifies the URL to redirect to.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutSDKAction checkoutSDKAction = (CheckoutSDKAction) o;
    return Objects.equals(this.paymentData, checkoutSDKAction.paymentData) &&
        Objects.equals(this.paymentMethodType, checkoutSDKAction.paymentMethodType) &&
        Objects.equals(this.sdkData, checkoutSDKAction.sdkData) &&
        Objects.equals(this.type, checkoutSDKAction.type) &&
        Objects.equals(this.url, checkoutSDKAction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentData, paymentMethodType, sdkData, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutSDKAction {\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    sdkData: ").append(toIndentedString(sdkData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("paymentData");
    openapiFields.add("paymentMethodType");
    openapiFields.add("sdkData");
    openapiFields.add("type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckoutSDKAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CheckoutSDKAction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutSDKAction is not found in the empty JSON string", CheckoutSDKAction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CheckoutSDKAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckoutSDKAction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckoutSDKAction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field paymentData
      if (jsonObj.get("paymentData") != null && !jsonObj.get("paymentData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentData").toString()));
      }
      // validate the optional field paymentMethodType
      if (jsonObj.get("paymentMethodType") != null && !jsonObj.get("paymentMethodType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentMethodType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethodType").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
      // validate the optional field url
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutSDKAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutSDKAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutSDKAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutSDKAction.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutSDKAction>() {
           @Override
           public void write(JsonWriter out, CheckoutSDKAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckoutSDKAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckoutSDKAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutSDKAction
  * @throws IOException if the JSON string is invalid with respect to CheckoutSDKAction
  */
  public static CheckoutSDKAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutSDKAction.class);
  }

 /**
  * Convert an instance of CheckoutSDKAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

