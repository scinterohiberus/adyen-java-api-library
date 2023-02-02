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
 * AchDetails
 */

public class AchDetails {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT_NUMBER = "bankAccountNumber";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_NUMBER)
  private String bankAccountNumber;

  public static final String SERIALIZED_NAME_BANK_LOCATION_ID = "bankLocationId";
  @SerializedName(SERIALIZED_NAME_BANK_LOCATION_ID)
  private String bankLocationId;

  public static final String SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID)
  private String checkoutAttemptId;

  public static final String SERIALIZED_NAME_ENCRYPTED_BANK_ACCOUNT_NUMBER = "encryptedBankAccountNumber";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_BANK_ACCOUNT_NUMBER)
  private String encryptedBankAccountNumber;

  public static final String SERIALIZED_NAME_ENCRYPTED_BANK_LOCATION_ID = "encryptedBankLocationId";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_BANK_LOCATION_ID)
  private String encryptedBankLocationId;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  @SerializedName(SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID)
  private String storedPaymentMethodId;

  /**
   * **ach**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ACH("ach");

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
  private TypeEnum type = TypeEnum.ACH;

  public AchDetails() { 
  }

  public AchDetails bankAccountNumber(String bankAccountNumber) {
    
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * The bank account number (without separators).
   * @return bankAccountNumber
  **/
  @ApiModelProperty(required = true, value = "The bank account number (without separators).")

  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public AchDetails bankLocationId(String bankLocationId) {
    
    this.bankLocationId = bankLocationId;
    return this;
  }

   /**
   * The bank routing number of the account. The field value is &#x60;nil&#x60; in most cases.
   * @return bankLocationId
  **/
  @ApiModelProperty(value = "The bank routing number of the account. The field value is `nil` in most cases.")

  public String getBankLocationId() {
    return bankLocationId;
  }


  public void setBankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
  }


  public AchDetails checkoutAttemptId(String checkoutAttemptId) {
    
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


  public AchDetails encryptedBankAccountNumber(String encryptedBankAccountNumber) {
    
    this.encryptedBankAccountNumber = encryptedBankAccountNumber;
    return this;
  }

   /**
   * Encrypted bank account number. The bank account number (without separators).
   * @return encryptedBankAccountNumber
  **/
  @ApiModelProperty(value = "Encrypted bank account number. The bank account number (without separators).")

  public String getEncryptedBankAccountNumber() {
    return encryptedBankAccountNumber;
  }


  public void setEncryptedBankAccountNumber(String encryptedBankAccountNumber) {
    this.encryptedBankAccountNumber = encryptedBankAccountNumber;
  }


  public AchDetails encryptedBankLocationId(String encryptedBankLocationId) {
    
    this.encryptedBankLocationId = encryptedBankLocationId;
    return this;
  }

   /**
   * Encrypted location id. The bank routing number of the account. The field value is &#x60;nil&#x60; in most cases.
   * @return encryptedBankLocationId
  **/
  @ApiModelProperty(value = "Encrypted location id. The bank routing number of the account. The field value is `nil` in most cases.")

  public String getEncryptedBankLocationId() {
    return encryptedBankLocationId;
  }


  public void setEncryptedBankLocationId(String encryptedBankLocationId) {
    this.encryptedBankLocationId = encryptedBankLocationId;
  }


  public AchDetails ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don&#39;t accept &#39;ø&#39;. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. &gt; If provided details don&#39;t match the required format, the response returns the error message: 203 &#39;Invalid bank account holder name&#39;.
   * @return ownerName
  **/
  @ApiModelProperty(value = "The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don't accept 'ø'. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. > If provided details don't match the required format, the response returns the error message: 203 'Invalid bank account holder name'.")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public AchDetails recurringDetailReference(String recurringDetailReference) {
    
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


  public AchDetails storedPaymentMethodId(String storedPaymentMethodId) {
    
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


  public AchDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **ach**
   * @return type
  **/
  @ApiModelProperty(value = "**ach**")

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
    AchDetails achDetails = (AchDetails) o;
    return Objects.equals(this.bankAccountNumber, achDetails.bankAccountNumber) &&
        Objects.equals(this.bankLocationId, achDetails.bankLocationId) &&
        Objects.equals(this.checkoutAttemptId, achDetails.checkoutAttemptId) &&
        Objects.equals(this.encryptedBankAccountNumber, achDetails.encryptedBankAccountNumber) &&
        Objects.equals(this.encryptedBankLocationId, achDetails.encryptedBankLocationId) &&
        Objects.equals(this.ownerName, achDetails.ownerName) &&
        Objects.equals(this.recurringDetailReference, achDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, achDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, achDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankLocationId, checkoutAttemptId, encryptedBankAccountNumber, encryptedBankLocationId, ownerName, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchDetails {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankLocationId: ").append(toIndentedString(bankLocationId)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    encryptedBankAccountNumber: ").append(toIndentedString(encryptedBankAccountNumber)).append("\n");
    sb.append("    encryptedBankLocationId: ").append(toIndentedString(encryptedBankLocationId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
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
    openapiFields.add("bankAccountNumber");
    openapiFields.add("bankLocationId");
    openapiFields.add("checkoutAttemptId");
    openapiFields.add("encryptedBankAccountNumber");
    openapiFields.add("encryptedBankLocationId");
    openapiFields.add("ownerName");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("storedPaymentMethodId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bankAccountNumber");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AchDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AchDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AchDetails is not found in the empty JSON string", AchDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AchDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AchDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AchDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field bankAccountNumber
      if (jsonObj.get("bankAccountNumber") != null && !jsonObj.get("bankAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankAccountNumber").toString()));
      }
      // validate the optional field bankLocationId
      if (jsonObj.get("bankLocationId") != null && !jsonObj.get("bankLocationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankLocationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankLocationId").toString()));
      }
      // validate the optional field checkoutAttemptId
      if (jsonObj.get("checkoutAttemptId") != null && !jsonObj.get("checkoutAttemptId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkoutAttemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkoutAttemptId").toString()));
      }
      // validate the optional field encryptedBankAccountNumber
      if (jsonObj.get("encryptedBankAccountNumber") != null && !jsonObj.get("encryptedBankAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedBankAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedBankAccountNumber").toString()));
      }
      // validate the optional field encryptedBankLocationId
      if (jsonObj.get("encryptedBankLocationId") != null && !jsonObj.get("encryptedBankLocationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedBankLocationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedBankLocationId").toString()));
      }
      // validate the optional field ownerName
      if (jsonObj.get("ownerName") != null && !jsonObj.get("ownerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerName").toString()));
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
       if (!AchDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AchDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AchDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AchDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AchDetails>() {
           @Override
           public void write(JsonWriter out, AchDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AchDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AchDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AchDetails
  * @throws IOException if the JSON string is invalid with respect to AchDetails
  */
  public static AchDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AchDetails.class);
  }

 /**
  * Convert an instance of AchDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

