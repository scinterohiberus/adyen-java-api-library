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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * Terminal
 */

public class Terminal {
  public static final String SERIALIZED_NAME_ASSIGNED = "assigned";
  @SerializedName(SERIALIZED_NAME_ASSIGNED)
  private Boolean assigned;

  public static final String SERIALIZED_NAME_BLUETOOTH_IP = "bluetoothIp";
  @SerializedName(SERIALIZED_NAME_BLUETOOTH_IP)
  private String bluetoothIp;

  public static final String SERIALIZED_NAME_BLUETOOTH_MAC = "bluetoothMac";
  @SerializedName(SERIALIZED_NAME_BLUETOOTH_MAC)
  private String bluetoothMac;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COMPANY_ACCOUNT = "companyAccount";
  @SerializedName(SERIALIZED_NAME_COMPANY_ACCOUNT)
  private String companyAccount;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_DEVICE_MODEL = "deviceModel";
  @SerializedName(SERIALIZED_NAME_DEVICE_MODEL)
  private String deviceModel;

  public static final String SERIALIZED_NAME_ETHERNET_IP = "ethernetIp";
  @SerializedName(SERIALIZED_NAME_ETHERNET_IP)
  private String ethernetIp;

  public static final String SERIALIZED_NAME_ETHERNET_MAC = "ethernetMac";
  @SerializedName(SERIALIZED_NAME_ETHERNET_MAC)
  private String ethernetMac;

