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
import com.finbourne.lusid.model.DateAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * CalendarDate
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CalendarDate {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_DATE_IDENTIFIER = "dateIdentifier";
  @SerializedName(SERIALIZED_NAME_DATE_IDENTIFIER)
  private String dateIdentifier;

  public static final String SERIALIZED_NAME_FROM_UTC = "fromUtc";
  @SerializedName(SERIALIZED_NAME_FROM_UTC)
  private OffsetDateTime fromUtc;

  public static final String SERIALIZED_NAME_TO_UTC = "toUtc";
  @SerializedName(SERIALIZED_NAME_TO_UTC)
  private OffsetDateTime toUtc;

  public static final String SERIALIZED_NAME_LOCAL_DATE = "localDate";
  @SerializedName(SERIALIZED_NAME_LOCAL_DATE)
  private String _localDate;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private DateAttributes attributes;

  public static final String SERIALIZED_NAME_SOURCE_DATA = "sourceData";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATA)
  private Map<String, String> sourceData;

  public CalendarDate() {
  }

  public CalendarDate href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @jakarta.annotation.Nullable
  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public CalendarDate dateIdentifier(String dateIdentifier) {
    
    this.dateIdentifier = dateIdentifier;
    return this;
  }

   /**
   * Get dateIdentifier
   * @return dateIdentifier
  **/
  @jakarta.annotation.Nonnull
  public String getDateIdentifier() {
    return dateIdentifier;
  }


  public void setDateIdentifier(String dateIdentifier) {
    this.dateIdentifier = dateIdentifier;
  }


  public CalendarDate fromUtc(OffsetDateTime fromUtc) {
    
    this.fromUtc = fromUtc;
    return this;
  }

   /**
   * Get fromUtc
   * @return fromUtc
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getFromUtc() {
    return fromUtc;
  }


  public void setFromUtc(OffsetDateTime fromUtc) {
    this.fromUtc = fromUtc;
  }


  public CalendarDate toUtc(OffsetDateTime toUtc) {
    
    this.toUtc = toUtc;
    return this;
  }

   /**
   * Get toUtc
   * @return toUtc
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getToUtc() {
    return toUtc;
  }


  public void setToUtc(OffsetDateTime toUtc) {
    this.toUtc = toUtc;
  }


  public CalendarDate _localDate(String _localDate) {
    
    this._localDate = _localDate;
    return this;
  }

   /**
   * Get _localDate
   * @return _localDate
  **/
  @jakarta.annotation.Nonnull
  public String getLocalDate() {
    return _localDate;
  }


  public void setLocalDate(String _localDate) {
    this._localDate = _localDate;
  }


  public CalendarDate timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @jakarta.annotation.Nonnull
  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public CalendarDate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CalendarDate type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CalendarDate attributes(DateAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  public DateAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(DateAttributes attributes) {
    this.attributes = attributes;
  }


  public CalendarDate sourceData(Map<String, String> sourceData) {
    
    this.sourceData = sourceData;
    return this;
  }

  public CalendarDate putSourceDataItem(String key, String sourceDataItem) {
    if (this.sourceData == null) {
      this.sourceData = new HashMap<>();
    }
    this.sourceData.put(key, sourceDataItem);
    return this;
  }

   /**
   * Get sourceData
   * @return sourceData
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getSourceData() {
    return sourceData;
  }


  public void setSourceData(Map<String, String> sourceData) {
    this.sourceData = sourceData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarDate calendarDate = (CalendarDate) o;
    return Objects.equals(this.href, calendarDate.href) &&
        Objects.equals(this.dateIdentifier, calendarDate.dateIdentifier) &&
        Objects.equals(this.fromUtc, calendarDate.fromUtc) &&
        Objects.equals(this.toUtc, calendarDate.toUtc) &&
        Objects.equals(this._localDate, calendarDate._localDate) &&
        Objects.equals(this.timezone, calendarDate.timezone) &&
        Objects.equals(this.description, calendarDate.description) &&
        Objects.equals(this.type, calendarDate.type) &&
        Objects.equals(this.attributes, calendarDate.attributes) &&
        Objects.equals(this.sourceData, calendarDate.sourceData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, dateIdentifier, fromUtc, toUtc, _localDate, timezone, description, type, attributes, sourceData);
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
    sb.append("class CalendarDate {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    dateIdentifier: ").append(toIndentedString(dateIdentifier)).append("\n");
    sb.append("    fromUtc: ").append(toIndentedString(fromUtc)).append("\n");
    sb.append("    toUtc: ").append(toIndentedString(toUtc)).append("\n");
    sb.append("    _localDate: ").append(toIndentedString(_localDate)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    sourceData: ").append(toIndentedString(sourceData)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("dateIdentifier");
    openapiFields.add("fromUtc");
    openapiFields.add("toUtc");
    openapiFields.add("localDate");
    openapiFields.add("timezone");
    openapiFields.add("description");
    openapiFields.add("type");
    openapiFields.add("attributes");
    openapiFields.add("sourceData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dateIdentifier");
    openapiRequiredFields.add("fromUtc");
    openapiRequiredFields.add("toUtc");
    openapiRequiredFields.add("localDate");
    openapiRequiredFields.add("timezone");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CalendarDate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CalendarDate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalendarDate is not found in the empty JSON string", CalendarDate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CalendarDate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (!jsonObj.get("dateIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateIdentifier").toString()));
      }
      if (!jsonObj.get("localDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localDate").toString()));
      }
      if (!jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `attributes`
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        DateAttributes.validateJsonElement(jsonObj.get("attributes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CalendarDate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalendarDate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalendarDate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalendarDate.class));

       return (TypeAdapter<T>) new TypeAdapter<CalendarDate>() {
           @Override
           public void write(JsonWriter out, CalendarDate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CalendarDate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CalendarDate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CalendarDate
  * @throws IOException if the JSON string is invalid with respect to CalendarDate
  */
  public static CalendarDate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalendarDate.class);
  }

 /**
  * Convert an instance of CalendarDate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
