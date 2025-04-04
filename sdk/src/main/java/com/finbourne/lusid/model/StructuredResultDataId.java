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
 * An identifier that uniquely describes an item of structured result data such as the risk to an interest curve or a set of yields or analytics on an index.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StructuredResultDataId {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EFFECTIVE_AT = "effectiveAt";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT)
  private String effectiveAt;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "resultType";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  private String resultType;

  public StructuredResultDataId() {
  }

  public StructuredResultDataId source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The platform or vendor that provided the structured result data, e.g. &#39;client&#39;. This is primarily of interest when data could have been sourced from multiple sources
   * @return source
  **/
  @jakarta.annotation.Nonnull
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public StructuredResultDataId code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The identifier for the entity that this id describes. It could be an index, instrument or other form of structured data
   * @return code
  **/
  @jakarta.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public StructuredResultDataId effectiveAt(String effectiveAt) {
    
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * The effectiveAt or cut label that this item of structured result data is/was updated/inserted with.
   * @return effectiveAt
  **/
  @jakarta.annotation.Nullable
  public String getEffectiveAt() {
    return effectiveAt;
  }


  public void setEffectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  public StructuredResultDataId resultType(String resultType) {
    
    this.resultType = resultType;
    return this;
  }

   /**
   * An identifier that denotes the class of data that the id points to. This is not the same as the format, but a more generic identifier such as &#39;risk result&#39;, &#39;cashflow&#39;, &#39;index&#39; or similar.
   * @return resultType
  **/
  @jakarta.annotation.Nullable
  public String getResultType() {
    return resultType;
  }


  public void setResultType(String resultType) {
    this.resultType = resultType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredResultDataId structuredResultDataId = (StructuredResultDataId) o;
    return Objects.equals(this.source, structuredResultDataId.source) &&
        Objects.equals(this.code, structuredResultDataId.code) &&
        Objects.equals(this.effectiveAt, structuredResultDataId.effectiveAt) &&
        Objects.equals(this.resultType, structuredResultDataId.resultType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, code, effectiveAt, resultType);
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
    sb.append("class StructuredResultDataId {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
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
    openapiFields.add("source");
    openapiFields.add("code");
    openapiFields.add("effectiveAt");
    openapiFields.add("resultType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StructuredResultDataId
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StructuredResultDataId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructuredResultDataId is not found in the empty JSON string", StructuredResultDataId.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StructuredResultDataId.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("effectiveAt") != null && !jsonObj.get("effectiveAt").isJsonNull()) && !jsonObj.get("effectiveAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveAt").toString()));
      }
      if ((jsonObj.get("resultType") != null && !jsonObj.get("resultType").isJsonNull()) && !jsonObj.get("resultType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructuredResultDataId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructuredResultDataId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructuredResultDataId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructuredResultDataId.class));

       return (TypeAdapter<T>) new TypeAdapter<StructuredResultDataId>() {
           @Override
           public void write(JsonWriter out, StructuredResultDataId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructuredResultDataId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructuredResultDataId given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructuredResultDataId
  * @throws IOException if the JSON string is invalid with respect to StructuredResultDataId
  */
  public static StructuredResultDataId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructuredResultDataId.class);
  }

 /**
  * Convert an instance of StructuredResultDataId to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
