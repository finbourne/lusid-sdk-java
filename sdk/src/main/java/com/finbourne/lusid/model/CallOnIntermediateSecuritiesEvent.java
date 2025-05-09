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
import com.finbourne.lusid.model.LapseElection;
import com.finbourne.lusid.model.NewInstrument;
import com.finbourne.lusid.model.OptionExerciseElection;
import com.finbourne.lusid.model.UnitsRatio;
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
 * CallOnIntermediateSecuritiesEvent event (EXRI), representing an exercise on intermediate securities resulting from an intermediate securities distribution.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallOnIntermediateSecuritiesEvent extends InstrumentEvent {
  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "paymentDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private OffsetDateTime paymentDate;

  public static final String SERIALIZED_NAME_NEW_INSTRUMENT = "newInstrument";
  @SerializedName(SERIALIZED_NAME_NEW_INSTRUMENT)
  private NewInstrument newInstrument;

  public static final String SERIALIZED_NAME_UNITS_RATIO = "unitsRatio";
  @SerializedName(SERIALIZED_NAME_UNITS_RATIO)
  private UnitsRatio unitsRatio;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private java.math.BigDecimal price;

  public static final String SERIALIZED_NAME_EXERCISE_CURRENCY = "exerciseCurrency";
  @SerializedName(SERIALIZED_NAME_EXERCISE_CURRENCY)
  private String exerciseCurrency;

  public static final String SERIALIZED_NAME_OPTION_EXERCISE_ELECTIONS = "optionExerciseElections";
  @SerializedName(SERIALIZED_NAME_OPTION_EXERCISE_ELECTIONS)
  private List<OptionExerciseElection> optionExerciseElections;

  public static final String SERIALIZED_NAME_LAPSE_ELECTIONS = "lapseElections";
  @SerializedName(SERIALIZED_NAME_LAPSE_ELECTIONS)
  private List<LapseElection> lapseElections;

  public CallOnIntermediateSecuritiesEvent() {
    // this.instrumentEventType = this.getClass().getSimpleName();
  }

  public CallOnIntermediateSecuritiesEvent expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The date on which the issue ends.
   * @return expiryDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public CallOnIntermediateSecuritiesEvent paymentDate(OffsetDateTime paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * The payment date of the event.
   * @return paymentDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }


  public CallOnIntermediateSecuritiesEvent newInstrument(NewInstrument newInstrument) {
    
    this.newInstrument = newInstrument;
    return this;
  }

   /**
   * Get newInstrument
   * @return newInstrument
  **/
  @jakarta.annotation.Nonnull
  public NewInstrument getNewInstrument() {
    return newInstrument;
  }


  public void setNewInstrument(NewInstrument newInstrument) {
    this.newInstrument = newInstrument;
  }


  public CallOnIntermediateSecuritiesEvent unitsRatio(UnitsRatio unitsRatio) {
    
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


  public CallOnIntermediateSecuritiesEvent price(java.math.BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price at which new units are purchased.
   * @return price
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getPrice() {
    return price;
  }


  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }


  public CallOnIntermediateSecuritiesEvent exerciseCurrency(String exerciseCurrency) {
    
    this.exerciseCurrency = exerciseCurrency;
    return this;
  }

   /**
   * The currency of the exercise.
   * @return exerciseCurrency
  **/
  @jakarta.annotation.Nonnull
  public String getExerciseCurrency() {
    return exerciseCurrency;
  }


  public void setExerciseCurrency(String exerciseCurrency) {
    this.exerciseCurrency = exerciseCurrency;
  }


  public CallOnIntermediateSecuritiesEvent optionExerciseElections(List<OptionExerciseElection> optionExerciseElections) {
    
    this.optionExerciseElections = optionExerciseElections;
    return this;
  }

  public CallOnIntermediateSecuritiesEvent addOptionExerciseElectionsItem(OptionExerciseElection optionExerciseElectionsItem) {
    if (this.optionExerciseElections == null) {
      this.optionExerciseElections = new ArrayList<>();
    }
    this.optionExerciseElections.add(optionExerciseElectionsItem);
    return this;
  }

   /**
   * Option exercise election for this event.
   * @return optionExerciseElections
  **/
  @jakarta.annotation.Nullable
  public List<OptionExerciseElection> getOptionExerciseElections() {
    return optionExerciseElections;
  }


  public void setOptionExerciseElections(List<OptionExerciseElection> optionExerciseElections) {
    this.optionExerciseElections = optionExerciseElections;
  }


  public CallOnIntermediateSecuritiesEvent lapseElections(List<LapseElection> lapseElections) {
    
    this.lapseElections = lapseElections;
    return this;
  }

  public CallOnIntermediateSecuritiesEvent addLapseElectionsItem(LapseElection lapseElectionsItem) {
    if (this.lapseElections == null) {
      this.lapseElections = new ArrayList<>();
    }
    this.lapseElections.add(lapseElectionsItem);
    return this;
  }

   /**
   * Lapse election for this event.
   * @return lapseElections
  **/
  @jakarta.annotation.Nullable
  public List<LapseElection> getLapseElections() {
    return lapseElections;
  }


  public void setLapseElections(List<LapseElection> lapseElections) {
    this.lapseElections = lapseElections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallOnIntermediateSecuritiesEvent callOnIntermediateSecuritiesEvent = (CallOnIntermediateSecuritiesEvent) o;
    return Objects.equals(this.expiryDate, callOnIntermediateSecuritiesEvent.expiryDate) &&
        Objects.equals(this.paymentDate, callOnIntermediateSecuritiesEvent.paymentDate) &&
        Objects.equals(this.newInstrument, callOnIntermediateSecuritiesEvent.newInstrument) &&
        Objects.equals(this.unitsRatio, callOnIntermediateSecuritiesEvent.unitsRatio) &&
        (this.price.compareTo(callOnIntermediateSecuritiesEvent.getPrice()) == 0) &&
        Objects.equals(this.exerciseCurrency, callOnIntermediateSecuritiesEvent.exerciseCurrency) &&
        Objects.equals(this.optionExerciseElections, callOnIntermediateSecuritiesEvent.optionExerciseElections) &&
        Objects.equals(this.lapseElections, callOnIntermediateSecuritiesEvent.lapseElections) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryDate, paymentDate, newInstrument, unitsRatio, price, exerciseCurrency, optionExerciseElections, lapseElections, super.hashCode());
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
    sb.append("class CallOnIntermediateSecuritiesEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    newInstrument: ").append(toIndentedString(newInstrument)).append("\n");
    sb.append("    unitsRatio: ").append(toIndentedString(unitsRatio)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    exerciseCurrency: ").append(toIndentedString(exerciseCurrency)).append("\n");
    sb.append("    optionExerciseElections: ").append(toIndentedString(optionExerciseElections)).append("\n");
    sb.append("    lapseElections: ").append(toIndentedString(lapseElections)).append("\n");
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
    openapiFields.add("expiryDate");
    openapiFields.add("paymentDate");
    openapiFields.add("newInstrument");
    openapiFields.add("unitsRatio");
    openapiFields.add("price");
    openapiFields.add("exerciseCurrency");
    openapiFields.add("optionExerciseElections");
    openapiFields.add("lapseElections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("newInstrument");
    openapiRequiredFields.add("unitsRatio");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("exerciseCurrency");
    openapiRequiredFields.add("instrumentEventType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CallOnIntermediateSecuritiesEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallOnIntermediateSecuritiesEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallOnIntermediateSecuritiesEvent is not found in the empty JSON string", CallOnIntermediateSecuritiesEvent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CallOnIntermediateSecuritiesEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallOnIntermediateSecuritiesEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallOnIntermediateSecuritiesEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallOnIntermediateSecuritiesEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallOnIntermediateSecuritiesEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<CallOnIntermediateSecuritiesEvent>() {
           @Override
           public void write(JsonWriter out, CallOnIntermediateSecuritiesEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallOnIntermediateSecuritiesEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallOnIntermediateSecuritiesEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallOnIntermediateSecuritiesEvent
  * @throws IOException if the JSON string is invalid with respect to CallOnIntermediateSecuritiesEvent
  */
  public static CallOnIntermediateSecuritiesEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallOnIntermediateSecuritiesEvent.class);
  }

 /**
  * Convert an instance of CallOnIntermediateSecuritiesEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
