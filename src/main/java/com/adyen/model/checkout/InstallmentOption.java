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

import com.adyen.model.checkout.JSON;

/**
 * InstallmentOption
 */

public class InstallmentOption {
  public static final String SERIALIZED_NAME_MAX_VALUE = "maxValue";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private Integer maxValue;

  /**
   * Gets or Sets plans
   */
  @JsonAdapter(PlansEnum.Adapter.class)
  public enum PlansEnum {
    REGULAR("regular"),
    
    REVOLVING("revolving");

    private String value;

    PlansEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlansEnum fromValue(String value) {
      for (PlansEnum b : PlansEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlansEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlansEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlansEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlansEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLANS = "plans";
  @SerializedName(SERIALIZED_NAME_PLANS)
  private List<PlansEnum> plans = null;

  public static final String SERIALIZED_NAME_PRESELECTED_VALUE = "preselectedValue";
  @SerializedName(SERIALIZED_NAME_PRESELECTED_VALUE)
  private Integer preselectedValue;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values = null;

  public InstallmentOption() { 
  }

  public InstallmentOption maxValue(Integer maxValue) {
    
    this.maxValue = maxValue;
    return this;
  }

   /**
   * The maximum number of installments offered for this payment method.
   * @return maxValue
  **/
  @ApiModelProperty(value = "The maximum number of installments offered for this payment method.")

  public Integer getMaxValue() {
    return maxValue;
  }


  public void setMaxValue(Integer maxValue) {
    this.maxValue = maxValue;
  }


  public InstallmentOption plans(List<PlansEnum> plans) {
    
    this.plans = plans;
    return this;
  }

  public InstallmentOption addPlansItem(PlansEnum plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Defines the type of installment plan. If not set, defaults to **regular**.  Possible values: * **regular** * **revolving**
   * @return plans
  **/
  @ApiModelProperty(value = "Defines the type of installment plan. If not set, defaults to **regular**.  Possible values: * **regular** * **revolving**")

  public List<PlansEnum> getPlans() {
    return plans;
  }


  public void setPlans(List<PlansEnum> plans) {
    this.plans = plans;
  }


  public InstallmentOption preselectedValue(Integer preselectedValue) {
    
    this.preselectedValue = preselectedValue;
    return this;
  }

   /**
   * Preselected number of installments offered for this payment method.
   * @return preselectedValue
  **/
  @ApiModelProperty(value = "Preselected number of installments offered for this payment method.")

  public Integer getPreselectedValue() {
    return preselectedValue;
  }


  public void setPreselectedValue(Integer preselectedValue) {
    this.preselectedValue = preselectedValue;
  }


  public InstallmentOption values(List<Integer> values) {
    
    this.values = values;
    return this;
  }

  public InstallmentOption addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * An array of the number of installments that the shopper can choose from. For example, **[2,3,5]**. This cannot be specified simultaneously with &#x60;maxValue&#x60;.
   * @return values
  **/
  @ApiModelProperty(value = "An array of the number of installments that the shopper can choose from. For example, **[2,3,5]**. This cannot be specified simultaneously with `maxValue`.")

  public List<Integer> getValues() {
    return values;
  }


  public void setValues(List<Integer> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentOption installmentOption = (InstallmentOption) o;
    return Objects.equals(this.maxValue, installmentOption.maxValue) &&
        Objects.equals(this.plans, installmentOption.plans) &&
        Objects.equals(this.preselectedValue, installmentOption.preselectedValue) &&
        Objects.equals(this.values, installmentOption.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxValue, plans, preselectedValue, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentOption {\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    preselectedValue: ").append(toIndentedString(preselectedValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("maxValue");
    openapiFields.add("plans");
    openapiFields.add("preselectedValue");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentOption
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InstallmentOption.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentOption is not found in the empty JSON string", InstallmentOption.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentOption` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("plans") != null && !jsonObj.get("plans").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `plans` to be an array in the JSON string but got `%s`", jsonObj.get("plans").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstallmentOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentOption.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentOption>() {
           @Override
           public void write(JsonWriter out, InstallmentOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentOption read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentOption
  * @throws IOException if the JSON string is invalid with respect to InstallmentOption
  */
  public static InstallmentOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentOption.class);
  }

 /**
  * Convert an instance of InstallmentOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

