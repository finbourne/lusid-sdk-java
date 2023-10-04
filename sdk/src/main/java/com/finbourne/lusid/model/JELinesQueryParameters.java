/*
 * LUSID API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.lusid.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.lusid.JSON;

/**
 * JELinesQueryParameters
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JELinesQueryParameters {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_PROPERTY_KEYS = "propertyKeys";
  @SerializedName(SERIALIZED_NAME_PROPERTY_KEYS)
  private List<String> propertyKeys;

  public JELinesQueryParameters() {
  }

  public JELinesQueryParameters startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the JELines.
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public JELinesQueryParameters endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the JELInes
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public JELinesQueryParameters filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Expression to filter the result set.
   * @return filter
  **/
  @jakarta.annotation.Nullable
  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public JELinesQueryParameters propertyKeys(List<String> propertyKeys) {
    
    this.propertyKeys = propertyKeys;
    return this;
  }

  public JELinesQueryParameters addPropertyKeysItem(String propertyKeysItem) {
    if (this.propertyKeys == null) {
      this.propertyKeys = new ArrayList<>();
    }
    this.propertyKeys.add(propertyKeysItem);
    return this;
  }

   /**
   * A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, &#39;Portfolio&#39;, &#39;Account&#39;, &#39;LegalEntity&#39; or &#39;CustodianAccount&#39; domain to decorate onto the JELine.
   * @return propertyKeys
  **/
  @jakarta.annotation.Nullable
  public List<String> getPropertyKeys() {
    return propertyKeys;
  }


  public void setPropertyKeys(List<String> propertyKeys) {
    this.propertyKeys = propertyKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JELinesQueryParameters jeLinesQueryParameters = (JELinesQueryParameters) o;
    return Objects.equals(this.startDate, jeLinesQueryParameters.startDate) &&
        Objects.equals(this.endDate, jeLinesQueryParameters.endDate) &&
        Objects.equals(this.filter, jeLinesQueryParameters.filter) &&
        Objects.equals(this.propertyKeys, jeLinesQueryParameters.propertyKeys);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, filter, propertyKeys);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JELinesQueryParameters {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    propertyKeys: ").append(toIndentedString(propertyKeys)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("filter");
    openapiFields.add("propertyKeys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JELinesQueryParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JELinesQueryParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JELinesQueryParameters is not found in the empty JSON string", JELinesQueryParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JELinesQueryParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JELinesQueryParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("propertyKeys") != null && !jsonObj.get("propertyKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyKeys` to be an array in the JSON string but got `%s`", jsonObj.get("propertyKeys").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JELinesQueryParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JELinesQueryParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JELinesQueryParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JELinesQueryParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<JELinesQueryParameters>() {
           @Override
           public void write(JsonWriter out, JELinesQueryParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JELinesQueryParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JELinesQueryParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JELinesQueryParameters
  * @throws IOException if the JSON string is invalid with respect to JELinesQueryParameters
  */
  public static JELinesQueryParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JELinesQueryParameters.class);
  }

 /**
  * Convert an instance of JELinesQueryParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}