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
import com.finbourne.lusid.model.RoundingConfiguration;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * A &#39;transition&#39; within a corporate action, representing an output transition.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OutputTransition {
  public static final String SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS = "instrumentIdentifiers";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS)
  private Map<String, String> instrumentIdentifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_UNITS_FACTOR = "unitsFactor";
  @SerializedName(SERIALIZED_NAME_UNITS_FACTOR)
  private java.math.BigDecimal unitsFactor;

  public static final String SERIALIZED_NAME_COST_FACTOR = "costFactor";
  @SerializedName(SERIALIZED_NAME_COST_FACTOR)
  private java.math.BigDecimal costFactor;

  public static final String SERIALIZED_NAME_LUSID_INSTRUMENT_ID = "lusidInstrumentId";
  @SerializedName(SERIALIZED_NAME_LUSID_INSTRUMENT_ID)
  private String lusidInstrumentId;

  public static final String SERIALIZED_NAME_INSTRUMENT_SCOPE = "instrumentScope";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_SCOPE)
  private String instrumentScope;

  public static final String SERIALIZED_NAME_ROUNDING = "rounding";
  @SerializedName(SERIALIZED_NAME_ROUNDING)
  private RoundingConfiguration rounding;

  public OutputTransition() {
  }

  
  public OutputTransition(
     String lusidInstrumentId, 
     String instrumentScope
  ) {
    this();
    this.lusidInstrumentId = lusidInstrumentId;
    this.instrumentScope = instrumentScope;
  }

  public OutputTransition instrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    
    this.instrumentIdentifiers = instrumentIdentifiers;
    return this;
  }

  public OutputTransition putInstrumentIdentifiersItem(String key, String instrumentIdentifiersItem) {
    if (this.instrumentIdentifiers == null) {
      this.instrumentIdentifiers = new HashMap<>();
    }
    this.instrumentIdentifiers.put(key, instrumentIdentifiersItem);
    return this;
  }

   /**
   * Unique instrument identifiers
   * @return instrumentIdentifiers
  **/
  @jakarta.annotation.Nonnull
  public Map<String, String> getInstrumentIdentifiers() {
    return instrumentIdentifiers;
  }


  public void setInstrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
  }


  public OutputTransition unitsFactor(java.math.BigDecimal unitsFactor) {
    
    this.unitsFactor = unitsFactor;
    return this;
  }

   /**
   * The factor to scale units by
   * @return unitsFactor
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getUnitsFactor() {
    return unitsFactor;
  }


  public void setUnitsFactor(java.math.BigDecimal unitsFactor) {
    this.unitsFactor = unitsFactor;
  }


  public OutputTransition costFactor(java.math.BigDecimal costFactor) {
    
    this.costFactor = costFactor;
    return this;
  }

   /**
   * The factor to scale cost by
   * @return costFactor
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getCostFactor() {
    return costFactor;
  }


  public void setCostFactor(java.math.BigDecimal costFactor) {
    this.costFactor = costFactor;
  }


   /**
   * LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers
   * @return lusidInstrumentId
  **/
  @jakarta.annotation.Nullable
  public String getLusidInstrumentId() {
    return lusidInstrumentId;
  }




   /**
   * The scope in which the instrument lies.
   * @return instrumentScope
  **/
  @jakarta.annotation.Nullable
  public String getInstrumentScope() {
    return instrumentScope;
  }




  public OutputTransition rounding(RoundingConfiguration rounding) {
    
    this.rounding = rounding;
    return this;
  }

   /**
   * Get rounding
   * @return rounding
  **/
  @jakarta.annotation.Nullable
  public RoundingConfiguration getRounding() {
    return rounding;
  }


  public void setRounding(RoundingConfiguration rounding) {
    this.rounding = rounding;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputTransition outputTransition = (OutputTransition) o;
    return Objects.equals(this.instrumentIdentifiers, outputTransition.instrumentIdentifiers) &&
        (this.unitsFactor.compareTo(outputTransition.getUnitsFactor()) == 0) &&
        (this.costFactor.compareTo(outputTransition.getCostFactor()) == 0) &&
        Objects.equals(this.lusidInstrumentId, outputTransition.lusidInstrumentId) &&
        Objects.equals(this.instrumentScope, outputTransition.instrumentScope) &&
        Objects.equals(this.rounding, outputTransition.rounding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentIdentifiers, unitsFactor, costFactor, lusidInstrumentId, instrumentScope, rounding);
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
    sb.append("class OutputTransition {\n");
    sb.append("    instrumentIdentifiers: ").append(toIndentedString(instrumentIdentifiers)).append("\n");
    sb.append("    unitsFactor: ").append(toIndentedString(unitsFactor)).append("\n");
    sb.append("    costFactor: ").append(toIndentedString(costFactor)).append("\n");
    sb.append("    lusidInstrumentId: ").append(toIndentedString(lusidInstrumentId)).append("\n");
    sb.append("    instrumentScope: ").append(toIndentedString(instrumentScope)).append("\n");
    sb.append("    rounding: ").append(toIndentedString(rounding)).append("\n");
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
    openapiFields.add("instrumentIdentifiers");
    openapiFields.add("unitsFactor");
    openapiFields.add("costFactor");
    openapiFields.add("lusidInstrumentId");
    openapiFields.add("instrumentScope");
    openapiFields.add("rounding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instrumentIdentifiers");
    openapiRequiredFields.add("unitsFactor");
    openapiRequiredFields.add("costFactor");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OutputTransition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OutputTransition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutputTransition is not found in the empty JSON string", OutputTransition.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OutputTransition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lusidInstrumentId") != null && !jsonObj.get("lusidInstrumentId").isJsonNull()) && !jsonObj.get("lusidInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lusidInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lusidInstrumentId").toString()));
      }
      if ((jsonObj.get("instrumentScope") != null && !jsonObj.get("instrumentScope").isJsonNull()) && !jsonObj.get("instrumentScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrumentScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrumentScope").toString()));
      }
      // validate the optional field `rounding`
      if (jsonObj.get("rounding") != null && !jsonObj.get("rounding").isJsonNull()) {
        RoundingConfiguration.validateJsonElement(jsonObj.get("rounding"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutputTransition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutputTransition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutputTransition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutputTransition.class));

       return (TypeAdapter<T>) new TypeAdapter<OutputTransition>() {
           @Override
           public void write(JsonWriter out, OutputTransition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutputTransition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutputTransition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutputTransition
  * @throws IOException if the JSON string is invalid with respect to OutputTransition
  */
  public static OutputTransition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutputTransition.class);
  }

 /**
  * Convert an instance of OutputTransition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
