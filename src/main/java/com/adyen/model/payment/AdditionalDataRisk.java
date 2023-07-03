/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AdditionalDataRisk
 */
@JsonPropertyOrder({
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_CUSTOM_FIELD_NAME,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_AMOUNT_PER_ITEM,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_BRAND,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_CATEGORY,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_COLOR,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_CURRENCY,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_ITEM_I_D,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_MANUFACTURER,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_PRODUCT_TITLE,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_QUANTITY,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_RECEIVER_EMAIL,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_SIZE,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_SKU,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_UPC,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_CODE,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_AMOUNT,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_CURRENCY,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_PERCENTAGE,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_NAME,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_RISK_PROFILE_REFERENCE,
  AdditionalDataRisk.JSON_PROPERTY_RISKDATA_SKIP_RISK
})

public class AdditionalDataRisk {
  public static final String JSON_PROPERTY_RISKDATA_CUSTOM_FIELD_NAME = "riskdata.[customFieldName]";
  private String riskdataCustomFieldName;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_AMOUNT_PER_ITEM = "riskdata.basket.item[itemNr].amountPerItem";
  private String riskdataBasketItemItemNrAmountPerItem;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_BRAND = "riskdata.basket.item[itemNr].brand";
  private String riskdataBasketItemItemNrBrand;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_CATEGORY = "riskdata.basket.item[itemNr].category";
  private String riskdataBasketItemItemNrCategory;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_COLOR = "riskdata.basket.item[itemNr].color";
  private String riskdataBasketItemItemNrColor;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_CURRENCY = "riskdata.basket.item[itemNr].currency";
  private String riskdataBasketItemItemNrCurrency;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_ITEM_I_D = "riskdata.basket.item[itemNr].itemID";
  private String riskdataBasketItemItemNrItemID;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_MANUFACTURER = "riskdata.basket.item[itemNr].manufacturer";
  private String riskdataBasketItemItemNrManufacturer;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_PRODUCT_TITLE = "riskdata.basket.item[itemNr].productTitle";
  private String riskdataBasketItemItemNrProductTitle;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_QUANTITY = "riskdata.basket.item[itemNr].quantity";
  private String riskdataBasketItemItemNrQuantity;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_RECEIVER_EMAIL = "riskdata.basket.item[itemNr].receiverEmail";
  private String riskdataBasketItemItemNrReceiverEmail;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_SIZE = "riskdata.basket.item[itemNr].size";
  private String riskdataBasketItemItemNrSize;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_SKU = "riskdata.basket.item[itemNr].sku";
  private String riskdataBasketItemItemNrSku;

  public static final String JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_UPC = "riskdata.basket.item[itemNr].upc";
  private String riskdataBasketItemItemNrUpc;

  public static final String JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_CODE = "riskdata.promotions.promotion[itemNr].promotionCode";
  private String riskdataPromotionsPromotionItemNrPromotionCode;

  public static final String JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_AMOUNT = "riskdata.promotions.promotion[itemNr].promotionDiscountAmount";
  private String riskdataPromotionsPromotionItemNrPromotionDiscountAmount;

  public static final String JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_CURRENCY = "riskdata.promotions.promotion[itemNr].promotionDiscountCurrency";
  private String riskdataPromotionsPromotionItemNrPromotionDiscountCurrency;

  public static final String JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_PERCENTAGE = "riskdata.promotions.promotion[itemNr].promotionDiscountPercentage";
  private String riskdataPromotionsPromotionItemNrPromotionDiscountPercentage;

  public static final String JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_NAME = "riskdata.promotions.promotion[itemNr].promotionName";
  private String riskdataPromotionsPromotionItemNrPromotionName;

  public static final String JSON_PROPERTY_RISKDATA_RISK_PROFILE_REFERENCE = "riskdata.riskProfileReference";
  private String riskdataRiskProfileReference;

  public static final String JSON_PROPERTY_RISKDATA_SKIP_RISK = "riskdata.skipRisk";
  private String riskdataSkipRisk;

  public AdditionalDataRisk() { 
  }

  public AdditionalDataRisk riskdataCustomFieldName(String riskdataCustomFieldName) {
    this.riskdataCustomFieldName = riskdataCustomFieldName;
    return this;
  }

