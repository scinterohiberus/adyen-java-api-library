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
 * AdditionalDataRatepay
 */

public class AdditionalDataRatepay {
  public static final String SERIALIZED_NAME_RATEPAY_INSTALLMENT_AMOUNT = "ratepay.installmentAmount";
  @SerializedName(SERIALIZED_NAME_RATEPAY_INSTALLMENT_AMOUNT)
  private String ratepayInstallmentAmount;

  public static final String SERIALIZED_NAME_RATEPAY_INTEREST_RATE = "ratepay.interestRate";
  @SerializedName(SERIALIZED_NAME_RATEPAY_INTEREST_RATE)
  private String ratepayInterestRate;

  public static final String SERIALIZED_NAME_RATEPAY_LAST_INSTALLMENT_AMOUNT = "ratepay.lastInstallmentAmount";
  @SerializedName(SERIALIZED_NAME_RATEPAY_LAST_INSTALLMENT_AMOUNT)
  private String ratepayLastInstallmentAmount;

  public static final String SERIALIZED_NAME_RATEPAY_PAYMENT_FIRSTDAY = "ratepay.paymentFirstday";
  @SerializedName(SERIALIZED_NAME_RATEPAY_PAYMENT_FIRSTDAY)
  private String ratepayPaymentFirstday;

  public static final String SERIALIZED_NAME_RATEPAYDATA_DELIVERY_DATE = "ratepaydata.deliveryDate";
  @SerializedName(SERIALIZED_NAME_RATEPAYDATA_DELIVERY_DATE)
  private String ratepaydataDeliveryDate;

  public static final String SERIALIZED_NAME_RATEPAYDATA_DUE_DATE = "ratepaydata.dueDate";
  @SerializedName(SERIALIZED_NAME_RATEPAYDATA_DUE_DATE)
  private String ratepaydataDueDate;

  public static final String SERIALIZED_NAME_RATEPAYDATA_INVOICE_DATE = "ratepaydata.invoiceDate";
  @SerializedName(SERIALIZED_NAME_RATEPAYDATA_INVOICE_DATE)
  private String ratepaydataInvoiceDate;

  public static final String SERIALIZED_NAME_RATEPAYDATA_INVOICE_ID = "ratepaydata.invoiceId";
  @SerializedName(SERIALIZED_NAME_RATEPAYDATA_INVOICE_ID)
  private String ratepaydataInvoiceId;

  public AdditionalDataRatepay() { 
  }

  public AdditionalDataRatepay ratepayInstallmentAmount(String ratepayInstallmentAmount) {
    
    this.ratepayInstallmentAmount = ratepayInstallmentAmount;
    return this;
  }

   /**
   * Amount the customer has to pay each month.
   * @return ratepayInstallmentAmount
  **/
  @ApiModelProperty(value = "Amount the customer has to pay each month.")

  public String getRatepayInstallmentAmount() {
    return ratepayInstallmentAmount;
  }


  public void setRatepayInstallmentAmount(String ratepayInstallmentAmount) {
    this.ratepayInstallmentAmount = ratepayInstallmentAmount;
  }


  public AdditionalDataRatepay ratepayInterestRate(String ratepayInterestRate) {
    
    this.ratepayInterestRate = ratepayInterestRate;
    return this;
  }

   /**
   * Interest rate of this installment.
   * @return ratepayInterestRate
  **/
  @ApiModelProperty(value = "Interest rate of this installment.")

  public String getRatepayInterestRate() {
    return ratepayInterestRate;
  }


  public void setRatepayInterestRate(String ratepayInterestRate) {
    this.ratepayInterestRate = ratepayInterestRate;
  }


  public AdditionalDataRatepay ratepayLastInstallmentAmount(String ratepayLastInstallmentAmount) {
    
    this.ratepayLastInstallmentAmount = ratepayLastInstallmentAmount;
    return this;
  }

   /**
   * Amount of the last installment.
   * @return ratepayLastInstallmentAmount
  **/
  @ApiModelProperty(value = "Amount of the last installment.")

  public String getRatepayLastInstallmentAmount() {
    return ratepayLastInstallmentAmount;
  }


  public void setRatepayLastInstallmentAmount(String ratepayLastInstallmentAmount) {
    this.ratepayLastInstallmentAmount = ratepayLastInstallmentAmount;
  }


