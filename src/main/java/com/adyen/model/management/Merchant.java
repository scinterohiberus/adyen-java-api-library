/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.management.DataCenter;
import com.adyen.model.management.MerchantLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.management.JSON;

/**
 * Merchant
 */

public class Merchant {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private MerchantLinks links;

  public static final String SERIALIZED_NAME_CAPTURE_DELAY = "captureDelay";
  @SerializedName(SERIALIZED_NAME_CAPTURE_DELAY)
  private String captureDelay;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_DATA_CENTERS = "dataCenters";
  @SerializedName(SERIALIZED_NAME_DATA_CENTERS)
  private List<DataCenter> dataCenters = null;

  public static final String SERIALIZED_NAME_DEFAULT_SHOPPER_INTERACTION = "defaultShopperInteraction";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SHOPPER_INTERACTION)
  private String defaultShopperInteraction;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MERCHANT_CITY = "merchantCity";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CITY)
  private String merchantCity;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICING_PLAN = "pricingPlan";
  @SerializedName(SERIALIZED_NAME_PRICING_PLAN)
  private String pricingPlan;

  public static final String SERIALIZED_NAME_PRIMARY_SETTLEMENT_CURRENCY = "primarySettlementCurrency";
  @SerializedName(SERIALIZED_NAME_PRIMARY_SETTLEMENT_CURRENCY)
  private String primarySettlementCurrency;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SHOP_WEB_ADDRESS = "shopWebAddress";
  @SerializedName(SERIALIZED_NAME_SHOP_WEB_ADDRESS)
  private String shopWebAddress;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public Merchant() { 
  }

  public Merchant links(MerchantLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  public MerchantLinks getLinks() {
    return links;
  }


  public void setLinks(MerchantLinks links) {
    this.links = links;
  }


  public Merchant captureDelay(String captureDelay) {
    
    this.captureDelay = captureDelay;
    return this;
  }

   /**
   * The [capture delay](https://docs.adyen.com/online-payments/capture#capture-delay) set for the merchant account.  Possible values: * **Immediate** * **Manual** * Number of days from **1** to **29**
   * @return captureDelay
  **/
  @ApiModelProperty(value = "The [capture delay](https://docs.adyen.com/online-payments/capture#capture-delay) set for the merchant account.  Possible values: * **Immediate** * **Manual** * Number of days from **1** to **29**")

  public String getCaptureDelay() {
    return captureDelay;
  }


  public void setCaptureDelay(String captureDelay) {
    this.captureDelay = captureDelay;
  }


  public Merchant companyId(String companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * The unique identifier of the company account this merchant belongs to
   * @return companyId
  **/
  @ApiModelProperty(value = "The unique identifier of the company account this merchant belongs to")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public Merchant dataCenters(List<DataCenter> dataCenters) {
    
    this.dataCenters = dataCenters;
    return this;
  }

  public Merchant addDataCentersItem(DataCenter dataCentersItem) {
    if (this.dataCenters == null) {
      this.dataCenters = new ArrayList<>();
    }
    this.dataCenters.add(dataCentersItem);
    return this;
  }

   /**
   * List of available data centers.  Adyen has several data centers around the world.In the URL that you use for making API requests, we recommend you use the live URL prefix from the data center closest to your shoppers.
   * @return dataCenters
  **/
  @ApiModelProperty(value = "List of available data centers.  Adyen has several data centers around the world.In the URL that you use for making API requests, we recommend you use the live URL prefix from the data center closest to your shoppers.")

  public List<DataCenter> getDataCenters() {
    return dataCenters;
  }


  public void setDataCenters(List<DataCenter> dataCenters) {
    this.dataCenters = dataCenters;
  }


  public Merchant defaultShopperInteraction(String defaultShopperInteraction) {
    
    this.defaultShopperInteraction = defaultShopperInteraction;
    return this;
  }

   /**
   * The default [&#x60;shopperInteraction&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/v68/post/payments__reqParam_shopperInteraction) value used when processing payments through this merchant account.
   * @return defaultShopperInteraction
  **/
  @ApiModelProperty(value = "The default [`shopperInteraction`](https://docs.adyen.com/api-explorer/#/CheckoutService/v68/post/payments__reqParam_shopperInteraction) value used when processing payments through this merchant account.")

  public String getDefaultShopperInteraction() {
    return defaultShopperInteraction;
  }


  public void setDefaultShopperInteraction(String defaultShopperInteraction) {
    this.defaultShopperInteraction = defaultShopperInteraction;
  }


  public Merchant description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the merchant account, maximum 300 characters
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the merchant account, maximum 300 characters")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Merchant id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the merchant account.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the merchant account.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Merchant merchantCity(String merchantCity) {
    
    this.merchantCity = merchantCity;
    return this;
  }

   /**
   * The city where the legal entity of this merchant account is registered.
   * @return merchantCity
  **/
  @ApiModelProperty(value = "The city where the legal entity of this merchant account is registered.")

  public String getMerchantCity() {
    return merchantCity;
  }


  public void setMerchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
  }


  public Merchant name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the legal entity associated with the merchant account.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the legal entity associated with the merchant account.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Merchant pricingPlan(String pricingPlan) {
    
    this.pricingPlan = pricingPlan;
    return this;
  }

   /**
   * Only applies to merchant accounts managed by Adyen&#39;s partners. The name of the pricing plan assigned to the merchant account.
   * @return pricingPlan
  **/
  @ApiModelProperty(value = "Only applies to merchant accounts managed by Adyen's partners. The name of the pricing plan assigned to the merchant account.")

  public String getPricingPlan() {
    return pricingPlan;
  }


  public void setPricingPlan(String pricingPlan) {
    this.pricingPlan = pricingPlan;
  }


  public Merchant primarySettlementCurrency(String primarySettlementCurrency) {
    
    this.primarySettlementCurrency = primarySettlementCurrency;
    return this;
  }

   /**
   * The currency of the country where the legal entity of this merchant account is registered. Format: [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, a legal entity based in the United States has USD as the primary settlement currency.
   * @return primarySettlementCurrency
  **/
  @ApiModelProperty(value = "The currency of the country where the legal entity of this merchant account is registered. Format: [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, a legal entity based in the United States has USD as the primary settlement currency.")

  public String getPrimarySettlementCurrency() {
    return primarySettlementCurrency;
  }


  public void setPrimarySettlementCurrency(String primarySettlementCurrency) {
    this.primarySettlementCurrency = primarySettlementCurrency;
  }


  public Merchant reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Reference of the merchant account.
   * @return reference
  **/
  @ApiModelProperty(value = "Reference of the merchant account.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Merchant shopWebAddress(String shopWebAddress) {
    
    this.shopWebAddress = shopWebAddress;
    return this;
  }

   /**
   * The URL for the ecommerce website used with this merchant account.
   * @return shopWebAddress
  **/
  @ApiModelProperty(value = "The URL for the ecommerce website used with this merchant account.")

  public String getShopWebAddress() {
    return shopWebAddress;
  }


  public void setShopWebAddress(String shopWebAddress) {
    this.shopWebAddress = shopWebAddress;
  }


  public Merchant status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the merchant account.  Possible values:  * **PreActive**: The merchant account has been created. Users cannot access the merchant account in the Customer Area. The account cannot process payments. * **Active**: Users can access the merchant account in the Customer Area. If the company account is also **Active**, then payment processing and payouts are enabled. * **InactiveWithModifications**: Users can access the merchant account in the Customer Area. You cannot process new payments but you can still modify payments, for example issue refunds. You can still receive payouts. * **Inactive**: Users can access the merchant account in the Customer Area. Payment processing and payouts are disabled. * **Closed**: The account is closed and this cannot be reversed. Users cannot log in. Payment processing and payouts are disabled.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the merchant account.  Possible values:  * **PreActive**: The merchant account has been created. Users cannot access the merchant account in the Customer Area. The account cannot process payments. * **Active**: Users can access the merchant account in the Customer Area. If the company account is also **Active**, then payment processing and payouts are enabled. * **InactiveWithModifications**: Users can access the merchant account in the Customer Area. You cannot process new payments but you can still modify payments, for example issue refunds. You can still receive payouts. * **Inactive**: Users can access the merchant account in the Customer Area. Payment processing and payouts are disabled. * **Closed**: The account is closed and this cannot be reversed. Users cannot log in. Payment processing and payouts are disabled.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.links, merchant.links) &&
        Objects.equals(this.captureDelay, merchant.captureDelay) &&
        Objects.equals(this.companyId, merchant.companyId) &&
        Objects.equals(this.dataCenters, merchant.dataCenters) &&
        Objects.equals(this.defaultShopperInteraction, merchant.defaultShopperInteraction) &&
        Objects.equals(this.description, merchant.description) &&
        Objects.equals(this.id, merchant.id) &&
        Objects.equals(this.merchantCity, merchant.merchantCity) &&
        Objects.equals(this.name, merchant.name) &&
        Objects.equals(this.pricingPlan, merchant.pricingPlan) &&
        Objects.equals(this.primarySettlementCurrency, merchant.primarySettlementCurrency) &&
        Objects.equals(this.reference, merchant.reference) &&
        Objects.equals(this.shopWebAddress, merchant.shopWebAddress) &&
        Objects.equals(this.status, merchant.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, captureDelay, companyId, dataCenters, defaultShopperInteraction, description, id, merchantCity, name, pricingPlan, primarySettlementCurrency, reference, shopWebAddress, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    captureDelay: ").append(toIndentedString(captureDelay)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    dataCenters: ").append(toIndentedString(dataCenters)).append("\n");
    sb.append("    defaultShopperInteraction: ").append(toIndentedString(defaultShopperInteraction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantCity: ").append(toIndentedString(merchantCity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricingPlan: ").append(toIndentedString(pricingPlan)).append("\n");
    sb.append("    primarySettlementCurrency: ").append(toIndentedString(primarySettlementCurrency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopWebAddress: ").append(toIndentedString(shopWebAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("captureDelay");
    openapiFields.add("companyId");
    openapiFields.add("dataCenters");
    openapiFields.add("defaultShopperInteraction");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("merchantCity");
    openapiFields.add("name");
    openapiFields.add("pricingPlan");
    openapiFields.add("primarySettlementCurrency");
    openapiFields.add("reference");
    openapiFields.add("shopWebAddress");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Merchant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Merchant.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Merchant is not found in the empty JSON string", Merchant.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Merchant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Merchant` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.getAsJsonObject("_links") != null) {
        MerchantLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      // validate the optional field captureDelay
      if (jsonObj.get("captureDelay") != null && !jsonObj.get("captureDelay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `captureDelay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("captureDelay").toString()));
      }
      // validate the optional field companyId
      if (jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      JsonArray jsonArraydataCenters = jsonObj.getAsJsonArray("dataCenters");
      if (jsonArraydataCenters != null) {
        // ensure the json data is an array
        if (!jsonObj.get("dataCenters").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `dataCenters` to be an array in the JSON string but got `%s`", jsonObj.get("dataCenters").toString()));
        }

        // validate the optional field `dataCenters` (array)
        for (int i = 0; i < jsonArraydataCenters.size(); i++) {
          DataCenter.validateJsonObject(jsonArraydataCenters.get(i).getAsJsonObject());
        };
      }
      // validate the optional field defaultShopperInteraction
      if (jsonObj.get("defaultShopperInteraction") != null && !jsonObj.get("defaultShopperInteraction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultShopperInteraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultShopperInteraction").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field merchantCity
      if (jsonObj.get("merchantCity") != null && !jsonObj.get("merchantCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantCity").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field pricingPlan
      if (jsonObj.get("pricingPlan") != null && !jsonObj.get("pricingPlan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricingPlan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricingPlan").toString()));
      }
      // validate the optional field primarySettlementCurrency
      if (jsonObj.get("primarySettlementCurrency") != null && !jsonObj.get("primarySettlementCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primarySettlementCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primarySettlementCurrency").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field shopWebAddress
      if (jsonObj.get("shopWebAddress") != null && !jsonObj.get("shopWebAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopWebAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopWebAddress").toString()));
      }
      // validate the optional field status
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Merchant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Merchant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Merchant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Merchant.class));

       return (TypeAdapter<T>) new TypeAdapter<Merchant>() {
           @Override
           public void write(JsonWriter out, Merchant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Merchant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Merchant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Merchant
  * @throws IOException if the JSON string is invalid with respect to Merchant
  */
  public static Merchant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Merchant.class);
  }

 /**
  * Convert an instance of Merchant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

