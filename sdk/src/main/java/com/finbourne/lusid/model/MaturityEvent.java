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
import com.finbourne.lusid.model.InstrumentEvent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * Definition of a Maturity Event  This is an event that describes the maturity of the instrument.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MaturityEvent extends InstrumentEvent {
  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public MaturityEvent() {
    // this.instrumentEventType = this.getClass().getSimpleName();
  }

  public MaturityEvent maturityDate(OffsetDateTime maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Maturity date of the instrument
   * @return maturityDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaturityEvent maturityEvent = (MaturityEvent) o;
    return Objects.equals(this.maturityDate, maturityEvent.maturityDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maturityDate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaturityEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
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
    openapiFields.add("instrumentEventType");
    openapiFields.add("maturityDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("maturityDate");
    openapiRequiredFields.add("instrumentEventType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MaturityEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MaturityEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MaturityEvent is not found in the empty JSON string", MaturityEvent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MaturityEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaturityEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaturityEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaturityEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaturityEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<MaturityEvent>() {
           @Override
           public void write(JsonWriter out, MaturityEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MaturityEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MaturityEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MaturityEvent
  * @throws IOException if the JSON string is invalid with respect to MaturityEvent
  */
  public static MaturityEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaturityEvent.class);
  }

 /**
  * Convert an instance of MaturityEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}