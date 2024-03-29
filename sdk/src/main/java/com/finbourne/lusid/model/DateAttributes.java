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
 * DateAttributes
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DateAttributes {
  public static final String SERIALIZED_NAME_IRREGULAR = "irregular";
  @SerializedName(SERIALIZED_NAME_IRREGULAR)
  private Boolean irregular;

  public static final String SERIALIZED_NAME_IRREGULAR_SESSION = "irregularSession";
  @SerializedName(SERIALIZED_NAME_IRREGULAR_SESSION)
  private Boolean irregularSession;

  public static final String SERIALIZED_NAME_NEW_HOURS = "newHours";
  @SerializedName(SERIALIZED_NAME_NEW_HOURS)
  private Boolean newHours;

  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private String activity;

  public static final String SERIALIZED_NAME_FIRST_OPEN = "firstOpen";
  @SerializedName(SERIALIZED_NAME_FIRST_OPEN)
  private String firstOpen;

  public static final String SERIALIZED_NAME_LAST_OPEN = "lastOpen";
  @SerializedName(SERIALIZED_NAME_LAST_OPEN)
  private String lastOpen;

  public static final String SERIALIZED_NAME_FIRST_CLOSE = "firstClose";
  @SerializedName(SERIALIZED_NAME_FIRST_CLOSE)
  private String firstClose;

  public static final String SERIALIZED_NAME_LAST_CLOSE = "lastClose";
  @SerializedName(SERIALIZED_NAME_LAST_CLOSE)
  private String lastClose;

  public DateAttributes() {
  }

  public DateAttributes irregular(Boolean irregular) {
    
    this.irregular = irregular;
    return this;
  }

   /**
   * Get irregular
   * @return irregular
  **/
  @jakarta.annotation.Nonnull
  public Boolean getIrregular() {
    return irregular;
  }


  public void setIrregular(Boolean irregular) {
    this.irregular = irregular;
  }


  public DateAttributes irregularSession(Boolean irregularSession) {
    
    this.irregularSession = irregularSession;
    return this;
  }

   /**
   * Get irregularSession
   * @return irregularSession
  **/
  @jakarta.annotation.Nonnull
  public Boolean getIrregularSession() {
    return irregularSession;
  }


  public void setIrregularSession(Boolean irregularSession) {
    this.irregularSession = irregularSession;
  }


  public DateAttributes newHours(Boolean newHours) {
    
    this.newHours = newHours;
    return this;
  }

   /**
   * Get newHours
   * @return newHours
  **/
  @jakarta.annotation.Nonnull
  public Boolean getNewHours() {
    return newHours;
  }


  public void setNewHours(Boolean newHours) {
    this.newHours = newHours;
  }


  public DateAttributes activity(String activity) {
    
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @jakarta.annotation.Nullable
  public String getActivity() {
    return activity;
  }


  public void setActivity(String activity) {
    this.activity = activity;
  }


  public DateAttributes firstOpen(String firstOpen) {
    
    this.firstOpen = firstOpen;
    return this;
  }

   /**
   * Get firstOpen
   * @return firstOpen
  **/
  @jakarta.annotation.Nullable
  public String getFirstOpen() {
    return firstOpen;
  }


  public void setFirstOpen(String firstOpen) {
    this.firstOpen = firstOpen;
  }


  public DateAttributes lastOpen(String lastOpen) {
    
    this.lastOpen = lastOpen;
    return this;
  }

   /**
   * Get lastOpen
   * @return lastOpen
  **/
  @jakarta.annotation.Nullable
  public String getLastOpen() {
    return lastOpen;
  }


  public void setLastOpen(String lastOpen) {
    this.lastOpen = lastOpen;
  }


  public DateAttributes firstClose(String firstClose) {
    
    this.firstClose = firstClose;
    return this;
  }

   /**
   * Get firstClose
   * @return firstClose
  **/
  @jakarta.annotation.Nullable
  public String getFirstClose() {
    return firstClose;
  }


  public void setFirstClose(String firstClose) {
    this.firstClose = firstClose;
  }


  public DateAttributes lastClose(String lastClose) {
    
    this.lastClose = lastClose;
    return this;
  }

   /**
   * Get lastClose
   * @return lastClose
  **/
  @jakarta.annotation.Nullable
  public String getLastClose() {
    return lastClose;
  }


  public void setLastClose(String lastClose) {
    this.lastClose = lastClose;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateAttributes dateAttributes = (DateAttributes) o;
    return Objects.equals(this.irregular, dateAttributes.irregular) &&
        Objects.equals(this.irregularSession, dateAttributes.irregularSession) &&
        Objects.equals(this.newHours, dateAttributes.newHours) &&
        Objects.equals(this.activity, dateAttributes.activity) &&
        Objects.equals(this.firstOpen, dateAttributes.firstOpen) &&
        Objects.equals(this.lastOpen, dateAttributes.lastOpen) &&
        Objects.equals(this.firstClose, dateAttributes.firstClose) &&
        Objects.equals(this.lastClose, dateAttributes.lastClose);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(irregular, irregularSession, newHours, activity, firstOpen, lastOpen, firstClose, lastClose);
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
    sb.append("class DateAttributes {\n");
    sb.append("    irregular: ").append(toIndentedString(irregular)).append("\n");
    sb.append("    irregularSession: ").append(toIndentedString(irregularSession)).append("\n");
    sb.append("    newHours: ").append(toIndentedString(newHours)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    firstOpen: ").append(toIndentedString(firstOpen)).append("\n");
    sb.append("    lastOpen: ").append(toIndentedString(lastOpen)).append("\n");
    sb.append("    firstClose: ").append(toIndentedString(firstClose)).append("\n");
    sb.append("    lastClose: ").append(toIndentedString(lastClose)).append("\n");
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
    openapiFields.add("irregular");
    openapiFields.add("irregularSession");
    openapiFields.add("newHours");
    openapiFields.add("activity");
    openapiFields.add("firstOpen");
    openapiFields.add("lastOpen");
    openapiFields.add("firstClose");
    openapiFields.add("lastClose");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("irregular");
    openapiRequiredFields.add("irregularSession");
    openapiRequiredFields.add("newHours");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DateAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DateAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DateAttributes is not found in the empty JSON string", DateAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DateAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("activity") != null && !jsonObj.get("activity").isJsonNull()) && !jsonObj.get("activity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity").toString()));
      }
      if ((jsonObj.get("firstOpen") != null && !jsonObj.get("firstOpen").isJsonNull()) && !jsonObj.get("firstOpen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstOpen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstOpen").toString()));
      }
      if ((jsonObj.get("lastOpen") != null && !jsonObj.get("lastOpen").isJsonNull()) && !jsonObj.get("lastOpen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastOpen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastOpen").toString()));
      }
      if ((jsonObj.get("firstClose") != null && !jsonObj.get("firstClose").isJsonNull()) && !jsonObj.get("firstClose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstClose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstClose").toString()));
      }
      if ((jsonObj.get("lastClose") != null && !jsonObj.get("lastClose").isJsonNull()) && !jsonObj.get("lastClose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastClose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastClose").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DateAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DateAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DateAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DateAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<DateAttributes>() {
           @Override
           public void write(JsonWriter out, DateAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DateAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DateAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DateAttributes
  * @throws IOException if the JSON string is invalid with respect to DateAttributes
  */
  public static DateAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DateAttributes.class);
  }

 /**
  * Convert an instance of DateAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
