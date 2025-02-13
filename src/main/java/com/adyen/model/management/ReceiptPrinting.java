/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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
 * ReceiptPrinting
 */
@JsonPropertyOrder({
  ReceiptPrinting.JSON_PROPERTY_MERCHANT_APPROVED,
  ReceiptPrinting.JSON_PROPERTY_MERCHANT_CANCELLED,
  ReceiptPrinting.JSON_PROPERTY_MERCHANT_CAPTURE_APPROVED,
  ReceiptPrinting.JSON_PROPERTY_MERCHANT_CAPTURE_REFUSED,
  ReceiptPrinting.JSON_PROPERTY_MERCHANT_REFUND_APPROVED,
  ReceiptPrinting.JSON_PROPERTY_MERCHANT_REFUND_REFUSED,
  ReceiptPrinting.JSON_PROPERTY_MERCHANT_REFUSED,
  ReceiptPrinting.JSON_PROPERTY_MERCHANT_VOID,
  ReceiptPrinting.JSON_PROPERTY_SHOPPER_APPROVED,
  ReceiptPrinting.JSON_PROPERTY_SHOPPER_CANCELLED,
  ReceiptPrinting.JSON_PROPERTY_SHOPPER_CAPTURE_APPROVED,
  ReceiptPrinting.JSON_PROPERTY_SHOPPER_CAPTURE_REFUSED,
  ReceiptPrinting.JSON_PROPERTY_SHOPPER_REFUND_APPROVED,
  ReceiptPrinting.JSON_PROPERTY_SHOPPER_REFUND_REFUSED,
  ReceiptPrinting.JSON_PROPERTY_SHOPPER_REFUSED,
  ReceiptPrinting.JSON_PROPERTY_SHOPPER_VOID
})

public class ReceiptPrinting {
  public static final String JSON_PROPERTY_MERCHANT_APPROVED = "merchantApproved";
  private Boolean merchantApproved;

  public static final String JSON_PROPERTY_MERCHANT_CANCELLED = "merchantCancelled";
  private Boolean merchantCancelled;

  public static final String JSON_PROPERTY_MERCHANT_CAPTURE_APPROVED = "merchantCaptureApproved";
  private Boolean merchantCaptureApproved;

  public static final String JSON_PROPERTY_MERCHANT_CAPTURE_REFUSED = "merchantCaptureRefused";
  private Boolean merchantCaptureRefused;

  public static final String JSON_PROPERTY_MERCHANT_REFUND_APPROVED = "merchantRefundApproved";
  private Boolean merchantRefundApproved;

  public static final String JSON_PROPERTY_MERCHANT_REFUND_REFUSED = "merchantRefundRefused";
  private Boolean merchantRefundRefused;

  public static final String JSON_PROPERTY_MERCHANT_REFUSED = "merchantRefused";
  private Boolean merchantRefused;

  public static final String JSON_PROPERTY_MERCHANT_VOID = "merchantVoid";
  private Boolean merchantVoid;

  public static final String JSON_PROPERTY_SHOPPER_APPROVED = "shopperApproved";
  private Boolean shopperApproved;

  public static final String JSON_PROPERTY_SHOPPER_CANCELLED = "shopperCancelled";
  private Boolean shopperCancelled;

  public static final String JSON_PROPERTY_SHOPPER_CAPTURE_APPROVED = "shopperCaptureApproved";
  private Boolean shopperCaptureApproved;

  public static final String JSON_PROPERTY_SHOPPER_CAPTURE_REFUSED = "shopperCaptureRefused";
  private Boolean shopperCaptureRefused;

  public static final String JSON_PROPERTY_SHOPPER_REFUND_APPROVED = "shopperRefundApproved";
  private Boolean shopperRefundApproved;

  public static final String JSON_PROPERTY_SHOPPER_REFUND_REFUSED = "shopperRefundRefused";
  private Boolean shopperRefundRefused;

  public static final String JSON_PROPERTY_SHOPPER_REFUSED = "shopperRefused";
  private Boolean shopperRefused;

  public static final String JSON_PROPERTY_SHOPPER_VOID = "shopperVoid";
  private Boolean shopperVoid;

  public ReceiptPrinting() { 
  }

  public ReceiptPrinting merchantApproved(Boolean merchantApproved) {
    this.merchantApproved = merchantApproved;
    return this;
  }

