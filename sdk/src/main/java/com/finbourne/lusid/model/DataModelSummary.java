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
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * DataModelSummary
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataModelSummary {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PRECEDENCE = "precedence";
  @SerializedName(SERIALIZED_NAME_PRECEDENCE)
  private Integer precedence;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<DataModelSummary> children = new ArrayList<>();

  public DataModelSummary() {
  }

  public DataModelSummary id(ResourceId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getId() {
    return id;
  }


  public void setId(ResourceId id) {
    this.id = id;
  }


  public DataModelSummary displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the Custom Data Model.
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public DataModelSummary description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the Custom Data Model.
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DataModelSummary entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The entity type that the Custom Data Model binds to.
   * @return entityType
  **/
  @jakarta.annotation.Nonnull
  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public DataModelSummary type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Either Root or Leaf or Intermediate.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DataModelSummary precedence(Integer precedence) {
    
    this.precedence = precedence;
    return this;
  }

   /**
   * Where in the hierarchy this model sits.
   * @return precedence
  **/
  @jakarta.annotation.Nonnull
  public Integer getPrecedence() {
    return precedence;
  }


  public void setPrecedence(Integer precedence) {
    this.precedence = precedence;
  }


  public DataModelSummary children(List<DataModelSummary> children) {
    
    this.children = children;
    return this;
  }

  public DataModelSummary addChildrenItem(DataModelSummary childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Child Custom Data Models that will inherit from this data model.
   * @return children
  **/
  @jakarta.annotation.Nonnull
  public List<DataModelSummary> getChildren() {
    return children;
  }


  public void setChildren(List<DataModelSummary> children) {
    this.children = children;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelSummary dataModelSummary = (DataModelSummary) o;
    return Objects.equals(this.id, dataModelSummary.id) &&
        Objects.equals(this.displayName, dataModelSummary.displayName) &&
        Objects.equals(this.description, dataModelSummary.description) &&
        Objects.equals(this.entityType, dataModelSummary.entityType) &&
        Objects.equals(this.type, dataModelSummary.type) &&
        Objects.equals(this.precedence, dataModelSummary.precedence) &&
        Objects.equals(this.children, dataModelSummary.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, description, entityType, type, precedence, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    precedence: ").append(toIndentedString(precedence)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("entityType");
    openapiFields.add("type");
    openapiFields.add("precedence");
    openapiFields.add("children");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("entityType");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("precedence");
    openapiRequiredFields.add("children");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataModelSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataModelSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataModelSummary is not found in the empty JSON string", DataModelSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataModelSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      ResourceId.validateJsonElement(jsonObj.get("id"));
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("children").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
      }

      JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
      // validate the required field `children` (array)
      for (int i = 0; i < jsonArraychildren.size(); i++) {
        DataModelSummary.validateJsonElement(jsonArraychildren.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataModelSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataModelSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataModelSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataModelSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<DataModelSummary>() {
           @Override
           public void write(JsonWriter out, DataModelSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataModelSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataModelSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataModelSummary
  * @throws IOException if the JSON string is invalid with respect to DataModelSummary
  */
  public static DataModelSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataModelSummary.class);
  }

 /**
  * Convert an instance of DataModelSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
