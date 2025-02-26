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
import java.util.Arrays;
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
 * The apportionment from overall fund level journal entry Line to the share class.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JournalEntryLineShareClassBreakdown {
  public static final String SERIALIZED_NAME_SHORT_CODE = "shortCode";
  @SerializedName(SERIALIZED_NAME_SHORT_CODE)
  private String shortCode;

  public static final String SERIALIZED_NAME_APPORTIONMENT_FACTOR = "apportionmentFactor";
  @SerializedName(SERIALIZED_NAME_APPORTIONMENT_FACTOR)
  private java.math.BigDecimal apportionmentFactor;

  public static final String SERIALIZED_NAME_LOCAL_VALUE = "localValue";
  @SerializedName(SERIALIZED_NAME_LOCAL_VALUE)
  private java.math.BigDecimal localValue;

  public static final String SERIALIZED_NAME_BASE_VALUE = "baseValue";
  @SerializedName(SERIALIZED_NAME_BASE_VALUE)
  private java.math.BigDecimal baseValue;

  public JournalEntryLineShareClassBreakdown() {
  }

  public JournalEntryLineShareClassBreakdown shortCode(String shortCode) {
    
    this.shortCode = shortCode;
    return this;
  }

   /**
   * The share class identifier.
   * @return shortCode
  **/
  @jakarta.annotation.Nullable
  public String getShortCode() {
    return shortCode;
  }


  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }


  public JournalEntryLineShareClassBreakdown apportionmentFactor(java.math.BigDecimal apportionmentFactor) {
    
    this.apportionmentFactor = apportionmentFactor;
    return this;
  }

   /**
   * The share class apportionment factor (capital ratio).
   * @return apportionmentFactor
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getApportionmentFactor() {
    return apportionmentFactor;
  }


  public void setApportionmentFactor(java.math.BigDecimal apportionmentFactor) {
    this.apportionmentFactor = apportionmentFactor;
  }


  public JournalEntryLineShareClassBreakdown localValue(java.math.BigDecimal localValue) {
    
    this.localValue = localValue;
    return this;
  }

   /**
   * This journal entry line&#39;s local value amount after apportionment is applied.
   * @return localValue
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getLocalValue() {
    return localValue;
  }


  public void setLocalValue(java.math.BigDecimal localValue) {
    this.localValue = localValue;
  }


  public JournalEntryLineShareClassBreakdown baseValue(java.math.BigDecimal baseValue) {
    
    this.baseValue = baseValue;
    return this;
  }

   /**
   * This journal entry line&#39;s base value amount after apportionment is applied
   * @return baseValue
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getBaseValue() {
    return baseValue;
  }


  public void setBaseValue(java.math.BigDecimal baseValue) {
    this.baseValue = baseValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalEntryLineShareClassBreakdown journalEntryLineShareClassBreakdown = (JournalEntryLineShareClassBreakdown) o;
    return Objects.equals(this.shortCode, journalEntryLineShareClassBreakdown.shortCode) &&
        (this.apportionmentFactor.compareTo(journalEntryLineShareClassBreakdown.getApportionmentFactor()) == 0) &&
        (this.localValue.compareTo(journalEntryLineShareClassBreakdown.getLocalValue()) == 0) &&
        (this.baseValue.compareTo(journalEntryLineShareClassBreakdown.getBaseValue()) == 0);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortCode, apportionmentFactor, localValue, baseValue);
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
    sb.append("class JournalEntryLineShareClassBreakdown {\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    apportionmentFactor: ").append(toIndentedString(apportionmentFactor)).append("\n");
    sb.append("    localValue: ").append(toIndentedString(localValue)).append("\n");
    sb.append("    baseValue: ").append(toIndentedString(baseValue)).append("\n");
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
    openapiFields.add("shortCode");
    openapiFields.add("apportionmentFactor");
    openapiFields.add("localValue");
    openapiFields.add("baseValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to JournalEntryLineShareClassBreakdown
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JournalEntryLineShareClassBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JournalEntryLineShareClassBreakdown is not found in the empty JSON string", JournalEntryLineShareClassBreakdown.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("shortCode") != null && !jsonObj.get("shortCode").isJsonNull()) && !jsonObj.get("shortCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JournalEntryLineShareClassBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JournalEntryLineShareClassBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JournalEntryLineShareClassBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JournalEntryLineShareClassBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<JournalEntryLineShareClassBreakdown>() {
           @Override
           public void write(JsonWriter out, JournalEntryLineShareClassBreakdown value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JournalEntryLineShareClassBreakdown read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JournalEntryLineShareClassBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JournalEntryLineShareClassBreakdown
  * @throws IOException if the JSON string is invalid with respect to JournalEntryLineShareClassBreakdown
  */
  public static JournalEntryLineShareClassBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JournalEntryLineShareClassBreakdown.class);
  }

 /**
  * Convert an instance of JournalEntryLineShareClassBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