  public static final String SERIALIZED_NAME_FIRMWARE_VERSION = "firmwareVersion";
  @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION)
  private String firmwareVersion;

  public static final String SERIALIZED_NAME_ICCID = "iccid";
  @SerializedName(SERIALIZED_NAME_ICCID)
  private String iccid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY_DATE_TIME = "lastActivityDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY_DATE_TIME)
  private OffsetDateTime lastActivityDateTime;

  public static final String SERIALIZED_NAME_LAST_TRANSACTION_DATE_TIME = "lastTransactionDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSACTION_DATE_TIME)
  private OffsetDateTime lastTransactionDateTime;

  public static final String SERIALIZED_NAME_LINK_NEGOTIATION = "linkNegotiation";
  @SerializedName(SERIALIZED_NAME_LINK_NEGOTIATION)
  private String linkNegotiation;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_SIM_STATUS = "simStatus";
  @SerializedName(SERIALIZED_NAME_SIM_STATUS)
  private String simStatus;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STORE_STATUS = "storeStatus";
  @SerializedName(SERIALIZED_NAME_STORE_STATUS)
  private String storeStatus;

  public static final String SERIALIZED_NAME_WIFI_IP = "wifiIp";
  @SerializedName(SERIALIZED_NAME_WIFI_IP)
  private String wifiIp;

  public static final String SERIALIZED_NAME_WIFI_MAC = "wifiMac";
  @SerializedName(SERIALIZED_NAME_WIFI_MAC)
  private String wifiMac;

  public static final String SERIALIZED_NAME_WIFI_SSID = "wifiSsid";
  @SerializedName(SERIALIZED_NAME_WIFI_SSID)
  private String wifiSsid;

  public Terminal() { 
  }

  public Terminal assigned(Boolean assigned) {
    
    this.assigned = assigned;
    return this;
  }

   /**
   * The [assignment status](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api) of the terminal. If true, the terminal is assigned. If false, the terminal is in inventory and can&#39;t be boarded.
   * @return assigned
  **/
  @ApiModelProperty(value = "The [assignment status](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api) of the terminal. If true, the terminal is assigned. If false, the terminal is in inventory and can't be boarded.")

  public Boolean getAssigned() {
    return assigned;
  }


  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }


  public Terminal bluetoothIp(String bluetoothIp) {
    
    this.bluetoothIp = bluetoothIp;
    return this;
  }

   /**
   * The Bluetooth IP address of the terminal.
   * @return bluetoothIp
  **/
  @ApiModelProperty(value = "The Bluetooth IP address of the terminal.")

  public String getBluetoothIp() {
    return bluetoothIp;
  }


  public void setBluetoothIp(String bluetoothIp) {
    this.bluetoothIp = bluetoothIp;
  }


  public Terminal bluetoothMac(String bluetoothMac) {
    
    this.bluetoothMac = bluetoothMac;
    return this;
  }

   /**
   * The Bluetooth MAC address of the terminal.
   * @return bluetoothMac
  **/
  @ApiModelProperty(value = "The Bluetooth MAC address of the terminal.")

  public String getBluetoothMac() {
    return bluetoothMac;
  }


  public void setBluetoothMac(String bluetoothMac) {
    this.bluetoothMac = bluetoothMac;
  }


  public Terminal city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city where the terminal is located.
   * @return city
  **/
  @ApiModelProperty(value = "The city where the terminal is located.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Terminal companyAccount(String companyAccount) {
    
    this.companyAccount = companyAccount;
    return this;
  }

   /**
   * The company account that the terminal is associated with. If this is the only account level shown in the response, the terminal is assigned to the inventory of the company account.
   * @return companyAccount
  **/
  @ApiModelProperty(value = "The company account that the terminal is associated with. If this is the only account level shown in the response, the terminal is assigned to the inventory of the company account.")

  public String getCompanyAccount() {
    return companyAccount;
  }


  public void setCompanyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
  }


  public Terminal countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code of the country where the terminal is located.
   * @return countryCode
  **/
  @ApiModelProperty(value = "The country code of the country where the terminal is located.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Terminal deviceModel(String deviceModel) {
    
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * The model name of the terminal.
   * @return deviceModel
  **/
  @ApiModelProperty(value = "The model name of the terminal.")

  public String getDeviceModel() {
    return deviceModel;
  }


  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }


  public Terminal ethernetIp(String ethernetIp) {
    
    this.ethernetIp = ethernetIp;
    return this;
  }

   /**
   * The ethernet IP address of the terminal.
   * @return ethernetIp
  **/
  @ApiModelProperty(value = "The ethernet IP address of the terminal.")

  public String getEthernetIp() {
    return ethernetIp;
  }


  public void setEthernetIp(String ethernetIp) {
    this.ethernetIp = ethernetIp;
  }


  public Terminal ethernetMac(String ethernetMac) {
    
    this.ethernetMac = ethernetMac;
    return this;
  }

   /**
   * The ethernet MAC address of the terminal.
   * @return ethernetMac
  **/
  @ApiModelProperty(value = "The ethernet MAC address of the terminal.")

  public String getEthernetMac() {
    return ethernetMac;
  }


  public void setEthernetMac(String ethernetMac) {
    this.ethernetMac = ethernetMac;
  }


  public Terminal firmwareVersion(String firmwareVersion) {
    
    this.firmwareVersion = firmwareVersion;
    return this;
  }

   /**
   * The software release currently in use on the terminal.
   * @return firmwareVersion
  **/
  @ApiModelProperty(value = "The software release currently in use on the terminal.")

  public String getFirmwareVersion() {
    return firmwareVersion;
  }


  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }


  public Terminal iccid(String iccid) {
    
    this.iccid = iccid;
    return this;
  }

   /**
   * The integrated circuit card identifier (ICCID) of the SIM card in the terminal.
   * @return iccid
  **/
  @ApiModelProperty(value = "The integrated circuit card identifier (ICCID) of the SIM card in the terminal.")

  public String getIccid() {
    return iccid;
  }


  public void setIccid(String iccid) {
    this.iccid = iccid;
  }


  public Terminal id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the terminal.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the terminal.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Terminal lastActivityDateTime(OffsetDateTime lastActivityDateTime) {
    
    this.lastActivityDateTime = lastActivityDateTime;
    return this;
  }

   /**
   * Date and time of the last activity on the terminal. Not included when the last activity was more than 14 days ago.
   * @return lastActivityDateTime
  **/
  @ApiModelProperty(value = "Date and time of the last activity on the terminal. Not included when the last activity was more than 14 days ago.")

  public OffsetDateTime getLastActivityDateTime() {
    return lastActivityDateTime;
  }


  public void setLastActivityDateTime(OffsetDateTime lastActivityDateTime) {
    this.lastActivityDateTime = lastActivityDateTime;
  }


  public Terminal lastTransactionDateTime(OffsetDateTime lastTransactionDateTime) {
    
    this.lastTransactionDateTime = lastTransactionDateTime;
    return this;
  }

   /**
   * Date and time of the last transaction on the terminal. Not included when the last transaction was more than 14 days ago.
   * @return lastTransactionDateTime
  **/
  @ApiModelProperty(value = "Date and time of the last transaction on the terminal. Not included when the last transaction was more than 14 days ago.")

  public OffsetDateTime getLastTransactionDateTime() {
    return lastTransactionDateTime;
  }


  public void setLastTransactionDateTime(OffsetDateTime lastTransactionDateTime) {
    this.lastTransactionDateTime = lastTransactionDateTime;
  }


  public Terminal linkNegotiation(String linkNegotiation) {
    
    this.linkNegotiation = linkNegotiation;
    return this;
  }

   /**
   * The Ethernet link negotiation that the terminal uses:  - &#x60;auto&#x60;: Auto-negotiation  - &#x60;100full&#x60;: 100 Mbps full duplex
   * @return linkNegotiation
  **/
  @ApiModelProperty(value = "The Ethernet link negotiation that the terminal uses:  - `auto`: Auto-negotiation  - `100full`: 100 Mbps full duplex")

  public String getLinkNegotiation() {
    return linkNegotiation;
  }


  public void setLinkNegotiation(String linkNegotiation) {
    this.linkNegotiation = linkNegotiation;
  }


  public Terminal serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serial number of the terminal.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "The serial number of the terminal.")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public Terminal simStatus(String simStatus) {
    
    this.simStatus = simStatus;
    return this;
  }

   /**
   * On a terminal that supports 3G or 4G connectivity, indicates the status of the SIM card in the terminal: ACTIVE or INVENTORY.
   * @return simStatus
  **/
  @ApiModelProperty(value = "On a terminal that supports 3G or 4G connectivity, indicates the status of the SIM card in the terminal: ACTIVE or INVENTORY.")

  public String getSimStatus() {
    return simStatus;
  }


  public void setSimStatus(String simStatus) {
    this.simStatus = simStatus;
  }


  public Terminal status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Indicates when the terminal was last online, whether the terminal is being reassigned, or whether the terminal is turned off. If the terminal was last online more that a week ago, it is also shown as turned off.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates when the terminal was last online, whether the terminal is being reassigned, or whether the terminal is turned off. If the terminal was last online more that a week ago, it is also shown as turned off.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Terminal storeStatus(String storeStatus) {
    
    this.storeStatus = storeStatus;
    return this;
  }

   /**
   * The status of the store that the terminal is assigned to.
   * @return storeStatus
  **/
  @ApiModelProperty(value = "The status of the store that the terminal is assigned to.")

  public String getStoreStatus() {
    return storeStatus;
  }


  public void setStoreStatus(String storeStatus) {
    this.storeStatus = storeStatus;
  }


  public Terminal wifiIp(String wifiIp) {
    
    this.wifiIp = wifiIp;
    return this;
  }

   /**
   * The terminal&#39;s IP address in your Wi-Fi network.
   * @return wifiIp
  **/
  @ApiModelProperty(value = "The terminal's IP address in your Wi-Fi network.")

  public String getWifiIp() {
    return wifiIp;
  }


  public void setWifiIp(String wifiIp) {
    this.wifiIp = wifiIp;
  }


  public Terminal wifiMac(String wifiMac) {
    
    this.wifiMac = wifiMac;
    return this;
  }

   /**
   * The terminal&#39;s MAC address in your Wi-Fi network.
   * @return wifiMac
  **/
  @ApiModelProperty(value = "The terminal's MAC address in your Wi-Fi network.")

  public String getWifiMac() {
    return wifiMac;
  }


  public void setWifiMac(String wifiMac) {
    this.wifiMac = wifiMac;
  }


  public Terminal wifiSsid(String wifiSsid) {
    
    this.wifiSsid = wifiSsid;
    return this;
  }

   /**
   * The SSID of the Wi-Fi network that your terminal is connected to.
   * @return wifiSsid
  **/
  @ApiModelProperty(value = "The SSID of the Wi-Fi network that your terminal is connected to.")

  public String getWifiSsid() {
    return wifiSsid;
  }


  public void setWifiSsid(String wifiSsid) {
    this.wifiSsid = wifiSsid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Terminal terminal = (Terminal) o;
    return Objects.equals(this.assigned, terminal.assigned) &&
        Objects.equals(this.bluetoothIp, terminal.bluetoothIp) &&
        Objects.equals(this.bluetoothMac, terminal.bluetoothMac) &&
        Objects.equals(this.city, terminal.city) &&
        Objects.equals(this.companyAccount, terminal.companyAccount) &&
        Objects.equals(this.countryCode, terminal.countryCode) &&
        Objects.equals(this.deviceModel, terminal.deviceModel) &&
        Objects.equals(this.ethernetIp, terminal.ethernetIp) &&
        Objects.equals(this.ethernetMac, terminal.ethernetMac) &&
        Objects.equals(this.firmwareVersion, terminal.firmwareVersion) &&
        Objects.equals(this.iccid, terminal.iccid) &&
        Objects.equals(this.id, terminal.id) &&
        Objects.equals(this.lastActivityDateTime, terminal.lastActivityDateTime) &&
        Objects.equals(this.lastTransactionDateTime, terminal.lastTransactionDateTime) &&
        Objects.equals(this.linkNegotiation, terminal.linkNegotiation) &&
        Objects.equals(this.serialNumber, terminal.serialNumber) &&
        Objects.equals(this.simStatus, terminal.simStatus) &&
        Objects.equals(this.status, terminal.status) &&
        Objects.equals(this.storeStatus, terminal.storeStatus) &&
        Objects.equals(this.wifiIp, terminal.wifiIp) &&
        Objects.equals(this.wifiMac, terminal.wifiMac) &&
        Objects.equals(this.wifiSsid, terminal.wifiSsid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigned, bluetoothIp, bluetoothMac, city, companyAccount, countryCode, deviceModel, ethernetIp, ethernetMac, firmwareVersion, iccid, id, lastActivityDateTime, lastTransactionDateTime, linkNegotiation, serialNumber, simStatus, status, storeStatus, wifiIp, wifiMac, wifiSsid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Terminal {\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    bluetoothIp: ").append(toIndentedString(bluetoothIp)).append("\n");
    sb.append("    bluetoothMac: ").append(toIndentedString(bluetoothMac)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    companyAccount: ").append(toIndentedString(companyAccount)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    ethernetIp: ").append(toIndentedString(ethernetIp)).append("\n");
    sb.append("    ethernetMac: ").append(toIndentedString(ethernetMac)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastActivityDateTime: ").append(toIndentedString(lastActivityDateTime)).append("\n");
    sb.append("    lastTransactionDateTime: ").append(toIndentedString(lastTransactionDateTime)).append("\n");
    sb.append("    linkNegotiation: ").append(toIndentedString(linkNegotiation)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    simStatus: ").append(toIndentedString(simStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeStatus: ").append(toIndentedString(storeStatus)).append("\n");
    sb.append("    wifiIp: ").append(toIndentedString(wifiIp)).append("\n");
    sb.append("    wifiMac: ").append(toIndentedString(wifiMac)).append("\n");
    sb.append("    wifiSsid: ").append(toIndentedString(wifiSsid)).append("\n");
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
    openapiFields.add("assigned");
    openapiFields.add("bluetoothIp");
    openapiFields.add("bluetoothMac");
    openapiFields.add("city");
    openapiFields.add("companyAccount");
    openapiFields.add("countryCode");
    openapiFields.add("deviceModel");
    openapiFields.add("ethernetIp");
    openapiFields.add("ethernetMac");
    openapiFields.add("firmwareVersion");
    openapiFields.add("iccid");
    openapiFields.add("id");
    openapiFields.add("lastActivityDateTime");
    openapiFields.add("lastTransactionDateTime");
    openapiFields.add("linkNegotiation");
    openapiFields.add("serialNumber");
    openapiFields.add("simStatus");
    openapiFields.add("status");
    openapiFields.add("storeStatus");
    openapiFields.add("wifiIp");
    openapiFields.add("wifiMac");
    openapiFields.add("wifiSsid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Terminal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Terminal.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Terminal is not found in the empty JSON string", Terminal.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Terminal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Terminal` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field bluetoothIp
      if (jsonObj.get("bluetoothIp") != null && !jsonObj.get("bluetoothIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bluetoothIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bluetoothIp").toString()));
      }
      // validate the optional field bluetoothMac
      if (jsonObj.get("bluetoothMac") != null && !jsonObj.get("bluetoothMac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bluetoothMac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bluetoothMac").toString()));
      }
      // validate the optional field city
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      // validate the optional field companyAccount
      if (jsonObj.get("companyAccount") != null && !jsonObj.get("companyAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyAccount").toString()));
      }
      // validate the optional field countryCode
      if (jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      // validate the optional field deviceModel
      if (jsonObj.get("deviceModel") != null && !jsonObj.get("deviceModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceModel").toString()));
      }
      // validate the optional field ethernetIp
      if (jsonObj.get("ethernetIp") != null && !jsonObj.get("ethernetIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ethernetIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ethernetIp").toString()));
      }
      // validate the optional field ethernetMac
      if (jsonObj.get("ethernetMac") != null && !jsonObj.get("ethernetMac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ethernetMac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ethernetMac").toString()));
      }
      // validate the optional field firmwareVersion
      if (jsonObj.get("firmwareVersion") != null && !jsonObj.get("firmwareVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firmwareVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firmwareVersion").toString()));
      }
      // validate the optional field iccid
      if (jsonObj.get("iccid") != null && !jsonObj.get("iccid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iccid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iccid").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field linkNegotiation
      if (jsonObj.get("linkNegotiation") != null && !jsonObj.get("linkNegotiation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkNegotiation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkNegotiation").toString()));
      }
      // validate the optional field serialNumber
      if (jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      // validate the optional field simStatus
      if (jsonObj.get("simStatus") != null && !jsonObj.get("simStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `simStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("simStatus").toString()));
      }
      // validate the optional field status
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field storeStatus
      if (jsonObj.get("storeStatus") != null && !jsonObj.get("storeStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storeStatus").toString()));
      }
      // validate the optional field wifiIp
      if (jsonObj.get("wifiIp") != null && !jsonObj.get("wifiIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wifiIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wifiIp").toString()));
      }
      // validate the optional field wifiMac
      if (jsonObj.get("wifiMac") != null && !jsonObj.get("wifiMac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wifiMac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wifiMac").toString()));
      }
      // validate the optional field wifiSsid
      if (jsonObj.get("wifiSsid") != null && !jsonObj.get("wifiSsid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wifiSsid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wifiSsid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Terminal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Terminal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Terminal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Terminal.class));

       return (TypeAdapter<T>) new TypeAdapter<Terminal>() {
           @Override
           public void write(JsonWriter out, Terminal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Terminal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Terminal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Terminal
  * @throws IOException if the JSON string is invalid with respect to Terminal
  */
  public static Terminal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Terminal.class);
  }

 /**
  * Convert an instance of Terminal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

