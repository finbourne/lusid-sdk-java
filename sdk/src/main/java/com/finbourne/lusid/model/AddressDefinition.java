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
 * AddressDefinition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddressDefinition {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * The available values are: String, Int, Decimal, DateTime, Boolean, ResultValue, Result0D, Json
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("String"),
    
    INT("Int"),
    
    DECIMAL("Decimal"),
    
    DATETIME("DateTime"),
    
    BOOLEAN("Boolean"),
    
    RESULTVALUE("ResultValue"),
    
    RESULT0D("Result0D"),
    
    JSON("Json");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LIFE_CYCLE_STATUS = "lifeCycleStatus";
  @SerializedName(SERIALIZED_NAME_LIFE_CYCLE_STATUS)
  private String lifeCycleStatus;

  public static final String SERIALIZED_NAME_REMOVAL_DATE = "removalDate";
  @SerializedName(SERIALIZED_NAME_REMOVAL_DATE)
  private OffsetDateTime removalDate;

  public static final String SERIALIZED_NAME_DOCUMENTATION_LINK = "documentationLink";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION_LINK)
  private String documentationLink;

  public AddressDefinition() {
  }

  public AddressDefinition displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the address key.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public AddressDefinition type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The available values are: String, Int, Decimal, DateTime, Boolean, ResultValue, Result0D, Json
   * @return type
  **/
  @jakarta.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AddressDefinition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description for this result.
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AddressDefinition lifeCycleStatus(String lifeCycleStatus) {
    
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

   /**
   * What is the status of the address path. If it is not Production then it might be removed at some point in the future.  See the removal date for the likely timing of that if any.
   * @return lifeCycleStatus
  **/
  @jakarta.annotation.Nullable
  public String getLifeCycleStatus() {
    return lifeCycleStatus;
  }


  public void setLifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }


  public AddressDefinition removalDate(OffsetDateTime removalDate) {
    
    this.removalDate = removalDate;
    return this;
  }

   /**
   * If the life-cycle status of the address is Deprecated then this is the date at which support of the address will be suspended.  After that date it will be removed at the earliest possible point subject to any specific contractual support and development constraints.
   * @return removalDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getRemovalDate() {
    return removalDate;
  }


  public void setRemovalDate(OffsetDateTime removalDate) {
    this.removalDate = removalDate;
  }


  public AddressDefinition documentationLink(String documentationLink) {
    
    this.documentationLink = documentationLink;
    return this;
  }

   /**
   * Contains a link to the documentation for this AddressDefinition in KnowledgeBase.
   * @return documentationLink
  **/
  @jakarta.annotation.Nullable
  public String getDocumentationLink() {
    return documentationLink;
  }


  public void setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDefinition addressDefinition = (AddressDefinition) o;
    return Objects.equals(this.displayName, addressDefinition.displayName) &&
        Objects.equals(this.type, addressDefinition.type) &&
        Objects.equals(this.description, addressDefinition.description) &&
        Objects.equals(this.lifeCycleStatus, addressDefinition.lifeCycleStatus) &&
        Objects.equals(this.removalDate, addressDefinition.removalDate) &&
        Objects.equals(this.documentationLink, addressDefinition.documentationLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, type, description, lifeCycleStatus, removalDate, documentationLink);
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
    sb.append("class AddressDefinition {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    removalDate: ").append(toIndentedString(removalDate)).append("\n");
    sb.append("    documentationLink: ").append(toIndentedString(documentationLink)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("type");
    openapiFields.add("description");
    openapiFields.add("lifeCycleStatus");
    openapiFields.add("removalDate");
    openapiFields.add("documentationLink");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressDefinition is not found in the empty JSON string", AddressDefinition.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("lifeCycleStatus") != null && !jsonObj.get("lifeCycleStatus").isJsonNull()) && !jsonObj.get("lifeCycleStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lifeCycleStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lifeCycleStatus").toString()));
      }
      if ((jsonObj.get("documentationLink") != null && !jsonObj.get("documentationLink").isJsonNull()) && !jsonObj.get("documentationLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentationLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentationLink").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressDefinition>() {
           @Override
           public void write(JsonWriter out, AddressDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressDefinition
  * @throws IOException if the JSON string is invalid with respect to AddressDefinition
  */
  public static AddressDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressDefinition.class);
  }

 /**
  * Convert an instance of AddressDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
