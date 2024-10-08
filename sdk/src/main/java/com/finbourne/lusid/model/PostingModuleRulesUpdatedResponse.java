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
import com.finbourne.lusid.model.PostingModuleRule;
import com.finbourne.lusid.model.Version;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
 * A Posting Module rules update response
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostingModuleRulesUpdatedResponse {
  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<PostingModuleRule> rules;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public PostingModuleRulesUpdatedResponse() {
  }

  public PostingModuleRulesUpdatedResponse rules(List<PostingModuleRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public PostingModuleRulesUpdatedResponse addRulesItem(PostingModuleRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The Posting Rules that apply for the Posting Module. Rules are evaluated in the order they occur in this collection.
   * @return rules
  **/
  @jakarta.annotation.Nullable
  public List<PostingModuleRule> getRules() {
    return rules;
  }


  public void setRules(List<PostingModuleRule> rules) {
    this.rules = rules;
  }


  public PostingModuleRulesUpdatedResponse version(Version version) {
    
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


  public PostingModuleRulesUpdatedResponse href(URI href) {
    
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


  public PostingModuleRulesUpdatedResponse links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public PostingModuleRulesUpdatedResponse addLinksItem(Link linksItem) {
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
    PostingModuleRulesUpdatedResponse postingModuleRulesUpdatedResponse = (PostingModuleRulesUpdatedResponse) o;
    return Objects.equals(this.rules, postingModuleRulesUpdatedResponse.rules) &&
        Objects.equals(this.version, postingModuleRulesUpdatedResponse.version) &&
        Objects.equals(this.href, postingModuleRulesUpdatedResponse.href) &&
        Objects.equals(this.links, postingModuleRulesUpdatedResponse.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, version, href, links);
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
    sb.append("class PostingModuleRulesUpdatedResponse {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
    openapiFields.add("rules");
    openapiFields.add("version");
    openapiFields.add("href");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostingModuleRulesUpdatedResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostingModuleRulesUpdatedResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostingModuleRulesUpdatedResponse is not found in the empty JSON string", PostingModuleRulesUpdatedResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            PostingModuleRule.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Version.validateJsonElement(jsonObj.get("version"));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
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
       if (!PostingModuleRulesUpdatedResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostingModuleRulesUpdatedResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostingModuleRulesUpdatedResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostingModuleRulesUpdatedResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PostingModuleRulesUpdatedResponse>() {
           @Override
           public void write(JsonWriter out, PostingModuleRulesUpdatedResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostingModuleRulesUpdatedResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostingModuleRulesUpdatedResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostingModuleRulesUpdatedResponse
  * @throws IOException if the JSON string is invalid with respect to PostingModuleRulesUpdatedResponse
  */
  public static PostingModuleRulesUpdatedResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostingModuleRulesUpdatedResponse.class);
  }

 /**
  * Convert an instance of PostingModuleRulesUpdatedResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
