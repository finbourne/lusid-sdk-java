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
import com.finbourne.lusid.model.EconomicDependency;
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
 * Economic dependency required to price FX derivative products that contain optionality.  FX Vol surface is a grid of implied volatilities for an array of strikes and tenors,  derived from vanilla option prices in the market.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FxVolDependency extends EconomicDependency {
  public static final String SERIALIZED_NAME_DOMESTIC_CURRENCY = "domesticCurrency";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_CURRENCY)
  private String domesticCurrency;

  public static final String SERIALIZED_NAME_FOREIGN_CURRENCY = "foreignCurrency";
  @SerializedName(SERIALIZED_NAME_FOREIGN_CURRENCY)
  private String foreignCurrency;

  public static final String SERIALIZED_NAME_VOL_TYPE = "volType";
  @SerializedName(SERIALIZED_NAME_VOL_TYPE)
  private String volType;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public FxVolDependency() {
    // this.dependencyType = this.getClass().getSimpleName();
  }

  public FxVolDependency domesticCurrency(String domesticCurrency) {
    
    this.domesticCurrency = domesticCurrency;
    return this;
  }

   /**
   * DomesticCurrency is the first currency in a currency pair quote e.g. eur-gbp, eur is the domestic currency.
   * @return domesticCurrency
  **/
  @jakarta.annotation.Nonnull
  public String getDomesticCurrency() {
    return domesticCurrency;
  }


  public void setDomesticCurrency(String domesticCurrency) {
    this.domesticCurrency = domesticCurrency;
  }


  public FxVolDependency foreignCurrency(String foreignCurrency) {
    
    this.foreignCurrency = foreignCurrency;
    return this;
  }

   /**
   * ForeignCurrency is the second currency in a currency pair quote e.g. eur-gbp, gbp is the foreign currency.
   * @return foreignCurrency
  **/
  @jakarta.annotation.Nonnull
  public String getForeignCurrency() {
    return foreignCurrency;
  }


  public void setForeignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
  }


  public FxVolDependency volType(String volType) {
    
    this.volType = volType;
    return this;
  }

   /**
   * Volatility type e.g. \&quot;LN\&quot; and \&quot;N\&quot; for log-normal and normal volatility.
   * @return volType
  **/
  @jakarta.annotation.Nonnull
  public String getVolType() {
    return volType;
  }


  public void setVolType(String volType) {
    this.volType = volType;
  }


  public FxVolDependency date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date.
   * @return date
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FxVolDependency fxVolDependency = (FxVolDependency) o;
    return Objects.equals(this.domesticCurrency, fxVolDependency.domesticCurrency) &&
        Objects.equals(this.foreignCurrency, fxVolDependency.foreignCurrency) &&
        Objects.equals(this.volType, fxVolDependency.volType) &&
        Objects.equals(this.date, fxVolDependency.date) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domesticCurrency, foreignCurrency, volType, date, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FxVolDependency {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    domesticCurrency: ").append(toIndentedString(domesticCurrency)).append("\n");
    sb.append("    foreignCurrency: ").append(toIndentedString(foreignCurrency)).append("\n");
    sb.append("    volType: ").append(toIndentedString(volType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
    openapiFields.add("dependencyType");
    openapiFields.add("domesticCurrency");
    openapiFields.add("foreignCurrency");
    openapiFields.add("volType");
    openapiFields.add("date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("domesticCurrency");
    openapiRequiredFields.add("foreignCurrency");
    openapiRequiredFields.add("volType");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("dependencyType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FxVolDependency
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FxVolDependency.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FxVolDependency is not found in the empty JSON string", FxVolDependency.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FxVolDependency.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FxVolDependency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FxVolDependency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FxVolDependency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FxVolDependency.class));

       return (TypeAdapter<T>) new TypeAdapter<FxVolDependency>() {
           @Override
           public void write(JsonWriter out, FxVolDependency value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FxVolDependency read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FxVolDependency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FxVolDependency
  * @throws IOException if the JSON string is invalid with respect to FxVolDependency
  */
  public static FxVolDependency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FxVolDependency.class);
  }

 /**
  * Convert an instance of FxVolDependency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
