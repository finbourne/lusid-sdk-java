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
 * Definition of a Bond Principal Event  This is an event that describes the occurence of a cashflow due to the principal payment.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BondPrincipalEvent extends InstrumentEvent {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EX_DATE = "exDate";
  @SerializedName(SERIALIZED_NAME_EX_DATE)
  private OffsetDateTime exDate;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "paymentDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private OffsetDateTime paymentDate;

  public static final String SERIALIZED_NAME_PRINCIPAL_PER_UNIT = "principalPerUnit";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_PER_UNIT)
  private java.math.BigDecimal principalPerUnit;

  public BondPrincipalEvent() {
    // this.instrumentEventType = this.getClass().getSimpleName();
  }

  public BondPrincipalEvent currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the principal payment
   * @return currency
  **/
  @jakarta.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public BondPrincipalEvent exDate(OffsetDateTime exDate) {
    
    this.exDate = exDate;
    return this;
  }

   /**
   * Ex-Dividend date of the principal payment
   * @return exDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getExDate() {
    return exDate;
  }


  public void setExDate(OffsetDateTime exDate) {
    this.exDate = exDate;
  }


  public BondPrincipalEvent paymentDate(OffsetDateTime paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Payment date of the principal payment
   * @return paymentDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }


  public BondPrincipalEvent principalPerUnit(java.math.BigDecimal principalPerUnit) {
    
    this.principalPerUnit = principalPerUnit;
    return this;
  }

   /**
   * Principal per unit
   * @return principalPerUnit
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getPrincipalPerUnit() {
    return principalPerUnit;
  }


  public void setPrincipalPerUnit(java.math.BigDecimal principalPerUnit) {
    this.principalPerUnit = principalPerUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BondPrincipalEvent bondPrincipalEvent = (BondPrincipalEvent) o;
    return Objects.equals(this.currency, bondPrincipalEvent.currency) &&
        Objects.equals(this.exDate, bondPrincipalEvent.exDate) &&
        Objects.equals(this.paymentDate, bondPrincipalEvent.paymentDate) &&
        (this.principalPerUnit.compareTo(bondPrincipalEvent.getPrincipalPerUnit()) == 0) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, exDate, paymentDate, principalPerUnit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BondPrincipalEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exDate: ").append(toIndentedString(exDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    principalPerUnit: ").append(toIndentedString(principalPerUnit)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("exDate");
    openapiFields.add("paymentDate");
    openapiFields.add("principalPerUnit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("exDate");
    openapiRequiredFields.add("paymentDate");
    openapiRequiredFields.add("principalPerUnit");
    openapiRequiredFields.add("instrumentEventType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BondPrincipalEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BondPrincipalEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BondPrincipalEvent is not found in the empty JSON string", BondPrincipalEvent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BondPrincipalEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BondPrincipalEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BondPrincipalEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BondPrincipalEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BondPrincipalEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<BondPrincipalEvent>() {
           @Override
           public void write(JsonWriter out, BondPrincipalEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BondPrincipalEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BondPrincipalEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BondPrincipalEvent
  * @throws IOException if the JSON string is invalid with respect to BondPrincipalEvent
  */
  public static BondPrincipalEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BondPrincipalEvent.class);
  }

 /**
  * Convert an instance of BondPrincipalEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}