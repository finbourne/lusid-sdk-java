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
 * DeleteRelationRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeleteRelationRequest {
  public static final String SERIALIZED_NAME_SOURCE_ENTITY_ID = "sourceEntityId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ENTITY_ID)
  private Map<String, String> sourceEntityId = new HashMap<>();

  public static final String SERIALIZED_NAME_TARGET_ENTITY_ID = "targetEntityId";
  @SerializedName(SERIALIZED_NAME_TARGET_ENTITY_ID)
  private Map<String, String> targetEntityId = new HashMap<>();

  public DeleteRelationRequest() {
  }

  public DeleteRelationRequest sourceEntityId(Map<String, String> sourceEntityId) {
    
    this.sourceEntityId = sourceEntityId;
    return this;
  }

  public DeleteRelationRequest putSourceEntityIdItem(String key, String sourceEntityIdItem) {
    if (this.sourceEntityId == null) {
      this.sourceEntityId = new HashMap<>();
    }
    this.sourceEntityId.put(key, sourceEntityIdItem);
    return this;
  }

   /**
   * The identifier of the source entity of the relation to be deleted.
   * @return sourceEntityId
  **/
  @jakarta.annotation.Nonnull
  public Map<String, String> getSourceEntityId() {
    return sourceEntityId;
  }


  public void setSourceEntityId(Map<String, String> sourceEntityId) {
    this.sourceEntityId = sourceEntityId;
  }


  public DeleteRelationRequest targetEntityId(Map<String, String> targetEntityId) {
    
    this.targetEntityId = targetEntityId;
    return this;
  }

  public DeleteRelationRequest putTargetEntityIdItem(String key, String targetEntityIdItem) {
    if (this.targetEntityId == null) {
      this.targetEntityId = new HashMap<>();
    }
    this.targetEntityId.put(key, targetEntityIdItem);
    return this;
  }

   /**
   * The identifier of the target entity of the relation to be deleted.
   * @return targetEntityId
  **/
  @jakarta.annotation.Nonnull
  public Map<String, String> getTargetEntityId() {
    return targetEntityId;
  }


  public void setTargetEntityId(Map<String, String> targetEntityId) {
    this.targetEntityId = targetEntityId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteRelationRequest deleteRelationRequest = (DeleteRelationRequest) o;
    return Objects.equals(this.sourceEntityId, deleteRelationRequest.sourceEntityId) &&
        Objects.equals(this.targetEntityId, deleteRelationRequest.targetEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceEntityId, targetEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteRelationRequest {\n");
    sb.append("    sourceEntityId: ").append(toIndentedString(sourceEntityId)).append("\n");
    sb.append("    targetEntityId: ").append(toIndentedString(targetEntityId)).append("\n");
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
    openapiFields.add("sourceEntityId");
    openapiFields.add("targetEntityId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sourceEntityId");
    openapiRequiredFields.add("targetEntityId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeleteRelationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteRelationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteRelationRequest is not found in the empty JSON string", DeleteRelationRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteRelationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteRelationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteRelationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteRelationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteRelationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteRelationRequest>() {
           @Override
           public void write(JsonWriter out, DeleteRelationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteRelationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteRelationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteRelationRequest
  * @throws IOException if the JSON string is invalid with respect to DeleteRelationRequest
  */
  public static DeleteRelationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteRelationRequest.class);
  }

 /**
  * Convert an instance of DeleteRelationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
