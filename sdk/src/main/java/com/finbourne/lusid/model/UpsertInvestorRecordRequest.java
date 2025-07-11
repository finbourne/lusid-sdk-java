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
import com.finbourne.lusid.model.InvestorIdentifier;
import com.finbourne.lusid.model.Property;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
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
 * Request to create or update an investor record
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpsertInvestorRecordRequest {
  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Map<String, Property> identifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INVESTOR = "investor";
  @SerializedName(SERIALIZED_NAME_INVESTOR)
  private InvestorIdentifier investor;

  public UpsertInvestorRecordRequest() {
  }

  public UpsertInvestorRecordRequest identifiers(Map<String, Property> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public UpsertInvestorRecordRequest putIdentifiersItem(String key, Property identifiersItem) {
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
  @jakarta.annotation.Nonnull
  public Map<String, Property> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(Map<String, Property> identifiers) {
    this.identifiers = identifiers;
  }


  public UpsertInvestorRecordRequest properties(Map<String, Property> properties) {
    
    this.properties = properties;
    return this;
  }

  public UpsertInvestorRecordRequest putPropertiesItem(String key, Property propertiesItem) {
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


  public UpsertInvestorRecordRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the Investor Record
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UpsertInvestorRecordRequest description(String description) {
    
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


  public UpsertInvestorRecordRequest investor(InvestorIdentifier investor) {
    
    this.investor = investor;
    return this;
  }

   /**
   * Get investor
   * @return investor
  **/
  @jakarta.annotation.Nullable
  public InvestorIdentifier getInvestor() {
    return investor;
  }


  public void setInvestor(InvestorIdentifier investor) {
    this.investor = investor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertInvestorRecordRequest upsertInvestorRecordRequest = (UpsertInvestorRecordRequest) o;
    return Objects.equals(this.identifiers, upsertInvestorRecordRequest.identifiers) &&
        Objects.equals(this.properties, upsertInvestorRecordRequest.properties) &&
        Objects.equals(this.displayName, upsertInvestorRecordRequest.displayName) &&
        Objects.equals(this.description, upsertInvestorRecordRequest.description) &&
        Objects.equals(this.investor, upsertInvestorRecordRequest.investor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers, properties, displayName, description, investor);
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
    sb.append("class UpsertInvestorRecordRequest {\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    investor: ").append(toIndentedString(investor)).append("\n");
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
    openapiFields.add("identifiers");
    openapiFields.add("properties");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("investor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("identifiers");
    openapiRequiredFields.add("displayName");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpsertInvestorRecordRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertInvestorRecordRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertInvestorRecordRequest is not found in the empty JSON string", UpsertInvestorRecordRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpsertInvestorRecordRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `investor`
      if (jsonObj.get("investor") != null && !jsonObj.get("investor").isJsonNull()) {
        InvestorIdentifier.validateJsonElement(jsonObj.get("investor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertInvestorRecordRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertInvestorRecordRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertInvestorRecordRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertInvestorRecordRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertInvestorRecordRequest>() {
           @Override
           public void write(JsonWriter out, UpsertInvestorRecordRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertInvestorRecordRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpsertInvestorRecordRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpsertInvestorRecordRequest
  * @throws IOException if the JSON string is invalid with respect to UpsertInvestorRecordRequest
  */
  public static UpsertInvestorRecordRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertInvestorRecordRequest.class);
  }

 /**
  * Convert an instance of UpsertInvestorRecordRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
