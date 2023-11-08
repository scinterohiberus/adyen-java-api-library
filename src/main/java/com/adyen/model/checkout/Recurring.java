/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Recurring
 */
@JsonPropertyOrder({
  Recurring.JSON_PROPERTY_CONTRACT,
  Recurring.JSON_PROPERTY_RECURRING_DETAIL_NAME,
  Recurring.JSON_PROPERTY_RECURRING_EXPIRY,
  Recurring.JSON_PROPERTY_RECURRING_FREQUENCY,
  Recurring.JSON_PROPERTY_TOKEN_SERVICE
})

public class Recurring {
  /**
   * The type of recurring contract to be used. Possible values: * &#x60;ONECLICK&#x60; – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * &#x60;RECURRING&#x60; – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * &#x60;ONECLICK,RECURRING&#x60; – Payment details can be used regardless of whether the shopper is on your site or not. * &#x60;PAYOUT&#x60; – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts).
   */
  public enum ContractEnum {
    ONECLICK("ONECLICK"),
    
    RECURRING("RECURRING"),
    
    PAYOUT("PAYOUT");

    private String value;

    ContractEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContractEnum fromValue(String value) {
      for (ContractEnum b : ContractEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONTRACT = "contract";
  private ContractEnum contract;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_NAME = "recurringDetailName";
  private String recurringDetailName;

  public static final String JSON_PROPERTY_RECURRING_EXPIRY = "recurringExpiry";
  private OffsetDateTime recurringExpiry;

  public static final String JSON_PROPERTY_RECURRING_FREQUENCY = "recurringFrequency";
  private String recurringFrequency;

  /**
   * The name of the token service.
   */
  public enum TokenServiceEnum {
    VISATOKENSERVICE("VISATOKENSERVICE"),
    
    MCTOKENSERVICE("MCTOKENSERVICE"),
    
    AMEXTOKENSERVICE("AMEXTOKENSERVICE"),
    
    TOKEN_SHARING("TOKEN_SHARING");

    private String value;

    TokenServiceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TokenServiceEnum fromValue(String value) {
      for (TokenServiceEnum b : TokenServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TOKEN_SERVICE = "tokenService";
  private TokenServiceEnum tokenService;

  public Recurring() { 
  }

  public Recurring contract(ContractEnum contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The type of recurring contract to be used. Possible values: * &#x60;ONECLICK&#x60; – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * &#x60;RECURRING&#x60; – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * &#x60;ONECLICK,RECURRING&#x60; – Payment details can be used regardless of whether the shopper is on your site or not. * &#x60;PAYOUT&#x60; – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts).
   * @return contract
  **/
  @ApiModelProperty(value = "The type of recurring contract to be used. Possible values: * `ONECLICK` – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * `RECURRING` – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * `ONECLICK,RECURRING` – Payment details can be used regardless of whether the shopper is on your site or not. * `PAYOUT` – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts).")
  @JsonProperty(JSON_PROPERTY_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContractEnum getContract() {
    return contract;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContract(ContractEnum contract) {
    this.contract = contract;
  }


  public Recurring recurringDetailName(String recurringDetailName) {
    this.recurringDetailName = recurringDetailName;
    return this;
  }

   /**
   * A descriptive name for this detail.
   * @return recurringDetailName
  **/
  @ApiModelProperty(value = "A descriptive name for this detail.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailName() {
    return recurringDetailName;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailName(String recurringDetailName) {
    this.recurringDetailName = recurringDetailName;
  }


  public Recurring recurringExpiry(OffsetDateTime recurringExpiry) {
    this.recurringExpiry = recurringExpiry;
    return this;
  }

   /**
   * Date after which no further authorisations shall be performed. Only for 3D Secure 2.
   * @return recurringExpiry
  **/
  @ApiModelProperty(value = "Date after which no further authorisations shall be performed. Only for 3D Secure 2.")
  @JsonProperty(JSON_PROPERTY_RECURRING_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRecurringExpiry() {
    return recurringExpiry;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringExpiry(OffsetDateTime recurringExpiry) {
    this.recurringExpiry = recurringExpiry;
  }


  public Recurring recurringFrequency(String recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
    return this;
  }

   /**
   * Minimum number of days between authorisations. Only for 3D Secure 2.
   * @return recurringFrequency
  **/
  @ApiModelProperty(value = "Minimum number of days between authorisations. Only for 3D Secure 2.")
  @JsonProperty(JSON_PROPERTY_RECURRING_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringFrequency() {
    return recurringFrequency;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringFrequency(String recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
  }


  public Recurring tokenService(TokenServiceEnum tokenService) {
    this.tokenService = tokenService;
    return this;
  }

   /**
   * The name of the token service.
   * @return tokenService
  **/
  @ApiModelProperty(value = "The name of the token service.")
  @JsonProperty(JSON_PROPERTY_TOKEN_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenServiceEnum getTokenService() {
    return tokenService;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenService(TokenServiceEnum tokenService) {
    this.tokenService = tokenService;
  }


  /**
   * Return true if this Recurring object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurring recurring = (Recurring) o;
    return Objects.equals(this.contract, recurring.contract) &&
        Objects.equals(this.recurringDetailName, recurring.recurringDetailName) &&
        Objects.equals(this.recurringExpiry, recurring.recurringExpiry) &&
        Objects.equals(this.recurringFrequency, recurring.recurringFrequency) &&
        Objects.equals(this.tokenService, recurring.tokenService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, recurringDetailName, recurringExpiry, recurringFrequency, tokenService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurring {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    recurringDetailName: ").append(toIndentedString(recurringDetailName)).append("\n");
    sb.append("    recurringExpiry: ").append(toIndentedString(recurringExpiry)).append("\n");
    sb.append("    recurringFrequency: ").append(toIndentedString(recurringFrequency)).append("\n");
    sb.append("    tokenService: ").append(toIndentedString(tokenService)).append("\n");
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
   * Create an instance of Recurring given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Recurring
   * @throws JsonProcessingException if the JSON string is invalid with respect to Recurring
   */
  public static Recurring fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Recurring.class);
  }
/**
  * Convert an instance of Recurring to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

