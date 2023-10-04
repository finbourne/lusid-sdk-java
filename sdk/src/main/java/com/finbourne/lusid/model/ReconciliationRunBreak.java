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
import com.finbourne.lusid.model.ReconciliationBreakId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
 * ReconciliationRunBreak
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReconciliationRunBreak {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ReconciliationBreakId id;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_LEFT_FIELDS = "leftFields";
  @SerializedName(SERIALIZED_NAME_LEFT_FIELDS)
  private Map<String, String> leftFields;

  public static final String SERIALIZED_NAME_RIGHT_FIELDS = "rightFields";
  @SerializedName(SERIALIZED_NAME_RIGHT_FIELDS)
  private Map<String, String> rightFields;

  public static final String SERIALIZED_NAME_DIFF = "diff";
  @SerializedName(SERIALIZED_NAME_DIFF)
  private String diff;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public ReconciliationRunBreak() {
  }

  public ReconciliationRunBreak id(ReconciliationBreakId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  public ReconciliationBreakId getId() {
    return id;
  }


  public void setId(ReconciliationBreakId id) {
    this.id = id;
  }


  public ReconciliationRunBreak href(URI href) {
    
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


  public ReconciliationRunBreak leftFields(Map<String, String> leftFields) {
    
    this.leftFields = leftFields;
    return this;
  }

  public ReconciliationRunBreak putLeftFieldsItem(String key, String leftFieldsItem) {
    if (this.leftFields == null) {
      this.leftFields = new HashMap<>();
    }
    this.leftFields.put(key, leftFieldsItem);
    return this;
  }

   /**
   * Fields for the left hand side of the reconciliation
   * @return leftFields
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getLeftFields() {
    return leftFields;
  }


  public void setLeftFields(Map<String, String> leftFields) {
    this.leftFields = leftFields;
  }


  public ReconciliationRunBreak rightFields(Map<String, String> rightFields) {
    
    this.rightFields = rightFields;
    return this;
  }

  public ReconciliationRunBreak putRightFieldsItem(String key, String rightFieldsItem) {
    if (this.rightFields == null) {
      this.rightFields = new HashMap<>();
    }
    this.rightFields.put(key, rightFieldsItem);
    return this;
  }

   /**
   * Fields for the right hand side of the reconciliation
   * @return rightFields
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getRightFields() {
    return rightFields;
  }


  public void setRightFields(Map<String, String> rightFields) {
    this.rightFields = rightFields;
  }


  public ReconciliationRunBreak diff(String diff) {
    
    this.diff = diff;
    return this;
  }

   /**
   * The difference between two matching fields
   * @return diff
  **/
  @jakarta.annotation.Nullable
  public String getDiff() {
    return diff;
  }


  public void setDiff(String diff) {
    this.diff = diff;
  }


  public ReconciliationRunBreak links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public ReconciliationRunBreak addLinksItem(Link linksItem) {
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
    ReconciliationRunBreak reconciliationRunBreak = (ReconciliationRunBreak) o;
    return Objects.equals(this.id, reconciliationRunBreak.id) &&
        Objects.equals(this.href, reconciliationRunBreak.href) &&
        Objects.equals(this.leftFields, reconciliationRunBreak.leftFields) &&
        Objects.equals(this.rightFields, reconciliationRunBreak.rightFields) &&
        Objects.equals(this.diff, reconciliationRunBreak.diff) &&
        Objects.equals(this.links, reconciliationRunBreak.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, leftFields, rightFields, diff, links);
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
    sb.append("class ReconciliationRunBreak {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    leftFields: ").append(toIndentedString(leftFields)).append("\n");
    sb.append("    rightFields: ").append(toIndentedString(rightFields)).append("\n");
    sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("href");
    openapiFields.add("leftFields");
    openapiFields.add("rightFields");
    openapiFields.add("diff");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReconciliationRunBreak
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReconciliationRunBreak.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReconciliationRunBreak is not found in the empty JSON string", ReconciliationRunBreak.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReconciliationRunBreak.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReconciliationRunBreak` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        ReconciliationBreakId.validateJsonObject(jsonObj.getAsJsonObject("id"));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("diff") != null && !jsonObj.get("diff").isJsonNull()) && !jsonObj.get("diff").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diff` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diff").toString()));
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
       if (!ReconciliationRunBreak.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReconciliationRunBreak' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReconciliationRunBreak> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReconciliationRunBreak.class));

       return (TypeAdapter<T>) new TypeAdapter<ReconciliationRunBreak>() {
           @Override
           public void write(JsonWriter out, ReconciliationRunBreak value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReconciliationRunBreak read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReconciliationRunBreak given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReconciliationRunBreak
  * @throws IOException if the JSON string is invalid with respect to ReconciliationRunBreak
  */
  public static ReconciliationRunBreak fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReconciliationRunBreak.class);
  }

 /**
  * Convert an instance of ReconciliationRunBreak to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}