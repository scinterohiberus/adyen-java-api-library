/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payments;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payments.Address;
import com.adyen.model.payments.Card;
import com.adyen.model.payments.Name;
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

import com.adyen.model.payments.JSON;

/**
 * FundSource
 */

public class FundSource {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Address billingAddress;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private Card card;

  public static final String SERIALIZED_NAME_SHOPPER_EMAIL = "shopperEmail";
  @SerializedName(SERIALIZED_NAME_SHOPPER_EMAIL)
  private String shopperEmail;

  public static final String SERIALIZED_NAME_SHOPPER_NAME = "shopperName";
  @SerializedName(SERIALIZED_NAME_SHOPPER_NAME)
  private Name shopperName;

  public static final String SERIALIZED_NAME_TELEPHONE_NUMBER = "telephoneNumber";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NUMBER)
  private String telephoneNumber;

  public FundSource() { 
  }

  public FundSource additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public FundSource putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * A map of name-value pairs for passing additional or industry-specific data.
   * @return additionalData
  **/
  @ApiModelProperty(value = "A map of name-value pairs for passing additional or industry-specific data.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public FundSource billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")

  public Address getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }


  public FundSource card(Card card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")

  public Card getCard() {
    return card;
  }


  public void setCard(Card card) {
    this.card = card;
  }


  public FundSource shopperEmail(String shopperEmail) {
    
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * Email address of the person.
   * @return shopperEmail
  **/
  @ApiModelProperty(value = "Email address of the person.")

  public String getShopperEmail() {
    return shopperEmail;
  }


  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public FundSource shopperName(Name shopperName) {
    
    this.shopperName = shopperName;
    return this;
  }

   /**
   * Get shopperName
   * @return shopperName
  **/
  @ApiModelProperty(value = "")

  public Name getShopperName() {
    return shopperName;
  }


  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }


  public FundSource telephoneNumber(String telephoneNumber) {
    
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * Phone number of the person
   * @return telephoneNumber
  **/
  @ApiModelProperty(value = "Phone number of the person")

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundSource fundSource = (FundSource) o;
    return Objects.equals(this.additionalData, fundSource.additionalData) &&
        Objects.equals(this.billingAddress, fundSource.billingAddress) &&
        Objects.equals(this.card, fundSource.card) &&
        Objects.equals(this.shopperEmail, fundSource.shopperEmail) &&
        Objects.equals(this.shopperName, fundSource.shopperName) &&
        Objects.equals(this.telephoneNumber, fundSource.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, billingAddress, card, shopperEmail, shopperName, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundSource {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
    openapiFields.add("additionalData");
    openapiFields.add("billingAddress");
    openapiFields.add("card");
    openapiFields.add("shopperEmail");
    openapiFields.add("shopperName");
    openapiFields.add("telephoneNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FundSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FundSource.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FundSource is not found in the empty JSON string", FundSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FundSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FundSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `billingAddress`
      if (jsonObj.getAsJsonObject("billingAddress") != null) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
      // validate the optional field `card`
      if (jsonObj.getAsJsonObject("card") != null) {
        Card.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // validate the optional field shopperEmail
      if (jsonObj.get("shopperEmail") != null && !jsonObj.get("shopperEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperEmail").toString()));
      }
      // validate the optional field `shopperName`
      if (jsonObj.getAsJsonObject("shopperName") != null) {
        Name.validateJsonObject(jsonObj.getAsJsonObject("shopperName"));
      }
      // validate the optional field telephoneNumber
      if (jsonObj.get("telephoneNumber") != null && !jsonObj.get("telephoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundSource.class));

       return (TypeAdapter<T>) new TypeAdapter<FundSource>() {
           @Override
           public void write(JsonWriter out, FundSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FundSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FundSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundSource
  * @throws IOException if the JSON string is invalid with respect to FundSource
  */
  public static FundSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundSource.class);
  }

 /**
  * Convert an instance of FundSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

