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
 * SettlementSchedule
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SettlementSchedule {
  public static final String SERIALIZED_NAME_TRADE_ID = "tradeId";
  @SerializedName(SERIALIZED_NAME_TRADE_ID)
  private String tradeId;

  public static final String SERIALIZED_NAME_SETTLEMENT_DATE = "settlementDate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DATE)
  private OffsetDateTime settlementDate;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private java.math.BigDecimal units;

  public SettlementSchedule() {
  }

  public SettlementSchedule tradeId(String tradeId) {
    
    this.tradeId = tradeId;
    return this;
  }

   /**
   * Get tradeId
   * @return tradeId
  **/
  @jakarta.annotation.Nullable
  public String getTradeId() {
    return tradeId;
  }


  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }


  public SettlementSchedule settlementDate(OffsetDateTime settlementDate) {
    
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Get settlementDate
   * @return settlementDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }


  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }


  public SettlementSchedule units(java.math.BigDecimal units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getUnits() {
    return units;
  }


  public void setUnits(java.math.BigDecimal units) {
    this.units = units;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementSchedule settlementSchedule = (SettlementSchedule) o;
    return Objects.equals(this.tradeId, settlementSchedule.tradeId) &&
        Objects.equals(this.settlementDate, settlementSchedule.settlementDate) &&
        (this.units.compareTo(settlementSchedule.getUnits()) == 0);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeId, settlementDate, units);
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
    sb.append("class SettlementSchedule {\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
    openapiFields.add("tradeId");
    openapiFields.add("settlementDate");
    openapiFields.add("units");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementSchedule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SettlementSchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettlementSchedule is not found in the empty JSON string", SettlementSchedule.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tradeId") != null && !jsonObj.get("tradeId").isJsonNull()) && !jsonObj.get("tradeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tradeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tradeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementSchedule>() {
           @Override
           public void write(JsonWriter out, SettlementSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementSchedule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementSchedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementSchedule
  * @throws IOException if the JSON string is invalid with respect to SettlementSchedule
  */
  public static SettlementSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementSchedule.class);
  }

 /**
  * Convert an instance of SettlementSchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}