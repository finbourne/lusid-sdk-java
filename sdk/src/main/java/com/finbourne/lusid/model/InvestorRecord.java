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
import com.finbourne.lusid.model.Investor;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.Relationship;
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
 * Representation of an Investor Record on the LUSID API
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvestorRecord {
  public static final String SERIALIZED_NAME_LUSID_INVESTOR_RECORD_ID = "lusidInvestorRecordId";
  @SerializedName(SERIALIZED_NAME_LUSID_INVESTOR_RECORD_ID)
  private String lusidInvestorRecordId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INVESTOR = "investor";
  @SerializedName(SERIALIZED_NAME_INVESTOR)
  private Investor investor;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Map<String, Property> identifiers;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties;

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private List<Relationship> relationships;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public InvestorRecord() {
  }

  public InvestorRecord lusidInvestorRecordId(String lusidInvestorRecordId) {
    
    this.lusidInvestorRecordId = lusidInvestorRecordId;
    return this;
  }

   /**
   * The unique LUSID Investor Record Identifier of the Investor Record.
   * @return lusidInvestorRecordId
  **/
  @jakarta.annotation.Nullable
  public String getLusidInvestorRecordId() {
    return lusidInvestorRecordId;
  }


  public void setLusidInvestorRecordId(String lusidInvestorRecordId) {
    this.lusidInvestorRecordId = lusidInvestorRecordId;
  }


  public InvestorRecord displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the Investor Record
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public InvestorRecord description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Investor Record
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InvestorRecord investor(Investor investor) {
    
    this.investor = investor;
    return this;
  }

   /**
   * Get investor
   * @return investor
  **/
  @jakarta.annotation.Nullable
  public Investor getInvestor() {
    return investor;
  }


  public void setInvestor(Investor investor) {
    this.investor = investor;
  }


  public InvestorRecord identifiers(Map<String, Property> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public InvestorRecord putIdentifiersItem(String key, Property identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new HashMap<>();
    }
    this.identifiers.put(key, identifiersItem);
    return this;
  }

   /**
   * Unique client-defined identifiers of the Investor Record.
   * @return identifiers
  **/
  @jakarta.annotation.Nullable
  public Map<String, Property> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(Map<String, Property> identifiers) {
    this.identifiers = identifiers;
  }


  public InvestorRecord properties(Map<String, Property> properties) {
    
    this.properties = properties;
    return this;
  }

  public InvestorRecord putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A set of properties associated to the Investor Record.
   * @return properties
  **/
  @jakarta.annotation.Nullable
  public Map<String, Property> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }


  public InvestorRecord relationships(List<Relationship> relationships) {
    
    this.relationships = relationships;
    return this;
  }

  public InvestorRecord addRelationshipsItem(Relationship relationshipsItem) {
    if (this.relationships == null) {
      this.relationships = new ArrayList<>();
    }
    this.relationships.add(relationshipsItem);
    return this;
  }

   /**
   * A set of relationships associated to the Investor Record.
   * @return relationships
  **/
  @jakarta.annotation.Nullable
  public List<Relationship> getRelationships() {
    return relationships;
  }


  public void setRelationships(List<Relationship> relationships) {
    this.relationships = relationships;
  }


  public InvestorRecord href(URI href) {
    
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


  public InvestorRecord version(Version version) {
    
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


  public InvestorRecord links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public InvestorRecord addLinksItem(Link linksItem) {
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
    InvestorRecord investorRecord = (InvestorRecord) o;
    return Objects.equals(this.lusidInvestorRecordId, investorRecord.lusidInvestorRecordId) &&
        Objects.equals(this.displayName, investorRecord.displayName) &&
        Objects.equals(this.description, investorRecord.description) &&
        Objects.equals(this.investor, investorRecord.investor) &&
        Objects.equals(this.identifiers, investorRecord.identifiers) &&
        Objects.equals(this.properties, investorRecord.properties) &&
        Objects.equals(this.relationships, investorRecord.relationships) &&
        Objects.equals(this.href, investorRecord.href) &&
        Objects.equals(this.version, investorRecord.version) &&
        Objects.equals(this.links, investorRecord.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lusidInvestorRecordId, displayName, description, investor, identifiers, properties, relationships, href, version, links);
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
    sb.append("class InvestorRecord {\n");
    sb.append("    lusidInvestorRecordId: ").append(toIndentedString(lusidInvestorRecordId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    investor: ").append(toIndentedString(investor)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
    openapiFields.add("lusidInvestorRecordId");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("investor");
    openapiFields.add("identifiers");
    openapiFields.add("properties");
    openapiFields.add("relationships");
    openapiFields.add("href");
    openapiFields.add("version");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvestorRecord
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvestorRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvestorRecord is not found in the empty JSON string", InvestorRecord.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lusidInvestorRecordId") != null && !jsonObj.get("lusidInvestorRecordId").isJsonNull()) && !jsonObj.get("lusidInvestorRecordId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lusidInvestorRecordId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lusidInvestorRecordId").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `investor`
      if (jsonObj.get("investor") != null && !jsonObj.get("investor").isJsonNull()) {
        Investor.validateJsonElement(jsonObj.get("investor"));
      }
      if (jsonObj.get("relationships") != null && !jsonObj.get("relationships").isJsonNull()) {
        JsonArray jsonArrayrelationships = jsonObj.getAsJsonArray("relationships");
        if (jsonArrayrelationships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("relationships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `relationships` to be an array in the JSON string but got `%s`", jsonObj.get("relationships").toString()));
          }

          // validate the optional field `relationships` (array)
          for (int i = 0; i < jsonArrayrelationships.size(); i++) {
            Relationship.validateJsonElement(jsonArrayrelationships.get(i));
          };
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Version.validateJsonElement(jsonObj.get("version"));
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
       if (!InvestorRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvestorRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvestorRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvestorRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<InvestorRecord>() {
           @Override
           public void write(JsonWriter out, InvestorRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvestorRecord read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvestorRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvestorRecord
  * @throws IOException if the JSON string is invalid with respect to InvestorRecord
  */
  public static InvestorRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvestorRecord.class);
  }

 /**
  * Convert an instance of InvestorRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
