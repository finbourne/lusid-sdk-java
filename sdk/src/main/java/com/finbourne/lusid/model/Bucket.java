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
import com.finbourne.lusid.model.CurrencyAndAmount;
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
 * Bucket
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Bucket {
  public static final String SERIALIZED_NAME_TAX_LOT_ID = "taxLotId";
  @SerializedName(SERIALIZED_NAME_TAX_LOT_ID)
  private String taxLotId;

  public static final String SERIALIZED_NAME_MOVEMENT_NAME = "movementName";
  @SerializedName(SERIALIZED_NAME_MOVEMENT_NAME)
  private String movementName;

  public static final String SERIALIZED_NAME_HOLDING_TYPE = "holdingType";
  @SerializedName(SERIALIZED_NAME_HOLDING_TYPE)
  private String holdingType;

  public static final String SERIALIZED_NAME_ECONOMIC_BUCKET = "economicBucket";
  @SerializedName(SERIALIZED_NAME_ECONOMIC_BUCKET)
  private String economicBucket;

  public static final String SERIALIZED_NAME_ECONOMIC_BUCKET_COMPONENT = "economicBucketComponent";
  @SerializedName(SERIALIZED_NAME_ECONOMIC_BUCKET_COMPONENT)
  private String economicBucketComponent;

  public static final String SERIALIZED_NAME_ECONOMIC_BUCKET_VARIANT = "economicBucketVariant";
  @SerializedName(SERIALIZED_NAME_ECONOMIC_BUCKET_VARIANT)
  private String economicBucketVariant;

  public static final String SERIALIZED_NAME_HOLDING_SIGN = "holdingSign";
  @SerializedName(SERIALIZED_NAME_HOLDING_SIGN)
  private String holdingSign;

  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  private CurrencyAndAmount local;

  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private CurrencyAndAmount base;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private java.math.BigDecimal units;

  public static final String SERIALIZED_NAME_ACTIVITY_DATE = "activityDate";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DATE)
  private OffsetDateTime activityDate;

  public Bucket() {
  }

  public Bucket taxLotId(String taxLotId) {
    
    this.taxLotId = taxLotId;
    return this;
  }

   /**
   * The identifier of the tax lot this bucket is for.
   * @return taxLotId
  **/
  @jakarta.annotation.Nullable
  public String getTaxLotId() {
    return taxLotId;
  }


  public void setTaxLotId(String taxLotId) {
    this.taxLotId = taxLotId;
  }


  public Bucket movementName(String movementName) {
    
    this.movementName = movementName;
    return this;
  }

   /**
   * The name of the movement.
   * @return movementName
  **/
  @jakarta.annotation.Nullable
  public String getMovementName() {
    return movementName;
  }


  public void setMovementName(String movementName) {
    this.movementName = movementName;
  }


  public Bucket holdingType(String holdingType) {
    
    this.holdingType = holdingType;
    return this;
  }

   /**
   * The type of the holding.
   * @return holdingType
  **/
  @jakarta.annotation.Nullable
  public String getHoldingType() {
    return holdingType;
  }


  public void setHoldingType(String holdingType) {
    this.holdingType = holdingType;
  }


  public Bucket economicBucket(String economicBucket) {
    
    this.economicBucket = economicBucket;
    return this;
  }

   /**
   * The economic bucket.
   * @return economicBucket
  **/
  @jakarta.annotation.Nullable
  public String getEconomicBucket() {
    return economicBucket;
  }


  public void setEconomicBucket(String economicBucket) {
    this.economicBucket = economicBucket;
  }


  public Bucket economicBucketComponent(String economicBucketComponent) {
    
    this.economicBucketComponent = economicBucketComponent;
    return this;
  }

   /**
   * The economic bucket component.
   * @return economicBucketComponent
  **/
  @jakarta.annotation.Nullable
  public String getEconomicBucketComponent() {
    return economicBucketComponent;
  }


  public void setEconomicBucketComponent(String economicBucketComponent) {
    this.economicBucketComponent = economicBucketComponent;
  }


  public Bucket economicBucketVariant(String economicBucketVariant) {
    
    this.economicBucketVariant = economicBucketVariant;
    return this;
  }

   /**
   * The economic bucket component.
   * @return economicBucketVariant
  **/
  @jakarta.annotation.Nullable
  public String getEconomicBucketVariant() {
    return economicBucketVariant;
  }


  public void setEconomicBucketVariant(String economicBucketVariant) {
    this.economicBucketVariant = economicBucketVariant;
  }


  public Bucket holdingSign(String holdingSign) {
    
    this.holdingSign = holdingSign;
    return this;
  }

   /**
   * The holding sign.
   * @return holdingSign
  **/
  @jakarta.annotation.Nullable
  public String getHoldingSign() {
    return holdingSign;
  }


  public void setHoldingSign(String holdingSign) {
    this.holdingSign = holdingSign;
  }


  public Bucket local(CurrencyAndAmount local) {
    
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
  **/
  @jakarta.annotation.Nullable
  public CurrencyAndAmount getLocal() {
    return local;
  }


  public void setLocal(CurrencyAndAmount local) {
    this.local = local;
  }


  public Bucket base(CurrencyAndAmount base) {
    
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @jakarta.annotation.Nullable
  public CurrencyAndAmount getBase() {
    return base;
  }


  public void setBase(CurrencyAndAmount base) {
    this.base = base;
  }


  public Bucket units(java.math.BigDecimal units) {
    
    this.units = units;
    return this;
  }

   /**
   * The units.
   * @return units
  **/
  @jakarta.annotation.Nullable
  public java.math.BigDecimal getUnits() {
    return units;
  }


  public void setUnits(java.math.BigDecimal units) {
    this.units = units;
  }


  public Bucket activityDate(OffsetDateTime activityDate) {
    
    this.activityDate = activityDate;
    return this;
  }

   /**
   * The activity date of the bucket.
   * @return activityDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getActivityDate() {
    return activityDate;
  }


  public void setActivityDate(OffsetDateTime activityDate) {
    this.activityDate = activityDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bucket bucket = (Bucket) o;
    return Objects.equals(this.taxLotId, bucket.taxLotId) &&
        Objects.equals(this.movementName, bucket.movementName) &&
        Objects.equals(this.holdingType, bucket.holdingType) &&
        Objects.equals(this.economicBucket, bucket.economicBucket) &&
        Objects.equals(this.economicBucketComponent, bucket.economicBucketComponent) &&
        Objects.equals(this.economicBucketVariant, bucket.economicBucketVariant) &&
        Objects.equals(this.holdingSign, bucket.holdingSign) &&
        Objects.equals(this.local, bucket.local) &&
        Objects.equals(this.base, bucket.base) &&
        (this.units.compareTo(bucket.getUnits()) == 0) &&
        Objects.equals(this.activityDate, bucket.activityDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxLotId, movementName, holdingType, economicBucket, economicBucketComponent, economicBucketVariant, holdingSign, local, base, units, activityDate);
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
    sb.append("class Bucket {\n");
    sb.append("    taxLotId: ").append(toIndentedString(taxLotId)).append("\n");
    sb.append("    movementName: ").append(toIndentedString(movementName)).append("\n");
    sb.append("    holdingType: ").append(toIndentedString(holdingType)).append("\n");
    sb.append("    economicBucket: ").append(toIndentedString(economicBucket)).append("\n");
    sb.append("    economicBucketComponent: ").append(toIndentedString(economicBucketComponent)).append("\n");
    sb.append("    economicBucketVariant: ").append(toIndentedString(economicBucketVariant)).append("\n");
    sb.append("    holdingSign: ").append(toIndentedString(holdingSign)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    activityDate: ").append(toIndentedString(activityDate)).append("\n");
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
    openapiFields.add("taxLotId");
    openapiFields.add("movementName");
    openapiFields.add("holdingType");
    openapiFields.add("economicBucket");
    openapiFields.add("economicBucketComponent");
    openapiFields.add("economicBucketVariant");
    openapiFields.add("holdingSign");
    openapiFields.add("local");
    openapiFields.add("base");
    openapiFields.add("units");
    openapiFields.add("activityDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Bucket
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Bucket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Bucket is not found in the empty JSON string", Bucket.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("taxLotId") != null && !jsonObj.get("taxLotId").isJsonNull()) && !jsonObj.get("taxLotId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxLotId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxLotId").toString()));
      }
      if ((jsonObj.get("movementName") != null && !jsonObj.get("movementName").isJsonNull()) && !jsonObj.get("movementName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `movementName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("movementName").toString()));
      }
      if ((jsonObj.get("holdingType") != null && !jsonObj.get("holdingType").isJsonNull()) && !jsonObj.get("holdingType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holdingType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holdingType").toString()));
      }
      if ((jsonObj.get("economicBucket") != null && !jsonObj.get("economicBucket").isJsonNull()) && !jsonObj.get("economicBucket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `economicBucket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("economicBucket").toString()));
      }
      if ((jsonObj.get("economicBucketComponent") != null && !jsonObj.get("economicBucketComponent").isJsonNull()) && !jsonObj.get("economicBucketComponent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `economicBucketComponent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("economicBucketComponent").toString()));
      }
      if ((jsonObj.get("economicBucketVariant") != null && !jsonObj.get("economicBucketVariant").isJsonNull()) && !jsonObj.get("economicBucketVariant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `economicBucketVariant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("economicBucketVariant").toString()));
      }
      if ((jsonObj.get("holdingSign") != null && !jsonObj.get("holdingSign").isJsonNull()) && !jsonObj.get("holdingSign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holdingSign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holdingSign").toString()));
      }
      // validate the optional field `local`
      if (jsonObj.get("local") != null && !jsonObj.get("local").isJsonNull()) {
        CurrencyAndAmount.validateJsonElement(jsonObj.get("local"));
      }
      // validate the optional field `base`
      if (jsonObj.get("base") != null && !jsonObj.get("base").isJsonNull()) {
        CurrencyAndAmount.validateJsonElement(jsonObj.get("base"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Bucket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Bucket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Bucket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Bucket.class));

       return (TypeAdapter<T>) new TypeAdapter<Bucket>() {
           @Override
           public void write(JsonWriter out, Bucket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Bucket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Bucket given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Bucket
  * @throws IOException if the JSON string is invalid with respect to Bucket
  */
  public static Bucket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Bucket.class);
  }

 /**
  * Convert an instance of Bucket to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
