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
 * Information required to specify a conversion event for a convertible bond.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BondConversionEntry {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_DENOMINATION = "denomination";
  @SerializedName(SERIALIZED_NAME_DENOMINATION)
  private java.math.BigDecimal denomination;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private java.math.BigDecimal price;

  public static final String SERIALIZED_NAME_RATIO = "ratio";
  @SerializedName(SERIALIZED_NAME_RATIO)
  private java.math.BigDecimal ratio;

  public BondConversionEntry() {
  }

  public BondConversionEntry date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * The date at which the bond can be converted
   * @return date
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public BondConversionEntry denomination(java.math.BigDecimal denomination) {
    
    this.denomination = denomination;
    return this;
  }

   /**
   * The number of shares to be issued on conversion will be equal to the denomination of the  bond divided by the conversion price.  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero.
   * @return denomination
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getDenomination() {
    return denomination;
  }


  public void setDenomination(java.math.BigDecimal denomination) {
    this.denomination = denomination;
  }


  public BondConversionEntry price(java.math.BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The conversion price  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero.
   * @return price
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getPrice() {
    return price;
  }


  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }


  public BondConversionEntry ratio(java.math.BigDecimal ratio) {
    
    this.ratio = ratio;
    return this;
  }

   /**
   * The number of common shares received at the time of conversion for each convertible bond  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero.
   * @return ratio
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getRatio() {
    return ratio;
  }


  public void setRatio(java.math.BigDecimal ratio) {
    this.ratio = ratio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BondConversionEntry bondConversionEntry = (BondConversionEntry) o;
    return Objects.equals(this.date, bondConversionEntry.date) &&
        (this.denomination.compareTo(bondConversionEntry.getDenomination()) == 0) &&
        (this.price.compareTo(bondConversionEntry.getPrice()) == 0) &&
        (this.ratio.compareTo(bondConversionEntry.getRatio()) == 0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, denomination, price, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BondConversionEntry {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    denomination: ").append(toIndentedString(denomination)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("denomination");
    openapiFields.add("price");
    openapiFields.add("ratio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BondConversionEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BondConversionEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BondConversionEntry is not found in the empty JSON string", BondConversionEntry.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BondConversionEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BondConversionEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BondConversionEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BondConversionEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<BondConversionEntry>() {
           @Override
           public void write(JsonWriter out, BondConversionEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BondConversionEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BondConversionEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BondConversionEntry
  * @throws IOException if the JSON string is invalid with respect to BondConversionEntry
  */
  public static BondConversionEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BondConversionEntry.class);
  }

 /**
  * Convert an instance of BondConversionEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}