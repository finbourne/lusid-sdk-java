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
 * Represents a set of diagnostics per generatedEvent, where applicable.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GeneratedEventDiagnostics {
  public static final String SERIALIZED_NAME_INSTRUMENT_EVENT_ID = "instrumentEventId";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_EVENT_ID)
  private String instrumentEventId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private List<String> errorDetails = new ArrayList<>();

  public GeneratedEventDiagnostics() {
  }

  public GeneratedEventDiagnostics instrumentEventId(String instrumentEventId) {
    
    this.instrumentEventId = instrumentEventId;
    return this;
  }

   /**
   * Get instrumentEventId
   * @return instrumentEventId
  **/
  @jakarta.annotation.Nonnull
  public String getInstrumentEventId() {
    return instrumentEventId;
  }


  public void setInstrumentEventId(String instrumentEventId) {
    this.instrumentEventId = instrumentEventId;
  }


  public GeneratedEventDiagnostics type(String type) {
    
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


  public GeneratedEventDiagnostics detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @jakarta.annotation.Nonnull
  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public GeneratedEventDiagnostics errorDetails(List<String> errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

  public GeneratedEventDiagnostics addErrorDetailsItem(String errorDetailsItem) {
    if (this.errorDetails == null) {
      this.errorDetails = new ArrayList<>();
    }
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @jakarta.annotation.Nonnull
  public List<String> getErrorDetails() {
    return errorDetails;
  }


  public void setErrorDetails(List<String> errorDetails) {
    this.errorDetails = errorDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratedEventDiagnostics generatedEventDiagnostics = (GeneratedEventDiagnostics) o;
    return Objects.equals(this.instrumentEventId, generatedEventDiagnostics.instrumentEventId) &&
        Objects.equals(this.type, generatedEventDiagnostics.type) &&
        Objects.equals(this.detail, generatedEventDiagnostics.detail) &&
        Objects.equals(this.errorDetails, generatedEventDiagnostics.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentEventId, type, detail, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratedEventDiagnostics {\n");
    sb.append("    instrumentEventId: ").append(toIndentedString(instrumentEventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
    openapiFields.add("instrumentEventId");
    openapiFields.add("type");
    openapiFields.add("detail");
    openapiFields.add("errorDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instrumentEventId");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("detail");
    openapiRequiredFields.add("errorDetails");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GeneratedEventDiagnostics
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GeneratedEventDiagnostics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeneratedEventDiagnostics is not found in the empty JSON string", GeneratedEventDiagnostics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GeneratedEventDiagnostics.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("instrumentEventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrumentEventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrumentEventId").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("errorDetails") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("errorDetails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be an array in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeneratedEventDiagnostics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeneratedEventDiagnostics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeneratedEventDiagnostics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeneratedEventDiagnostics.class));

       return (TypeAdapter<T>) new TypeAdapter<GeneratedEventDiagnostics>() {
           @Override
           public void write(JsonWriter out, GeneratedEventDiagnostics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GeneratedEventDiagnostics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GeneratedEventDiagnostics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GeneratedEventDiagnostics
  * @throws IOException if the JSON string is invalid with respect to GeneratedEventDiagnostics
  */
  public static GeneratedEventDiagnostics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeneratedEventDiagnostics.class);
  }

 /**
  * Convert an instance of GeneratedEventDiagnostics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
