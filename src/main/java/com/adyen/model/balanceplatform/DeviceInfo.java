/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * DeviceInfo
 */
@JsonPropertyOrder({
  DeviceInfo.JSON_PROPERTY_CARD_CAPTURE_TECHNOLOGY,
  DeviceInfo.JSON_PROPERTY_DEVICE_NAME,
  DeviceInfo.JSON_PROPERTY_FORM_FACTOR,
  DeviceInfo.JSON_PROPERTY_IMEI,
  DeviceInfo.JSON_PROPERTY_ISO_DEVICE_TYPE,
  DeviceInfo.JSON_PROPERTY_MSISDN,
  DeviceInfo.JSON_PROPERTY_OS_NAME,
  DeviceInfo.JSON_PROPERTY_OS_VERSION,
  DeviceInfo.JSON_PROPERTY_PAYMENT_TYPES,
  DeviceInfo.JSON_PROPERTY_SERIAL_NUMBER,
  DeviceInfo.JSON_PROPERTY_STORAGE_TECHNOLOGY
})

public class DeviceInfo {
  public static final String JSON_PROPERTY_CARD_CAPTURE_TECHNOLOGY = "cardCaptureTechnology";
  private String cardCaptureTechnology;

  public static final String JSON_PROPERTY_DEVICE_NAME = "deviceName";
  private String deviceName;

  public static final String JSON_PROPERTY_FORM_FACTOR = "formFactor";
  private String formFactor;

  public static final String JSON_PROPERTY_IMEI = "imei";
  private String imei;

  public static final String JSON_PROPERTY_ISO_DEVICE_TYPE = "isoDeviceType";
  private String isoDeviceType;

  public static final String JSON_PROPERTY_MSISDN = "msisdn";
  private String msisdn;

  public static final String JSON_PROPERTY_OS_NAME = "osName";
  private String osName;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public static final String JSON_PROPERTY_PAYMENT_TYPES = "paymentTypes";
  private List<String> paymentTypes = null;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serialNumber";
  private String serialNumber;

  public static final String JSON_PROPERTY_STORAGE_TECHNOLOGY = "storageTechnology";
  private String storageTechnology;

  public DeviceInfo() { 
  }

  public DeviceInfo cardCaptureTechnology(String cardCaptureTechnology) {
    this.cardCaptureTechnology = cardCaptureTechnology;
    return this;
  }