  public AdditionalDataRatepay ratepayPaymentFirstday(String ratepayPaymentFirstday) {
    
    this.ratepayPaymentFirstday = ratepayPaymentFirstday;
    return this;
  }

   /**
   * Calendar day of the first payment.
   * @return ratepayPaymentFirstday
  **/
  @ApiModelProperty(value = "Calendar day of the first payment.")

  public String getRatepayPaymentFirstday() {
    return ratepayPaymentFirstday;
  }


  public void setRatepayPaymentFirstday(String ratepayPaymentFirstday) {
    this.ratepayPaymentFirstday = ratepayPaymentFirstday;
  }


  public AdditionalDataRatepay ratepaydataDeliveryDate(String ratepaydataDeliveryDate) {
    
    this.ratepaydataDeliveryDate = ratepaydataDeliveryDate;
    return this;
  }

   /**
   * Date the merchant delivered the goods to the customer.
   * @return ratepaydataDeliveryDate
  **/
  @ApiModelProperty(value = "Date the merchant delivered the goods to the customer.")

  public String getRatepaydataDeliveryDate() {
    return ratepaydataDeliveryDate;
  }


  public void setRatepaydataDeliveryDate(String ratepaydataDeliveryDate) {
    this.ratepaydataDeliveryDate = ratepaydataDeliveryDate;
  }


  public AdditionalDataRatepay ratepaydataDueDate(String ratepaydataDueDate) {
    
    this.ratepaydataDueDate = ratepaydataDueDate;
    return this;
  }

   /**
   * Date by which the customer must settle the payment.
   * @return ratepaydataDueDate
  **/
  @ApiModelProperty(value = "Date by which the customer must settle the payment.")

  public String getRatepaydataDueDate() {
    return ratepaydataDueDate;
  }


  public void setRatepaydataDueDate(String ratepaydataDueDate) {
    this.ratepaydataDueDate = ratepaydataDueDate;
  }


  public AdditionalDataRatepay ratepaydataInvoiceDate(String ratepaydataInvoiceDate) {
    
    this.ratepaydataInvoiceDate = ratepaydataInvoiceDate;
    return this;
  }

   /**
   * Invoice date, defined by the merchant. If not included, the invoice date is set to the delivery date.
   * @return ratepaydataInvoiceDate
  **/
  @ApiModelProperty(value = "Invoice date, defined by the merchant. If not included, the invoice date is set to the delivery date.")

  public String getRatepaydataInvoiceDate() {
    return ratepaydataInvoiceDate;
  }


  public void setRatepaydataInvoiceDate(String ratepaydataInvoiceDate) {
    this.ratepaydataInvoiceDate = ratepaydataInvoiceDate;
  }


  public AdditionalDataRatepay ratepaydataInvoiceId(String ratepaydataInvoiceId) {
    
    this.ratepaydataInvoiceId = ratepaydataInvoiceId;
    return this;
  }

   /**
   * Identification name or number for the invoice, defined by the merchant.
   * @return ratepaydataInvoiceId
  **/
  @ApiModelProperty(value = "Identification name or number for the invoice, defined by the merchant.")

  public String getRatepaydataInvoiceId() {
    return ratepaydataInvoiceId;
  }


