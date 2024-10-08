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
 * External market codes and identifiers for the equity, e.g. IBM.  Required for valuation via SimpleStatic (look-up pricing).  Valuation will not succeed without a matching quote.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WeightedInstrumentInLineLookupIdentifiers {
  public static final String SERIALIZED_NAME_LUSID_INSTRUMENT_ID = "LusidInstrumentId";
  @SerializedName(SERIALIZED_NAME_LUSID_INSTRUMENT_ID)
  private String lusidInstrumentId;

  public static final String SERIALIZED_NAME_ISIN = "Isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_SEDOL = "Sedol";
  @SerializedName(SERIALIZED_NAME_SEDOL)
  private String sedol;

  public static final String SERIALIZED_NAME_CUSIP = "Cusip";
  @SerializedName(SERIALIZED_NAME_CUSIP)
  private String cusip;

  public static final String SERIALIZED_NAME_CLIENT_INTERNAL = "ClientInternal";
  @SerializedName(SERIALIZED_NAME_CLIENT_INTERNAL)
  private String clientInternal;

  public static final String SERIALIZED_NAME_FIGI = "Figi";
  @SerializedName(SERIALIZED_NAME_FIGI)
  private String figi;

  public static final String SERIALIZED_NAME_R_I_C = "RIC";
  @SerializedName(SERIALIZED_NAME_R_I_C)
  private String RIC;

  public static final String SERIALIZED_NAME_QUOTE_PERM_ID = "QuotePermId";
  @SerializedName(SERIALIZED_NAME_QUOTE_PERM_ID)
  private String quotePermId;

  public static final String SERIALIZED_NAME_RE_D_CODE = "REDCode";
  @SerializedName(SERIALIZED_NAME_RE_D_CODE)
  private String reDCode;

  public static final String SERIALIZED_NAME_BB_G_ID = "BBGId";
  @SerializedName(SERIALIZED_NAME_BB_G_ID)
  private String bbGId;

  public static final String SERIALIZED_NAME_IC_E_CODE = "ICECode";
  @SerializedName(SERIALIZED_NAME_IC_E_CODE)
  private String icECode;

  public WeightedInstrumentInLineLookupIdentifiers() {
  }

  public WeightedInstrumentInLineLookupIdentifiers lusidInstrumentId(String lusidInstrumentId) {
    
    this.lusidInstrumentId = lusidInstrumentId;
    return this;
  }

   /**
   * Get lusidInstrumentId
   * @return lusidInstrumentId
  **/
  @jakarta.annotation.Nullable
  public String getLusidInstrumentId() {
    return lusidInstrumentId;
  }


  public void setLusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId;
  }


  public WeightedInstrumentInLineLookupIdentifiers isin(String isin) {
    
    this.isin = isin;
    return this;
  }

   /**
   * Get isin
   * @return isin
  **/
  @jakarta.annotation.Nullable
  public String getIsin() {
    return isin;
  }


  public void setIsin(String isin) {
    this.isin = isin;
  }


  public WeightedInstrumentInLineLookupIdentifiers sedol(String sedol) {
    
    this.sedol = sedol;
    return this;
  }

   /**
   * Get sedol
   * @return sedol
  **/
  @jakarta.annotation.Nullable
  public String getSedol() {
    return sedol;
  }


  public void setSedol(String sedol) {
    this.sedol = sedol;
  }


  public WeightedInstrumentInLineLookupIdentifiers cusip(String cusip) {
    
    this.cusip = cusip;
    return this;
  }

   /**
   * Get cusip
   * @return cusip
  **/
  @jakarta.annotation.Nullable
  public String getCusip() {
    return cusip;
  }


  public void setCusip(String cusip) {
    this.cusip = cusip;
  }


  public WeightedInstrumentInLineLookupIdentifiers clientInternal(String clientInternal) {
    
    this.clientInternal = clientInternal;
    return this;
  }

   /**
   * Get clientInternal
   * @return clientInternal
  **/
  @jakarta.annotation.Nullable
  public String getClientInternal() {
    return clientInternal;
  }


  public void setClientInternal(String clientInternal) {
    this.clientInternal = clientInternal;
  }


  public WeightedInstrumentInLineLookupIdentifiers figi(String figi) {
    
    this.figi = figi;
    return this;
  }

   /**
   * Get figi
   * @return figi
  **/
  @jakarta.annotation.Nullable
  public String getFigi() {
    return figi;
  }


  public void setFigi(String figi) {
    this.figi = figi;
  }


  public WeightedInstrumentInLineLookupIdentifiers RIC(String RIC) {
    
    this.RIC = RIC;
    return this;
  }

   /**
   * Get RIC
   * @return RIC
  **/
  @jakarta.annotation.Nullable
  public String getRIC() {
    return RIC;
  }


  public void setRIC(String RIC) {
    this.RIC = RIC;
  }


  public WeightedInstrumentInLineLookupIdentifiers quotePermId(String quotePermId) {
    
    this.quotePermId = quotePermId;
    return this;
  }

   /**
   * Get quotePermId
   * @return quotePermId
  **/
  @jakarta.annotation.Nullable
  public String getQuotePermId() {
    return quotePermId;
  }


  public void setQuotePermId(String quotePermId) {
    this.quotePermId = quotePermId;
  }


  public WeightedInstrumentInLineLookupIdentifiers reDCode(String reDCode) {
    
    this.reDCode = reDCode;
    return this;
  }

   /**
   * Get reDCode
   * @return reDCode
  **/
  @jakarta.annotation.Nullable
  public String getReDCode() {
    return reDCode;
  }


  public void setReDCode(String reDCode) {
    this.reDCode = reDCode;
  }


  public WeightedInstrumentInLineLookupIdentifiers bbGId(String bbGId) {
    
    this.bbGId = bbGId;
    return this;
  }

   /**
   * Get bbGId
   * @return bbGId
  **/
  @jakarta.annotation.Nullable
  public String getBbGId() {
    return bbGId;
  }


  public void setBbGId(String bbGId) {
    this.bbGId = bbGId;
  }


  public WeightedInstrumentInLineLookupIdentifiers icECode(String icECode) {
    
    this.icECode = icECode;
    return this;
  }

   /**
   * Get icECode
   * @return icECode
  **/
  @jakarta.annotation.Nullable
  public String getIcECode() {
    return icECode;
  }


  public void setIcECode(String icECode) {
    this.icECode = icECode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedInstrumentInLineLookupIdentifiers weightedInstrumentInLineLookupIdentifiers = (WeightedInstrumentInLineLookupIdentifiers) o;
    return Objects.equals(this.lusidInstrumentId, weightedInstrumentInLineLookupIdentifiers.lusidInstrumentId) &&
        Objects.equals(this.isin, weightedInstrumentInLineLookupIdentifiers.isin) &&
        Objects.equals(this.sedol, weightedInstrumentInLineLookupIdentifiers.sedol) &&
        Objects.equals(this.cusip, weightedInstrumentInLineLookupIdentifiers.cusip) &&
        Objects.equals(this.clientInternal, weightedInstrumentInLineLookupIdentifiers.clientInternal) &&
        Objects.equals(this.figi, weightedInstrumentInLineLookupIdentifiers.figi) &&
        Objects.equals(this.RIC, weightedInstrumentInLineLookupIdentifiers.RIC) &&
        Objects.equals(this.quotePermId, weightedInstrumentInLineLookupIdentifiers.quotePermId) &&
        Objects.equals(this.reDCode, weightedInstrumentInLineLookupIdentifiers.reDCode) &&
        Objects.equals(this.bbGId, weightedInstrumentInLineLookupIdentifiers.bbGId) &&
        Objects.equals(this.icECode, weightedInstrumentInLineLookupIdentifiers.icECode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lusidInstrumentId, isin, sedol, cusip, clientInternal, figi, RIC, quotePermId, reDCode, bbGId, icECode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedInstrumentInLineLookupIdentifiers {\n");
    sb.append("    lusidInstrumentId: ").append(toIndentedString(lusidInstrumentId)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    clientInternal: ").append(toIndentedString(clientInternal)).append("\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    RIC: ").append(toIndentedString(RIC)).append("\n");
    sb.append("    quotePermId: ").append(toIndentedString(quotePermId)).append("\n");
    sb.append("    reDCode: ").append(toIndentedString(reDCode)).append("\n");
    sb.append("    bbGId: ").append(toIndentedString(bbGId)).append("\n");
    sb.append("    icECode: ").append(toIndentedString(icECode)).append("\n");
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
    openapiFields.add("LusidInstrumentId");
    openapiFields.add("Isin");
    openapiFields.add("Sedol");
    openapiFields.add("Cusip");
    openapiFields.add("ClientInternal");
    openapiFields.add("Figi");
    openapiFields.add("RIC");
    openapiFields.add("QuotePermId");
    openapiFields.add("REDCode");
    openapiFields.add("BBGId");
    openapiFields.add("ICECode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WeightedInstrumentInLineLookupIdentifiers
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WeightedInstrumentInLineLookupIdentifiers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WeightedInstrumentInLineLookupIdentifiers is not found in the empty JSON string", WeightedInstrumentInLineLookupIdentifiers.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LusidInstrumentId") != null && !jsonObj.get("LusidInstrumentId").isJsonNull()) && !jsonObj.get("LusidInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LusidInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LusidInstrumentId").toString()));
      }
      if ((jsonObj.get("Isin") != null && !jsonObj.get("Isin").isJsonNull()) && !jsonObj.get("Isin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Isin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Isin").toString()));
      }
      if ((jsonObj.get("Sedol") != null && !jsonObj.get("Sedol").isJsonNull()) && !jsonObj.get("Sedol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sedol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Sedol").toString()));
      }
      if ((jsonObj.get("Cusip") != null && !jsonObj.get("Cusip").isJsonNull()) && !jsonObj.get("Cusip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Cusip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Cusip").toString()));
      }
      if ((jsonObj.get("ClientInternal") != null && !jsonObj.get("ClientInternal").isJsonNull()) && !jsonObj.get("ClientInternal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientInternal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientInternal").toString()));
      }
      if ((jsonObj.get("Figi") != null && !jsonObj.get("Figi").isJsonNull()) && !jsonObj.get("Figi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Figi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Figi").toString()));
      }
      if ((jsonObj.get("RIC") != null && !jsonObj.get("RIC").isJsonNull()) && !jsonObj.get("RIC").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RIC` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RIC").toString()));
      }
      if ((jsonObj.get("QuotePermId") != null && !jsonObj.get("QuotePermId").isJsonNull()) && !jsonObj.get("QuotePermId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `QuotePermId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("QuotePermId").toString()));
      }
      if ((jsonObj.get("REDCode") != null && !jsonObj.get("REDCode").isJsonNull()) && !jsonObj.get("REDCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `REDCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("REDCode").toString()));
      }
      if ((jsonObj.get("BBGId") != null && !jsonObj.get("BBGId").isJsonNull()) && !jsonObj.get("BBGId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BBGId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BBGId").toString()));
      }
      if ((jsonObj.get("ICECode") != null && !jsonObj.get("ICECode").isJsonNull()) && !jsonObj.get("ICECode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ICECode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ICECode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WeightedInstrumentInLineLookupIdentifiers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WeightedInstrumentInLineLookupIdentifiers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WeightedInstrumentInLineLookupIdentifiers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WeightedInstrumentInLineLookupIdentifiers.class));

       return (TypeAdapter<T>) new TypeAdapter<WeightedInstrumentInLineLookupIdentifiers>() {
           @Override
           public void write(JsonWriter out, WeightedInstrumentInLineLookupIdentifiers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WeightedInstrumentInLineLookupIdentifiers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WeightedInstrumentInLineLookupIdentifiers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WeightedInstrumentInLineLookupIdentifiers
  * @throws IOException if the JSON string is invalid with respect to WeightedInstrumentInLineLookupIdentifiers
  */
  public static WeightedInstrumentInLineLookupIdentifiers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WeightedInstrumentInLineLookupIdentifiers.class);
  }

 /**
  * Convert an instance of WeightedInstrumentInLineLookupIdentifiers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
