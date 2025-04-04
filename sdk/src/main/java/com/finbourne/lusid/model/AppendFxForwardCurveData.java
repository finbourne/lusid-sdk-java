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
import com.finbourne.lusid.model.AppendMarketData;
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
 * Used to append a new point to an FX curve defined using &#x60;FxForwardCurveData&#x60;.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppendFxForwardCurveData extends AppendMarketData {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private java.math.BigDecimal rate;

  public AppendFxForwardCurveData() {
    // this.marketDataType = this.getClass().getSimpleName();
  }

  public AppendFxForwardCurveData date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date for which the forward rate applies.
   * @return date
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public AppendFxForwardCurveData rate(java.math.BigDecimal rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Rate provided for the fx forward (price in FgnCcy per unit of DomCcy).
   * @return rate
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getRate() {
    return rate;
  }


  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendFxForwardCurveData appendFxForwardCurveData = (AppendFxForwardCurveData) o;
    return Objects.equals(this.date, appendFxForwardCurveData.date) &&
        (this.rate.compareTo(appendFxForwardCurveData.getRate()) == 0) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, rate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendFxForwardCurveData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
    openapiFields.add("marketDataType");
    openapiFields.add("date");
    openapiFields.add("rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("rate");
    openapiRequiredFields.add("marketDataType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendFxForwardCurveData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendFxForwardCurveData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendFxForwardCurveData is not found in the empty JSON string", AppendFxForwardCurveData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppendFxForwardCurveData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppendFxForwardCurveData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppendFxForwardCurveData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppendFxForwardCurveData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppendFxForwardCurveData.class));

       return (TypeAdapter<T>) new TypeAdapter<AppendFxForwardCurveData>() {
           @Override
           public void write(JsonWriter out, AppendFxForwardCurveData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppendFxForwardCurveData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppendFxForwardCurveData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendFxForwardCurveData
  * @throws IOException if the JSON string is invalid with respect to AppendFxForwardCurveData
  */
  public static AppendFxForwardCurveData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendFxForwardCurveData.class);
  }

 /**
  * Convert an instance of AppendFxForwardCurveData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
