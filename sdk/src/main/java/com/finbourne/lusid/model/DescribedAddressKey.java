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
 * An address key with additional data describing what this key is for.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DescribedAddressKey {
  public static final String SERIALIZED_NAME_ADDRESS_KEY = "addressKey";
  @SerializedName(SERIALIZED_NAME_ADDRESS_KEY)
  private String addressKey;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public DescribedAddressKey() {
  }

  public DescribedAddressKey addressKey(String addressKey) {
    
    this.addressKey = addressKey;
    return this;
  }

   /**
   * Address key of some underlying object e.g. Valuation/PV, Instrument/Features
   * @return addressKey
  **/
  @jakarta.annotation.Nullable
  public String getAddressKey() {
    return addressKey;
  }


  public void setAddressKey(String addressKey) {
    this.addressKey = addressKey;
  }


  public DescribedAddressKey description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the address key.
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribedAddressKey describedAddressKey = (DescribedAddressKey) o;
    return Objects.equals(this.addressKey, describedAddressKey.addressKey) &&
        Objects.equals(this.description, describedAddressKey.description);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressKey, description);
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
    sb.append("class DescribedAddressKey {\n");
    sb.append("    addressKey: ").append(toIndentedString(addressKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("addressKey");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DescribedAddressKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DescribedAddressKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribedAddressKey is not found in the empty JSON string", DescribedAddressKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DescribedAddressKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribedAddressKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("addressKey") != null && !jsonObj.get("addressKey").isJsonNull()) && !jsonObj.get("addressKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressKey").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribedAddressKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribedAddressKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribedAddressKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribedAddressKey.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribedAddressKey>() {
           @Override
           public void write(JsonWriter out, DescribedAddressKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribedAddressKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DescribedAddressKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DescribedAddressKey
  * @throws IOException if the JSON string is invalid with respect to DescribedAddressKey
  */
  public static DescribedAddressKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribedAddressKey.class);
  }

 /**
  * Convert an instance of DescribedAddressKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}