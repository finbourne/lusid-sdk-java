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
import com.finbourne.lusid.model.UnitsRatio;
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
 * A payment to shareholders that consists of additional shares rather than cash.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockDividendEvent extends InstrumentEvent {
  public static final String SERIALIZED_NAME_ANNOUNCEMENT_DATE = "announcementDate";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_DATE)
  private OffsetDateTime announcementDate;

  public static final String SERIALIZED_NAME_EX_DATE = "exDate";
  @SerializedName(SERIALIZED_NAME_EX_DATE)
  private OffsetDateTime exDate;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "paymentDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private OffsetDateTime paymentDate;

  public static final String SERIALIZED_NAME_RECORD_DATE = "recordDate";
  @SerializedName(SERIALIZED_NAME_RECORD_DATE)
  private OffsetDateTime recordDate;

  public static final String SERIALIZED_NAME_UNITS_RATIO = "unitsRatio";
  @SerializedName(SERIALIZED_NAME_UNITS_RATIO)
  private UnitsRatio unitsRatio;

  public StockDividendEvent() {
    // this.instrumentEventType = this.getClass().getSimpleName();
  }

  public StockDividendEvent announcementDate(OffsetDateTime announcementDate) {
    
    this.announcementDate = announcementDate;
    return this;
  }

   /**
   * Date on which the dividend was announced / declared.
   * @return announcementDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAnnouncementDate() {
    return announcementDate;
  }


  public void setAnnouncementDate(OffsetDateTime announcementDate) {
    this.announcementDate = announcementDate;
  }


  public StockDividendEvent exDate(OffsetDateTime exDate) {
    
    this.exDate = exDate;
    return this;
  }

   /**
   * The first business day on which the dividend is not owed to the buying party.  Typically this is T-1 from the RecordDate.
   * @return exDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getExDate() {
    return exDate;
  }


  public void setExDate(OffsetDateTime exDate) {
    this.exDate = exDate;
  }


  public StockDividendEvent paymentDate(OffsetDateTime paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * The date the company pays out dividends to shareholders.
   * @return paymentDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }


  public StockDividendEvent recordDate(OffsetDateTime recordDate) {
    
    this.recordDate = recordDate;
    return this;
  }

   /**
   * Date you have to be the holder of record in order to participate in the tender.
   * @return recordDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getRecordDate() {
    return recordDate;
  }


  public void setRecordDate(OffsetDateTime recordDate) {
    this.recordDate = recordDate;
  }


  public StockDividendEvent unitsRatio(UnitsRatio unitsRatio) {
    
    this.unitsRatio = unitsRatio;
    return this;
  }

   /**
   * Get unitsRatio
   * @return unitsRatio
  **/
  @jakarta.annotation.Nonnull
  public UnitsRatio getUnitsRatio() {
    return unitsRatio;
  }


  public void setUnitsRatio(UnitsRatio unitsRatio) {
    this.unitsRatio = unitsRatio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockDividendEvent stockDividendEvent = (StockDividendEvent) o;
    return Objects.equals(this.announcementDate, stockDividendEvent.announcementDate) &&
        Objects.equals(this.exDate, stockDividendEvent.exDate) &&
        Objects.equals(this.paymentDate, stockDividendEvent.paymentDate) &&
        Objects.equals(this.recordDate, stockDividendEvent.recordDate) &&
        Objects.equals(this.unitsRatio, stockDividendEvent.unitsRatio) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(announcementDate, exDate, paymentDate, recordDate, unitsRatio, super.hashCode());
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
    sb.append("class StockDividendEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    announcementDate: ").append(toIndentedString(announcementDate)).append("\n");
    sb.append("    exDate: ").append(toIndentedString(exDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
    sb.append("    unitsRatio: ").append(toIndentedString(unitsRatio)).append("\n");
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
    openapiFields.add("announcementDate");
    openapiFields.add("exDate");
    openapiFields.add("paymentDate");
    openapiFields.add("recordDate");
    openapiFields.add("unitsRatio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("exDate");
    openapiRequiredFields.add("paymentDate");
    openapiRequiredFields.add("unitsRatio");
    openapiRequiredFields.add("instrumentEventType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StockDividendEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StockDividendEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StockDividendEvent is not found in the empty JSON string", StockDividendEvent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StockDividendEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StockDividendEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StockDividendEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StockDividendEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StockDividendEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<StockDividendEvent>() {
           @Override
           public void write(JsonWriter out, StockDividendEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StockDividendEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StockDividendEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StockDividendEvent
  * @throws IOException if the JSON string is invalid with respect to StockDividendEvent
  */
  public static StockDividendEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StockDividendEvent.class);
  }

 /**
  * Convert an instance of StockDividendEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}