/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.transfers.BankAccountV3AccountIdentification;
import com.adyen.model.transfers.PartyIdentification2;
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

import com.adyen.model.transfers.JSON;

/**
 * BankAccountV3
 */

public class BankAccountV3 {
  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER = "accountHolder";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER)
  private PartyIdentification2 accountHolder;

  public static final String SERIALIZED_NAME_ACCOUNT_IDENTIFICATION = "accountIdentification";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDENTIFICATION)
  private BankAccountV3AccountIdentification accountIdentification;

  public BankAccountV3() { 
  }

  public BankAccountV3 accountHolder(PartyIdentification2 accountHolder) {
    
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * Get accountHolder
   * @return accountHolder
  **/
  @ApiModelProperty(required = true, value = "")

  public PartyIdentification2 getAccountHolder() {
    return accountHolder;
  }


  public void setAccountHolder(PartyIdentification2 accountHolder) {
    this.accountHolder = accountHolder;
  }


  public BankAccountV3 accountIdentification(BankAccountV3AccountIdentification accountIdentification) {
    
    this.accountIdentification = accountIdentification;
    return this;
  }

   /**
   * Get accountIdentification
   * @return accountIdentification
  **/
  @ApiModelProperty(required = true, value = "")

  public BankAccountV3AccountIdentification getAccountIdentification() {
    return accountIdentification;
  }


  public void setAccountIdentification(BankAccountV3AccountIdentification accountIdentification) {
    this.accountIdentification = accountIdentification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountV3 bankAccountV3 = (BankAccountV3) o;
    return Objects.equals(this.accountHolder, bankAccountV3.accountHolder) &&
        Objects.equals(this.accountIdentification, bankAccountV3.accountIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, accountIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountV3 {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    accountIdentification: ").append(toIndentedString(accountIdentification)).append("\n");
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
    openapiFields.add("accountHolder");
    openapiFields.add("accountIdentification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountHolder");
    openapiRequiredFields.add("accountIdentification");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BankAccountV3
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BankAccountV3.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankAccountV3 is not found in the empty JSON string", BankAccountV3.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BankAccountV3.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BankAccountV3` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BankAccountV3.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `accountHolder`
      if (jsonObj.getAsJsonObject("accountHolder") != null) {
        PartyIdentification2.validateJsonObject(jsonObj.getAsJsonObject("accountHolder"));
      }
      // validate the optional field `accountIdentification`
      if (jsonObj.getAsJsonObject("accountIdentification") != null) {
        BankAccountV3AccountIdentification.validateJsonObject(jsonObj.getAsJsonObject("accountIdentification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankAccountV3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankAccountV3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankAccountV3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankAccountV3.class));

       return (TypeAdapter<T>) new TypeAdapter<BankAccountV3>() {
           @Override
           public void write(JsonWriter out, BankAccountV3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BankAccountV3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BankAccountV3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BankAccountV3
  * @throws IOException if the JSON string is invalid with respect to BankAccountV3
  */
  public static BankAccountV3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankAccountV3.class);
  }

 /**
  * Convert an instance of BankAccountV3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

