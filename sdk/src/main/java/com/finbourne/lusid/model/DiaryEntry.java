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
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.Version;
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
import java.util.HashMap;
import java.util.List;
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
 * DiaryEntry
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DiaryEntry {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ABOR_ID = "aborId";
  @SerializedName(SERIALIZED_NAME_ABOR_ID)
  private ResourceId aborId;

  public static final String SERIALIZED_NAME_DIARY_ENTRY_CODE = "diaryEntryCode";
  @SerializedName(SERIALIZED_NAME_DIARY_ENTRY_CODE)
  private String diaryEntryCode;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_EFFECTIVE_AT = "effectiveAt";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT)
  private OffsetDateTime effectiveAt;

  public static final String SERIALIZED_NAME_QUERY_AS_AT = "queryAsAt";
  @SerializedName(SERIALIZED_NAME_QUERY_AS_AT)
  private OffsetDateTime queryAsAt;

  public static final String SERIALIZED_NAME_PREVIOUS_ENTRY_TIME = "previousEntryTime";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_ENTRY_TIME)
  private OffsetDateTime previousEntryTime;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public DiaryEntry() {
  }

  public DiaryEntry href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @jakarta.annotation.Nullable
  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public DiaryEntry aborId(ResourceId aborId) {
    
    this.aborId = aborId;
    return this;
  }

   /**
   * Get aborId
   * @return aborId
  **/
  @jakarta.annotation.Nullable
  public ResourceId getAborId() {
    return aborId;
  }


  public void setAborId(ResourceId aborId) {
    this.aborId = aborId;
  }


  public DiaryEntry diaryEntryCode(String diaryEntryCode) {
    
    this.diaryEntryCode = diaryEntryCode;
    return this;
  }

   /**
   * The code of the diary entry.
   * @return diaryEntryCode
  **/
  @jakarta.annotation.Nullable
  public String getDiaryEntryCode() {
    return diaryEntryCode;
  }


  public void setDiaryEntryCode(String diaryEntryCode) {
    this.diaryEntryCode = diaryEntryCode;
  }


  public DiaryEntry type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the diary entry.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DiaryEntry name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the diary entry.
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DiaryEntry status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the diary entry. Defaults to &#39;Undefined&#39;.
   * @return status
  **/
  @jakarta.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DiaryEntry effectiveAt(OffsetDateTime effectiveAt) {
    
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * The effective time of the diary entry.
   * @return effectiveAt
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getEffectiveAt() {
    return effectiveAt;
  }


  public void setEffectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  public DiaryEntry queryAsAt(OffsetDateTime queryAsAt) {
    
    this.queryAsAt = queryAsAt;
    return this;
  }

   /**
   * The query time of the diary entry. Defaults to latest.
   * @return queryAsAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getQueryAsAt() {
    return queryAsAt;
  }


  public void setQueryAsAt(OffsetDateTime queryAsAt) {
    this.queryAsAt = queryAsAt;
  }


  public DiaryEntry previousEntryTime(OffsetDateTime previousEntryTime) {
    
    this.previousEntryTime = previousEntryTime;
    return this;
  }

   /**
   * The entry time of the previous diary entry.
   * @return previousEntryTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getPreviousEntryTime() {
    return previousEntryTime;
  }


  public void setPreviousEntryTime(OffsetDateTime previousEntryTime) {
    this.previousEntryTime = previousEntryTime;
  }


  public DiaryEntry properties(Map<String, Property> properties) {
    
    this.properties = properties;
    return this;
  }

  public DiaryEntry putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A set of properties for the diary entry.
   * @return properties
  **/
  @jakarta.annotation.Nullable
  public Map<String, Property> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }


  public DiaryEntry version(Version version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  public Version getVersion() {
    return version;
  }


  public void setVersion(Version version) {
    this.version = version;
  }


  public DiaryEntry links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public DiaryEntry addLinksItem(Link linksItem) {
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
    DiaryEntry diaryEntry = (DiaryEntry) o;
    return Objects.equals(this.href, diaryEntry.href) &&
        Objects.equals(this.aborId, diaryEntry.aborId) &&
        Objects.equals(this.diaryEntryCode, diaryEntry.diaryEntryCode) &&
        Objects.equals(this.type, diaryEntry.type) &&
        Objects.equals(this.name, diaryEntry.name) &&
        Objects.equals(this.status, diaryEntry.status) &&
        Objects.equals(this.effectiveAt, diaryEntry.effectiveAt) &&
        Objects.equals(this.queryAsAt, diaryEntry.queryAsAt) &&
        Objects.equals(this.previousEntryTime, diaryEntry.previousEntryTime) &&
        Objects.equals(this.properties, diaryEntry.properties) &&
        Objects.equals(this.version, diaryEntry.version) &&
        Objects.equals(this.links, diaryEntry.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, aborId, diaryEntryCode, type, name, status, effectiveAt, queryAsAt, previousEntryTime, properties, version, links);
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
    sb.append("class DiaryEntry {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    aborId: ").append(toIndentedString(aborId)).append("\n");
    sb.append("    diaryEntryCode: ").append(toIndentedString(diaryEntryCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    queryAsAt: ").append(toIndentedString(queryAsAt)).append("\n");
    sb.append("    previousEntryTime: ").append(toIndentedString(previousEntryTime)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("aborId");
    openapiFields.add("diaryEntryCode");
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("effectiveAt");
    openapiFields.add("queryAsAt");
    openapiFields.add("previousEntryTime");
    openapiFields.add("properties");
    openapiFields.add("version");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("effectiveAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DiaryEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DiaryEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiaryEntry is not found in the empty JSON string", DiaryEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DiaryEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiaryEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DiaryEntry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the optional field `aborId`
      if (jsonObj.get("aborId") != null && !jsonObj.get("aborId").isJsonNull()) {
        ResourceId.validateJsonObject(jsonObj.getAsJsonObject("aborId"));
      }
      if ((jsonObj.get("diaryEntryCode") != null && !jsonObj.get("diaryEntryCode").isJsonNull()) && !jsonObj.get("diaryEntryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diaryEntryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diaryEntryCode").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Version.validateJsonObject(jsonObj.getAsJsonObject("version"));
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
            Link.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiaryEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiaryEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiaryEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiaryEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<DiaryEntry>() {
           @Override
           public void write(JsonWriter out, DiaryEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiaryEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiaryEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiaryEntry
  * @throws IOException if the JSON string is invalid with respect to DiaryEntry
  */
  public static DiaryEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiaryEntry.class);
  }

 /**
  * Convert an instance of DiaryEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}