  public void setRatepaydataInvoiceId(String ratepaydataInvoiceId) {
    this.ratepaydataInvoiceId = ratepaydataInvoiceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataRatepay additionalDataRatepay = (AdditionalDataRatepay) o;
    return Objects.equals(this.ratepayInstallmentAmount, additionalDataRatepay.ratepayInstallmentAmount) &&
        Objects.equals(this.ratepayInterestRate, additionalDataRatepay.ratepayInterestRate) &&
        Objects.equals(this.ratepayLastInstallmentAmount, additionalDataRatepay.ratepayLastInstallmentAmount) &&
        Objects.equals(this.ratepayPaymentFirstday, additionalDataRatepay.ratepayPaymentFirstday) &&
        Objects.equals(this.ratepaydataDeliveryDate, additionalDataRatepay.ratepaydataDeliveryDate) &&
        Objects.equals(this.ratepaydataDueDate, additionalDataRatepay.ratepaydataDueDate) &&
        Objects.equals(this.ratepaydataInvoiceDate, additionalDataRatepay.ratepaydataInvoiceDate) &&
        Objects.equals(this.ratepaydataInvoiceId, additionalDataRatepay.ratepaydataInvoiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratepayInstallmentAmount, ratepayInterestRate, ratepayLastInstallmentAmount, ratepayPaymentFirstday, ratepaydataDeliveryDate, ratepaydataDueDate, ratepaydataInvoiceDate, ratepaydataInvoiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataRatepay {\n");
    sb.append("    ratepayInstallmentAmount: ").append(toIndentedString(ratepayInstallmentAmount)).append("\n");
    sb.append("    ratepayInterestRate: ").append(toIndentedString(ratepayInterestRate)).append("\n");
    sb.append("    ratepayLastInstallmentAmount: ").append(toIndentedString(ratepayLastInstallmentAmount)).append("\n");
    sb.append("    ratepayPaymentFirstday: ").append(toIndentedString(ratepayPaymentFirstday)).append("\n");
    sb.append("    ratepaydataDeliveryDate: ").append(toIndentedString(ratepaydataDeliveryDate)).append("\n");
    sb.append("    ratepaydataDueDate: ").append(toIndentedString(ratepaydataDueDate)).append("\n");
    sb.append("    ratepaydataInvoiceDate: ").append(toIndentedString(ratepaydataInvoiceDate)).append("\n");
    sb.append("    ratepaydataInvoiceId: ").append(toIndentedString(ratepaydataInvoiceId)).append("\n");
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
    openapiFields.add("ratepay.installmentAmount");
    openapiFields.add("ratepay.interestRate");
    openapiFields.add("ratepay.lastInstallmentAmount");
    openapiFields.add("ratepay.paymentFirstday");
    openapiFields.add("ratepaydata.deliveryDate");
    openapiFields.add("ratepaydata.dueDate");
    openapiFields.add("ratepaydata.invoiceDate");
    openapiFields.add("ratepaydata.invoiceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataRatepay
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataRatepay.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataRatepay is not found in the empty JSON string", AdditionalDataRatepay.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataRatepay.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataRatepay` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field ratepay.installmentAmount
      if (jsonObj.get("ratepay.installmentAmount") != null && !jsonObj.get("ratepay.installmentAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratepay.installmentAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratepay.installmentAmount").toString()));
      }
      // validate the optional field ratepay.interestRate
      if (jsonObj.get("ratepay.interestRate") != null && !jsonObj.get("ratepay.interestRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratepay.interestRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratepay.interestRate").toString()));
      }
      // validate the optional field ratepay.lastInstallmentAmount
      if (jsonObj.get("ratepay.lastInstallmentAmount") != null && !jsonObj.get("ratepay.lastInstallmentAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratepay.lastInstallmentAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratepay.lastInstallmentAmount").toString()));
      }
      // validate the optional field ratepay.paymentFirstday
      if (jsonObj.get("ratepay.paymentFirstday") != null && !jsonObj.get("ratepay.paymentFirstday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratepay.paymentFirstday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratepay.paymentFirstday").toString()));
      }
      // validate the optional field ratepaydata.deliveryDate
      if (jsonObj.get("ratepaydata.deliveryDate") != null && !jsonObj.get("ratepaydata.deliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratepaydata.deliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratepaydata.deliveryDate").toString()));
      }
      // validate the optional field ratepaydata.dueDate
      if (jsonObj.get("ratepaydata.dueDate") != null && !jsonObj.get("ratepaydata.dueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratepaydata.dueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratepaydata.dueDate").toString()));
      }
      // validate the optional field ratepaydata.invoiceDate
      if (jsonObj.get("ratepaydata.invoiceDate") != null && !jsonObj.get("ratepaydata.invoiceDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratepaydata.invoiceDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratepaydata.invoiceDate").toString()));
      }
      // validate the optional field ratepaydata.invoiceId
      if (jsonObj.get("ratepaydata.invoiceId") != null && !jsonObj.get("ratepaydata.invoiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ratepaydata.invoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ratepaydata.invoiceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataRatepay.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataRatepay' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataRatepay> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataRatepay.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataRatepay>() {
           @Override
           public void write(JsonWriter out, AdditionalDataRatepay value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataRatepay read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalDataRatepay given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalDataRatepay
  * @throws IOException if the JSON string is invalid with respect to AdditionalDataRatepay
  */
  public static AdditionalDataRatepay fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalDataRatepay.class);
  }

 /**
  * Convert an instance of AdditionalDataRatepay to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

