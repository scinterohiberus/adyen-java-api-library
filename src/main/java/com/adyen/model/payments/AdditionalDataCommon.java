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

import com.adyen.model.payments.JSON;

/**
 * AdditionalDataCommon
 */

public class AdditionalDataCommon {
  public static final String SERIALIZED_NAME_REQUESTED_TEST_ERROR_RESPONSE_CODE = "RequestedTestErrorResponseCode";
  @SerializedName(SERIALIZED_NAME_REQUESTED_TEST_ERROR_RESPONSE_CODE)
  private String requestedTestErrorResponseCode;

  public static final String SERIALIZED_NAME_AUTHORISATION_TYPE = "authorisationType";
  @SerializedName(SERIALIZED_NAME_AUTHORISATION_TYPE)
  private String authorisationType;

  public static final String SERIALIZED_NAME_CUSTOM_ROUTING_FLAG = "customRoutingFlag";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ROUTING_FLAG)
  private String customRoutingFlag;

  /**
   * In case of [asynchronous authorisation adjustment](https://docs.adyen.com/online-payments/adjust-authorisation#adjust-authorisation), this field denotes why the additional payment is made.  Possible values:   * **NoShow**: An incremental charge is carried out because of a no-show for a guaranteed reservation.   * **DelayedCharge**: An incremental charge is carried out to process an additional payment after the original services have been rendered and the respective payment has been processed.
   */
  @JsonAdapter(IndustryUsageEnum.Adapter.class)
  public enum IndustryUsageEnum {
    NOSHOW("NoShow"),
    
    DELAYEDCHARGE("DelayedCharge");

    private String value;

    IndustryUsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IndustryUsageEnum fromValue(String value) {
      for (IndustryUsageEnum b : IndustryUsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IndustryUsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndustryUsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndustryUsageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IndustryUsageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INDUSTRY_USAGE = "industryUsage";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_USAGE)
  private IndustryUsageEnum industryUsage;

  public static final String SERIALIZED_NAME_NETWORK_TX_REFERENCE = "networkTxReference";
  @SerializedName(SERIALIZED_NAME_NETWORK_TX_REFERENCE)
  private String networkTxReference;

  public static final String SERIALIZED_NAME_OVERWRITE_BRAND = "overwriteBrand";
  @SerializedName(SERIALIZED_NAME_OVERWRITE_BRAND)
  private String overwriteBrand;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_CITY = "subMerchantCity";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_CITY)
  private String subMerchantCity;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_COUNTRY = "subMerchantCountry";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_COUNTRY)
  private String subMerchantCountry;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_I_D = "subMerchantID";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_I_D)
  private String subMerchantID;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_NAME = "subMerchantName";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_NAME)
  private String subMerchantName;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_POSTAL_CODE = "subMerchantPostalCode";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_POSTAL_CODE)
  private String subMerchantPostalCode;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_STATE = "subMerchantState";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_STATE)
  private String subMerchantState;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_STREET = "subMerchantStreet";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_STREET)
  private String subMerchantStreet;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_TAX_ID = "subMerchantTaxId";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_TAX_ID)
  private String subMerchantTaxId;

  public AdditionalDataCommon() { 
  }

  public AdditionalDataCommon requestedTestErrorResponseCode(String requestedTestErrorResponseCode) {
    
    this.requestedTestErrorResponseCode = requestedTestErrorResponseCode;
    return this;
  }

   /**
   * Triggers test scenarios that allow to replicate certain communication errors.  Allowed values: * **NO_CONNECTION_AVAILABLE** – There wasn&#39;t a connection available to service the outgoing communication. This is a transient, retriable error since no messaging could be initiated to an issuing system (or third-party acquiring system). Therefore, the header Transient-Error: true is returned in the response. A subsequent request using the same idempotency key will be processed as if it was the first request. * **IOEXCEPTION_RECEIVED** – Something went wrong during transmission of the message or receiving the response. This is a classified as non-transient because the message could have been received by the issuing party and been acted upon. No transient error header is returned. If using idempotency, the (error) response is stored as the final result for the idempotency key. Subsequent messages with the same idempotency key not be processed beyond returning the stored response.
   * @return requestedTestErrorResponseCode
  **/
  @ApiModelProperty(value = "Triggers test scenarios that allow to replicate certain communication errors.  Allowed values: * **NO_CONNECTION_AVAILABLE** – There wasn't a connection available to service the outgoing communication. This is a transient, retriable error since no messaging could be initiated to an issuing system (or third-party acquiring system). Therefore, the header Transient-Error: true is returned in the response. A subsequent request using the same idempotency key will be processed as if it was the first request. * **IOEXCEPTION_RECEIVED** – Something went wrong during transmission of the message or receiving the response. This is a classified as non-transient because the message could have been received by the issuing party and been acted upon. No transient error header is returned. If using idempotency, the (error) response is stored as the final result for the idempotency key. Subsequent messages with the same idempotency key not be processed beyond returning the stored response.")

  public String getRequestedTestErrorResponseCode() {
    return requestedTestErrorResponseCode;
  }


  public void setRequestedTestErrorResponseCode(String requestedTestErrorResponseCode) {
    this.requestedTestErrorResponseCode = requestedTestErrorResponseCode;
  }


  public AdditionalDataCommon authorisationType(String authorisationType) {
    
    this.authorisationType = authorisationType;
    return this;
  }

   /**
   * Flags a card payment request for either pre-authorisation or final authorisation. For more information, refer to [Authorisation types](https://docs.adyen.com/online-payments/adjust-authorisation#authorisation-types).  Allowed values: * **PreAuth** – flags the payment request to be handled as a pre-authorisation. * **FinalAuth** – flags the payment request to be handled as a final authorisation.
   * @return authorisationType
  **/
  @ApiModelProperty(value = "Flags a card payment request for either pre-authorisation or final authorisation. For more information, refer to [Authorisation types](https://docs.adyen.com/online-payments/adjust-authorisation#authorisation-types).  Allowed values: * **PreAuth** – flags the payment request to be handled as a pre-authorisation. * **FinalAuth** – flags the payment request to be handled as a final authorisation.")

  public String getAuthorisationType() {
    return authorisationType;
  }


  public void setAuthorisationType(String authorisationType) {
    this.authorisationType = authorisationType;
  }


  public AdditionalDataCommon customRoutingFlag(String customRoutingFlag) {
    
    this.customRoutingFlag = customRoutingFlag;
    return this;
  }

   /**
   * Allows you to determine or override the acquirer account that should be used for the transaction.  If you need to process a payment with an acquirer different from a default one, you can set up a corresponding configuration on the Adyen payments platform. Then you can pass a custom routing flag in a payment request&#39;s additional data to target a specific acquirer.  To enable this functionality, contact [Support](https://www.adyen.help/hc/en-us/requests/new).
   * @return customRoutingFlag
  **/
  @ApiModelProperty(value = "Allows you to determine or override the acquirer account that should be used for the transaction.  If you need to process a payment with an acquirer different from a default one, you can set up a corresponding configuration on the Adyen payments platform. Then you can pass a custom routing flag in a payment request's additional data to target a specific acquirer.  To enable this functionality, contact [Support](https://www.adyen.help/hc/en-us/requests/new).")

  public String getCustomRoutingFlag() {
    return customRoutingFlag;
  }


  public void setCustomRoutingFlag(String customRoutingFlag) {
    this.customRoutingFlag = customRoutingFlag;
  }


  public AdditionalDataCommon industryUsage(IndustryUsageEnum industryUsage) {
    
    this.industryUsage = industryUsage;
    return this;
  }

   /**
   * In case of [asynchronous authorisation adjustment](https://docs.adyen.com/online-payments/adjust-authorisation#adjust-authorisation), this field denotes why the additional payment is made.  Possible values:   * **NoShow**: An incremental charge is carried out because of a no-show for a guaranteed reservation.   * **DelayedCharge**: An incremental charge is carried out to process an additional payment after the original services have been rendered and the respective payment has been processed.
   * @return industryUsage
  **/
  @ApiModelProperty(value = "In case of [asynchronous authorisation adjustment](https://docs.adyen.com/online-payments/adjust-authorisation#adjust-authorisation), this field denotes why the additional payment is made.  Possible values:   * **NoShow**: An incremental charge is carried out because of a no-show for a guaranteed reservation.   * **DelayedCharge**: An incremental charge is carried out to process an additional payment after the original services have been rendered and the respective payment has been processed.")

  public IndustryUsageEnum getIndustryUsage() {
    return industryUsage;
  }


  public void setIndustryUsage(IndustryUsageEnum industryUsage) {
    this.industryUsage = industryUsage;
  }


  public AdditionalDataCommon networkTxReference(String networkTxReference) {
    
    this.networkTxReference = networkTxReference;
    return this;
  }

   /**
   * Allows you to link the transaction to the original or previous one in a subscription/card-on-file chain. This field is required for token-based transactions where Adyen does not tokenize the card.  Transaction identifier from card schemes, for example, Mastercard Trace ID or the Visa Transaction ID.  Submit the original transaction ID of the contract in your payment request if you are not tokenizing card details with Adyen and are making a merchant-initiated transaction (MIT) for subsequent charges.  Make sure you are sending &#x60;shopperInteraction&#x60; **ContAuth** and &#x60;recurringProcessingModel&#x60; **Subscription** or **UnscheduledCardOnFile** to ensure that the transaction is classified as MIT.
   * @return networkTxReference
  **/
  @ApiModelProperty(value = "Allows you to link the transaction to the original or previous one in a subscription/card-on-file chain. This field is required for token-based transactions where Adyen does not tokenize the card.  Transaction identifier from card schemes, for example, Mastercard Trace ID or the Visa Transaction ID.  Submit the original transaction ID of the contract in your payment request if you are not tokenizing card details with Adyen and are making a merchant-initiated transaction (MIT) for subsequent charges.  Make sure you are sending `shopperInteraction` **ContAuth** and `recurringProcessingModel` **Subscription** or **UnscheduledCardOnFile** to ensure that the transaction is classified as MIT.")

  public String getNetworkTxReference() {
    return networkTxReference;
  }


  public void setNetworkTxReference(String networkTxReference) {
    this.networkTxReference = networkTxReference;
  }


  public AdditionalDataCommon overwriteBrand(String overwriteBrand) {
    
    this.overwriteBrand = overwriteBrand;
    return this;
  }

   /**
   * Boolean indicator that can be optionally used for performing debit transactions on combo cards (for example, combo cards in Brazil). This is not mandatory but we recommend that you set this to true if you want to use the &#x60;selectedBrand&#x60; value to specify how to process the transaction.
   * @return overwriteBrand
  **/
  @ApiModelProperty(value = "Boolean indicator that can be optionally used for performing debit transactions on combo cards (for example, combo cards in Brazil). This is not mandatory but we recommend that you set this to true if you want to use the `selectedBrand` value to specify how to process the transaction.")

  public String getOverwriteBrand() {
    return overwriteBrand;
  }


  public void setOverwriteBrand(String overwriteBrand) {
    this.overwriteBrand = overwriteBrand;
  }


  public AdditionalDataCommon subMerchantCity(String subMerchantCity) {
    
    this.subMerchantCity = subMerchantCity;
    return this;
  }

   /**
   * This field is required if the transaction is performed by a registered payment facilitator. This field must contain the city of the actual merchant&#39;s address. * Format: alpha-numeric. * Maximum length: 13 characters.
   * @return subMerchantCity
  **/
  @ApiModelProperty(value = "This field is required if the transaction is performed by a registered payment facilitator. This field must contain the city of the actual merchant's address. * Format: alpha-numeric. * Maximum length: 13 characters.")

  public String getSubMerchantCity() {
    return subMerchantCity;
  }


  public void setSubMerchantCity(String subMerchantCity) {
    this.subMerchantCity = subMerchantCity;
  }


  public AdditionalDataCommon subMerchantCountry(String subMerchantCountry) {
    
    this.subMerchantCountry = subMerchantCountry;
    return this;
  }

   /**
   * This field is required if the transaction is performed by a registered payment facilitator. This field must contain the three-letter country code of the actual merchant&#39;s address. * Format: alpha-numeric. * Fixed length: 3 characters.
   * @return subMerchantCountry
  **/
  @ApiModelProperty(value = "This field is required if the transaction is performed by a registered payment facilitator. This field must contain the three-letter country code of the actual merchant's address. * Format: alpha-numeric. * Fixed length: 3 characters.")

  public String getSubMerchantCountry() {
    return subMerchantCountry;
  }


  public void setSubMerchantCountry(String subMerchantCountry) {
    this.subMerchantCountry = subMerchantCountry;
  }


  public AdditionalDataCommon subMerchantID(String subMerchantID) {
    
    this.subMerchantID = subMerchantID;
    return this;
  }

   /**
   * This field contains an identifier of the actual merchant when a transaction is submitted via a payment facilitator. The payment facilitator must send in this unique ID.  A unique identifier per submerchant that is required if the transaction is performed by a registered payment facilitator. * Format: alpha-numeric. * Fixed length: 15 characters.
   * @return subMerchantID
  **/
  @ApiModelProperty(value = "This field contains an identifier of the actual merchant when a transaction is submitted via a payment facilitator. The payment facilitator must send in this unique ID.  A unique identifier per submerchant that is required if the transaction is performed by a registered payment facilitator. * Format: alpha-numeric. * Fixed length: 15 characters.")

  public String getSubMerchantID() {
    return subMerchantID;
  }


  public void setSubMerchantID(String subMerchantID) {
    this.subMerchantID = subMerchantID;
  }


  public AdditionalDataCommon subMerchantName(String subMerchantName) {
    
    this.subMerchantName = subMerchantName;
    return this;
  }

   /**
   * This field is required if the transaction is performed by a registered payment facilitator. This field must contain the name of the actual merchant. * Format: alpha-numeric. * Maximum length: 22 characters.
   * @return subMerchantName
  **/
  @ApiModelProperty(value = "This field is required if the transaction is performed by a registered payment facilitator. This field must contain the name of the actual merchant. * Format: alpha-numeric. * Maximum length: 22 characters.")

  public String getSubMerchantName() {
    return subMerchantName;
  }


  public void setSubMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
  }


  public AdditionalDataCommon subMerchantPostalCode(String subMerchantPostalCode) {
    
    this.subMerchantPostalCode = subMerchantPostalCode;
    return this;
  }

   /**
   * This field is required if the transaction is performed by a registered payment facilitator. This field must contain the postal code of the actual merchant&#39;s address. * Format: alpha-numeric. * Maximum length: 10 characters.
   * @return subMerchantPostalCode
  **/
  @ApiModelProperty(value = "This field is required if the transaction is performed by a registered payment facilitator. This field must contain the postal code of the actual merchant's address. * Format: alpha-numeric. * Maximum length: 10 characters.")

  public String getSubMerchantPostalCode() {
    return subMerchantPostalCode;
  }


  public void setSubMerchantPostalCode(String subMerchantPostalCode) {
    this.subMerchantPostalCode = subMerchantPostalCode;
  }


  public AdditionalDataCommon subMerchantState(String subMerchantState) {
    
    this.subMerchantState = subMerchantState;
    return this;
  }

   /**
   * This field is required if the transaction is performed by a registered payment facilitator, and if applicable to the country. This field must contain the state code of the actual merchant&#39;s address. * Format: alpha-numeric. * Maximum length: 3 characters.
   * @return subMerchantState
  **/
  @ApiModelProperty(value = "This field is required if the transaction is performed by a registered payment facilitator, and if applicable to the country. This field must contain the state code of the actual merchant's address. * Format: alpha-numeric. * Maximum length: 3 characters.")

  public String getSubMerchantState() {
    return subMerchantState;
  }


  public void setSubMerchantState(String subMerchantState) {
    this.subMerchantState = subMerchantState;
  }


  public AdditionalDataCommon subMerchantStreet(String subMerchantStreet) {
    
    this.subMerchantStreet = subMerchantStreet;
    return this;
  }

   /**
   * This field is required if the transaction is performed by a registered payment facilitator. This field must contain the street of the actual merchant&#39;s address. * Format: alpha-numeric. * Maximum length: 60 characters.
   * @return subMerchantStreet
  **/
  @ApiModelProperty(value = "This field is required if the transaction is performed by a registered payment facilitator. This field must contain the street of the actual merchant's address. * Format: alpha-numeric. * Maximum length: 60 characters.")

  public String getSubMerchantStreet() {
    return subMerchantStreet;
  }


  public void setSubMerchantStreet(String subMerchantStreet) {
    this.subMerchantStreet = subMerchantStreet;
  }


  public AdditionalDataCommon subMerchantTaxId(String subMerchantTaxId) {
    
    this.subMerchantTaxId = subMerchantTaxId;
    return this;
  }

   /**
   * This field is required if the transaction is performed by a registered payment facilitator. This field must contain the tax ID of the actual merchant. * Format: alpha-numeric. * Fixed length: 11 or 14 characters.
   * @return subMerchantTaxId
  **/
  @ApiModelProperty(value = "This field is required if the transaction is performed by a registered payment facilitator. This field must contain the tax ID of the actual merchant. * Format: alpha-numeric. * Fixed length: 11 or 14 characters.")

  public String getSubMerchantTaxId() {
    return subMerchantTaxId;
  }


  public void setSubMerchantTaxId(String subMerchantTaxId) {
    this.subMerchantTaxId = subMerchantTaxId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataCommon additionalDataCommon = (AdditionalDataCommon) o;
    return Objects.equals(this.requestedTestErrorResponseCode, additionalDataCommon.requestedTestErrorResponseCode) &&
        Objects.equals(this.authorisationType, additionalDataCommon.authorisationType) &&
        Objects.equals(this.customRoutingFlag, additionalDataCommon.customRoutingFlag) &&
        Objects.equals(this.industryUsage, additionalDataCommon.industryUsage) &&
        Objects.equals(this.networkTxReference, additionalDataCommon.networkTxReference) &&
        Objects.equals(this.overwriteBrand, additionalDataCommon.overwriteBrand) &&
        Objects.equals(this.subMerchantCity, additionalDataCommon.subMerchantCity) &&
        Objects.equals(this.subMerchantCountry, additionalDataCommon.subMerchantCountry) &&
        Objects.equals(this.subMerchantID, additionalDataCommon.subMerchantID) &&
        Objects.equals(this.subMerchantName, additionalDataCommon.subMerchantName) &&
        Objects.equals(this.subMerchantPostalCode, additionalDataCommon.subMerchantPostalCode) &&
        Objects.equals(this.subMerchantState, additionalDataCommon.subMerchantState) &&
        Objects.equals(this.subMerchantStreet, additionalDataCommon.subMerchantStreet) &&
        Objects.equals(this.subMerchantTaxId, additionalDataCommon.subMerchantTaxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedTestErrorResponseCode, authorisationType, customRoutingFlag, industryUsage, networkTxReference, overwriteBrand, subMerchantCity, subMerchantCountry, subMerchantID, subMerchantName, subMerchantPostalCode, subMerchantState, subMerchantStreet, subMerchantTaxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataCommon {\n");
    sb.append("    requestedTestErrorResponseCode: ").append(toIndentedString(requestedTestErrorResponseCode)).append("\n");
    sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
    sb.append("    customRoutingFlag: ").append(toIndentedString(customRoutingFlag)).append("\n");
    sb.append("    industryUsage: ").append(toIndentedString(industryUsage)).append("\n");
    sb.append("    networkTxReference: ").append(toIndentedString(networkTxReference)).append("\n");
    sb.append("    overwriteBrand: ").append(toIndentedString(overwriteBrand)).append("\n");
    sb.append("    subMerchantCity: ").append(toIndentedString(subMerchantCity)).append("\n");
    sb.append("    subMerchantCountry: ").append(toIndentedString(subMerchantCountry)).append("\n");
    sb.append("    subMerchantID: ").append(toIndentedString(subMerchantID)).append("\n");
    sb.append("    subMerchantName: ").append(toIndentedString(subMerchantName)).append("\n");
    sb.append("    subMerchantPostalCode: ").append(toIndentedString(subMerchantPostalCode)).append("\n");
    sb.append("    subMerchantState: ").append(toIndentedString(subMerchantState)).append("\n");
    sb.append("    subMerchantStreet: ").append(toIndentedString(subMerchantStreet)).append("\n");
    sb.append("    subMerchantTaxId: ").append(toIndentedString(subMerchantTaxId)).append("\n");
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
    openapiFields.add("RequestedTestErrorResponseCode");
    openapiFields.add("authorisationType");
    openapiFields.add("customRoutingFlag");
    openapiFields.add("industryUsage");
    openapiFields.add("networkTxReference");
    openapiFields.add("overwriteBrand");
    openapiFields.add("subMerchantCity");
    openapiFields.add("subMerchantCountry");
    openapiFields.add("subMerchantID");
    openapiFields.add("subMerchantName");
    openapiFields.add("subMerchantPostalCode");
    openapiFields.add("subMerchantState");
    openapiFields.add("subMerchantStreet");
    openapiFields.add("subMerchantTaxId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataCommon
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataCommon.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataCommon is not found in the empty JSON string", AdditionalDataCommon.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataCommon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataCommon` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field RequestedTestErrorResponseCode
      if (jsonObj.get("RequestedTestErrorResponseCode") != null && !jsonObj.get("RequestedTestErrorResponseCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestedTestErrorResponseCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RequestedTestErrorResponseCode").toString()));
      }
      // validate the optional field authorisationType
      if (jsonObj.get("authorisationType") != null && !jsonObj.get("authorisationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorisationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorisationType").toString()));
      }
      // validate the optional field customRoutingFlag
      if (jsonObj.get("customRoutingFlag") != null && !jsonObj.get("customRoutingFlag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customRoutingFlag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customRoutingFlag").toString()));
      }
      // ensure the field industryUsage can be parsed to an enum value
      if (jsonObj.get("industryUsage") != null) {
        if(!jsonObj.get("industryUsage").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `industryUsage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industryUsage").toString()));
        }
        IndustryUsageEnum.fromValue(jsonObj.get("industryUsage").getAsString());
      }
      // validate the optional field networkTxReference
      if (jsonObj.get("networkTxReference") != null && !jsonObj.get("networkTxReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkTxReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkTxReference").toString()));
      }
      // validate the optional field overwriteBrand
      if (jsonObj.get("overwriteBrand") != null && !jsonObj.get("overwriteBrand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overwriteBrand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overwriteBrand").toString()));
      }
      // validate the optional field subMerchantCity
      if (jsonObj.get("subMerchantCity") != null && !jsonObj.get("subMerchantCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subMerchantCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subMerchantCity").toString()));
      }
      // validate the optional field subMerchantCountry
      if (jsonObj.get("subMerchantCountry") != null && !jsonObj.get("subMerchantCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subMerchantCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subMerchantCountry").toString()));
      }
      // validate the optional field subMerchantID
      if (jsonObj.get("subMerchantID") != null && !jsonObj.get("subMerchantID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subMerchantID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subMerchantID").toString()));
      }
      // validate the optional field subMerchantName
      if (jsonObj.get("subMerchantName") != null && !jsonObj.get("subMerchantName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subMerchantName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subMerchantName").toString()));
      }
      // validate the optional field subMerchantPostalCode
      if (jsonObj.get("subMerchantPostalCode") != null && !jsonObj.get("subMerchantPostalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subMerchantPostalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subMerchantPostalCode").toString()));
      }
      // validate the optional field subMerchantState
      if (jsonObj.get("subMerchantState") != null && !jsonObj.get("subMerchantState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subMerchantState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subMerchantState").toString()));
      }
      // validate the optional field subMerchantStreet
      if (jsonObj.get("subMerchantStreet") != null && !jsonObj.get("subMerchantStreet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subMerchantStreet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subMerchantStreet").toString()));
      }
      // validate the optional field subMerchantTaxId
      if (jsonObj.get("subMerchantTaxId") != null && !jsonObj.get("subMerchantTaxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subMerchantTaxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subMerchantTaxId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataCommon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataCommon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataCommon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataCommon.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataCommon>() {
           @Override
           public void write(JsonWriter out, AdditionalDataCommon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataCommon read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalDataCommon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalDataCommon
  * @throws IOException if the JSON string is invalid with respect to AdditionalDataCommon
  */
  public static AdditionalDataCommon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalDataCommon.class);
  }

 /**
  * Convert an instance of AdditionalDataCommon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

