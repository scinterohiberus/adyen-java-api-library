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
import com.adyen.model.checkout.Item;
import com.adyen.model.checkout.SubInputDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * InputDetail
 */

public class InputDetail {
  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, String> configuration = null;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<SubInputDetail> details = null;

  public static final String SERIALIZED_NAME_INPUT_DETAILS = "inputDetails";
  @SerializedName(SERIALIZED_NAME_INPUT_DETAILS)
  private List<SubInputDetail> inputDetails = null;

  public static final String SERIALIZED_NAME_ITEM_SEARCH_URL = "itemSearchUrl";
  @SerializedName(SERIALIZED_NAME_ITEM_SEARCH_URL)
  private String itemSearchUrl;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Item> items = null;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public InputDetail() { 
  }

  public InputDetail configuration(Map<String, String> configuration) {
    
    this.configuration = configuration;
    return this;
  }

  public InputDetail putConfigurationItem(String key, String configurationItem) {
    if (this.configuration == null) {
      this.configuration = new HashMap<>();
    }
    this.configuration.put(key, configurationItem);
    return this;
  }

   /**
   * Configuration parameters for the required input.
   * @return configuration
  **/
  @ApiModelProperty(value = "Configuration parameters for the required input.")

  public Map<String, String> getConfiguration() {
    return configuration;
  }


  public void setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
  }


  public InputDetail details(List<SubInputDetail> details) {
    
    this.details = details;
    return this;
  }

  public InputDetail addDetailsItem(SubInputDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Input details can also be provided recursively.
   * @return details
  **/
  @ApiModelProperty(value = "Input details can also be provided recursively.")

  public List<SubInputDetail> getDetails() {
    return details;
  }


  public void setDetails(List<SubInputDetail> details) {
    this.details = details;
  }


  public InputDetail inputDetails(List<SubInputDetail> inputDetails) {
    
    this.inputDetails = inputDetails;
    return this;
  }

  public InputDetail addInputDetailsItem(SubInputDetail inputDetailsItem) {
    if (this.inputDetails == null) {
      this.inputDetails = new ArrayList<>();
    }
    this.inputDetails.add(inputDetailsItem);
    return this;
  }

   /**
   * Input details can also be provided recursively (deprecated).
   * @return inputDetails
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "Input details can also be provided recursively (deprecated).")

  public List<SubInputDetail> getInputDetails() {
    return inputDetails;
  }


  public void setInputDetails(List<SubInputDetail> inputDetails) {
    this.inputDetails = inputDetails;
  }


  public InputDetail itemSearchUrl(String itemSearchUrl) {
    
    this.itemSearchUrl = itemSearchUrl;
    return this;
  }

   /**
   * In case of a select, the URL from which to query the items.
   * @return itemSearchUrl
  **/
  @ApiModelProperty(value = "In case of a select, the URL from which to query the items.")

  public String getItemSearchUrl() {
    return itemSearchUrl;
  }


  public void setItemSearchUrl(String itemSearchUrl) {
    this.itemSearchUrl = itemSearchUrl;
  }


  public InputDetail items(List<Item> items) {
    
    this.items = items;
    return this;
  }

  public InputDetail addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * In case of a select, the items to choose from.
   * @return items
  **/
  @ApiModelProperty(value = "In case of a select, the items to choose from.")

  public List<Item> getItems() {
    return items;
  }


  public void setItems(List<Item> items) {
    this.items = items;
  }


  public InputDetail key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The value to provide in the result.
   * @return key
  **/
  @ApiModelProperty(value = "The value to provide in the result.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public InputDetail optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * True if this input value is optional.
   * @return optional
  **/
  @ApiModelProperty(value = "True if this input value is optional.")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public InputDetail type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the required input.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the required input.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public InputDetail value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value can be pre-filled, if available.
   * @return value
  **/
  @ApiModelProperty(value = "The value can be pre-filled, if available.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputDetail inputDetail = (InputDetail) o;
    return Objects.equals(this.configuration, inputDetail.configuration) &&
        Objects.equals(this.details, inputDetail.details) &&
        Objects.equals(this.inputDetails, inputDetail.inputDetails) &&
        Objects.equals(this.itemSearchUrl, inputDetail.itemSearchUrl) &&
        Objects.equals(this.items, inputDetail.items) &&
        Objects.equals(this.key, inputDetail.key) &&
        Objects.equals(this.optional, inputDetail.optional) &&
        Objects.equals(this.type, inputDetail.type) &&
        Objects.equals(this.value, inputDetail.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, details, inputDetails, itemSearchUrl, items, key, optional, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputDetail {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    inputDetails: ").append(toIndentedString(inputDetails)).append("\n");
    sb.append("    itemSearchUrl: ").append(toIndentedString(itemSearchUrl)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("configuration");
    openapiFields.add("details");
    openapiFields.add("inputDetails");
    openapiFields.add("itemSearchUrl");
    openapiFields.add("items");
    openapiFields.add("key");
    openapiFields.add("optional");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InputDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InputDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InputDetail is not found in the empty JSON string", InputDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InputDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InputDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
      if (jsonArraydetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("details").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
        }

        // validate the optional field `details` (array)
        for (int i = 0; i < jsonArraydetails.size(); i++) {
          SubInputDetail.validateJsonObject(jsonArraydetails.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayinputDetails = jsonObj.getAsJsonArray("inputDetails");
      if (jsonArrayinputDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inputDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `inputDetails` to be an array in the JSON string but got `%s`", jsonObj.get("inputDetails").toString()));
        }

        // validate the optional field `inputDetails` (array)
        for (int i = 0; i < jsonArrayinputDetails.size(); i++) {
          SubInputDetail.validateJsonObject(jsonArrayinputDetails.get(i).getAsJsonObject());
        };
      }
      // validate the optional field itemSearchUrl
      if (jsonObj.get("itemSearchUrl") != null && !jsonObj.get("itemSearchUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemSearchUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemSearchUrl").toString()));
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          Item.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
      // validate the optional field key
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field value
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InputDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InputDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InputDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InputDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<InputDetail>() {
           @Override
           public void write(JsonWriter out, InputDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InputDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InputDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InputDetail
  * @throws IOException if the JSON string is invalid with respect to InputDetail
  */
  public static InputDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InputDetail.class);
  }

 /**
  * Convert an instance of InputDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

