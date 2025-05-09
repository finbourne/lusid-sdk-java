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
 * Definition of an MBS Coupon Event  This is an event that describes the occurence of a cashflow due to a mortgage-backed security coupon payment.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MbsCouponEvent extends InstrumentEvent {
  public static final String SERIALIZED_NAME_EX_DATE = "exDate";
  @SerializedName(SERIALIZED_NAME_EX_DATE)
  private OffsetDateTime exDate;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "paymentDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private OffsetDateTime paymentDate;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COUPON_PER_UNIT = "couponPerUnit";
  @SerializedName(SERIALIZED_NAME_COUPON_PER_UNIT)
  private java.math.BigDecimal couponPerUnit;

  public MbsCouponEvent() {
    // this.instrumentEventType = this.getClass().getSimpleName();
  }

  public MbsCouponEvent exDate(OffsetDateTime exDate) {
    
    this.exDate = exDate;
    return this;
  }

   /**
   * The ex date (entitlement date) of the coupon
   * @return exDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getExDate() {
    return exDate;
  }


  public void setExDate(OffsetDateTime exDate) {
    this.exDate = exDate;
  }


  public MbsCouponEvent paymentDate(OffsetDateTime paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * The payment date of the coupon
   * @return paymentDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }


  public MbsCouponEvent currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency in which the coupon is paid
   * @return currency
  **/
  @jakarta.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public MbsCouponEvent couponPerUnit(java.math.BigDecimal couponPerUnit) {
    
    this.couponPerUnit = couponPerUnit;
    return this;
  }

   /**
   * The coupon amount received for each unit of the instrument held on the ex date
   * @return couponPerUnit
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getCouponPerUnit() {
    return couponPerUnit;
  }


  public void setCouponPerUnit(java.math.BigDecimal couponPerUnit) {
    this.couponPerUnit = couponPerUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MbsCouponEvent mbsCouponEvent = (MbsCouponEvent) o;
    return Objects.equals(this.exDate, mbsCouponEvent.exDate) &&
        Objects.equals(this.paymentDate, mbsCouponEvent.paymentDate) &&
        Objects.equals(this.currency, mbsCouponEvent.currency) &&
        (this.couponPerUnit.compareTo(mbsCouponEvent.getCouponPerUnit()) == 0) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(exDate, paymentDate, currency, couponPerUnit, super.hashCode());
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
    sb.append("class MbsCouponEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exDate: ").append(toIndentedString(exDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    couponPerUnit: ").append(toIndentedString(couponPerUnit)).append("\n");
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
    openapiFields.add("exDate");
    openapiFields.add("paymentDate");
    openapiFields.add("currency");
    openapiFields.add("couponPerUnit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("instrumentEventType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MbsCouponEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MbsCouponEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MbsCouponEvent is not found in the empty JSON string", MbsCouponEvent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MbsCouponEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MbsCouponEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MbsCouponEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MbsCouponEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MbsCouponEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<MbsCouponEvent>() {
           @Override
           public void write(JsonWriter out, MbsCouponEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MbsCouponEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MbsCouponEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MbsCouponEvent
  * @throws IOException if the JSON string is invalid with respect to MbsCouponEvent
  */
  public static MbsCouponEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MbsCouponEvent.class);
  }

 /**
  * Convert an instance of MbsCouponEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
