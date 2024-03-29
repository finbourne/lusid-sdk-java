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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.ResourceId;
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
 * The time an entity was modified (amendment and/or historical correction).
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Change {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private ResourceId entityId;

  public static final String SERIALIZED_NAME_CORRECTED = "corrected";
  @SerializedName(SERIALIZED_NAME_CORRECTED)
  private Boolean corrected;

  public static final String SERIALIZED_NAME_CORRECTION_EFFECTIVE_AT = "correctionEffectiveAt";
  @SerializedName(SERIALIZED_NAME_CORRECTION_EFFECTIVE_AT)
  private OffsetDateTime correctionEffectiveAt;

  public static final String SERIALIZED_NAME_CORRECTION_AS_AT = "correctionAsAt";
  @SerializedName(SERIALIZED_NAME_CORRECTION_AS_AT)
  private OffsetDateTime correctionAsAt;

  public static final String SERIALIZED_NAME_AMENDED = "amended";
  @SerializedName(SERIALIZED_NAME_AMENDED)
  private Boolean amended;

  public static final String SERIALIZED_NAME_AMENDMENT_EFFECTIVE_AT = "amendmentEffectiveAt";
  @SerializedName(SERIALIZED_NAME_AMENDMENT_EFFECTIVE_AT)
  private OffsetDateTime amendmentEffectiveAt;

  public static final String SERIALIZED_NAME_AMENDMENT_AS_AT = "amendmentAsAt";
  @SerializedName(SERIALIZED_NAME_AMENDMENT_AS_AT)
  private OffsetDateTime amendmentAsAt;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public Change() {
  }

  public Change href(URI href) {
    
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


  public Change entityId(ResourceId entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getEntityId() {
    return entityId;
  }


  public void setEntityId(ResourceId entityId) {
    this.entityId = entityId;
  }


  public Change corrected(Boolean corrected) {
    
    this.corrected = corrected;
    return this;
  }

   /**
   * 
   * @return corrected
  **/
  @jakarta.annotation.Nonnull
  public Boolean getCorrected() {
    return corrected;
  }


  public void setCorrected(Boolean corrected) {
    this.corrected = corrected;
  }


  public Change correctionEffectiveAt(OffsetDateTime correctionEffectiveAt) {
    
    this.correctionEffectiveAt = correctionEffectiveAt;
    return this;
  }

   /**
   * 
   * @return correctionEffectiveAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getCorrectionEffectiveAt() {
    return correctionEffectiveAt;
  }


  public void setCorrectionEffectiveAt(OffsetDateTime correctionEffectiveAt) {
    this.correctionEffectiveAt = correctionEffectiveAt;
  }


  public Change correctionAsAt(OffsetDateTime correctionAsAt) {
    
    this.correctionAsAt = correctionAsAt;
    return this;
  }

   /**
   * 
   * @return correctionAsAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getCorrectionAsAt() {
    return correctionAsAt;
  }


  public void setCorrectionAsAt(OffsetDateTime correctionAsAt) {
    this.correctionAsAt = correctionAsAt;
  }


  public Change amended(Boolean amended) {
    
    this.amended = amended;
    return this;
  }

   /**
   * 
   * @return amended
  **/
  @jakarta.annotation.Nonnull
  public Boolean getAmended() {
    return amended;
  }


  public void setAmended(Boolean amended) {
    this.amended = amended;
  }


  public Change amendmentEffectiveAt(OffsetDateTime amendmentEffectiveAt) {
    
    this.amendmentEffectiveAt = amendmentEffectiveAt;
    return this;
  }

   /**
   * 
   * @return amendmentEffectiveAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAmendmentEffectiveAt() {
    return amendmentEffectiveAt;
  }


  public void setAmendmentEffectiveAt(OffsetDateTime amendmentEffectiveAt) {
    this.amendmentEffectiveAt = amendmentEffectiveAt;
  }


  public Change amendmentAsAt(OffsetDateTime amendmentAsAt) {
    
    this.amendmentAsAt = amendmentAsAt;
    return this;
  }

   /**
   * 
   * @return amendmentAsAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAmendmentAsAt() {
    return amendmentAsAt;
  }


  public void setAmendmentAsAt(OffsetDateTime amendmentAsAt) {
    this.amendmentAsAt = amendmentAsAt;
  }


  public Change links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public Change addLinksItem(Link linksItem) {
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
    Change change = (Change) o;
    return Objects.equals(this.href, change.href) &&
        Objects.equals(this.entityId, change.entityId) &&
        Objects.equals(this.corrected, change.corrected) &&
        Objects.equals(this.correctionEffectiveAt, change.correctionEffectiveAt) &&
        Objects.equals(this.correctionAsAt, change.correctionAsAt) &&
        Objects.equals(this.amended, change.amended) &&
        Objects.equals(this.amendmentEffectiveAt, change.amendmentEffectiveAt) &&
        Objects.equals(this.amendmentAsAt, change.amendmentAsAt) &&
        Objects.equals(this.links, change.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, entityId, corrected, correctionEffectiveAt, correctionAsAt, amended, amendmentEffectiveAt, amendmentAsAt, links);
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
    sb.append("class Change {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    corrected: ").append(toIndentedString(corrected)).append("\n");
    sb.append("    correctionEffectiveAt: ").append(toIndentedString(correctionEffectiveAt)).append("\n");
    sb.append("    correctionAsAt: ").append(toIndentedString(correctionAsAt)).append("\n");
    sb.append("    amended: ").append(toIndentedString(amended)).append("\n");
    sb.append("    amendmentEffectiveAt: ").append(toIndentedString(amendmentEffectiveAt)).append("\n");
    sb.append("    amendmentAsAt: ").append(toIndentedString(amendmentAsAt)).append("\n");
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
    openapiFields.add("entityId");
    openapiFields.add("corrected");
    openapiFields.add("correctionEffectiveAt");
    openapiFields.add("correctionAsAt");
    openapiFields.add("amended");
    openapiFields.add("amendmentEffectiveAt");
    openapiFields.add("amendmentAsAt");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entityId");
    openapiRequiredFields.add("corrected");
    openapiRequiredFields.add("amended");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Change
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Change.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Change is not found in the empty JSON string", Change.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Change.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the required field `entityId`
      ResourceId.validateJsonElement(jsonObj.get("entityId"));
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
       if (!Change.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Change' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Change> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Change.class));

       return (TypeAdapter<T>) new TypeAdapter<Change>() {
           @Override
           public void write(JsonWriter out, Change value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Change read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Change given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Change
  * @throws IOException if the JSON string is invalid with respect to Change
  */
  public static Change fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Change.class);
  }

 /**
  * Convert an instance of Change to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
