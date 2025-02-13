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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AdditionalDataLodging
 */
@JsonPropertyOrder({
  AdditionalDataLodging.JSON_PROPERTY_LODGING_CHECK_IN_DATE,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_CHECK_OUT_DATE,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_CUSTOMER_SERVICE_TOLL_FREE_NUMBER,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_FIRE_SAFETY_ACT_INDICATOR,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_FOLIO_CASH_ADVANCES,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_FOLIO_NUMBER,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_FOOD_BEVERAGE_CHARGES,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_NO_SHOW_INDICATOR,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_PREPAID_EXPENSES,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_PROPERTY_PHONE_NUMBER,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_ROOM1_NUMBER_OF_NIGHTS,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_ROOM1_RATE,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_TOTAL_ROOM_TAX,
  AdditionalDataLodging.JSON_PROPERTY_LODGING_TOTAL_TAX,
  AdditionalDataLodging.JSON_PROPERTY_TRAVEL_ENTERTAINMENT_AUTH_DATA_DURATION,
  AdditionalDataLodging.JSON_PROPERTY_TRAVEL_ENTERTAINMENT_AUTH_DATA_MARKET
})

public class AdditionalDataLodging {
  public static final String JSON_PROPERTY_LODGING_CHECK_IN_DATE = "lodging.checkInDate";
  private String lodgingCheckInDate;

  public static final String JSON_PROPERTY_LODGING_CHECK_OUT_DATE = "lodging.checkOutDate";
  private String lodgingCheckOutDate;

  public static final String JSON_PROPERTY_LODGING_CUSTOMER_SERVICE_TOLL_FREE_NUMBER = "lodging.customerServiceTollFreeNumber";
  private String lodgingCustomerServiceTollFreeNumber;

  public static final String JSON_PROPERTY_LODGING_FIRE_SAFETY_ACT_INDICATOR = "lodging.fireSafetyActIndicator";
  private String lodgingFireSafetyActIndicator;

  public static final String JSON_PROPERTY_LODGING_FOLIO_CASH_ADVANCES = "lodging.folioCashAdvances";
  private String lodgingFolioCashAdvances;

  public static final String JSON_PROPERTY_LODGING_FOLIO_NUMBER = "lodging.folioNumber";
  private String lodgingFolioNumber;

  public static final String JSON_PROPERTY_LODGING_FOOD_BEVERAGE_CHARGES = "lodging.foodBeverageCharges";
  private String lodgingFoodBeverageCharges;

  public static final String JSON_PROPERTY_LODGING_NO_SHOW_INDICATOR = "lodging.noShowIndicator";
  private String lodgingNoShowIndicator;

  public static final String JSON_PROPERTY_LODGING_PREPAID_EXPENSES = "lodging.prepaidExpenses";
  private String lodgingPrepaidExpenses;

  public static final String JSON_PROPERTY_LODGING_PROPERTY_PHONE_NUMBER = "lodging.propertyPhoneNumber";
  private String lodgingPropertyPhoneNumber;

  public static final String JSON_PROPERTY_LODGING_ROOM1_NUMBER_OF_NIGHTS = "lodging.room1.numberOfNights";
  private String lodgingRoom1NumberOfNights;

  public static final String JSON_PROPERTY_LODGING_ROOM1_RATE = "lodging.room1.rate";
  private String lodgingRoom1Rate;

  public static final String JSON_PROPERTY_LODGING_TOTAL_ROOM_TAX = "lodging.totalRoomTax";
  private String lodgingTotalRoomTax;

  public static final String JSON_PROPERTY_LODGING_TOTAL_TAX = "lodging.totalTax";
  private String lodgingTotalTax;

  public static final String JSON_PROPERTY_TRAVEL_ENTERTAINMENT_AUTH_DATA_DURATION = "travelEntertainmentAuthData.duration";
  private String travelEntertainmentAuthDataDuration;

  public static final String JSON_PROPERTY_TRAVEL_ENTERTAINMENT_AUTH_DATA_MARKET = "travelEntertainmentAuthData.market";
  private String travelEntertainmentAuthDataMarket;

  public AdditionalDataLodging() { 
  }

  public AdditionalDataLodging lodgingCheckInDate(String lodgingCheckInDate) {
    this.lodgingCheckInDate = lodgingCheckInDate;
    return this;
  }

