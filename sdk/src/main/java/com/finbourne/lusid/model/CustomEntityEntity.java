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
import com.finbourne.lusid.model.CustomEntityResponse;
import com.finbourne.lusid.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * CustomEntityEntity
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomEntityEntity {
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

  public static final String SERIALIZED_NAME_PREVAILING_CUSTOM_ENTITY = "prevailingCustomEntity";
  @SerializedName(SERIALIZED_NAME_PREVAILING_CUSTOM_ENTITY)
  private CustomEntityResponse prevailingCustomEntity;

  public static final String SERIALIZED_NAME_DELETED_CUSTOM_ENTITY = "deletedCustomEntity";
  @SerializedName(SERIALIZED_NAME_DELETED_CUSTOM_ENTITY)
  private CustomEntityResponse deletedCustomEntity;

  public static final String SERIALIZED_NAME_PREVIEWED_STATUS = "previewedStatus";
  @SerializedName(SERIALIZED_NAME_PREVIEWED_STATUS)
  private String previewedStatus;

  public static final String SERIALIZED_NAME_PREVIEWED_CUSTOM_ENTITY = "previewedCustomEntity";
  @SerializedName(SERIALIZED_NAME_PREVIEWED_CUSTOM_ENTITY)
  private CustomEntityResponse previewedCustomEntity;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public CustomEntityEntity() {
  }

  public CustomEntityEntity href(URI href) {
    
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


  public CustomEntityEntity entityUniqueId(String entityUniqueId) {
    
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


  public CustomEntityEntity asAtVersionNumber(Integer asAtVersionNumber) {
    
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


  public CustomEntityEntity status(String status) {
    
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


  public CustomEntityEntity asAtDeleted(OffsetDateTime asAtDeleted) {
    
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


  public CustomEntityEntity userIdDeleted(String userIdDeleted) {
    
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


  public CustomEntityEntity requestIdDeleted(String requestIdDeleted) {
    
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


  public CustomEntityEntity effectiveAtCreated(OffsetDateTime effectiveAtCreated) {
    
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


  public CustomEntityEntity prevailingCustomEntity(CustomEntityResponse prevailingCustomEntity) {
    
    this.prevailingCustomEntity = prevailingCustomEntity;
    return this;
  }

   /**
   * Get prevailingCustomEntity
   * @return prevailingCustomEntity
  **/
  @jakarta.annotation.Nullable
  public CustomEntityResponse getPrevailingCustomEntity() {
    return prevailingCustomEntity;
  }


  public void setPrevailingCustomEntity(CustomEntityResponse prevailingCustomEntity) {
    this.prevailingCustomEntity = prevailingCustomEntity;
  }


  public CustomEntityEntity deletedCustomEntity(CustomEntityResponse deletedCustomEntity) {
    
    this.deletedCustomEntity = deletedCustomEntity;
    return this;
  }

   /**
   * Get deletedCustomEntity
   * @return deletedCustomEntity
  **/
  @jakarta.annotation.Nullable
  public CustomEntityResponse getDeletedCustomEntity() {
    return deletedCustomEntity;
  }


  public void setDeletedCustomEntity(CustomEntityResponse deletedCustomEntity) {
    this.deletedCustomEntity = deletedCustomEntity;
  }


  public CustomEntityEntity previewedStatus(String previewedStatus) {
    
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


  public CustomEntityEntity previewedCustomEntity(CustomEntityResponse previewedCustomEntity) {
    
    this.previewedCustomEntity = previewedCustomEntity;
    return this;
  }

   /**
   * Get previewedCustomEntity
   * @return previewedCustomEntity
  **/
  @jakarta.annotation.Nullable
  public CustomEntityResponse getPreviewedCustomEntity() {
    return previewedCustomEntity;
  }


  public void setPreviewedCustomEntity(CustomEntityResponse previewedCustomEntity) {
    this.previewedCustomEntity = previewedCustomEntity;
  }


  public CustomEntityEntity links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public CustomEntityEntity addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEntityEntity customEntityEntity = (CustomEntityEntity) o;
    return Objects.equals(this.href, customEntityEntity.href) &&
        Objects.equals(this.entityUniqueId, customEntityEntity.entityUniqueId) &&
        Objects.equals(this.asAtVersionNumber, customEntityEntity.asAtVersionNumber) &&
        Objects.equals(this.status, customEntityEntity.status) &&
        Objects.equals(this.asAtDeleted, customEntityEntity.asAtDeleted) &&
        Objects.equals(this.userIdDeleted, customEntityEntity.userIdDeleted) &&
        Objects.equals(this.requestIdDeleted, customEntityEntity.requestIdDeleted) &&
        Objects.equals(this.effectiveAtCreated, customEntityEntity.effectiveAtCreated) &&
        Objects.equals(this.prevailingCustomEntity, customEntityEntity.prevailingCustomEntity) &&
        Objects.equals(this.deletedCustomEntity, customEntityEntity.deletedCustomEntity) &&
        Objects.equals(this.previewedStatus, customEntityEntity.previewedStatus) &&
        Objects.equals(this.previewedCustomEntity, customEntityEntity.previewedCustomEntity) &&
        Objects.equals(this.links, customEntityEntity.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, entityUniqueId, asAtVersionNumber, status, asAtDeleted, userIdDeleted, requestIdDeleted, effectiveAtCreated, prevailingCustomEntity, deletedCustomEntity, previewedStatus, previewedCustomEntity, links);
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
    sb.append("class CustomEntityEntity {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    entityUniqueId: ").append(toIndentedString(entityUniqueId)).append("\n");
    sb.append("    asAtVersionNumber: ").append(toIndentedString(asAtVersionNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    asAtDeleted: ").append(toIndentedString(asAtDeleted)).append("\n");
    sb.append("    userIdDeleted: ").append(toIndentedString(userIdDeleted)).append("\n");
    sb.append("    requestIdDeleted: ").append(toIndentedString(requestIdDeleted)).append("\n");
    sb.append("    effectiveAtCreated: ").append(toIndentedString(effectiveAtCreated)).append("\n");
    sb.append("    prevailingCustomEntity: ").append(toIndentedString(prevailingCustomEntity)).append("\n");
    sb.append("    deletedCustomEntity: ").append(toIndentedString(deletedCustomEntity)).append("\n");
    sb.append("    previewedStatus: ").append(toIndentedString(previewedStatus)).append("\n");
    sb.append("    previewedCustomEntity: ").append(toIndentedString(previewedCustomEntity)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("prevailingCustomEntity");
    openapiFields.add("deletedCustomEntity");
    openapiFields.add("previewedStatus");
    openapiFields.add("previewedCustomEntity");
    openapiFields.add("links");

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
  * @throws IOException if the JSON Element is invalid with respect to CustomEntityEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomEntityEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEntityEntity is not found in the empty JSON string", CustomEntityEntity.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomEntityEntity.openapiRequiredFields) {
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
      // validate the optional field `prevailingCustomEntity`
      if (jsonObj.get("prevailingCustomEntity") != null && !jsonObj.get("prevailingCustomEntity").isJsonNull()) {
        CustomEntityResponse.validateJsonElement(jsonObj.get("prevailingCustomEntity"));
      }
      // validate the optional field `deletedCustomEntity`
      if (jsonObj.get("deletedCustomEntity") != null && !jsonObj.get("deletedCustomEntity").isJsonNull()) {
        CustomEntityResponse.validateJsonElement(jsonObj.get("deletedCustomEntity"));
      }
      if ((jsonObj.get("previewedStatus") != null && !jsonObj.get("previewedStatus").isJsonNull()) && !jsonObj.get("previewedStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previewedStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previewedStatus").toString()));
      }
      // validate the optional field `previewedCustomEntity`
      if (jsonObj.get("previewedCustomEntity") != null && !jsonObj.get("previewedCustomEntity").isJsonNull()) {
        CustomEntityResponse.validateJsonElement(jsonObj.get("previewedCustomEntity"));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEntityEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEntityEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEntityEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEntityEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEntityEntity>() {
           @Override
           public void write(JsonWriter out, CustomEntityEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomEntityEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomEntityEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomEntityEntity
  * @throws IOException if the JSON string is invalid with respect to CustomEntityEntity
  */
  public static CustomEntityEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEntityEntity.class);
  }

 /**
  * Convert an instance of CustomEntityEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
