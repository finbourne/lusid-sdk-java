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
 * CustomEntityFieldDefinition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomEntityFieldDefinition {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LIFETIME = "lifetime";
  @SerializedName(SERIALIZED_NAME_LIFETIME)
  private String lifetime;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_COLLECTION_TYPE = "collectionType";
  @SerializedName(SERIALIZED_NAME_COLLECTION_TYPE)
  private String collectionType;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public CustomEntityFieldDefinition() {
  }

  public CustomEntityFieldDefinition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomEntityFieldDefinition lifetime(String lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Describes how the field’s values can change over time. The available values are: “Perpetual”, “TimeVariant”.
   * @return lifetime
  **/
  @jakarta.annotation.Nonnull
  public String getLifetime() {
    return lifetime;
  }


  public void setLifetime(String lifetime) {
    this.lifetime = lifetime;
  }


  public CustomEntityFieldDefinition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The value type for the field. Available values are: “String”, “Boolean”, “DateTime”, “Decimal”.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CustomEntityFieldDefinition collectionType(String collectionType) {
    
    this.collectionType = collectionType;
    return this;
  }

   /**
   * The collection type for the field. Available values are: “Single”, “Array”. Null value defaults to “Single”
   * @return collectionType
  **/
  @jakarta.annotation.Nullable
  public String getCollectionType() {
    return collectionType;
  }


  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }


  public CustomEntityFieldDefinition required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Whether the field is required or not.
   * @return required
  **/
  @jakarta.annotation.Nonnull
  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public CustomEntityFieldDefinition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An optional description for the field.
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEntityFieldDefinition customEntityFieldDefinition = (CustomEntityFieldDefinition) o;
    return Objects.equals(this.name, customEntityFieldDefinition.name) &&
        Objects.equals(this.lifetime, customEntityFieldDefinition.lifetime) &&
        Objects.equals(this.type, customEntityFieldDefinition.type) &&
        Objects.equals(this.collectionType, customEntityFieldDefinition.collectionType) &&
        Objects.equals(this.required, customEntityFieldDefinition.required) &&
        Objects.equals(this.description, customEntityFieldDefinition.description);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lifetime, type, collectionType, required, description);
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
    sb.append("class CustomEntityFieldDefinition {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("lifetime");
    openapiFields.add("type");
    openapiFields.add("collectionType");
    openapiFields.add("required");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("lifetime");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("required");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomEntityFieldDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomEntityFieldDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomEntityFieldDefinition is not found in the empty JSON string", CustomEntityFieldDefinition.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomEntityFieldDefinition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("lifetime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lifetime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lifetime").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("collectionType") != null && !jsonObj.get("collectionType").isJsonNull()) && !jsonObj.get("collectionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionType").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomEntityFieldDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomEntityFieldDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomEntityFieldDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomEntityFieldDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomEntityFieldDefinition>() {
           @Override
           public void write(JsonWriter out, CustomEntityFieldDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomEntityFieldDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomEntityFieldDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomEntityFieldDefinition
  * @throws IOException if the JSON string is invalid with respect to CustomEntityFieldDefinition
  */
  public static CustomEntityFieldDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomEntityFieldDefinition.class);
  }

 /**
  * Convert an instance of CustomEntityFieldDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