   /**
   * Print a merchant receipt when the payment is approved.
   * @return merchantApproved
  **/
  @ApiModelProperty(value = "Print a merchant receipt when the payment is approved.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantApproved() {
    return merchantApproved;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantApproved(Boolean merchantApproved) {
    this.merchantApproved = merchantApproved;
  }


  public ReceiptPrinting merchantCancelled(Boolean merchantCancelled) {
    this.merchantCancelled = merchantCancelled;
    return this;
  }

   /**
   * Print a merchant receipt when the transaction is cancelled.
   * @return merchantCancelled
  **/
  @ApiModelProperty(value = "Print a merchant receipt when the transaction is cancelled.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_CANCELLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantCancelled() {
    return merchantCancelled;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CANCELLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCancelled(Boolean merchantCancelled) {
    this.merchantCancelled = merchantCancelled;
  }


  public ReceiptPrinting merchantCaptureApproved(Boolean merchantCaptureApproved) {
    this.merchantCaptureApproved = merchantCaptureApproved;
    return this;
  }

   /**
   * Print a merchant receipt when capturing the payment is approved.
   * @return merchantCaptureApproved
  **/
  @ApiModelProperty(value = "Print a merchant receipt when capturing the payment is approved.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_CAPTURE_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantCaptureApproved() {
    return merchantCaptureApproved;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CAPTURE_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCaptureApproved(Boolean merchantCaptureApproved) {
    this.merchantCaptureApproved = merchantCaptureApproved;
  }


  public ReceiptPrinting merchantCaptureRefused(Boolean merchantCaptureRefused) {
    this.merchantCaptureRefused = merchantCaptureRefused;
    return this;
  }

   /**
   * Print a merchant receipt when capturing the payment is refused.
   * @return merchantCaptureRefused
  **/
  @ApiModelProperty(value = "Print a merchant receipt when capturing the payment is refused.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_CAPTURE_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantCaptureRefused() {
    return merchantCaptureRefused;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CAPTURE_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCaptureRefused(Boolean merchantCaptureRefused) {
    this.merchantCaptureRefused = merchantCaptureRefused;
  }


  public ReceiptPrinting merchantRefundApproved(Boolean merchantRefundApproved) {
    this.merchantRefundApproved = merchantRefundApproved;
    return this;
  }

   /**
   * Print a merchant receipt when the refund is approved.
   * @return merchantRefundApproved
  **/
  @ApiModelProperty(value = "Print a merchant receipt when the refund is approved.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFUND_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantRefundApproved() {
    return merchantRefundApproved;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFUND_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantRefundApproved(Boolean merchantRefundApproved) {
    this.merchantRefundApproved = merchantRefundApproved;
  }


  public ReceiptPrinting merchantRefundRefused(Boolean merchantRefundRefused) {
    this.merchantRefundRefused = merchantRefundRefused;
    return this;
  }

   /**
   * Print a merchant receipt when the refund is refused.
   * @return merchantRefundRefused
  **/
  @ApiModelProperty(value = "Print a merchant receipt when the refund is refused.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFUND_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantRefundRefused() {
    return merchantRefundRefused;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFUND_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantRefundRefused(Boolean merchantRefundRefused) {
    this.merchantRefundRefused = merchantRefundRefused;
  }


  public ReceiptPrinting merchantRefused(Boolean merchantRefused) {
    this.merchantRefused = merchantRefused;
    return this;
  }

   /**
   * Print a merchant receipt when the payment is refused.
   * @return merchantRefused
  **/
  @ApiModelProperty(value = "Print a merchant receipt when the payment is refused.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantRefused() {
    return merchantRefused;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantRefused(Boolean merchantRefused) {
    this.merchantRefused = merchantRefused;
  }


  public ReceiptPrinting merchantVoid(Boolean merchantVoid) {
    this.merchantVoid = merchantVoid;
    return this;
  }

   /**
   * Print a merchant receipt when a previous transaction is voided.
   * @return merchantVoid
  **/
  @ApiModelProperty(value = "Print a merchant receipt when a previous transaction is voided.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_VOID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantVoid() {
    return merchantVoid;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_VOID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantVoid(Boolean merchantVoid) {
    this.merchantVoid = merchantVoid;
  }


  public ReceiptPrinting shopperApproved(Boolean shopperApproved) {
    this.shopperApproved = shopperApproved;
    return this;
  }

   /**
   * Print a shopper receipt when the payment is approved.
   * @return shopperApproved
  **/
  @ApiModelProperty(value = "Print a shopper receipt when the payment is approved.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShopperApproved() {
    return shopperApproved;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperApproved(Boolean shopperApproved) {
    this.shopperApproved = shopperApproved;
  }


  public ReceiptPrinting shopperCancelled(Boolean shopperCancelled) {
    this.shopperCancelled = shopperCancelled;
    return this;
  }

   /**
   * Print a shopper receipt when the transaction is cancelled.
   * @return shopperCancelled
  **/
  @ApiModelProperty(value = "Print a shopper receipt when the transaction is cancelled.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_CANCELLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShopperCancelled() {
    return shopperCancelled;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_CANCELLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperCancelled(Boolean shopperCancelled) {
    this.shopperCancelled = shopperCancelled;
  }


  public ReceiptPrinting shopperCaptureApproved(Boolean shopperCaptureApproved) {
    this.shopperCaptureApproved = shopperCaptureApproved;
    return this;
  }

   /**
   * Print a shopper receipt when capturing the payment is approved.
   * @return shopperCaptureApproved
  **/
  @ApiModelProperty(value = "Print a shopper receipt when capturing the payment is approved.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_CAPTURE_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShopperCaptureApproved() {
    return shopperCaptureApproved;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_CAPTURE_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperCaptureApproved(Boolean shopperCaptureApproved) {
    this.shopperCaptureApproved = shopperCaptureApproved;
  }


  public ReceiptPrinting shopperCaptureRefused(Boolean shopperCaptureRefused) {
    this.shopperCaptureRefused = shopperCaptureRefused;
    return this;
  }

   /**
   * Print a shopper receipt when capturing the payment is refused.
   * @return shopperCaptureRefused
  **/
  @ApiModelProperty(value = "Print a shopper receipt when capturing the payment is refused.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_CAPTURE_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShopperCaptureRefused() {
    return shopperCaptureRefused;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_CAPTURE_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperCaptureRefused(Boolean shopperCaptureRefused) {
    this.shopperCaptureRefused = shopperCaptureRefused;
  }


  public ReceiptPrinting shopperRefundApproved(Boolean shopperRefundApproved) {
    this.shopperRefundApproved = shopperRefundApproved;
    return this;
  }

   /**
   * Print a shopper receipt when the refund is approved.
   * @return shopperRefundApproved
  **/
  @ApiModelProperty(value = "Print a shopper receipt when the refund is approved.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFUND_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShopperRefundApproved() {
    return shopperRefundApproved;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_REFUND_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperRefundApproved(Boolean shopperRefundApproved) {
    this.shopperRefundApproved = shopperRefundApproved;
  }


  public ReceiptPrinting shopperRefundRefused(Boolean shopperRefundRefused) {
    this.shopperRefundRefused = shopperRefundRefused;
    return this;
  }

   /**
   * Print a shopper receipt when the refund is refused.
   * @return shopperRefundRefused
  **/
  @ApiModelProperty(value = "Print a shopper receipt when the refund is refused.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFUND_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShopperRefundRefused() {
    return shopperRefundRefused;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_REFUND_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperRefundRefused(Boolean shopperRefundRefused) {
    this.shopperRefundRefused = shopperRefundRefused;
  }


  public ReceiptPrinting shopperRefused(Boolean shopperRefused) {
    this.shopperRefused = shopperRefused;
    return this;
  }

   /**
   * Print a shopper receipt when the payment is refused.
   * @return shopperRefused
  **/
  @ApiModelProperty(value = "Print a shopper receipt when the payment is refused.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShopperRefused() {
    return shopperRefused;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_REFUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperRefused(Boolean shopperRefused) {
    this.shopperRefused = shopperRefused;
  }


  public ReceiptPrinting shopperVoid(Boolean shopperVoid) {
    this.shopperVoid = shopperVoid;
    return this;
  }

   /**
   * Print a shopper receipt when a previous transaction is voided.
   * @return shopperVoid
  **/
  @ApiModelProperty(value = "Print a shopper receipt when a previous transaction is voided.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_VOID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShopperVoid() {
    return shopperVoid;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_VOID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperVoid(Boolean shopperVoid) {
    this.shopperVoid = shopperVoid;
  }


  /**
   * Return true if this ReceiptPrinting object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptPrinting receiptPrinting = (ReceiptPrinting) o;
    return Objects.equals(this.merchantApproved, receiptPrinting.merchantApproved) &&
        Objects.equals(this.merchantCancelled, receiptPrinting.merchantCancelled) &&
        Objects.equals(this.merchantCaptureApproved, receiptPrinting.merchantCaptureApproved) &&
        Objects.equals(this.merchantCaptureRefused, receiptPrinting.merchantCaptureRefused) &&
        Objects.equals(this.merchantRefundApproved, receiptPrinting.merchantRefundApproved) &&
        Objects.equals(this.merchantRefundRefused, receiptPrinting.merchantRefundRefused) &&
        Objects.equals(this.merchantRefused, receiptPrinting.merchantRefused) &&
        Objects.equals(this.merchantVoid, receiptPrinting.merchantVoid) &&
        Objects.equals(this.shopperApproved, receiptPrinting.shopperApproved) &&
        Objects.equals(this.shopperCancelled, receiptPrinting.shopperCancelled) &&
        Objects.equals(this.shopperCaptureApproved, receiptPrinting.shopperCaptureApproved) &&
        Objects.equals(this.shopperCaptureRefused, receiptPrinting.shopperCaptureRefused) &&
        Objects.equals(this.shopperRefundApproved, receiptPrinting.shopperRefundApproved) &&
        Objects.equals(this.shopperRefundRefused, receiptPrinting.shopperRefundRefused) &&
        Objects.equals(this.shopperRefused, receiptPrinting.shopperRefused) &&
        Objects.equals(this.shopperVoid, receiptPrinting.shopperVoid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantApproved, merchantCancelled, merchantCaptureApproved, merchantCaptureRefused, merchantRefundApproved, merchantRefundRefused, merchantRefused, merchantVoid, shopperApproved, shopperCancelled, shopperCaptureApproved, shopperCaptureRefused, shopperRefundApproved, shopperRefundRefused, shopperRefused, shopperVoid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptPrinting {\n");
    sb.append("    merchantApproved: ").append(toIndentedString(merchantApproved)).append("\n");
    sb.append("    merchantCancelled: ").append(toIndentedString(merchantCancelled)).append("\n");
    sb.append("    merchantCaptureApproved: ").append(toIndentedString(merchantCaptureApproved)).append("\n");
    sb.append("    merchantCaptureRefused: ").append(toIndentedString(merchantCaptureRefused)).append("\n");
    sb.append("    merchantRefundApproved: ").append(toIndentedString(merchantRefundApproved)).append("\n");
    sb.append("    merchantRefundRefused: ").append(toIndentedString(merchantRefundRefused)).append("\n");
    sb.append("    merchantRefused: ").append(toIndentedString(merchantRefused)).append("\n");
    sb.append("    merchantVoid: ").append(toIndentedString(merchantVoid)).append("\n");
    sb.append("    shopperApproved: ").append(toIndentedString(shopperApproved)).append("\n");
    sb.append("    shopperCancelled: ").append(toIndentedString(shopperCancelled)).append("\n");
    sb.append("    shopperCaptureApproved: ").append(toIndentedString(shopperCaptureApproved)).append("\n");
    sb.append("    shopperCaptureRefused: ").append(toIndentedString(shopperCaptureRefused)).append("\n");
    sb.append("    shopperRefundApproved: ").append(toIndentedString(shopperRefundApproved)).append("\n");
    sb.append("    shopperRefundRefused: ").append(toIndentedString(shopperRefundRefused)).append("\n");
    sb.append("    shopperRefused: ").append(toIndentedString(shopperRefused)).append("\n");
    sb.append("    shopperVoid: ").append(toIndentedString(shopperVoid)).append("\n");
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
   * Create an instance of ReceiptPrinting given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReceiptPrinting
   * @throws JsonProcessingException if the JSON string is invalid with respect to ReceiptPrinting
   */
  public static ReceiptPrinting fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ReceiptPrinting.class);
  }
/**
  * Convert an instance of ReceiptPrinting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

