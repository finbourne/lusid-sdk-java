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
import com.finbourne.lusid.model.CashElection;
import com.finbourne.lusid.model.InstrumentEvent;
import com.finbourne.lusid.model.SecurityElection;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * DVOP
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DividendOptionEvent extends InstrumentEvent {
  public static final String SERIALIZED_NAME_ANNOUNCEMENT_DATE = "announcementDate";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_DATE)
  private OffsetDateTime announcementDate;

  public static final String SERIALIZED_NAME_CASH_ELECTIONS = "cashElections";
  @SerializedName(SERIALIZED_NAME_CASH_ELECTIONS)
  private List<CashElection> cashElections = new ArrayList<>();

  public static final String SERIALIZED_NAME_EX_DATE = "exDate";
  @SerializedName(SERIALIZED_NAME_EX_DATE)
  private OffsetDateTime exDate;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "paymentDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private OffsetDateTime paymentDate;

  public static final String SERIALIZED_NAME_RECORD_DATE = "recordDate";
  @SerializedName(SERIALIZED_NAME_RECORD_DATE)
  private OffsetDateTime recordDate;

  public static final String SERIALIZED_NAME_SECURITY_ELECTIONS = "securityElections";
  @SerializedName(SERIALIZED_NAME_SECURITY_ELECTIONS)
  private List<SecurityElection> securityElections = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECURITY_SETTLEMENT_DATE = "securitySettlementDate";
  @SerializedName(SERIALIZED_NAME_SECURITY_SETTLEMENT_DATE)
  private OffsetDateTime securitySettlementDate;

  public DividendOptionEvent() {
    // this.instrumentEventType = this.getClass().getSimpleName();
  }

  public DividendOptionEvent announcementDate(OffsetDateTime announcementDate) {
    
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


  public DividendOptionEvent cashElections(List<CashElection> cashElections) {
    
    this.cashElections = cashElections;
    return this;
  }

  public DividendOptionEvent addCashElectionsItem(CashElection cashElectionsItem) {
    if (this.cashElections == null) {
      this.cashElections = new ArrayList<>();
    }
    this.cashElections.add(cashElectionsItem);
    return this;
  }

   /**
   * CashElection for this DividendReinvestmentEvent
   * @return cashElections
  **/
  @jakarta.annotation.Nonnull
  public List<CashElection> getCashElections() {
    return cashElections;
  }


  public void setCashElections(List<CashElection> cashElections) {
    this.cashElections = cashElections;
  }


  public DividendOptionEvent exDate(OffsetDateTime exDate) {
    
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


  public DividendOptionEvent paymentDate(OffsetDateTime paymentDate) {
    
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


  public DividendOptionEvent recordDate(OffsetDateTime recordDate) {
    
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


  public DividendOptionEvent securityElections(List<SecurityElection> securityElections) {
    
    this.securityElections = securityElections;
    return this;
  }

  public DividendOptionEvent addSecurityElectionsItem(SecurityElection securityElectionsItem) {
    if (this.securityElections == null) {
      this.securityElections = new ArrayList<>();
    }
    this.securityElections.add(securityElectionsItem);
    return this;
  }

   /**
   * SecurityElection for this DividendReinvestmentEvent
   * @return securityElections
  **/
  @jakarta.annotation.Nonnull
  public List<SecurityElection> getSecurityElections() {
    return securityElections;
  }


  public void setSecurityElections(List<SecurityElection> securityElections) {
    this.securityElections = securityElections;
  }


  public DividendOptionEvent securitySettlementDate(OffsetDateTime securitySettlementDate) {
    
    this.securitySettlementDate = securitySettlementDate;
    return this;
  }

   /**
   * Date on which the dividend was the security settles. Equal to the PaymentDate if not provided.
   * @return securitySettlementDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getSecuritySettlementDate() {
    return securitySettlementDate;
  }


  public void setSecuritySettlementDate(OffsetDateTime securitySettlementDate) {
    this.securitySettlementDate = securitySettlementDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DividendOptionEvent dividendOptionEvent = (DividendOptionEvent) o;
    return Objects.equals(this.announcementDate, dividendOptionEvent.announcementDate) &&
        Objects.equals(this.cashElections, dividendOptionEvent.cashElections) &&
        Objects.equals(this.exDate, dividendOptionEvent.exDate) &&
        Objects.equals(this.paymentDate, dividendOptionEvent.paymentDate) &&
        Objects.equals(this.recordDate, dividendOptionEvent.recordDate) &&
        Objects.equals(this.securityElections, dividendOptionEvent.securityElections) &&
        Objects.equals(this.securitySettlementDate, dividendOptionEvent.securitySettlementDate) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(announcementDate, cashElections, exDate, paymentDate, recordDate, securityElections, securitySettlementDate, super.hashCode());
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
    sb.append("class DividendOptionEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    announcementDate: ").append(toIndentedString(announcementDate)).append("\n");
    sb.append("    cashElections: ").append(toIndentedString(cashElections)).append("\n");
    sb.append("    exDate: ").append(toIndentedString(exDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
    sb.append("    securityElections: ").append(toIndentedString(securityElections)).append("\n");
    sb.append("    securitySettlementDate: ").append(toIndentedString(securitySettlementDate)).append("\n");
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
    openapiFields.add("cashElections");
    openapiFields.add("exDate");
    openapiFields.add("paymentDate");
    openapiFields.add("recordDate");
    openapiFields.add("securityElections");
    openapiFields.add("securitySettlementDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cashElections");
    openapiRequiredFields.add("exDate");
    openapiRequiredFields.add("paymentDate");
    openapiRequiredFields.add("securityElections");
    openapiRequiredFields.add("instrumentEventType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DividendOptionEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DividendOptionEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DividendOptionEvent is not found in the empty JSON string", DividendOptionEvent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DividendOptionEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DividendOptionEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DividendOptionEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DividendOptionEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DividendOptionEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<DividendOptionEvent>() {
           @Override
           public void write(JsonWriter out, DividendOptionEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DividendOptionEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DividendOptionEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DividendOptionEvent
  * @throws IOException if the JSON string is invalid with respect to DividendOptionEvent
  */
  public static DividendOptionEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DividendOptionEvent.class);
  }

 /**
  * Convert an instance of DividendOptionEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}