   /**
   * The technology used to capture the card details.
   * @return cardCaptureTechnology
  **/
  @ApiModelProperty(value = "The technology used to capture the card details.")
  @JsonProperty(JSON_PROPERTY_CARD_CAPTURE_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardCaptureTechnology() {
    return cardCaptureTechnology;
  }


  @JsonProperty(JSON_PROPERTY_CARD_CAPTURE_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardCaptureTechnology(String cardCaptureTechnology) {
    this.cardCaptureTechnology = cardCaptureTechnology;
  }


  public DeviceInfo deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * The name of the device.
   * @return deviceName
  **/
  @ApiModelProperty(value = "The name of the device.")
  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceName() {
    return deviceName;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  public DeviceInfo formFactor(String formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * The form factor of the device to be provisioned.
   * @return formFactor
  **/
  @ApiModelProperty(value = "The form factor of the device to be provisioned.")
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormFactor() {
    return formFactor;
  }


  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFactor(String formFactor) {
    this.formFactor = formFactor;
  }


  public DeviceInfo imei(String imei) {
    this.imei = imei;
    return this;
  }

   /**
   * The IMEI number of the device being provisioned.
   * @return imei
  **/
  @ApiModelProperty(value = "The IMEI number of the device being provisioned.")
  @JsonProperty(JSON_PROPERTY_IMEI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImei() {
    return imei;
  }


  @JsonProperty(JSON_PROPERTY_IMEI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImei(String imei) {
    this.imei = imei;
  }


  public DeviceInfo isoDeviceType(String isoDeviceType) {
    this.isoDeviceType = isoDeviceType;
    return this;
  }

   /**
   * The 2-digit device type provided on the ISO messages that the token is being provisioned to.
   * @return isoDeviceType
  **/
  @ApiModelProperty(value = "The 2-digit device type provided on the ISO messages that the token is being provisioned to.")
  @JsonProperty(JSON_PROPERTY_ISO_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsoDeviceType() {
    return isoDeviceType;
  }


  @JsonProperty(JSON_PROPERTY_ISO_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsoDeviceType(String isoDeviceType) {
    this.isoDeviceType = isoDeviceType;
  }


  public DeviceInfo msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * The MSISDN of the device being provisioned.
   * @return msisdn
  **/
  @ApiModelProperty(value = "The MSISDN of the device being provisioned.")
  @JsonProperty(JSON_PROPERTY_MSISDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsisdn() {
    return msisdn;
  }


  @JsonProperty(JSON_PROPERTY_MSISDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }


  public DeviceInfo osName(String osName) {
    this.osName = osName;
    return this;
  }

   /**
   * The name of the device operating system.
   * @return osName
  **/
  @ApiModelProperty(value = "The name of the device operating system.")
  @JsonProperty(JSON_PROPERTY_OS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsName() {
    return osName;
  }


  @JsonProperty(JSON_PROPERTY_OS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsName(String osName) {
    this.osName = osName;
  }


  public DeviceInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * The version of the device operating system.
   * @return osVersion
  **/
  @ApiModelProperty(value = "The version of the device operating system.")
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsVersion() {
    return osVersion;
  }


  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public DeviceInfo paymentTypes(List<String> paymentTypes) {
    this.paymentTypes = paymentTypes;
    return this;
  }

  public DeviceInfo addPaymentTypesItem(String paymentTypesItem) {
    if (this.paymentTypes == null) {
      this.paymentTypes = new ArrayList<>();
    }
    this.paymentTypes.add(paymentTypesItem);
    return this;
  }

   /**
   * Different types of payments supported for the network token.
   * @return paymentTypes
  **/
  @ApiModelProperty(value = "Different types of payments supported for the network token.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPaymentTypes() {
    return paymentTypes;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentTypes(List<String> paymentTypes) {
    this.paymentTypes = paymentTypes;
  }


  public DeviceInfo serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serial number of the device.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "The serial number of the device.")
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerialNumber() {
    return serialNumber;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public DeviceInfo storageTechnology(String storageTechnology) {
    this.storageTechnology = storageTechnology;
    return this;
  }

   /**
   * The architecture or technology used for network token storage.
   * @return storageTechnology
  **/
  @ApiModelProperty(value = "The architecture or technology used for network token storage.")
  @JsonProperty(JSON_PROPERTY_STORAGE_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStorageTechnology() {
    return storageTechnology;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageTechnology(String storageTechnology) {
    this.storageTechnology = storageTechnology;
  }


  /**
   * Return true if this DeviceInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInfo deviceInfo = (DeviceInfo) o;
    return Objects.equals(this.cardCaptureTechnology, deviceInfo.cardCaptureTechnology) &&
        Objects.equals(this.deviceName, deviceInfo.deviceName) &&
        Objects.equals(this.formFactor, deviceInfo.formFactor) &&
        Objects.equals(this.imei, deviceInfo.imei) &&
        Objects.equals(this.isoDeviceType, deviceInfo.isoDeviceType) &&
        Objects.equals(this.msisdn, deviceInfo.msisdn) &&
        Objects.equals(this.osName, deviceInfo.osName) &&
        Objects.equals(this.osVersion, deviceInfo.osVersion) &&
        Objects.equals(this.paymentTypes, deviceInfo.paymentTypes) &&
        Objects.equals(this.serialNumber, deviceInfo.serialNumber) &&
        Objects.equals(this.storageTechnology, deviceInfo.storageTechnology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCaptureTechnology, deviceName, formFactor, imei, isoDeviceType, msisdn, osName, osVersion, paymentTypes, serialNumber, storageTechnology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInfo {\n");
    sb.append("    cardCaptureTechnology: ").append(toIndentedString(cardCaptureTechnology)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    isoDeviceType: ").append(toIndentedString(isoDeviceType)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    paymentTypes: ").append(toIndentedString(paymentTypes)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    storageTechnology: ").append(toIndentedString(storageTechnology)).append("\n");
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
   * Create an instance of DeviceInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeviceInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to DeviceInfo
   */
  public static DeviceInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DeviceInfo.class);
  }
/**
  * Convert an instance of DeviceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

