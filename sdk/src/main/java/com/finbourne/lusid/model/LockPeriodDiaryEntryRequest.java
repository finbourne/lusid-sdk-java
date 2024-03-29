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
 * A definition for the period you wish to lock
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LockPeriodDiaryEntryRequest {
  public static final String SERIALIZED_NAME_DIARY_ENTRY_CODE = "diaryEntryCode";
  @SerializedName(SERIALIZED_NAME_DIARY_ENTRY_CODE)
  private String diaryEntryCode;

  public static final String SERIALIZED_NAME_CLOSING_OPTIONS = "closingOptions";
  @SerializedName(SERIALIZED_NAME_CLOSING_OPTIONS)
  private List<String> closingOptions;

  public LockPeriodDiaryEntryRequest() {
  }

  public LockPeriodDiaryEntryRequest diaryEntryCode(String diaryEntryCode) {
    
    this.diaryEntryCode = diaryEntryCode;
    return this;
  }

   /**
   * Unique code assigned to a period. When left blank last closed period will be located.
   * @return diaryEntryCode
  **/
  @jakarta.annotation.Nullable
  public String getDiaryEntryCode() {
    return diaryEntryCode;
  }


  public void setDiaryEntryCode(String diaryEntryCode) {
    this.diaryEntryCode = diaryEntryCode;
  }


  public LockPeriodDiaryEntryRequest closingOptions(List<String> closingOptions) {
    
    this.closingOptions = closingOptions;
    return this;
  }

  public LockPeriodDiaryEntryRequest addClosingOptionsItem(String closingOptionsItem) {
    if (this.closingOptions == null) {
      this.closingOptions = new ArrayList<>();
    }
    this.closingOptions.add(closingOptionsItem);
    return this;
  }

   /**
   * The options which will be executed once a period is closed or locked.
   * @return closingOptions
  **/
  @jakarta.annotation.Nullable
  public List<String> getClosingOptions() {
    return closingOptions;
  }


  public void setClosingOptions(List<String> closingOptions) {
    this.closingOptions = closingOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockPeriodDiaryEntryRequest lockPeriodDiaryEntryRequest = (LockPeriodDiaryEntryRequest) o;
    return Objects.equals(this.diaryEntryCode, lockPeriodDiaryEntryRequest.diaryEntryCode) &&
        Objects.equals(this.closingOptions, lockPeriodDiaryEntryRequest.closingOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(diaryEntryCode, closingOptions);
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
    sb.append("class LockPeriodDiaryEntryRequest {\n");
    sb.append("    diaryEntryCode: ").append(toIndentedString(diaryEntryCode)).append("\n");
    sb.append("    closingOptions: ").append(toIndentedString(closingOptions)).append("\n");
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
    openapiFields.add("diaryEntryCode");
    openapiFields.add("closingOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LockPeriodDiaryEntryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LockPeriodDiaryEntryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LockPeriodDiaryEntryRequest is not found in the empty JSON string", LockPeriodDiaryEntryRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("diaryEntryCode") != null && !jsonObj.get("diaryEntryCode").isJsonNull()) && !jsonObj.get("diaryEntryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diaryEntryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diaryEntryCode").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("closingOptions") != null && !jsonObj.get("closingOptions").isJsonNull() && !jsonObj.get("closingOptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `closingOptions` to be an array in the JSON string but got `%s`", jsonObj.get("closingOptions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LockPeriodDiaryEntryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LockPeriodDiaryEntryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LockPeriodDiaryEntryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LockPeriodDiaryEntryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LockPeriodDiaryEntryRequest>() {
           @Override
           public void write(JsonWriter out, LockPeriodDiaryEntryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LockPeriodDiaryEntryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LockPeriodDiaryEntryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LockPeriodDiaryEntryRequest
  * @throws IOException if the JSON string is invalid with respect to LockPeriodDiaryEntryRequest
  */
  public static LockPeriodDiaryEntryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LockPeriodDiaryEntryRequest.class);
  }

 /**
  * Convert an instance of LockPeriodDiaryEntryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
