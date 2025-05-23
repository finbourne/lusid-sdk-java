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
import com.finbourne.lusid.model.ErrorDetail;
import com.finbourne.lusid.model.InstrumentEventInstruction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * The collection of successfully upserted instructions, and the collection of failures for those instructions that could not be upserted
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstrumentEventInstructionsResponse {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private Map<String, InstrumentEventInstruction> values;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Map<String, ErrorDetail> failed;

  public InstrumentEventInstructionsResponse() {
  }

  public InstrumentEventInstructionsResponse values(Map<String, InstrumentEventInstruction> values) {
    
    this.values = values;
    return this;
  }

  public InstrumentEventInstructionsResponse putValuesItem(String key, InstrumentEventInstruction valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

   /**
   * The collection of successfully upserted instructions
   * @return values
  **/
  @jakarta.annotation.Nullable
  public Map<String, InstrumentEventInstruction> getValues() {
    return values;
  }


  public void setValues(Map<String, InstrumentEventInstruction> values) {
    this.values = values;
  }


  public InstrumentEventInstructionsResponse failed(Map<String, ErrorDetail> failed) {
    
    this.failed = failed;
    return this;
  }

  public InstrumentEventInstructionsResponse putFailedItem(String key, ErrorDetail failedItem) {
    if (this.failed == null) {
      this.failed = new HashMap<>();
    }
    this.failed.put(key, failedItem);
    return this;
  }

   /**
   * The collection of error information for instructions that could not be upserted
   * @return failed
  **/
  @jakarta.annotation.Nullable
  public Map<String, ErrorDetail> getFailed() {
    return failed;
  }


  public void setFailed(Map<String, ErrorDetail> failed) {
    this.failed = failed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentEventInstructionsResponse instrumentEventInstructionsResponse = (InstrumentEventInstructionsResponse) o;
    return Objects.equals(this.values, instrumentEventInstructionsResponse.values) &&
        Objects.equals(this.failed, instrumentEventInstructionsResponse.failed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, failed);
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
    sb.append("class InstrumentEventInstructionsResponse {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
    openapiFields.add("values");
    openapiFields.add("failed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstrumentEventInstructionsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InstrumentEventInstructionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstrumentEventInstructionsResponse is not found in the empty JSON string", InstrumentEventInstructionsResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstrumentEventInstructionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstrumentEventInstructionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstrumentEventInstructionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstrumentEventInstructionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InstrumentEventInstructionsResponse>() {
           @Override
           public void write(JsonWriter out, InstrumentEventInstructionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstrumentEventInstructionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstrumentEventInstructionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstrumentEventInstructionsResponse
  * @throws IOException if the JSON string is invalid with respect to InstrumentEventInstructionsResponse
  */
  public static InstrumentEventInstructionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstrumentEventInstructionsResponse.class);
  }

 /**
  * Convert an instance of InstrumentEventInstructionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