   /**
   * The data for your custom risk field. For more information, refer to [Create custom risk fields](https://docs.adyen.com/risk-management/configure-custom-risk-rules#step-1-create-custom-risk-fields).
   * @return riskdataCustomFieldName
  **/
  @ApiModelProperty(value = "The data for your custom risk field. For more information, refer to [Create custom risk fields](https://docs.adyen.com/risk-management/configure-custom-risk-rules#step-1-create-custom-risk-fields).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_CUSTOM_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataCustomFieldName() {
    return riskdataCustomFieldName;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_CUSTOM_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataCustomFieldName(String riskdataCustomFieldName) {
    this.riskdataCustomFieldName = riskdataCustomFieldName;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrAmountPerItem(String riskdataBasketItemItemNrAmountPerItem) {
    this.riskdataBasketItemItemNrAmountPerItem = riskdataBasketItemItemNrAmountPerItem;
    return this;
  }

   /**
   * The price of item in the basket, represented in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return riskdataBasketItemItemNrAmountPerItem
  **/
  @ApiModelProperty(value = "The price of item in the basket, represented in [minor units](https://docs.adyen.com/development-resources/currency-codes).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_AMOUNT_PER_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrAmountPerItem() {
    return riskdataBasketItemItemNrAmountPerItem;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_AMOUNT_PER_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrAmountPerItem(String riskdataBasketItemItemNrAmountPerItem) {
    this.riskdataBasketItemItemNrAmountPerItem = riskdataBasketItemItemNrAmountPerItem;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrBrand(String riskdataBasketItemItemNrBrand) {
    this.riskdataBasketItemItemNrBrand = riskdataBasketItemItemNrBrand;
    return this;
  }

   /**
   * Brand of the item.
   * @return riskdataBasketItemItemNrBrand
  **/
  @ApiModelProperty(value = "Brand of the item.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrBrand() {
    return riskdataBasketItemItemNrBrand;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrBrand(String riskdataBasketItemItemNrBrand) {
    this.riskdataBasketItemItemNrBrand = riskdataBasketItemItemNrBrand;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrCategory(String riskdataBasketItemItemNrCategory) {
    this.riskdataBasketItemItemNrCategory = riskdataBasketItemItemNrCategory;
    return this;
  }

   /**
   * Category of the item.
   * @return riskdataBasketItemItemNrCategory
  **/
  @ApiModelProperty(value = "Category of the item.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrCategory() {
    return riskdataBasketItemItemNrCategory;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrCategory(String riskdataBasketItemItemNrCategory) {
    this.riskdataBasketItemItemNrCategory = riskdataBasketItemItemNrCategory;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrColor(String riskdataBasketItemItemNrColor) {
    this.riskdataBasketItemItemNrColor = riskdataBasketItemItemNrColor;
    return this;
  }

   /**
   * Color of the item.
   * @return riskdataBasketItemItemNrColor
  **/
  @ApiModelProperty(value = "Color of the item.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrColor() {
    return riskdataBasketItemItemNrColor;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrColor(String riskdataBasketItemItemNrColor) {
    this.riskdataBasketItemItemNrColor = riskdataBasketItemItemNrColor;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrCurrency(String riskdataBasketItemItemNrCurrency) {
    this.riskdataBasketItemItemNrCurrency = riskdataBasketItemItemNrCurrency;
    return this;
  }

   /**
   * The three-character [ISO currency code](https://en.wikipedia.org/wiki/ISO_4217).
   * @return riskdataBasketItemItemNrCurrency
  **/
  @ApiModelProperty(value = "The three-character [ISO currency code](https://en.wikipedia.org/wiki/ISO_4217).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrCurrency() {
    return riskdataBasketItemItemNrCurrency;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrCurrency(String riskdataBasketItemItemNrCurrency) {
    this.riskdataBasketItemItemNrCurrency = riskdataBasketItemItemNrCurrency;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrItemID(String riskdataBasketItemItemNrItemID) {
    this.riskdataBasketItemItemNrItemID = riskdataBasketItemItemNrItemID;
    return this;
  }

   /**
   * ID of the item.
   * @return riskdataBasketItemItemNrItemID
  **/
  @ApiModelProperty(value = "ID of the item.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_ITEM_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrItemID() {
    return riskdataBasketItemItemNrItemID;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_ITEM_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrItemID(String riskdataBasketItemItemNrItemID) {
    this.riskdataBasketItemItemNrItemID = riskdataBasketItemItemNrItemID;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrManufacturer(String riskdataBasketItemItemNrManufacturer) {
    this.riskdataBasketItemItemNrManufacturer = riskdataBasketItemItemNrManufacturer;
    return this;
  }

   /**
   * Manufacturer of the item.
   * @return riskdataBasketItemItemNrManufacturer
  **/
  @ApiModelProperty(value = "Manufacturer of the item.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrManufacturer() {
    return riskdataBasketItemItemNrManufacturer;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrManufacturer(String riskdataBasketItemItemNrManufacturer) {
    this.riskdataBasketItemItemNrManufacturer = riskdataBasketItemItemNrManufacturer;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrProductTitle(String riskdataBasketItemItemNrProductTitle) {
    this.riskdataBasketItemItemNrProductTitle = riskdataBasketItemItemNrProductTitle;
    return this;
  }

   /**
   * A text description of the product the invoice line refers to.
   * @return riskdataBasketItemItemNrProductTitle
  **/
  @ApiModelProperty(value = "A text description of the product the invoice line refers to.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_PRODUCT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrProductTitle() {
    return riskdataBasketItemItemNrProductTitle;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_PRODUCT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrProductTitle(String riskdataBasketItemItemNrProductTitle) {
    this.riskdataBasketItemItemNrProductTitle = riskdataBasketItemItemNrProductTitle;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrQuantity(String riskdataBasketItemItemNrQuantity) {
    this.riskdataBasketItemItemNrQuantity = riskdataBasketItemItemNrQuantity;
    return this;
  }

   /**
   * Quantity of the item purchased.
   * @return riskdataBasketItemItemNrQuantity
  **/
  @ApiModelProperty(value = "Quantity of the item purchased.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrQuantity() {
    return riskdataBasketItemItemNrQuantity;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrQuantity(String riskdataBasketItemItemNrQuantity) {
    this.riskdataBasketItemItemNrQuantity = riskdataBasketItemItemNrQuantity;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrReceiverEmail(String riskdataBasketItemItemNrReceiverEmail) {
    this.riskdataBasketItemItemNrReceiverEmail = riskdataBasketItemItemNrReceiverEmail;
    return this;
  }

   /**
   * Email associated with the given product in the basket (usually in electronic gift cards).
   * @return riskdataBasketItemItemNrReceiverEmail
  **/
  @ApiModelProperty(value = "Email associated with the given product in the basket (usually in electronic gift cards).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_RECEIVER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrReceiverEmail() {
    return riskdataBasketItemItemNrReceiverEmail;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_RECEIVER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrReceiverEmail(String riskdataBasketItemItemNrReceiverEmail) {
    this.riskdataBasketItemItemNrReceiverEmail = riskdataBasketItemItemNrReceiverEmail;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrSize(String riskdataBasketItemItemNrSize) {
    this.riskdataBasketItemItemNrSize = riskdataBasketItemItemNrSize;
    return this;
  }

   /**
   * Size of the item.
   * @return riskdataBasketItemItemNrSize
  **/
  @ApiModelProperty(value = "Size of the item.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrSize() {
    return riskdataBasketItemItemNrSize;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrSize(String riskdataBasketItemItemNrSize) {
    this.riskdataBasketItemItemNrSize = riskdataBasketItemItemNrSize;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrSku(String riskdataBasketItemItemNrSku) {
    this.riskdataBasketItemItemNrSku = riskdataBasketItemItemNrSku;
    return this;
  }

   /**
   * [Stock keeping unit](https://en.wikipedia.org/wiki/Stock_keeping_unit).
   * @return riskdataBasketItemItemNrSku
  **/
  @ApiModelProperty(value = "[Stock keeping unit](https://en.wikipedia.org/wiki/Stock_keeping_unit).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrSku() {
    return riskdataBasketItemItemNrSku;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrSku(String riskdataBasketItemItemNrSku) {
    this.riskdataBasketItemItemNrSku = riskdataBasketItemItemNrSku;
  }


  public AdditionalDataRisk riskdataBasketItemItemNrUpc(String riskdataBasketItemItemNrUpc) {
    this.riskdataBasketItemItemNrUpc = riskdataBasketItemItemNrUpc;
    return this;
  }

   /**
   * [Universal Product Code](https://en.wikipedia.org/wiki/Universal_Product_Code).
   * @return riskdataBasketItemItemNrUpc
  **/
  @ApiModelProperty(value = "[Universal Product Code](https://en.wikipedia.org/wiki/Universal_Product_Code).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataBasketItemItemNrUpc() {
    return riskdataBasketItemItemNrUpc;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_BASKET_ITEM_ITEM_NR_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataBasketItemItemNrUpc(String riskdataBasketItemItemNrUpc) {
    this.riskdataBasketItemItemNrUpc = riskdataBasketItemItemNrUpc;
  }


  public AdditionalDataRisk riskdataPromotionsPromotionItemNrPromotionCode(String riskdataPromotionsPromotionItemNrPromotionCode) {
    this.riskdataPromotionsPromotionItemNrPromotionCode = riskdataPromotionsPromotionItemNrPromotionCode;
    return this;
  }

   /**
   * Code of the promotion.
   * @return riskdataPromotionsPromotionItemNrPromotionCode
  **/
  @ApiModelProperty(value = "Code of the promotion.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataPromotionsPromotionItemNrPromotionCode() {
    return riskdataPromotionsPromotionItemNrPromotionCode;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataPromotionsPromotionItemNrPromotionCode(String riskdataPromotionsPromotionItemNrPromotionCode) {
    this.riskdataPromotionsPromotionItemNrPromotionCode = riskdataPromotionsPromotionItemNrPromotionCode;
  }


  public AdditionalDataRisk riskdataPromotionsPromotionItemNrPromotionDiscountAmount(String riskdataPromotionsPromotionItemNrPromotionDiscountAmount) {
    this.riskdataPromotionsPromotionItemNrPromotionDiscountAmount = riskdataPromotionsPromotionItemNrPromotionDiscountAmount;
    return this;
  }

   /**
   * The discount amount of the promotion, represented in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return riskdataPromotionsPromotionItemNrPromotionDiscountAmount
  **/
  @ApiModelProperty(value = "The discount amount of the promotion, represented in [minor units](https://docs.adyen.com/development-resources/currency-codes).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataPromotionsPromotionItemNrPromotionDiscountAmount() {
    return riskdataPromotionsPromotionItemNrPromotionDiscountAmount;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataPromotionsPromotionItemNrPromotionDiscountAmount(String riskdataPromotionsPromotionItemNrPromotionDiscountAmount) {
    this.riskdataPromotionsPromotionItemNrPromotionDiscountAmount = riskdataPromotionsPromotionItemNrPromotionDiscountAmount;
  }


  public AdditionalDataRisk riskdataPromotionsPromotionItemNrPromotionDiscountCurrency(String riskdataPromotionsPromotionItemNrPromotionDiscountCurrency) {
    this.riskdataPromotionsPromotionItemNrPromotionDiscountCurrency = riskdataPromotionsPromotionItemNrPromotionDiscountCurrency;
    return this;
  }

   /**
   * The three-character [ISO currency code](https://en.wikipedia.org/wiki/ISO_4217).
   * @return riskdataPromotionsPromotionItemNrPromotionDiscountCurrency
  **/
  @ApiModelProperty(value = "The three-character [ISO currency code](https://en.wikipedia.org/wiki/ISO_4217).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataPromotionsPromotionItemNrPromotionDiscountCurrency() {
    return riskdataPromotionsPromotionItemNrPromotionDiscountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataPromotionsPromotionItemNrPromotionDiscountCurrency(String riskdataPromotionsPromotionItemNrPromotionDiscountCurrency) {
    this.riskdataPromotionsPromotionItemNrPromotionDiscountCurrency = riskdataPromotionsPromotionItemNrPromotionDiscountCurrency;
  }


  public AdditionalDataRisk riskdataPromotionsPromotionItemNrPromotionDiscountPercentage(String riskdataPromotionsPromotionItemNrPromotionDiscountPercentage) {
    this.riskdataPromotionsPromotionItemNrPromotionDiscountPercentage = riskdataPromotionsPromotionItemNrPromotionDiscountPercentage;
    return this;
  }

   /**
   * Promotion&#39;s percentage discount. It is represented in percentage value and there is no need to include the &#39;%&#39; sign.  e.g. for a promotion discount of 30%, the value of the field should be 30.
   * @return riskdataPromotionsPromotionItemNrPromotionDiscountPercentage
  **/
  @ApiModelProperty(value = "Promotion's percentage discount. It is represented in percentage value and there is no need to include the '%' sign.  e.g. for a promotion discount of 30%, the value of the field should be 30.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataPromotionsPromotionItemNrPromotionDiscountPercentage() {
    return riskdataPromotionsPromotionItemNrPromotionDiscountPercentage;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_DISCOUNT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataPromotionsPromotionItemNrPromotionDiscountPercentage(String riskdataPromotionsPromotionItemNrPromotionDiscountPercentage) {
    this.riskdataPromotionsPromotionItemNrPromotionDiscountPercentage = riskdataPromotionsPromotionItemNrPromotionDiscountPercentage;
  }


  public AdditionalDataRisk riskdataPromotionsPromotionItemNrPromotionName(String riskdataPromotionsPromotionItemNrPromotionName) {
    this.riskdataPromotionsPromotionItemNrPromotionName = riskdataPromotionsPromotionItemNrPromotionName;
    return this;
  }

   /**
   * Name of the promotion.
   * @return riskdataPromotionsPromotionItemNrPromotionName
  **/
  @ApiModelProperty(value = "Name of the promotion.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataPromotionsPromotionItemNrPromotionName() {
    return riskdataPromotionsPromotionItemNrPromotionName;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_PROMOTIONS_PROMOTION_ITEM_NR_PROMOTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataPromotionsPromotionItemNrPromotionName(String riskdataPromotionsPromotionItemNrPromotionName) {
    this.riskdataPromotionsPromotionItemNrPromotionName = riskdataPromotionsPromotionItemNrPromotionName;
  }


  public AdditionalDataRisk riskdataRiskProfileReference(String riskdataRiskProfileReference) {
    this.riskdataRiskProfileReference = riskdataRiskProfileReference;
    return this;
  }

   /**
   * Reference number of the risk profile that you want to apply to the payment. If not provided or left blank, the merchant-level account&#39;s default risk profile will be applied to the payment. For more information, see [dynamically assign a risk profile to a payment](https://docs.adyen.com/risk-management/create-and-use-risk-profiles#dynamically-assign-a-risk-profile-to-a-payment).
   * @return riskdataRiskProfileReference
  **/
  @ApiModelProperty(value = "Reference number of the risk profile that you want to apply to the payment. If not provided or left blank, the merchant-level account's default risk profile will be applied to the payment. For more information, see [dynamically assign a risk profile to a payment](https://docs.adyen.com/risk-management/create-and-use-risk-profiles#dynamically-assign-a-risk-profile-to-a-payment).")
  @JsonProperty(JSON_PROPERTY_RISKDATA_RISK_PROFILE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataRiskProfileReference() {
    return riskdataRiskProfileReference;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_RISK_PROFILE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataRiskProfileReference(String riskdataRiskProfileReference) {
    this.riskdataRiskProfileReference = riskdataRiskProfileReference;
  }


  public AdditionalDataRisk riskdataSkipRisk(String riskdataSkipRisk) {
    this.riskdataSkipRisk = riskdataSkipRisk;
    return this;
  }

   /**
   * If this parameter is provided with the value **true**, risk checks for the payment request are skipped and the transaction will not get a risk score.
   * @return riskdataSkipRisk
  **/
  @ApiModelProperty(value = "If this parameter is provided with the value **true**, risk checks for the payment request are skipped and the transaction will not get a risk score.")
  @JsonProperty(JSON_PROPERTY_RISKDATA_SKIP_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskdataSkipRisk() {
    return riskdataSkipRisk;
  }


  @JsonProperty(JSON_PROPERTY_RISKDATA_SKIP_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskdataSkipRisk(String riskdataSkipRisk) {
    this.riskdataSkipRisk = riskdataSkipRisk;
  }


  /**
   * Return true if this AdditionalDataRisk object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataRisk additionalDataRisk = (AdditionalDataRisk) o;
    return Objects.equals(this.riskdataCustomFieldName, additionalDataRisk.riskdataCustomFieldName) &&
        Objects.equals(this.riskdataBasketItemItemNrAmountPerItem, additionalDataRisk.riskdataBasketItemItemNrAmountPerItem) &&
        Objects.equals(this.riskdataBasketItemItemNrBrand, additionalDataRisk.riskdataBasketItemItemNrBrand) &&
        Objects.equals(this.riskdataBasketItemItemNrCategory, additionalDataRisk.riskdataBasketItemItemNrCategory) &&
        Objects.equals(this.riskdataBasketItemItemNrColor, additionalDataRisk.riskdataBasketItemItemNrColor) &&
        Objects.equals(this.riskdataBasketItemItemNrCurrency, additionalDataRisk.riskdataBasketItemItemNrCurrency) &&
        Objects.equals(this.riskdataBasketItemItemNrItemID, additionalDataRisk.riskdataBasketItemItemNrItemID) &&
        Objects.equals(this.riskdataBasketItemItemNrManufacturer, additionalDataRisk.riskdataBasketItemItemNrManufacturer) &&
        Objects.equals(this.riskdataBasketItemItemNrProductTitle, additionalDataRisk.riskdataBasketItemItemNrProductTitle) &&
        Objects.equals(this.riskdataBasketItemItemNrQuantity, additionalDataRisk.riskdataBasketItemItemNrQuantity) &&
        Objects.equals(this.riskdataBasketItemItemNrReceiverEmail, additionalDataRisk.riskdataBasketItemItemNrReceiverEmail) &&
        Objects.equals(this.riskdataBasketItemItemNrSize, additionalDataRisk.riskdataBasketItemItemNrSize) &&
        Objects.equals(this.riskdataBasketItemItemNrSku, additionalDataRisk.riskdataBasketItemItemNrSku) &&
        Objects.equals(this.riskdataBasketItemItemNrUpc, additionalDataRisk.riskdataBasketItemItemNrUpc) &&
        Objects.equals(this.riskdataPromotionsPromotionItemNrPromotionCode, additionalDataRisk.riskdataPromotionsPromotionItemNrPromotionCode) &&
        Objects.equals(this.riskdataPromotionsPromotionItemNrPromotionDiscountAmount, additionalDataRisk.riskdataPromotionsPromotionItemNrPromotionDiscountAmount) &&
        Objects.equals(this.riskdataPromotionsPromotionItemNrPromotionDiscountCurrency, additionalDataRisk.riskdataPromotionsPromotionItemNrPromotionDiscountCurrency) &&
        Objects.equals(this.riskdataPromotionsPromotionItemNrPromotionDiscountPercentage, additionalDataRisk.riskdataPromotionsPromotionItemNrPromotionDiscountPercentage) &&
        Objects.equals(this.riskdataPromotionsPromotionItemNrPromotionName, additionalDataRisk.riskdataPromotionsPromotionItemNrPromotionName) &&
        Objects.equals(this.riskdataRiskProfileReference, additionalDataRisk.riskdataRiskProfileReference) &&
        Objects.equals(this.riskdataSkipRisk, additionalDataRisk.riskdataSkipRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskdataCustomFieldName, riskdataBasketItemItemNrAmountPerItem, riskdataBasketItemItemNrBrand, riskdataBasketItemItemNrCategory, riskdataBasketItemItemNrColor, riskdataBasketItemItemNrCurrency, riskdataBasketItemItemNrItemID, riskdataBasketItemItemNrManufacturer, riskdataBasketItemItemNrProductTitle, riskdataBasketItemItemNrQuantity, riskdataBasketItemItemNrReceiverEmail, riskdataBasketItemItemNrSize, riskdataBasketItemItemNrSku, riskdataBasketItemItemNrUpc, riskdataPromotionsPromotionItemNrPromotionCode, riskdataPromotionsPromotionItemNrPromotionDiscountAmount, riskdataPromotionsPromotionItemNrPromotionDiscountCurrency, riskdataPromotionsPromotionItemNrPromotionDiscountPercentage, riskdataPromotionsPromotionItemNrPromotionName, riskdataRiskProfileReference, riskdataSkipRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataRisk {\n");
    sb.append("    riskdataCustomFieldName: ").append(toIndentedString(riskdataCustomFieldName)).append("\n");
    sb.append("    riskdataBasketItemItemNrAmountPerItem: ").append(toIndentedString(riskdataBasketItemItemNrAmountPerItem)).append("\n");
    sb.append("    riskdataBasketItemItemNrBrand: ").append(toIndentedString(riskdataBasketItemItemNrBrand)).append("\n");
    sb.append("    riskdataBasketItemItemNrCategory: ").append(toIndentedString(riskdataBasketItemItemNrCategory)).append("\n");
    sb.append("    riskdataBasketItemItemNrColor: ").append(toIndentedString(riskdataBasketItemItemNrColor)).append("\n");
    sb.append("    riskdataBasketItemItemNrCurrency: ").append(toIndentedString(riskdataBasketItemItemNrCurrency)).append("\n");
    sb.append("    riskdataBasketItemItemNrItemID: ").append(toIndentedString(riskdataBasketItemItemNrItemID)).append("\n");
    sb.append("    riskdataBasketItemItemNrManufacturer: ").append(toIndentedString(riskdataBasketItemItemNrManufacturer)).append("\n");
    sb.append("    riskdataBasketItemItemNrProductTitle: ").append(toIndentedString(riskdataBasketItemItemNrProductTitle)).append("\n");
    sb.append("    riskdataBasketItemItemNrQuantity: ").append(toIndentedString(riskdataBasketItemItemNrQuantity)).append("\n");
    sb.append("    riskdataBasketItemItemNrReceiverEmail: ").append(toIndentedString(riskdataBasketItemItemNrReceiverEmail)).append("\n");
    sb.append("    riskdataBasketItemItemNrSize: ").append(toIndentedString(riskdataBasketItemItemNrSize)).append("\n");
    sb.append("    riskdataBasketItemItemNrSku: ").append(toIndentedString(riskdataBasketItemItemNrSku)).append("\n");
    sb.append("    riskdataBasketItemItemNrUpc: ").append(toIndentedString(riskdataBasketItemItemNrUpc)).append("\n");
    sb.append("    riskdataPromotionsPromotionItemNrPromotionCode: ").append(toIndentedString(riskdataPromotionsPromotionItemNrPromotionCode)).append("\n");
    sb.append("    riskdataPromotionsPromotionItemNrPromotionDiscountAmount: ").append(toIndentedString(riskdataPromotionsPromotionItemNrPromotionDiscountAmount)).append("\n");
    sb.append("    riskdataPromotionsPromotionItemNrPromotionDiscountCurrency: ").append(toIndentedString(riskdataPromotionsPromotionItemNrPromotionDiscountCurrency)).append("\n");
    sb.append("    riskdataPromotionsPromotionItemNrPromotionDiscountPercentage: ").append(toIndentedString(riskdataPromotionsPromotionItemNrPromotionDiscountPercentage)).append("\n");
    sb.append("    riskdataPromotionsPromotionItemNrPromotionName: ").append(toIndentedString(riskdataPromotionsPromotionItemNrPromotionName)).append("\n");
    sb.append("    riskdataRiskProfileReference: ").append(toIndentedString(riskdataRiskProfileReference)).append("\n");
    sb.append("    riskdataSkipRisk: ").append(toIndentedString(riskdataSkipRisk)).append("\n");
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

/**
   * Create an instance of AdditionalDataRisk given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataRisk
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataRisk
   */
  public static AdditionalDataRisk fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataRisk.class);
  }
/**
  * Convert an instance of AdditionalDataRisk to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

