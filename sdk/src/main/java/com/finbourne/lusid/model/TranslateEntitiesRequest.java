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
import com.finbourne.lusid.model.DialectId;
import com.finbourne.lusid.model.TranslationInput;
import com.finbourne.lusid.model.TranslationScriptId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * Request to translate financial entities with a specified script stored in LUSID,  specified in the request by its id. The output of the translation is validated against a dialect stored in LUSID,  again specified in the request by its id.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranslateEntitiesRequest {
  public static final String SERIALIZED_NAME_ENTITY_PAYLOADS = "entityPayloads";
  @SerializedName(SERIALIZED_NAME_ENTITY_PAYLOADS)
  private Map<String, TranslationInput> entityPayloads = new HashMap<>();

  public static final String SERIALIZED_NAME_SCRIPT_ID = "scriptId";
  @SerializedName(SERIALIZED_NAME_SCRIPT_ID)
  private TranslationScriptId scriptId;

  public static final String SERIALIZED_NAME_DIALECT_ID = "dialectId";
  @SerializedName(SERIALIZED_NAME_DIALECT_ID)
  private DialectId dialectId;

  public TranslateEntitiesRequest() {
  }

  public TranslateEntitiesRequest entityPayloads(Map<String, TranslationInput> entityPayloads) {
    
    this.entityPayloads = entityPayloads;
    return this;
  }

  public TranslateEntitiesRequest putEntityPayloadsItem(String key, TranslationInput entityPayloadsItem) {
    if (this.entityPayloads == null) {
      this.entityPayloads = new HashMap<>();
    }
    this.entityPayloads.put(key, entityPayloadsItem);
    return this;
  }

   /**
   * Entity payloads to be translated, indexed by (ephemeral) unique correlation ids.
   * @return entityPayloads
  **/
  @jakarta.annotation.Nonnull
  public Map<String, TranslationInput> getEntityPayloads() {
    return entityPayloads;
  }


  public void setEntityPayloads(Map<String, TranslationInput> entityPayloads) {
    this.entityPayloads = entityPayloads;
  }


  public TranslateEntitiesRequest scriptId(TranslationScriptId scriptId) {
    
    this.scriptId = scriptId;
    return this;
  }

   /**
   * Get scriptId
   * @return scriptId
  **/
  @jakarta.annotation.Nonnull
  public TranslationScriptId getScriptId() {
    return scriptId;
  }


  public void setScriptId(TranslationScriptId scriptId) {
    this.scriptId = scriptId;
  }


  public TranslateEntitiesRequest dialectId(DialectId dialectId) {
    
    this.dialectId = dialectId;
    return this;
  }

   /**
   * Get dialectId
   * @return dialectId
  **/
  @jakarta.annotation.Nullable
  public DialectId getDialectId() {
    return dialectId;
  }


  public void setDialectId(DialectId dialectId) {
    this.dialectId = dialectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateEntitiesRequest translateEntitiesRequest = (TranslateEntitiesRequest) o;
    return Objects.equals(this.entityPayloads, translateEntitiesRequest.entityPayloads) &&
        Objects.equals(this.scriptId, translateEntitiesRequest.scriptId) &&
        Objects.equals(this.dialectId, translateEntitiesRequest.dialectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityPayloads, scriptId, dialectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateEntitiesRequest {\n");
    sb.append("    entityPayloads: ").append(toIndentedString(entityPayloads)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    dialectId: ").append(toIndentedString(dialectId)).append("\n");
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
    openapiFields.add("entityPayloads");
    openapiFields.add("scriptId");
    openapiFields.add("dialectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entityPayloads");
    openapiRequiredFields.add("scriptId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TranslateEntitiesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TranslateEntitiesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TranslateEntitiesRequest is not found in the empty JSON string", TranslateEntitiesRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TranslateEntitiesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `scriptId`
      TranslationScriptId.validateJsonElement(jsonObj.get("scriptId"));
      // validate the optional field `dialectId`
      if (jsonObj.get("dialectId") != null && !jsonObj.get("dialectId").isJsonNull()) {
        DialectId.validateJsonElement(jsonObj.get("dialectId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TranslateEntitiesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TranslateEntitiesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TranslateEntitiesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TranslateEntitiesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TranslateEntitiesRequest>() {
           @Override
           public void write(JsonWriter out, TranslateEntitiesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TranslateEntitiesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TranslateEntitiesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TranslateEntitiesRequest
  * @throws IOException if the JSON string is invalid with respect to TranslateEntitiesRequest
  */
  public static TranslateEntitiesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TranslateEntitiesRequest.class);
  }

 /**
  * Convert an instance of TranslateEntitiesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
