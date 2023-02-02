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
import com.adyen.model.management.JSONPath;
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
 * JSONObject
 */

public class JSONObject {
  public static final String SERIALIZED_NAME_PATHS = "paths";
  @SerializedName(SERIALIZED_NAME_PATHS)
  private List<JSONPath> paths = null;

  public static final String SERIALIZED_NAME_ROOT_PATH = "rootPath";
  @SerializedName(SERIALIZED_NAME_ROOT_PATH)
  private JSONPath rootPath;

  public JSONObject() { 
  }

  public JSONObject paths(List<JSONPath> paths) {
    
    this.paths = paths;
    return this;
  }

  public JSONObject addPathsItem(JSONPath pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * Get paths
   * @return paths
  **/
  @ApiModelProperty(value = "")

  public List<JSONPath> getPaths() {
    return paths;
  }


  public void setPaths(List<JSONPath> paths) {
    this.paths = paths;
  }


  public JSONObject rootPath(JSONPath rootPath) {
    
    this.rootPath = rootPath;
    return this;
  }

   /**
   * Get rootPath
   * @return rootPath
  **/
  @ApiModelProperty(value = "")

  public JSONPath getRootPath() {
    return rootPath;
  }


  public void setRootPath(JSONPath rootPath) {
    this.rootPath = rootPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONObject jsONObject = (JSONObject) o;
    return Objects.equals(this.paths, jsONObject.paths) &&
        Objects.equals(this.rootPath, jsONObject.rootPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths, rootPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONObject {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    rootPath: ").append(toIndentedString(rootPath)).append("\n");
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
    openapiFields.add("paths");
    openapiFields.add("rootPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JSONObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JSONObject.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JSONObject is not found in the empty JSON string", JSONObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JSONObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JSONObject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypaths = jsonObj.getAsJsonArray("paths");
      if (jsonArraypaths != null) {
        // ensure the json data is an array
        if (!jsonObj.get("paths").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `paths` to be an array in the JSON string but got `%s`", jsonObj.get("paths").toString()));
        }

        // validate the optional field `paths` (array)
        for (int i = 0; i < jsonArraypaths.size(); i++) {
          JSONPath.validateJsonObject(jsonArraypaths.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `rootPath`
      if (jsonObj.getAsJsonObject("rootPath") != null) {
        JSONPath.validateJsonObject(jsonObj.getAsJsonObject("rootPath"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JSONObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JSONObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JSONObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JSONObject.class));

       return (TypeAdapter<T>) new TypeAdapter<JSONObject>() {
           @Override
           public void write(JsonWriter out, JSONObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JSONObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JSONObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JSONObject
  * @throws IOException if the JSON string is invalid with respect to JSONObject
  */
  public static JSONObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JSONObject.class);
  }

 /**
  * Convert an instance of JSONObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

