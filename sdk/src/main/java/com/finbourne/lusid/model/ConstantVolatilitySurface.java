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
import com.finbourne.lusid.model.ComplexMarketData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Market Data required to build a volatility surface for pricing.  Single constant volatility point.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConstantVolatilitySurface extends ComplexMarketData {
  public static final String SERIALIZED_NAME_BASE_DATE = "baseDate";
  @SerializedName(SERIALIZED_NAME_BASE_DATE)
  private OffsetDateTime baseDate;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "assetType";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private String assetType;

  public static final String SERIALIZED_NAME_LINEAGE = "lineage";
  @SerializedName(SERIALIZED_NAME_LINEAGE)
  private String lineage;

  public static final String SERIALIZED_NAME_VOLATILITY = "volatility";
  @SerializedName(SERIALIZED_NAME_VOLATILITY)
  private java.math.BigDecimal volatility;

  public ConstantVolatilitySurface() {
    // this.marketDataType = this.getClass().getSimpleName();
  }

  public ConstantVolatilitySurface baseDate(OffsetDateTime baseDate) {
    
    this.baseDate = baseDate;
    return this;
  }

   /**
   * Base date of the engine - this is the reference date for resolution of tenors.
   * @return baseDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getBaseDate() {
    return baseDate;
  }


  public void setBaseDate(OffsetDateTime baseDate) {
    this.baseDate = baseDate;
  }


  public ConstantVolatilitySurface assetType(String assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * What is the asset that the engine is for.  Supported string (enumeration) values are: [Cash, Commodity, Credit, Equity, Fx, Rates, FxVol, IrVol, EquityVol, HolidayCalendar, IndexConvention, FlowConvention, CdsFlowConvention, CorporateActions, FxForwards, Quote, Inflation, EquityCurve, All, VendorOpaque].
   * @return assetType
  **/
  @jakarta.annotation.Nonnull
  public String getAssetType() {
    return assetType;
  }


  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }


  public ConstantVolatilitySurface lineage(String lineage) {
    
    this.lineage = lineage;
    return this;
  }

   /**
   * Get lineage
   * @return lineage
  **/
  @jakarta.annotation.Nullable
  public String getLineage() {
    return lineage;
  }


  public void setLineage(String lineage) {
    this.lineage = lineage;
  }


  public ConstantVolatilitySurface volatility(java.math.BigDecimal volatility) {
    
    this.volatility = volatility;
    return this;
  }

   /**
   * Volatility value.
   * @return volatility
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getVolatility() {
    return volatility;
  }


  public void setVolatility(java.math.BigDecimal volatility) {
    this.volatility = volatility;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstantVolatilitySurface constantVolatilitySurface = (ConstantVolatilitySurface) o;
    return Objects.equals(this.baseDate, constantVolatilitySurface.baseDate) &&
        Objects.equals(this.assetType, constantVolatilitySurface.assetType) &&
        Objects.equals(this.lineage, constantVolatilitySurface.lineage) &&
        (this.volatility.compareTo(constantVolatilitySurface.getVolatility()) == 0) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDate, assetType, lineage, volatility, super.hashCode());
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
    sb.append("class ConstantVolatilitySurface {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    baseDate: ").append(toIndentedString(baseDate)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    lineage: ").append(toIndentedString(lineage)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
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
    openapiFields.add("baseDate");
    openapiFields.add("assetType");
    openapiFields.add("lineage");
    openapiFields.add("volatility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("baseDate");
    openapiRequiredFields.add("assetType");
    openapiRequiredFields.add("volatility");
    openapiRequiredFields.add("marketDataType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConstantVolatilitySurface
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConstantVolatilitySurface.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConstantVolatilitySurface is not found in the empty JSON string", ConstantVolatilitySurface.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConstantVolatilitySurface.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConstantVolatilitySurface.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConstantVolatilitySurface' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConstantVolatilitySurface> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConstantVolatilitySurface.class));

       return (TypeAdapter<T>) new TypeAdapter<ConstantVolatilitySurface>() {
           @Override
           public void write(JsonWriter out, ConstantVolatilitySurface value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConstantVolatilitySurface read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConstantVolatilitySurface given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConstantVolatilitySurface
  * @throws IOException if the JSON string is invalid with respect to ConstantVolatilitySurface
  */
  public static ConstantVolatilitySurface fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConstantVolatilitySurface.class);
  }

 /**
  * Convert an instance of ConstantVolatilitySurface to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