   /**
   * The arrival date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**.
   * @return lodgingCheckInDate
  **/
  @ApiModelProperty(value = "The arrival date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**.")
  @JsonProperty(JSON_PROPERTY_LODGING_CHECK_IN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingCheckInDate() {
    return lodgingCheckInDate;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_CHECK_IN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingCheckInDate(String lodgingCheckInDate) {
    this.lodgingCheckInDate = lodgingCheckInDate;
  }


  public AdditionalDataLodging lodgingCheckOutDate(String lodgingCheckOutDate) {
    this.lodgingCheckOutDate = lodgingCheckOutDate;
    return this;
  }

   /**
   * The departure date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**.
   * @return lodgingCheckOutDate
  **/
  @ApiModelProperty(value = "The departure date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**.")
  @JsonProperty(JSON_PROPERTY_LODGING_CHECK_OUT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingCheckOutDate() {
    return lodgingCheckOutDate;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_CHECK_OUT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingCheckOutDate(String lodgingCheckOutDate) {
    this.lodgingCheckOutDate = lodgingCheckOutDate;
  }


  public AdditionalDataLodging lodgingCustomerServiceTollFreeNumber(String lodgingCustomerServiceTollFreeNumber) {
    this.lodgingCustomerServiceTollFreeNumber = lodgingCustomerServiceTollFreeNumber;
    return this;
  }

   /**
   * The toll-free phone number for the lodging. * Format: numeric * Max length: 17 characters. * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros.
   * @return lodgingCustomerServiceTollFreeNumber
  **/
  @ApiModelProperty(value = "The toll-free phone number for the lodging. * Format: numeric * Max length: 17 characters. * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros.")
  @JsonProperty(JSON_PROPERTY_LODGING_CUSTOMER_SERVICE_TOLL_FREE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingCustomerServiceTollFreeNumber() {
    return lodgingCustomerServiceTollFreeNumber;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_CUSTOMER_SERVICE_TOLL_FREE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingCustomerServiceTollFreeNumber(String lodgingCustomerServiceTollFreeNumber) {
    this.lodgingCustomerServiceTollFreeNumber = lodgingCustomerServiceTollFreeNumber;
  }


  public AdditionalDataLodging lodgingFireSafetyActIndicator(String lodgingFireSafetyActIndicator) {
    this.lodgingFireSafetyActIndicator = lodgingFireSafetyActIndicator;
    return this;
  }

   /**
   * Identifies that the facility complies with the Hotel and Motel Fire Safety Act of 1990. Must be &#39;Y&#39; or &#39;N&#39;. * Format: alphabetic * Max length: 1 character
   * @return lodgingFireSafetyActIndicator
  **/
  @ApiModelProperty(value = "Identifies that the facility complies with the Hotel and Motel Fire Safety Act of 1990. Must be 'Y' or 'N'. * Format: alphabetic * Max length: 1 character")
  @JsonProperty(JSON_PROPERTY_LODGING_FIRE_SAFETY_ACT_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingFireSafetyActIndicator() {
    return lodgingFireSafetyActIndicator;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_FIRE_SAFETY_ACT_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingFireSafetyActIndicator(String lodgingFireSafetyActIndicator) {
    this.lodgingFireSafetyActIndicator = lodgingFireSafetyActIndicator;
  }


  public AdditionalDataLodging lodgingFolioCashAdvances(String lodgingFolioCashAdvances) {
    this.lodgingFolioCashAdvances = lodgingFolioCashAdvances;
    return this;
  }

   /**
   * The folio cash advances, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters
   * @return lodgingFolioCashAdvances
  **/
  @ApiModelProperty(value = "The folio cash advances, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters")
  @JsonProperty(JSON_PROPERTY_LODGING_FOLIO_CASH_ADVANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingFolioCashAdvances() {
    return lodgingFolioCashAdvances;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_FOLIO_CASH_ADVANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingFolioCashAdvances(String lodgingFolioCashAdvances) {
    this.lodgingFolioCashAdvances = lodgingFolioCashAdvances;
  }


  public AdditionalDataLodging lodgingFolioNumber(String lodgingFolioNumber) {
    this.lodgingFolioNumber = lodgingFolioNumber;
    return this;
  }

   /**
   * The card acceptor’s internal invoice or billing ID reference number. * Max length: 25 characters. * Must not start with a space *Must not be all zeros.
   * @return lodgingFolioNumber
  **/
  @ApiModelProperty(value = "The card acceptor’s internal invoice or billing ID reference number. * Max length: 25 characters. * Must not start with a space *Must not be all zeros.")
  @JsonProperty(JSON_PROPERTY_LODGING_FOLIO_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingFolioNumber() {
    return lodgingFolioNumber;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_FOLIO_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingFolioNumber(String lodgingFolioNumber) {
    this.lodgingFolioNumber = lodgingFolioNumber;
  }


  public AdditionalDataLodging lodgingFoodBeverageCharges(String lodgingFoodBeverageCharges) {
    this.lodgingFoodBeverageCharges = lodgingFoodBeverageCharges;
    return this;
  }

   /**
   * Any charges for food and beverages associated with the booking, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters
   * @return lodgingFoodBeverageCharges
  **/
  @ApiModelProperty(value = "Any charges for food and beverages associated with the booking, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters")
  @JsonProperty(JSON_PROPERTY_LODGING_FOOD_BEVERAGE_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingFoodBeverageCharges() {
    return lodgingFoodBeverageCharges;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_FOOD_BEVERAGE_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingFoodBeverageCharges(String lodgingFoodBeverageCharges) {
    this.lodgingFoodBeverageCharges = lodgingFoodBeverageCharges;
  }


  public AdditionalDataLodging lodgingNoShowIndicator(String lodgingNoShowIndicator) {
    this.lodgingNoShowIndicator = lodgingNoShowIndicator;
    return this;
  }

   /**
   * Indicates if the customer didn&#39;t check in for their booking.  Possible values:  * **Y**: the customer didn&#39;t check in  * **N**: the customer checked in
   * @return lodgingNoShowIndicator
  **/
  @ApiModelProperty(value = "Indicates if the customer didn't check in for their booking.  Possible values:  * **Y**: the customer didn't check in  * **N**: the customer checked in")
  @JsonProperty(JSON_PROPERTY_LODGING_NO_SHOW_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingNoShowIndicator() {
    return lodgingNoShowIndicator;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_NO_SHOW_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingNoShowIndicator(String lodgingNoShowIndicator) {
    this.lodgingNoShowIndicator = lodgingNoShowIndicator;
  }


  public AdditionalDataLodging lodgingPrepaidExpenses(String lodgingPrepaidExpenses) {
    this.lodgingPrepaidExpenses = lodgingPrepaidExpenses;
    return this;
  }

   /**
   * The prepaid expenses for the booking. * Format: numeric * Max length: 12 characters
   * @return lodgingPrepaidExpenses
  **/
  @ApiModelProperty(value = "The prepaid expenses for the booking. * Format: numeric * Max length: 12 characters")
  @JsonProperty(JSON_PROPERTY_LODGING_PREPAID_EXPENSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingPrepaidExpenses() {
    return lodgingPrepaidExpenses;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_PREPAID_EXPENSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingPrepaidExpenses(String lodgingPrepaidExpenses) {
    this.lodgingPrepaidExpenses = lodgingPrepaidExpenses;
  }


  public AdditionalDataLodging lodgingPropertyPhoneNumber(String lodgingPropertyPhoneNumber) {
    this.lodgingPropertyPhoneNumber = lodgingPropertyPhoneNumber;
    return this;
  }

   /**
   * The lodging property location&#39;s phone number. * Format: numeric. * Min length: 10 characters * Max length: 17 characters * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros.
   * @return lodgingPropertyPhoneNumber
  **/
  @ApiModelProperty(value = "The lodging property location's phone number. * Format: numeric. * Min length: 10 characters * Max length: 17 characters * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros.")
  @JsonProperty(JSON_PROPERTY_LODGING_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingPropertyPhoneNumber() {
    return lodgingPropertyPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingPropertyPhoneNumber(String lodgingPropertyPhoneNumber) {
    this.lodgingPropertyPhoneNumber = lodgingPropertyPhoneNumber;
  }


  public AdditionalDataLodging lodgingRoom1NumberOfNights(String lodgingRoom1NumberOfNights) {
    this.lodgingRoom1NumberOfNights = lodgingRoom1NumberOfNights;
    return this;
  }

   /**
   * The total number of nights the room is booked for. * Format: numeric * Must be a number between 0 and 99 * Max length: 4 characters
   * @return lodgingRoom1NumberOfNights
  **/
  @ApiModelProperty(value = "The total number of nights the room is booked for. * Format: numeric * Must be a number between 0 and 99 * Max length: 4 characters")
  @JsonProperty(JSON_PROPERTY_LODGING_ROOM1_NUMBER_OF_NIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingRoom1NumberOfNights() {
    return lodgingRoom1NumberOfNights;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_ROOM1_NUMBER_OF_NIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingRoom1NumberOfNights(String lodgingRoom1NumberOfNights) {
    this.lodgingRoom1NumberOfNights = lodgingRoom1NumberOfNights;
  }


  public AdditionalDataLodging lodgingRoom1Rate(String lodgingRoom1Rate) {
    this.lodgingRoom1Rate = lodgingRoom1Rate;
    return this;
  }

   /**
   * The rate for the room, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number
   * @return lodgingRoom1Rate
  **/
  @ApiModelProperty(value = "The rate for the room, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number")
  @JsonProperty(JSON_PROPERTY_LODGING_ROOM1_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingRoom1Rate() {
    return lodgingRoom1Rate;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_ROOM1_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingRoom1Rate(String lodgingRoom1Rate) {
    this.lodgingRoom1Rate = lodgingRoom1Rate;
  }


  public AdditionalDataLodging lodgingTotalRoomTax(String lodgingTotalRoomTax) {
    this.lodgingTotalRoomTax = lodgingTotalRoomTax;
    return this;
  }

   /**
   * The total room tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number
   * @return lodgingTotalRoomTax
  **/
  @ApiModelProperty(value = "The total room tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number")
  @JsonProperty(JSON_PROPERTY_LODGING_TOTAL_ROOM_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingTotalRoomTax() {
    return lodgingTotalRoomTax;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_TOTAL_ROOM_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingTotalRoomTax(String lodgingTotalRoomTax) {
    this.lodgingTotalRoomTax = lodgingTotalRoomTax;
  }


  public AdditionalDataLodging lodgingTotalTax(String lodgingTotalTax) {
    this.lodgingTotalTax = lodgingTotalTax;
    return this;
  }

   /**
   * The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number
   * @return lodgingTotalTax
  **/
  @ApiModelProperty(value = "The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number")
  @JsonProperty(JSON_PROPERTY_LODGING_TOTAL_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLodgingTotalTax() {
    return lodgingTotalTax;
  }


  @JsonProperty(JSON_PROPERTY_LODGING_TOTAL_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLodgingTotalTax(String lodgingTotalTax) {
    this.lodgingTotalTax = lodgingTotalTax;
  }


  public AdditionalDataLodging travelEntertainmentAuthDataDuration(String travelEntertainmentAuthDataDuration) {
    this.travelEntertainmentAuthDataDuration = travelEntertainmentAuthDataDuration;
    return this;
  }

   /**
   * The number of nights. This should be included in the auth message. * Format: numeric * Max length: 4 characters
   * @return travelEntertainmentAuthDataDuration
  **/
  @ApiModelProperty(value = "The number of nights. This should be included in the auth message. * Format: numeric * Max length: 4 characters")
  @JsonProperty(JSON_PROPERTY_TRAVEL_ENTERTAINMENT_AUTH_DATA_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTravelEntertainmentAuthDataDuration() {
    return travelEntertainmentAuthDataDuration;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_ENTERTAINMENT_AUTH_DATA_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTravelEntertainmentAuthDataDuration(String travelEntertainmentAuthDataDuration) {
    this.travelEntertainmentAuthDataDuration = travelEntertainmentAuthDataDuration;
  }


  public AdditionalDataLodging travelEntertainmentAuthDataMarket(String travelEntertainmentAuthDataMarket) {
    this.travelEntertainmentAuthDataMarket = travelEntertainmentAuthDataMarket;
    return this;
  }

   /**
   * Indicates what market-specific dataset will be submitted. Must be &#39;H&#39; for Hotel. This should be included in the auth message.  * Format: alphanumeric * Max length: 1 character
   * @return travelEntertainmentAuthDataMarket
  **/
  @ApiModelProperty(value = "Indicates what market-specific dataset will be submitted. Must be 'H' for Hotel. This should be included in the auth message.  * Format: alphanumeric * Max length: 1 character")
  @JsonProperty(JSON_PROPERTY_TRAVEL_ENTERTAINMENT_AUTH_DATA_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTravelEntertainmentAuthDataMarket() {
    return travelEntertainmentAuthDataMarket;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_ENTERTAINMENT_AUTH_DATA_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTravelEntertainmentAuthDataMarket(String travelEntertainmentAuthDataMarket) {
    this.travelEntertainmentAuthDataMarket = travelEntertainmentAuthDataMarket;
  }


  /**
   * Return true if this AdditionalDataLodging object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataLodging additionalDataLodging = (AdditionalDataLodging) o;
    return Objects.equals(this.lodgingCheckInDate, additionalDataLodging.lodgingCheckInDate) &&
        Objects.equals(this.lodgingCheckOutDate, additionalDataLodging.lodgingCheckOutDate) &&
        Objects.equals(this.lodgingCustomerServiceTollFreeNumber, additionalDataLodging.lodgingCustomerServiceTollFreeNumber) &&
        Objects.equals(this.lodgingFireSafetyActIndicator, additionalDataLodging.lodgingFireSafetyActIndicator) &&
        Objects.equals(this.lodgingFolioCashAdvances, additionalDataLodging.lodgingFolioCashAdvances) &&
        Objects.equals(this.lodgingFolioNumber, additionalDataLodging.lodgingFolioNumber) &&
        Objects.equals(this.lodgingFoodBeverageCharges, additionalDataLodging.lodgingFoodBeverageCharges) &&
        Objects.equals(this.lodgingNoShowIndicator, additionalDataLodging.lodgingNoShowIndicator) &&
        Objects.equals(this.lodgingPrepaidExpenses, additionalDataLodging.lodgingPrepaidExpenses) &&
        Objects.equals(this.lodgingPropertyPhoneNumber, additionalDataLodging.lodgingPropertyPhoneNumber) &&
        Objects.equals(this.lodgingRoom1NumberOfNights, additionalDataLodging.lodgingRoom1NumberOfNights) &&
        Objects.equals(this.lodgingRoom1Rate, additionalDataLodging.lodgingRoom1Rate) &&
        Objects.equals(this.lodgingTotalRoomTax, additionalDataLodging.lodgingTotalRoomTax) &&
        Objects.equals(this.lodgingTotalTax, additionalDataLodging.lodgingTotalTax) &&
        Objects.equals(this.travelEntertainmentAuthDataDuration, additionalDataLodging.travelEntertainmentAuthDataDuration) &&
        Objects.equals(this.travelEntertainmentAuthDataMarket, additionalDataLodging.travelEntertainmentAuthDataMarket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lodgingCheckInDate, lodgingCheckOutDate, lodgingCustomerServiceTollFreeNumber, lodgingFireSafetyActIndicator, lodgingFolioCashAdvances, lodgingFolioNumber, lodgingFoodBeverageCharges, lodgingNoShowIndicator, lodgingPrepaidExpenses, lodgingPropertyPhoneNumber, lodgingRoom1NumberOfNights, lodgingRoom1Rate, lodgingTotalRoomTax, lodgingTotalTax, travelEntertainmentAuthDataDuration, travelEntertainmentAuthDataMarket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataLodging {\n");
    sb.append("    lodgingCheckInDate: ").append(toIndentedString(lodgingCheckInDate)).append("\n");
    sb.append("    lodgingCheckOutDate: ").append(toIndentedString(lodgingCheckOutDate)).append("\n");
    sb.append("    lodgingCustomerServiceTollFreeNumber: ").append(toIndentedString(lodgingCustomerServiceTollFreeNumber)).append("\n");
    sb.append("    lodgingFireSafetyActIndicator: ").append(toIndentedString(lodgingFireSafetyActIndicator)).append("\n");
    sb.append("    lodgingFolioCashAdvances: ").append(toIndentedString(lodgingFolioCashAdvances)).append("\n");
    sb.append("    lodgingFolioNumber: ").append(toIndentedString(lodgingFolioNumber)).append("\n");
    sb.append("    lodgingFoodBeverageCharges: ").append(toIndentedString(lodgingFoodBeverageCharges)).append("\n");
    sb.append("    lodgingNoShowIndicator: ").append(toIndentedString(lodgingNoShowIndicator)).append("\n");
    sb.append("    lodgingPrepaidExpenses: ").append(toIndentedString(lodgingPrepaidExpenses)).append("\n");
    sb.append("    lodgingPropertyPhoneNumber: ").append(toIndentedString(lodgingPropertyPhoneNumber)).append("\n");
    sb.append("    lodgingRoom1NumberOfNights: ").append(toIndentedString(lodgingRoom1NumberOfNights)).append("\n");
    sb.append("    lodgingRoom1Rate: ").append(toIndentedString(lodgingRoom1Rate)).append("\n");
    sb.append("    lodgingTotalRoomTax: ").append(toIndentedString(lodgingTotalRoomTax)).append("\n");
    sb.append("    lodgingTotalTax: ").append(toIndentedString(lodgingTotalTax)).append("\n");
    sb.append("    travelEntertainmentAuthDataDuration: ").append(toIndentedString(travelEntertainmentAuthDataDuration)).append("\n");
    sb.append("    travelEntertainmentAuthDataMarket: ").append(toIndentedString(travelEntertainmentAuthDataMarket)).append("\n");
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
   * Create an instance of AdditionalDataLodging given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataLodging
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataLodging
   */
  public static AdditionalDataLodging fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataLodging.class);
  }
/**
  * Convert an instance of AdditionalDataLodging to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

