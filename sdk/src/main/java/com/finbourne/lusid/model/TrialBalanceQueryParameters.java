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
import com.finbourne.lusid.model.DateOrDiaryEntry;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * TrialBalanceQueryParameters
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialBalanceQueryParameters {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private DateOrDiaryEntry start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private DateOrDiaryEntry end;

  public static final String SERIALIZED_NAME_DATE_MODE = "dateMode";
  @SerializedName(SERIALIZED_NAME_DATE_MODE)
  private String dateMode;

  public static final String SERIALIZED_NAME_GENERAL_LEDGER_PROFILE_CODE = "generalLedgerProfileCode";
  @SerializedName(SERIALIZED_NAME_GENERAL_LEDGER_PROFILE_CODE)
  private String generalLedgerProfileCode;

  public static final String SERIALIZED_NAME_PROPERTY_KEYS = "propertyKeys";
  @SerializedName(SERIALIZED_NAME_PROPERTY_KEYS)
  private List<String> propertyKeys;

  public TrialBalanceQueryParameters() {
  }

  public TrialBalanceQueryParameters start(DateOrDiaryEntry start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nullable
  public DateOrDiaryEntry getStart() {
    return start;
  }


  public void setStart(DateOrDiaryEntry start) {
    this.start = start;
  }


  public TrialBalanceQueryParameters end(DateOrDiaryEntry end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nullable
  public DateOrDiaryEntry getEnd() {
    return end;
  }


  public void setEnd(DateOrDiaryEntry end) {
    this.end = end;
  }


  public TrialBalanceQueryParameters dateMode(String dateMode) {
    
    this.dateMode = dateMode;
    return this;
  }

   /**
   * The mode of calculation of the journal entry lines. The available values are: ActivityDate.
   * @return dateMode
  **/
  @jakarta.annotation.Nullable
  public String getDateMode() {
    return dateMode;
  }


  public void setDateMode(String dateMode) {
    this.dateMode = dateMode;
  }


  public TrialBalanceQueryParameters generalLedgerProfileCode(String generalLedgerProfileCode) {
    
    this.generalLedgerProfileCode = generalLedgerProfileCode;
    return this;
  }

   /**
   * The optional code of a general ledger profile used to decorate journal entry lines with levels.
   * @return generalLedgerProfileCode
  **/
  @jakarta.annotation.Nullable
  public String getGeneralLedgerProfileCode() {
    return generalLedgerProfileCode;
  }


  public void setGeneralLedgerProfileCode(String generalLedgerProfileCode) {
    this.generalLedgerProfileCode = generalLedgerProfileCode;
  }


  public TrialBalanceQueryParameters propertyKeys(List<String> propertyKeys) {
    
    this.propertyKeys = propertyKeys;
    return this;
  }

  public TrialBalanceQueryParameters addPropertyKeysItem(String propertyKeysItem) {
    if (this.propertyKeys == null) {
      this.propertyKeys = new ArrayList<>();
    }
    this.propertyKeys.add(propertyKeysItem);
    return this;
  }

   /**
   * A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, &#39;Portfolio&#39;, &#39;Account&#39;, &#39;LegalEntity&#39; or &#39;CustodianAccount&#39; domain to decorate onto the journal entry lines.
   * @return propertyKeys
  **/
  @jakarta.annotation.Nullable
  public List<String> getPropertyKeys() {
    return propertyKeys;
  }


  public void setPropertyKeys(List<String> propertyKeys) {
    this.propertyKeys = propertyKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialBalanceQueryParameters trialBalanceQueryParameters = (TrialBalanceQueryParameters) o;
    return Objects.equals(this.start, trialBalanceQueryParameters.start) &&
        Objects.equals(this.end, trialBalanceQueryParameters.end) &&
        Objects.equals(this.dateMode, trialBalanceQueryParameters.dateMode) &&
        Objects.equals(this.generalLedgerProfileCode, trialBalanceQueryParameters.generalLedgerProfileCode) &&
        Objects.equals(this.propertyKeys, trialBalanceQueryParameters.propertyKeys);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, dateMode, generalLedgerProfileCode, propertyKeys);
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
    sb.append("class TrialBalanceQueryParameters {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    dateMode: ").append(toIndentedString(dateMode)).append("\n");
    sb.append("    generalLedgerProfileCode: ").append(toIndentedString(generalLedgerProfileCode)).append("\n");
    sb.append("    propertyKeys: ").append(toIndentedString(propertyKeys)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("dateMode");
    openapiFields.add("generalLedgerProfileCode");
    openapiFields.add("propertyKeys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TrialBalanceQueryParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrialBalanceQueryParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrialBalanceQueryParameters is not found in the empty JSON string", TrialBalanceQueryParameters.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `start`
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        DateOrDiaryEntry.validateJsonElement(jsonObj.get("start"));
      }
      // validate the optional field `end`
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        DateOrDiaryEntry.validateJsonElement(jsonObj.get("end"));
      }
      if ((jsonObj.get("dateMode") != null && !jsonObj.get("dateMode").isJsonNull()) && !jsonObj.get("dateMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateMode").toString()));
      }
      if ((jsonObj.get("generalLedgerProfileCode") != null && !jsonObj.get("generalLedgerProfileCode").isJsonNull()) && !jsonObj.get("generalLedgerProfileCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generalLedgerProfileCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generalLedgerProfileCode").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("propertyKeys") != null && !jsonObj.get("propertyKeys").isJsonNull() && !jsonObj.get("propertyKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyKeys` to be an array in the JSON string but got `%s`", jsonObj.get("propertyKeys").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrialBalanceQueryParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrialBalanceQueryParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrialBalanceQueryParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrialBalanceQueryParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<TrialBalanceQueryParameters>() {
           @Override
           public void write(JsonWriter out, TrialBalanceQueryParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrialBalanceQueryParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrialBalanceQueryParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrialBalanceQueryParameters
  * @throws IOException if the JSON string is invalid with respect to TrialBalanceQueryParameters
  */
  public static TrialBalanceQueryParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrialBalanceQueryParameters.class);
  }

 /**
  * Convert an instance of TrialBalanceQueryParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}