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
import com.finbourne.lusid.model.DataType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
 * DataTypeEntity
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataTypeEntity {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ENTITY_UNIQUE_ID = "entityUniqueId";
  @SerializedName(SERIALIZED_NAME_ENTITY_UNIQUE_ID)
  private String entityUniqueId;

  public static final String SERIALIZED_NAME_AS_AT_VERSION_NUMBER = "asAtVersionNumber";
  @SerializedName(SERIALIZED_NAME_AS_AT_VERSION_NUMBER)
  private Integer asAtVersionNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_AS_AT_DELETED = "asAtDeleted";
  @SerializedName(SERIALIZED_NAME_AS_AT_DELETED)
  private OffsetDateTime asAtDeleted;

  public static final String SERIALIZED_NAME_USER_ID_DELETED = "userIdDeleted";
  @SerializedName(SERIALIZED_NAME_USER_ID_DELETED)
  private String userIdDeleted;

  public static final String SERIALIZED_NAME_REQUEST_ID_DELETED = "requestIdDeleted";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID_DELETED)
  private String requestIdDeleted;

  public static final String SERIALIZED_NAME_EFFECTIVE_AT_CREATED = "effectiveAtCreated";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT_CREATED)
  private OffsetDateTime effectiveAtCreated;

  public static final String SERIALIZED_NAME_PREVAILING_DATA_TYPE = "prevailingDataType";
  @SerializedName(SERIALIZED_NAME_PREVAILING_DATA_TYPE)
  private DataType prevailingDataType;

  public static final String SERIALIZED_NAME_DELETED_DATA_TYPE = "deletedDataType";
  @SerializedName(SERIALIZED_NAME_DELETED_DATA_TYPE)
  private DataType deletedDataType;

  public static final String SERIALIZED_NAME_PREVIEWED_STATUS = "previewedStatus";
  @SerializedName(SERIALIZED_NAME_PREVIEWED_STATUS)
  private String previewedStatus;

  public static final String SERIALIZED_NAME_PREVIEWED_DATA_TYPE = "previewedDataType";
  @SerializedName(SERIALIZED_NAME_PREVIEWED_DATA_TYPE)
  private DataType previewedDataType;

  public DataTypeEntity() {
  }

  public DataTypeEntity href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @jakarta.annotation.Nonnull
  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public DataTypeEntity entityUniqueId(String entityUniqueId) {
    
    this.entityUniqueId = entityUniqueId;
    return this;
  }

   /**
   * The unique id of the entity.
   * @return entityUniqueId
  **/
  @jakarta.annotation.Nonnull
  public String getEntityUniqueId() {
    return entityUniqueId;
  }


  public void setEntityUniqueId(String entityUniqueId) {
    this.entityUniqueId = entityUniqueId;
  }


  public DataTypeEntity asAtVersionNumber(Integer asAtVersionNumber) {
    
    this.asAtVersionNumber = asAtVersionNumber;
    return this;
  }

   /**
   * The integer version number for the entity (the entity was created at version 1)
   * @return asAtVersionNumber
  **/
  @jakarta.annotation.Nullable
  public Integer getAsAtVersionNumber() {
    return asAtVersionNumber;
  }


  public void setAsAtVersionNumber(Integer asAtVersionNumber) {
    this.asAtVersionNumber = asAtVersionNumber;
  }


  public DataTypeEntity status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the entity at the current time.
   * @return status
  **/
  @jakarta.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DataTypeEntity asAtDeleted(OffsetDateTime asAtDeleted) {
    
    this.asAtDeleted = asAtDeleted;
    return this;
  }

   /**
   * The asAt datetime at which the entity was deleted.
   * @return asAtDeleted
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAsAtDeleted() {
    return asAtDeleted;
  }


  public void setAsAtDeleted(OffsetDateTime asAtDeleted) {
    this.asAtDeleted = asAtDeleted;
  }


  public DataTypeEntity userIdDeleted(String userIdDeleted) {
    
    this.userIdDeleted = userIdDeleted;
    return this;
  }

   /**
   * The unique id of the user who deleted the entity.
   * @return userIdDeleted
  **/
  @jakarta.annotation.Nullable
  public String getUserIdDeleted() {
    return userIdDeleted;
  }


  public void setUserIdDeleted(String userIdDeleted) {
    this.userIdDeleted = userIdDeleted;
  }


  public DataTypeEntity requestIdDeleted(String requestIdDeleted) {
    
    this.requestIdDeleted = requestIdDeleted;
    return this;
  }

   /**
   * The unique request id of the command that deleted the entity.
   * @return requestIdDeleted
  **/
  @jakarta.annotation.Nullable
  public String getRequestIdDeleted() {
    return requestIdDeleted;
  }


  public void setRequestIdDeleted(String requestIdDeleted) {
    this.requestIdDeleted = requestIdDeleted;
  }


  public DataTypeEntity effectiveAtCreated(OffsetDateTime effectiveAtCreated) {
    
    this.effectiveAtCreated = effectiveAtCreated;
    return this;
  }

   /**
   * The EffectiveAt this Entity is created, if entity does not currently exist in EffectiveAt.
   * @return effectiveAtCreated
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getEffectiveAtCreated() {
    return effectiveAtCreated;
  }


  public void setEffectiveAtCreated(OffsetDateTime effectiveAtCreated) {
    this.effectiveAtCreated = effectiveAtCreated;
  }


  public DataTypeEntity prevailingDataType(DataType prevailingDataType) {
    
    this.prevailingDataType = prevailingDataType;
    return this;
  }

   /**
   * Get prevailingDataType
   * @return prevailingDataType
  **/
  @jakarta.annotation.Nullable
  public DataType getPrevailingDataType() {
    return prevailingDataType;
  }


  public void setPrevailingDataType(DataType prevailingDataType) {
    this.prevailingDataType = prevailingDataType;
  }


  public DataTypeEntity deletedDataType(DataType deletedDataType) {
    
    this.deletedDataType = deletedDataType;
    return this;
  }

   /**
   * Get deletedDataType
   * @return deletedDataType
  **/
  @jakarta.annotation.Nullable
  public DataType getDeletedDataType() {
    return deletedDataType;
  }


  public void setDeletedDataType(DataType deletedDataType) {
    this.deletedDataType = deletedDataType;
  }


  public DataTypeEntity previewedStatus(String previewedStatus) {
    
    this.previewedStatus = previewedStatus;
    return this;
  }

   /**
   * The status of the previewed entity.
   * @return previewedStatus
  **/
  @jakarta.annotation.Nullable
  public String getPreviewedStatus() {
    return previewedStatus;
  }


  public void setPreviewedStatus(String previewedStatus) {
    this.previewedStatus = previewedStatus;
  }


  public DataTypeEntity previewedDataType(DataType previewedDataType) {
    
    this.previewedDataType = previewedDataType;
    return this;
  }

   /**
   * Get previewedDataType
   * @return previewedDataType
  **/
  @jakarta.annotation.Nullable
  public DataType getPreviewedDataType() {
    return previewedDataType;
  }


  public void setPreviewedDataType(DataType previewedDataType) {
    this.previewedDataType = previewedDataType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataTypeEntity dataTypeEntity = (DataTypeEntity) o;
    return Objects.equals(this.href, dataTypeEntity.href) &&
        Objects.equals(this.entityUniqueId, dataTypeEntity.entityUniqueId) &&
        Objects.equals(this.asAtVersionNumber, dataTypeEntity.asAtVersionNumber) &&
        Objects.equals(this.status, dataTypeEntity.status) &&
        Objects.equals(this.asAtDeleted, dataTypeEntity.asAtDeleted) &&
        Objects.equals(this.userIdDeleted, dataTypeEntity.userIdDeleted) &&
        Objects.equals(this.requestIdDeleted, dataTypeEntity.requestIdDeleted) &&
        Objects.equals(this.effectiveAtCreated, dataTypeEntity.effectiveAtCreated) &&
        Objects.equals(this.prevailingDataType, dataTypeEntity.prevailingDataType) &&
        Objects.equals(this.deletedDataType, dataTypeEntity.deletedDataType) &&
        Objects.equals(this.previewedStatus, dataTypeEntity.previewedStatus) &&
        Objects.equals(this.previewedDataType, dataTypeEntity.previewedDataType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, entityUniqueId, asAtVersionNumber, status, asAtDeleted, userIdDeleted, requestIdDeleted, effectiveAtCreated, prevailingDataType, deletedDataType, previewedStatus, previewedDataType);
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
    sb.append("class DataTypeEntity {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    entityUniqueId: ").append(toIndentedString(entityUniqueId)).append("\n");
    sb.append("    asAtVersionNumber: ").append(toIndentedString(asAtVersionNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    asAtDeleted: ").append(toIndentedString(asAtDeleted)).append("\n");
    sb.append("    userIdDeleted: ").append(toIndentedString(userIdDeleted)).append("\n");
    sb.append("    requestIdDeleted: ").append(toIndentedString(requestIdDeleted)).append("\n");
    sb.append("    effectiveAtCreated: ").append(toIndentedString(effectiveAtCreated)).append("\n");
    sb.append("    prevailingDataType: ").append(toIndentedString(prevailingDataType)).append("\n");
    sb.append("    deletedDataType: ").append(toIndentedString(deletedDataType)).append("\n");
    sb.append("    previewedStatus: ").append(toIndentedString(previewedStatus)).append("\n");
    sb.append("    previewedDataType: ").append(toIndentedString(previewedDataType)).append("\n");
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
    openapiFields.add("entityUniqueId");
    openapiFields.add("asAtVersionNumber");
    openapiFields.add("status");
    openapiFields.add("asAtDeleted");
    openapiFields.add("userIdDeleted");
    openapiFields.add("requestIdDeleted");
    openapiFields.add("effectiveAtCreated");
    openapiFields.add("prevailingDataType");
    openapiFields.add("deletedDataType");
    openapiFields.add("previewedStatus");
    openapiFields.add("previewedDataType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("href");
    openapiRequiredFields.add("entityUniqueId");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataTypeEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataTypeEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataTypeEntity is not found in the empty JSON string", DataTypeEntity.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataTypeEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (!jsonObj.get("entityUniqueId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityUniqueId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityUniqueId").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("userIdDeleted") != null && !jsonObj.get("userIdDeleted").isJsonNull()) && !jsonObj.get("userIdDeleted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIdDeleted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIdDeleted").toString()));
      }
      if ((jsonObj.get("requestIdDeleted") != null && !jsonObj.get("requestIdDeleted").isJsonNull()) && !jsonObj.get("requestIdDeleted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestIdDeleted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestIdDeleted").toString()));
      }
      // validate the optional field `prevailingDataType`
      if (jsonObj.get("prevailingDataType") != null && !jsonObj.get("prevailingDataType").isJsonNull()) {
        DataType.validateJsonElement(jsonObj.get("prevailingDataType"));
      }
      // validate the optional field `deletedDataType`
      if (jsonObj.get("deletedDataType") != null && !jsonObj.get("deletedDataType").isJsonNull()) {
        DataType.validateJsonElement(jsonObj.get("deletedDataType"));
      }
      if ((jsonObj.get("previewedStatus") != null && !jsonObj.get("previewedStatus").isJsonNull()) && !jsonObj.get("previewedStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previewedStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previewedStatus").toString()));
      }
      // validate the optional field `previewedDataType`
      if (jsonObj.get("previewedDataType") != null && !jsonObj.get("previewedDataType").isJsonNull()) {
        DataType.validateJsonElement(jsonObj.get("previewedDataType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataTypeEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataTypeEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataTypeEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataTypeEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<DataTypeEntity>() {
           @Override
           public void write(JsonWriter out, DataTypeEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataTypeEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataTypeEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataTypeEntity
  * @throws IOException if the JSON string is invalid with respect to DataTypeEntity
  */
  public static DataTypeEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataTypeEntity.class);
  }

 /**
  * Convert an instance of DataTypeEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}