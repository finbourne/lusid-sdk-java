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
 * GroupReconciliationDatePair
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupReconciliationDatePair {
  public static final String SERIALIZED_NAME_EFFECTIVE_AT = "effectiveAt";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT)
  private OffsetDateTime effectiveAt;

  public static final String SERIALIZED_NAME_AS_AT = "asAt";
  @SerializedName(SERIALIZED_NAME_AS_AT)
  private OffsetDateTime asAt;

  public GroupReconciliationDatePair() {
  }

  public GroupReconciliationDatePair effectiveAt(OffsetDateTime effectiveAt) {
    
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * The effective at date for the reconciliation
   * @return effectiveAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getEffectiveAt() {
    return effectiveAt;
  }


  public void setEffectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  public GroupReconciliationDatePair asAt(OffsetDateTime asAt) {
    
    this.asAt = asAt;
    return this;
  }

   /**
   * The as at date for the reconciliation
   * @return asAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAsAt() {
    return asAt;
  }


  public void setAsAt(OffsetDateTime asAt) {
    this.asAt = asAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupReconciliationDatePair groupReconciliationDatePair = (GroupReconciliationDatePair) o;
    return Objects.equals(this.effectiveAt, groupReconciliationDatePair.effectiveAt) &&
        Objects.equals(this.asAt, groupReconciliationDatePair.asAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveAt, asAt);
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
    sb.append("class GroupReconciliationDatePair {\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    asAt: ").append(toIndentedString(asAt)).append("\n");
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
    openapiFields.add("effectiveAt");
    openapiFields.add("asAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupReconciliationDatePair
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupReconciliationDatePair.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupReconciliationDatePair is not found in the empty JSON string", GroupReconciliationDatePair.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupReconciliationDatePair.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupReconciliationDatePair' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupReconciliationDatePair> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupReconciliationDatePair.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupReconciliationDatePair>() {
           @Override
           public void write(JsonWriter out, GroupReconciliationDatePair value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupReconciliationDatePair read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupReconciliationDatePair given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupReconciliationDatePair
  * @throws IOException if the JSON string is invalid with respect to GroupReconciliationDatePair
  */
  public static GroupReconciliationDatePair fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupReconciliationDatePair.class);
  }

 /**
  * Convert an instance of GroupReconciliationDatePair to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
