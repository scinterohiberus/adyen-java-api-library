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
 * CardDetails
 */

public class CardDetails {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID)
  private String checkoutAttemptId;

  public static final String SERIALIZED_NAME_CUPSECUREPLUS_SMSCODE = "cupsecureplus.smscode";
  @SerializedName(SERIALIZED_NAME_CUPSECUREPLUS_SMSCODE)
  private String cupsecureplusSmscode;

  public static final String SERIALIZED_NAME_CVC = "cvc";
  @SerializedName(SERIALIZED_NAME_CVC)
  private String cvc;

  public static final String SERIALIZED_NAME_ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_CARD_NUMBER)
  private String encryptedCardNumber;

  public static final String SERIALIZED_NAME_ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_EXPIRY_MONTH)
  private String encryptedExpiryMonth;

  public static final String SERIALIZED_NAME_ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_EXPIRY_YEAR)
  private String encryptedExpiryYear;

  public static final String SERIALIZED_NAME_ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_SECURITY_CODE)
  private String encryptedSecurityCode;

  public static final String SERIALIZED_NAME_EXPIRY_MONTH = "expiryMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRY_MONTH)
  private String expiryMonth;

  public static final String SERIALIZED_NAME_EXPIRY_YEAR = "expiryYear";
  @SerializedName(SERIALIZED_NAME_EXPIRY_YEAR)
  private String expiryYear;

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

  public static final String SERIALIZED_NAME_HOLDER_NAME = "holderName";
  @SerializedName(SERIALIZED_NAME_HOLDER_NAME)
  private String holderName;

  public static final String SERIALIZED_NAME_NETWORK_PAYMENT_REFERENCE = "networkPaymentReference";
  @SerializedName(SERIALIZED_NAME_NETWORK_PAYMENT_REFERENCE)
  private String networkPaymentReference;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_SHOPPER_NOTIFICATION_REFERENCE = "shopperNotificationReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_NOTIFICATION_REFERENCE)
  private String shopperNotificationReference;

  public static final String SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  @SerializedName(SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID)
  private String storedPaymentMethodId;

  public static final String SERIALIZED_NAME_THREE_D_S2_SDK_VERSION = "threeDS2SdkVersion";
  @SerializedName(SERIALIZED_NAME_THREE_D_S2_SDK_VERSION)
  private String threeDS2SdkVersion;

  /**
   * Default payment method details. Common for scheme payment methods, and for simple payment method details.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SCHEME("scheme"),
    
    NETWORKTOKEN("networkToken"),
    
    GIFTCARD("giftcard"),
    
    ALLIANCEDATA("alliancedata"),
    
    CARD("card");

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
  private TypeEnum type = TypeEnum.SCHEME;

  public CardDetails() { 
  }

  public CardDetails brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Secondary brand of the card. For example: **plastix**, **hmclub**.
   * @return brand
  **/
  @ApiModelProperty(value = "Secondary brand of the card. For example: **plastix**, **hmclub**.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public CardDetails checkoutAttemptId(String checkoutAttemptId) {
    
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


  public CardDetails cupsecureplusSmscode(String cupsecureplusSmscode) {
    
    this.cupsecureplusSmscode = cupsecureplusSmscode;
    return this;
  }

   /**
   * Get cupsecureplusSmscode
   * @return cupsecureplusSmscode
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "")

  public String getCupsecureplusSmscode() {
    return cupsecureplusSmscode;
  }


  public void setCupsecureplusSmscode(String cupsecureplusSmscode) {
    this.cupsecureplusSmscode = cupsecureplusSmscode;
  }


  public CardDetails cvc(String cvc) {
    
    this.cvc = cvc;
    return this;
  }

   /**
   * The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return cvc
  **/
  @ApiModelProperty(value = "The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")

  public String getCvc() {
    return cvc;
  }


  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public CardDetails encryptedCardNumber(String encryptedCardNumber) {
    
    this.encryptedCardNumber = encryptedCardNumber;
    return this;
  }

   /**
   * The encrypted card number.
   * @return encryptedCardNumber
  **/
  @ApiModelProperty(required = true, value = "The encrypted card number.")

  public String getEncryptedCardNumber() {
    return encryptedCardNumber;
  }


  public void setEncryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
  }


  public CardDetails encryptedExpiryMonth(String encryptedExpiryMonth) {
    
    this.encryptedExpiryMonth = encryptedExpiryMonth;
    return this;
  }

   /**
   * The encrypted card expiry month.
   * @return encryptedExpiryMonth
  **/
  @ApiModelProperty(required = true, value = "The encrypted card expiry month.")

  public String getEncryptedExpiryMonth() {
    return encryptedExpiryMonth;
  }


  public void setEncryptedExpiryMonth(String encryptedExpiryMonth) {
    this.encryptedExpiryMonth = encryptedExpiryMonth;
  }


  public CardDetails encryptedExpiryYear(String encryptedExpiryYear) {
    
    this.encryptedExpiryYear = encryptedExpiryYear;
    return this;
  }

   /**
   * The encrypted card expiry year.
   * @return encryptedExpiryYear
  **/
  @ApiModelProperty(required = true, value = "The encrypted card expiry year.")

  public String getEncryptedExpiryYear() {
    return encryptedExpiryYear;
  }


  public void setEncryptedExpiryYear(String encryptedExpiryYear) {
    this.encryptedExpiryYear = encryptedExpiryYear;
  }


  public CardDetails encryptedSecurityCode(String encryptedSecurityCode) {
    
    this.encryptedSecurityCode = encryptedSecurityCode;
    return this;
  }

   /**
   * The encrypted card verification code.
   * @return encryptedSecurityCode
  **/
  @ApiModelProperty(value = "The encrypted card verification code.")

  public String getEncryptedSecurityCode() {
    return encryptedSecurityCode;
  }


  public void setEncryptedSecurityCode(String encryptedSecurityCode) {
    this.encryptedSecurityCode = encryptedSecurityCode;
  }


  public CardDetails expiryMonth(String expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return expiryMonth
  **/
  @ApiModelProperty(value = "The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")

  public String getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public CardDetails expiryYear(String expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return expiryYear
  **/
  @ApiModelProperty(value = "The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")

  public String getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public CardDetails fundingSource(FundingSourceEnum fundingSource) {
    
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


  public CardDetails holderName(String holderName) {
    
    this.holderName = holderName;
    return this;
  }

   /**
   * The name of the card holder.
   * @return holderName
  **/
  @ApiModelProperty(value = "The name of the card holder.")

  public String getHolderName() {
    return holderName;
  }


  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  public CardDetails networkPaymentReference(String networkPaymentReference) {
    
    this.networkPaymentReference = networkPaymentReference;
    return this;
  }

   /**
   * The network token reference. This is the [&#x60;networkTxReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment.
   * @return networkPaymentReference
  **/
  @ApiModelProperty(value = "The network token reference. This is the [`networkTxReference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment.")

  public String getNetworkPaymentReference() {
    return networkPaymentReference;
  }


  public void setNetworkPaymentReference(String networkPaymentReference) {
    this.networkPaymentReference = networkPaymentReference;
  }


  public CardDetails number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return number
  **/
  @ApiModelProperty(value = "The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public CardDetails recurringDetailReference(String recurringDetailReference) {
    
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


  public CardDetails shopperNotificationReference(String shopperNotificationReference) {
    
    this.shopperNotificationReference = shopperNotificationReference;
    return this;
  }

   /**
   * The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used only for recurring payments in India.
   * @return shopperNotificationReference
  **/
  @ApiModelProperty(value = "The `shopperNotificationReference` returned in the response when you requested to notify the shopper. Used only for recurring payments in India.")

  public String getShopperNotificationReference() {
    return shopperNotificationReference;
  }


  public void setShopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
  }


  public CardDetails storedPaymentMethodId(String storedPaymentMethodId) {
    
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


  public CardDetails threeDS2SdkVersion(String threeDS2SdkVersion) {
    
    this.threeDS2SdkVersion = threeDS2SdkVersion;
    return this;
  }

   /**
   * Version of the 3D Secure 2 mobile SDK.
   * @return threeDS2SdkVersion
  **/
  @ApiModelProperty(value = "Version of the 3D Secure 2 mobile SDK.")

  public String getThreeDS2SdkVersion() {
    return threeDS2SdkVersion;
  }


  public void setThreeDS2SdkVersion(String threeDS2SdkVersion) {
    this.threeDS2SdkVersion = threeDS2SdkVersion;
  }


  public CardDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Default payment method details. Common for scheme payment methods, and for simple payment method details.
   * @return type
  **/
  @ApiModelProperty(value = "Default payment method details. Common for scheme payment methods, and for simple payment method details.")

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
    CardDetails cardDetails = (CardDetails) o;
    return Objects.equals(this.brand, cardDetails.brand) &&
        Objects.equals(this.checkoutAttemptId, cardDetails.checkoutAttemptId) &&
        Objects.equals(this.cupsecureplusSmscode, cardDetails.cupsecureplusSmscode) &&
        Objects.equals(this.cvc, cardDetails.cvc) &&
        Objects.equals(this.encryptedCardNumber, cardDetails.encryptedCardNumber) &&
        Objects.equals(this.encryptedExpiryMonth, cardDetails.encryptedExpiryMonth) &&
        Objects.equals(this.encryptedExpiryYear, cardDetails.encryptedExpiryYear) &&
        Objects.equals(this.encryptedSecurityCode, cardDetails.encryptedSecurityCode) &&
        Objects.equals(this.expiryMonth, cardDetails.expiryMonth) &&
        Objects.equals(this.expiryYear, cardDetails.expiryYear) &&
        Objects.equals(this.fundingSource, cardDetails.fundingSource) &&
        Objects.equals(this.holderName, cardDetails.holderName) &&
        Objects.equals(this.networkPaymentReference, cardDetails.networkPaymentReference) &&
        Objects.equals(this.number, cardDetails.number) &&
        Objects.equals(this.recurringDetailReference, cardDetails.recurringDetailReference) &&
        Objects.equals(this.shopperNotificationReference, cardDetails.shopperNotificationReference) &&
        Objects.equals(this.storedPaymentMethodId, cardDetails.storedPaymentMethodId) &&
        Objects.equals(this.threeDS2SdkVersion, cardDetails.threeDS2SdkVersion) &&
        Objects.equals(this.type, cardDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, checkoutAttemptId, cupsecureplusSmscode, cvc, encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode, expiryMonth, expiryYear, fundingSource, holderName, networkPaymentReference, number, recurringDetailReference, shopperNotificationReference, storedPaymentMethodId, threeDS2SdkVersion, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetails {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    cupsecureplusSmscode: ").append(toIndentedString(cupsecureplusSmscode)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    encryptedCardNumber: ").append(toIndentedString(encryptedCardNumber)).append("\n");
    sb.append("    encryptedExpiryMonth: ").append(toIndentedString(encryptedExpiryMonth)).append("\n");
    sb.append("    encryptedExpiryYear: ").append(toIndentedString(encryptedExpiryYear)).append("\n");
    sb.append("    encryptedSecurityCode: ").append(toIndentedString(encryptedSecurityCode)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    networkPaymentReference: ").append(toIndentedString(networkPaymentReference)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperNotificationReference: ").append(toIndentedString(shopperNotificationReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    threeDS2SdkVersion: ").append(toIndentedString(threeDS2SdkVersion)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("checkoutAttemptId");
    openapiFields.add("cupsecureplus.smscode");
    openapiFields.add("cvc");
    openapiFields.add("encryptedCardNumber");
    openapiFields.add("encryptedExpiryMonth");
    openapiFields.add("encryptedExpiryYear");
    openapiFields.add("encryptedSecurityCode");
    openapiFields.add("expiryMonth");
    openapiFields.add("expiryYear");
    openapiFields.add("fundingSource");
    openapiFields.add("holderName");
    openapiFields.add("networkPaymentReference");
    openapiFields.add("number");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("shopperNotificationReference");
    openapiFields.add("storedPaymentMethodId");
    openapiFields.add("threeDS2SdkVersion");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("encryptedCardNumber");
    openapiRequiredFields.add("encryptedExpiryMonth");
    openapiRequiredFields.add("encryptedExpiryYear");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardDetails is not found in the empty JSON string", CardDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field brand
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      // validate the optional field checkoutAttemptId
      if (jsonObj.get("checkoutAttemptId") != null && !jsonObj.get("checkoutAttemptId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkoutAttemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkoutAttemptId").toString()));
      }
      // validate the optional field cupsecureplus.smscode
      if (jsonObj.get("cupsecureplus.smscode") != null && !jsonObj.get("cupsecureplus.smscode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cupsecureplus.smscode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cupsecureplus.smscode").toString()));
      }
      // validate the optional field cvc
      if (jsonObj.get("cvc") != null && !jsonObj.get("cvc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvc").toString()));
      }
      // validate the optional field encryptedCardNumber
      if (jsonObj.get("encryptedCardNumber") != null && !jsonObj.get("encryptedCardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedCardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedCardNumber").toString()));
      }
      // validate the optional field encryptedExpiryMonth
      if (jsonObj.get("encryptedExpiryMonth") != null && !jsonObj.get("encryptedExpiryMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedExpiryMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedExpiryMonth").toString()));
      }
      // validate the optional field encryptedExpiryYear
      if (jsonObj.get("encryptedExpiryYear") != null && !jsonObj.get("encryptedExpiryYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedExpiryYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedExpiryYear").toString()));
      }
      // validate the optional field encryptedSecurityCode
      if (jsonObj.get("encryptedSecurityCode") != null && !jsonObj.get("encryptedSecurityCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedSecurityCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedSecurityCode").toString()));
      }
      // validate the optional field expiryMonth
      if (jsonObj.get("expiryMonth") != null && !jsonObj.get("expiryMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryMonth").toString()));
      }
      // validate the optional field expiryYear
      if (jsonObj.get("expiryYear") != null && !jsonObj.get("expiryYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryYear").toString()));
      }
      // ensure the field fundingSource can be parsed to an enum value
      if (jsonObj.get("fundingSource") != null) {
        if(!jsonObj.get("fundingSource").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `fundingSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundingSource").toString()));
        }
        FundingSourceEnum.fromValue(jsonObj.get("fundingSource").getAsString());
      }
      // validate the optional field holderName
      if (jsonObj.get("holderName") != null && !jsonObj.get("holderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holderName").toString()));
      }
      // validate the optional field networkPaymentReference
      if (jsonObj.get("networkPaymentReference") != null && !jsonObj.get("networkPaymentReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkPaymentReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkPaymentReference").toString()));
      }
      // validate the optional field number
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field shopperNotificationReference
      if (jsonObj.get("shopperNotificationReference") != null && !jsonObj.get("shopperNotificationReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperNotificationReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperNotificationReference").toString()));
      }
      // validate the optional field storedPaymentMethodId
      if (jsonObj.get("storedPaymentMethodId") != null && !jsonObj.get("storedPaymentMethodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storedPaymentMethodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storedPaymentMethodId").toString()));
      }
      // validate the optional field threeDS2SdkVersion
      if (jsonObj.get("threeDS2SdkVersion") != null && !jsonObj.get("threeDS2SdkVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDS2SdkVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDS2SdkVersion").toString()));
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
       if (!CardDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CardDetails>() {
           @Override
           public void write(JsonWriter out, CardDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardDetails
  * @throws IOException if the JSON string is invalid with respect to CardDetails
  */
  public static CardDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardDetails.class);
  }

 /**
  * Convert an instance of CardDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

