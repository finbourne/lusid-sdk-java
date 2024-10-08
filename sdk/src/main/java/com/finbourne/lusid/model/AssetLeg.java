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
import com.finbourne.lusid.model.LusidInstrument;
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
 * The underlying instrument representing one side of the TRS and its pay-receive direction.     Note that TRS currently only supports an asset of Bond or ComplexBond, no other instruments are allowed.  Support for additional instrument types will be added in the future.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetLeg {
  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private LusidInstrument asset;

  public static final String SERIALIZED_NAME_PAY_RECEIVE = "payReceive";
  @SerializedName(SERIALIZED_NAME_PAY_RECEIVE)
  private String payReceive;

  public AssetLeg() {
  }

  public AssetLeg asset(LusidInstrument asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  public LusidInstrument getAsset() {
    return asset;
  }


  public void setAsset(LusidInstrument asset) {
    this.asset = asset;
  }


  public AssetLeg payReceive(String payReceive) {
    
    this.payReceive = payReceive;
    return this;
  }

   /**
   * Either Pay or Receive stating direction of the asset in the swap.    Supported string (enumeration) values are: [Pay, Receive].
   * @return payReceive
  **/
  @jakarta.annotation.Nonnull
  public String getPayReceive() {
    return payReceive;
  }


  public void setPayReceive(String payReceive) {
    this.payReceive = payReceive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetLeg assetLeg = (AssetLeg) o;
    return Objects.equals(this.asset, assetLeg.asset) &&
        Objects.equals(this.payReceive, assetLeg.payReceive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, payReceive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetLeg {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    payReceive: ").append(toIndentedString(payReceive)).append("\n");
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
    openapiFields.add("asset");
    openapiFields.add("payReceive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asset");
    openapiRequiredFields.add("payReceive");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AssetLeg
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssetLeg.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetLeg is not found in the empty JSON string", AssetLeg.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssetLeg.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `asset`
      LusidInstrument.validateJsonElement(jsonObj.get("asset"));
      if (!jsonObj.get("payReceive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payReceive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payReceive").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetLeg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetLeg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetLeg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetLeg.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetLeg>() {
           @Override
           public void write(JsonWriter out, AssetLeg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetLeg read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetLeg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetLeg
  * @throws IOException if the JSON string is invalid with respect to AssetLeg
  */
  public static AssetLeg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetLeg.class);
  }

 /**
  * Convert an instance of AssetLeg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
