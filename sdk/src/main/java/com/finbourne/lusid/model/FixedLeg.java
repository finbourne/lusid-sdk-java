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
import com.finbourne.lusid.model.FixedLegAllOfOverrides;
import com.finbourne.lusid.model.InstrumentLeg;
import com.finbourne.lusid.model.LegDefinition;
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
 * LUSID representation of a Fixed Rate Leg.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FixedLeg extends InstrumentLeg {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_LEG_DEFINITION = "legDefinition";
  @SerializedName(SERIALIZED_NAME_LEG_DEFINITION)
  private LegDefinition legDefinition;

  public static final String SERIALIZED_NAME_NOTIONAL = "notional";
  @SerializedName(SERIALIZED_NAME_NOTIONAL)
  private java.math.BigDecimal notional;

  public static final String SERIALIZED_NAME_OVERRIDES = "overrides";
  @SerializedName(SERIALIZED_NAME_OVERRIDES)
  private FixedLegAllOfOverrides overrides;

  public static final String SERIALIZED_NAME_TIME_ZONE_CONVENTIONS = "timeZoneConventions";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_CONVENTIONS)
  private TimeZoneConventions timeZoneConventions;

  public FixedLeg() {
    // this.instrumentType = this.getClass().getSimpleName();
  }

  public FixedLeg startDate(OffsetDateTime startDate) {
    
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


  public FixedLeg maturityDate(OffsetDateTime maturityDate) {
    
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


  public FixedLeg legDefinition(LegDefinition legDefinition) {
    
    this.legDefinition = legDefinition;
    return this;
  }

   /**
   * Get legDefinition
   * @return legDefinition
  **/
  @jakarta.annotation.Nonnull
  public LegDefinition getLegDefinition() {
    return legDefinition;
  }


  public void setLegDefinition(LegDefinition legDefinition) {
    this.legDefinition = legDefinition;
  }


  public FixedLeg notional(java.math.BigDecimal notional) {
    
    this.notional = notional;
    return this;
  }

   /**
   * Get notional
   * @return notional
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getNotional() {
    return notional;
  }


  public void setNotional(java.math.BigDecimal notional) {
    this.notional = notional;
  }


  public FixedLeg overrides(FixedLegAllOfOverrides overrides) {
    
    this.overrides = overrides;
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @jakarta.annotation.Nullable
  public FixedLegAllOfOverrides getOverrides() {
    return overrides;
  }


  public void setOverrides(FixedLegAllOfOverrides overrides) {
    this.overrides = overrides;
  }


  public FixedLeg timeZoneConventions(TimeZoneConventions timeZoneConventions) {
    
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
    FixedLeg fixedLeg = (FixedLeg) o;
    return Objects.equals(this.startDate, fixedLeg.startDate) &&
        Objects.equals(this.maturityDate, fixedLeg.maturityDate) &&
        Objects.equals(this.legDefinition, fixedLeg.legDefinition) &&
        (this.notional.compareTo(fixedLeg.getNotional()) == 0) &&
        Objects.equals(this.overrides, fixedLeg.overrides) &&
        Objects.equals(this.timeZoneConventions, fixedLeg.timeZoneConventions) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, maturityDate, legDefinition, notional, overrides, timeZoneConventions, super.hashCode());
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
    sb.append("class FixedLeg {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    legDefinition: ").append(toIndentedString(legDefinition)).append("\n");
    sb.append("    notional: ").append(toIndentedString(notional)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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
    openapiFields.add("legDefinition");
    openapiFields.add("notional");
    openapiFields.add("overrides");
    openapiFields.add("timeZoneConventions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("maturityDate");
    openapiRequiredFields.add("legDefinition");
    openapiRequiredFields.add("notional");
    openapiRequiredFields.add("instrumentType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FixedLeg
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FixedLeg.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FixedLeg is not found in the empty JSON string", FixedLeg.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FixedLeg.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FixedLeg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FixedLeg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FixedLeg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FixedLeg.class));

       return (TypeAdapter<T>) new TypeAdapter<FixedLeg>() {
           @Override
           public void write(JsonWriter out, FixedLeg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FixedLeg read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FixedLeg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FixedLeg
  * @throws IOException if the JSON string is invalid with respect to FixedLeg
  */
  public static FixedLeg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FixedLeg.class);
  }

 /**
  * Convert an instance of FixedLeg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
