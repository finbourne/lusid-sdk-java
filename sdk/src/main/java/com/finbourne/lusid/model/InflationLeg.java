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
import com.finbourne.lusid.model.FlowConventions;
import com.finbourne.lusid.model.InflationIndexConventions;
import com.finbourne.lusid.model.LusidInstrument;
import com.finbourne.lusid.model.TimeZoneConventions;
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
 * LUSID representation of an Inflation Leg.  This leg instrument is part of the InflationSwap instrument, but can also be used as a standalone instrument.  The implementation supports the following inflation leg types:  * Zero Coupon inflation leg (CPI Leg), with a single payment at maturity.  * Year on Year inflation leg  * LPI Swap Leg (capped and floored YoY)
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InflationLeg extends LusidInstrument {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_FLOW_CONVENTIONS = "flowConventions";
  @SerializedName(SERIALIZED_NAME_FLOW_CONVENTIONS)
  private FlowConventions flowConventions;

  public static final String SERIALIZED_NAME_BASE_C_P_I = "baseCPI";
  @SerializedName(SERIALIZED_NAME_BASE_C_P_I)
  private java.math.BigDecimal baseCPI;

  public static final String SERIALIZED_NAME_CALCULATION_TYPE = "calculationType";
  @SerializedName(SERIALIZED_NAME_CALCULATION_TYPE)
  private String calculationType;

  public static final String SERIALIZED_NAME_CAP_RATE = "capRate";
  @SerializedName(SERIALIZED_NAME_CAP_RATE)
  private java.math.BigDecimal capRate;

  public static final String SERIALIZED_NAME_FLOOR_RATE = "floorRate";
  @SerializedName(SERIALIZED_NAME_FLOOR_RATE)
  private java.math.BigDecimal floorRate;

  public static final String SERIALIZED_NAME_INFLATION_INDEX_CONVENTIONS = "inflationIndexConventions";
  @SerializedName(SERIALIZED_NAME_INFLATION_INDEX_CONVENTIONS)
  private InflationIndexConventions inflationIndexConventions;

  public static final String SERIALIZED_NAME_NOTIONAL = "notional";
  @SerializedName(SERIALIZED_NAME_NOTIONAL)
  private java.math.BigDecimal notional;

  public static final String SERIALIZED_NAME_PAY_RECEIVE = "payReceive";
  @SerializedName(SERIALIZED_NAME_PAY_RECEIVE)
  private String payReceive;

  public static final String SERIALIZED_NAME_TIME_ZONE_CONVENTIONS = "timeZoneConventions";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_CONVENTIONS)
  private TimeZoneConventions timeZoneConventions;

  public InflationLeg() {
    // this.instrumentType = this.getClass().getSimpleName();
  }

  public InflationLeg startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the instrument. This is normally synonymous with the trade-date.
   * @return startDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public InflationLeg maturityDate(OffsetDateTime maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it.
   * @return maturityDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }


  public InflationLeg flowConventions(FlowConventions flowConventions) {
    
    this.flowConventions = flowConventions;
    return this;
  }

   /**
   * Get flowConventions
   * @return flowConventions
  **/
  @jakarta.annotation.Nonnull
  public FlowConventions getFlowConventions() {
    return flowConventions;
  }


  public void setFlowConventions(FlowConventions flowConventions) {
    this.flowConventions = flowConventions;
  }


  public InflationLeg baseCPI(java.math.BigDecimal baseCPI) {
    
    this.baseCPI = baseCPI;
    return this;
  }

   /**
   * Optional BaseCPI, if specified it will be used in place of BaseCPI(StartDate).  This should not be required for standard inflation swaps.
   * @return baseCPI
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getBaseCPI() {
    return baseCPI;
  }


  public void setBaseCPI(java.math.BigDecimal baseCPI) {
    this.baseCPI = baseCPI;
  }


  public InflationLeg calculationType(String calculationType) {
    
    this.calculationType = calculationType;
    return this;
  }

   /**
   * The calculation type.  ZeroCoupon is used for CPILegs where there is a single payment at maturity of  Notional generate justfile test_sdk (CPI(T) / CPI(T0) - 1)  where CPI(T0) is the BaseCPI of this leg  YearOnYear is used for YoY and LPI swap legs where there is a series of annual payments  Notional generate justfile test_sdk dayCount generate justfile test_sdk (CPI(t) / CPI(t-1) - 1)  If a cap and floor is added to this it becomes an LPI swap leg.  Compounded is used for inflation swap legs where there is a series of annual payments  Notional generate justfile test_sdk dayCount generate justfile test_sdk (CPI(t) / CPI(T0) - 1)  i.e. the BaseCPI is used every year. These swaps are not as common as CPI or    Supported string (enumeration) values are: [ZeroCoupon, YearOnYear, Compounded].
   * @return calculationType
  **/
  @jakarta.annotation.Nonnull
  public String getCalculationType() {
    return calculationType;
  }


  public void setCalculationType(String calculationType) {
    this.calculationType = calculationType;
  }


  public InflationLeg capRate(java.math.BigDecimal capRate) {
    
    this.capRate = capRate;
    return this;
  }

   /**
   * Optional cap, needed for LPI Legs or CPI Legs with Caps
   * @return capRate
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getCapRate() {
    return capRate;
  }


  public void setCapRate(java.math.BigDecimal capRate) {
    this.capRate = capRate;
  }


  public InflationLeg floorRate(java.math.BigDecimal floorRate) {
    
    this.floorRate = floorRate;
    return this;
  }

   /**
   * Optional floor, needed for LPI Legs or CPI Legs with Floors.
   * @return floorRate
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getFloorRate() {
    return floorRate;
  }


  public void setFloorRate(java.math.BigDecimal floorRate) {
    this.floorRate = floorRate;
  }


  public InflationLeg inflationIndexConventions(InflationIndexConventions inflationIndexConventions) {
    
    this.inflationIndexConventions = inflationIndexConventions;
    return this;
  }

   /**
   * Get inflationIndexConventions
   * @return inflationIndexConventions
  **/
  @jakarta.annotation.Nonnull
  public InflationIndexConventions getInflationIndexConventions() {
    return inflationIndexConventions;
  }


  public void setInflationIndexConventions(InflationIndexConventions inflationIndexConventions) {
    this.inflationIndexConventions = inflationIndexConventions;
  }


  public InflationLeg notional(java.math.BigDecimal notional) {
    
    this.notional = notional;
    return this;
  }

   /**
   * The notional
   * @return notional
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getNotional() {
    return notional;
  }


  public void setNotional(java.math.BigDecimal notional) {
    this.notional = notional;
  }


  public InflationLeg payReceive(String payReceive) {
    
    this.payReceive = payReceive;
    return this;
  }

   /**
   * PayReceive flag for the inflation leg.  This field is optional and defaults to Pay.    Supported string (enumeration) values are: [Pay, Receive].
   * @return payReceive
  **/
  @jakarta.annotation.Nullable
  public String getPayReceive() {
    return payReceive;
  }


  public void setPayReceive(String payReceive) {
    this.payReceive = payReceive;
  }


  public InflationLeg timeZoneConventions(TimeZoneConventions timeZoneConventions) {
    
    this.timeZoneConventions = timeZoneConventions;
    return this;
  }

   /**
   * Get timeZoneConventions
   * @return timeZoneConventions
  **/
  @jakarta.annotation.Nullable
  public TimeZoneConventions getTimeZoneConventions() {
    return timeZoneConventions;
  }


  public void setTimeZoneConventions(TimeZoneConventions timeZoneConventions) {
    this.timeZoneConventions = timeZoneConventions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InflationLeg inflationLeg = (InflationLeg) o;
    return Objects.equals(this.startDate, inflationLeg.startDate) &&
        Objects.equals(this.maturityDate, inflationLeg.maturityDate) &&
        Objects.equals(this.flowConventions, inflationLeg.flowConventions) &&
        (this.baseCPI.compareTo(inflationLeg.getBaseCPI()) == 0) &&
        Objects.equals(this.calculationType, inflationLeg.calculationType) &&
        (this.capRate.compareTo(inflationLeg.getCapRate()) == 0) &&
        (this.floorRate.compareTo(inflationLeg.getFloorRate()) == 0) &&
        Objects.equals(this.inflationIndexConventions, inflationLeg.inflationIndexConventions) &&
        (this.notional.compareTo(inflationLeg.getNotional()) == 0) &&
        Objects.equals(this.payReceive, inflationLeg.payReceive) &&
        Objects.equals(this.timeZoneConventions, inflationLeg.timeZoneConventions) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, maturityDate, flowConventions, baseCPI, calculationType, capRate, floorRate, inflationIndexConventions, notional, payReceive, timeZoneConventions, super.hashCode());
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
    sb.append("class InflationLeg {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    flowConventions: ").append(toIndentedString(flowConventions)).append("\n");
    sb.append("    baseCPI: ").append(toIndentedString(baseCPI)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    capRate: ").append(toIndentedString(capRate)).append("\n");
    sb.append("    floorRate: ").append(toIndentedString(floorRate)).append("\n");
    sb.append("    inflationIndexConventions: ").append(toIndentedString(inflationIndexConventions)).append("\n");
    sb.append("    notional: ").append(toIndentedString(notional)).append("\n");
    sb.append("    payReceive: ").append(toIndentedString(payReceive)).append("\n");
    sb.append("    timeZoneConventions: ").append(toIndentedString(timeZoneConventions)).append("\n");
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
    openapiFields.add("instrumentType");
    openapiFields.add("startDate");
    openapiFields.add("maturityDate");
    openapiFields.add("flowConventions");
    openapiFields.add("baseCPI");
    openapiFields.add("calculationType");
    openapiFields.add("capRate");
    openapiFields.add("floorRate");
    openapiFields.add("inflationIndexConventions");
    openapiFields.add("notional");
    openapiFields.add("payReceive");
    openapiFields.add("timeZoneConventions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("maturityDate");
    openapiRequiredFields.add("flowConventions");
    openapiRequiredFields.add("calculationType");
    openapiRequiredFields.add("inflationIndexConventions");
    openapiRequiredFields.add("notional");
    openapiRequiredFields.add("instrumentType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InflationLeg
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InflationLeg.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InflationLeg is not found in the empty JSON string", InflationLeg.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InflationLeg.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InflationLeg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InflationLeg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InflationLeg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InflationLeg.class));

       return (TypeAdapter<T>) new TypeAdapter<InflationLeg>() {
           @Override
           public void write(JsonWriter out, InflationLeg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InflationLeg read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InflationLeg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InflationLeg
  * @throws IOException if the JSON string is invalid with respect to InflationLeg
  */
  public static InflationLeg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InflationLeg.class);
  }

 /**
  * Convert an instance of InflationLeg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
