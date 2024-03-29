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
import com.finbourne.lusid.model.DialectSchema;
import com.finbourne.lusid.model.TranslationInput;
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
 * Request to translate financial entities with a given script body.  The output of the translation is validated against a schema specified in the request.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranslateEntitiesInlinedRequest {
  public static final String SERIALIZED_NAME_ENTITY_PAYLOADS = "entityPayloads";
  @SerializedName(SERIALIZED_NAME_ENTITY_PAYLOADS)
  private Map<String, TranslationInput> entityPayloads = new HashMap<>();

  public static final String SERIALIZED_NAME_SCRIPT_BODY = "scriptBody";
  @SerializedName(SERIALIZED_NAME_SCRIPT_BODY)
  private String scriptBody;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private DialectSchema schema;

  public TranslateEntitiesInlinedRequest() {
  }

  public TranslateEntitiesInlinedRequest entityPayloads(Map<String, TranslationInput> entityPayloads) {
    
    this.entityPayloads = entityPayloads;
    return this;
  }

  public TranslateEntitiesInlinedRequest putEntityPayloadsItem(String key, TranslationInput entityPayloadsItem) {
    if (this.entityPayloads == null) {
      this.entityPayloads = new HashMap<>();
    }
    this.entityPayloads.put(key, entityPayloadsItem);
    return this;
  }

   /**
   * Entity payloads to be translated indexed by (ephemeral) unique correlation ids.
   * @return entityPayloads
  **/
  @jakarta.annotation.Nonnull
  public Map<String, TranslationInput> getEntityPayloads() {
    return entityPayloads;
  }


  public void setEntityPayloads(Map<String, TranslationInput> entityPayloads) {
    this.entityPayloads = entityPayloads;
  }


  public TranslateEntitiesInlinedRequest scriptBody(String scriptBody) {
    
    this.scriptBody = scriptBody;
    return this;
  }

   /**
   * The body of the translation script to use for translating the entities.
   * @return scriptBody
  **/
  @jakarta.annotation.Nonnull
  public String getScriptBody() {
    return scriptBody;
  }


  public void setScriptBody(String scriptBody) {
    this.scriptBody = scriptBody;
  }


  public TranslateEntitiesInlinedRequest schema(DialectSchema schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @jakarta.annotation.Nullable
  public DialectSchema getSchema() {
    return schema;
  }


  public void setSchema(DialectSchema schema) {
    this.schema = schema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateEntitiesInlinedRequest translateEntitiesInlinedRequest = (TranslateEntitiesInlinedRequest) o;
    return Objects.equals(this.entityPayloads, translateEntitiesInlinedRequest.entityPayloads) &&
        Objects.equals(this.scriptBody, translateEntitiesInlinedRequest.scriptBody) &&
        Objects.equals(this.schema, translateEntitiesInlinedRequest.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityPayloads, scriptBody, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateEntitiesInlinedRequest {\n");
    sb.append("    entityPayloads: ").append(toIndentedString(entityPayloads)).append("\n");
    sb.append("    scriptBody: ").append(toIndentedString(scriptBody)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
    openapiFields.add("scriptBody");
    openapiFields.add("schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entityPayloads");
    openapiRequiredFields.add("scriptBody");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TranslateEntitiesInlinedRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TranslateEntitiesInlinedRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TranslateEntitiesInlinedRequest is not found in the empty JSON string", TranslateEntitiesInlinedRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TranslateEntitiesInlinedRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("scriptBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scriptBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scriptBody").toString()));
      }
      // validate the optional field `schema`
      if (jsonObj.get("schema") != null && !jsonObj.get("schema").isJsonNull()) {
        DialectSchema.validateJsonElement(jsonObj.get("schema"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TranslateEntitiesInlinedRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TranslateEntitiesInlinedRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TranslateEntitiesInlinedRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TranslateEntitiesInlinedRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TranslateEntitiesInlinedRequest>() {
           @Override
           public void write(JsonWriter out, TranslateEntitiesInlinedRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TranslateEntitiesInlinedRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TranslateEntitiesInlinedRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TranslateEntitiesInlinedRequest
  * @throws IOException if the JSON string is invalid with respect to TranslateEntitiesInlinedRequest
  */
  public static TranslateEntitiesInlinedRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TranslateEntitiesInlinedRequest.class);
  }

 /**
  * Convert an instance of TranslateEntitiesInlinedRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
