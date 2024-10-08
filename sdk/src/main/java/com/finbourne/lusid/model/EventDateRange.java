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
 * A standard representation of the effective date range for the event, used for display, filtering and windowing use cases.  The start and end values for the eventDateRange are mapped from the particular dates contained within the specific  InstrumentEvent schema. Note that the start and end values may be identical for some types of events.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventDateRange {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;

  public EventDateRange() {
  }

  public EventDateRange start(OffsetDateTime start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public EventDateRange end(OffsetDateTime end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDateRange eventDateRange = (EventDateRange) o;
    return Objects.equals(this.start, eventDateRange.start) &&
        Objects.equals(this.end, eventDateRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDateRange {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("end");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventDateRange
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventDateRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventDateRange is not found in the empty JSON string", EventDateRange.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventDateRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventDateRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventDateRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventDateRange.class));

       return (TypeAdapter<T>) new TypeAdapter<EventDateRange>() {
           @Override
           public void write(JsonWriter out, EventDateRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventDateRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventDateRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventDateRange
  * @throws IOException if the JSON string is invalid with respect to EventDateRange
  */
  public static EventDateRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventDateRange.class);
  }

 /**
  * Convert an instance of EventDateRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
