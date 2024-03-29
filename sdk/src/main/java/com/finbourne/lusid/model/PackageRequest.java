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
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * A request to create or update a Package.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PackageRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_ORDER_IDS = "orderIds";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<ResourceId> orderIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDER_INSTRUCTION_IDS = "orderInstructionIds";
  @SerializedName(SERIALIZED_NAME_ORDER_INSTRUCTION_IDS)
  private List<ResourceId> orderInstructionIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties;

  public PackageRequest() {
  }

  public PackageRequest id(ResourceId id) {
    
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


  public PackageRequest orderIds(List<ResourceId> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public PackageRequest addOrderIdsItem(ResourceId orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Related order ids.
   * @return orderIds
  **/
  @jakarta.annotation.Nonnull
  public List<ResourceId> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<ResourceId> orderIds) {
    this.orderIds = orderIds;
  }


  public PackageRequest orderInstructionIds(List<ResourceId> orderInstructionIds) {
    
    this.orderInstructionIds = orderInstructionIds;
    return this;
  }

  public PackageRequest addOrderInstructionIdsItem(ResourceId orderInstructionIdsItem) {
    if (this.orderInstructionIds == null) {
      this.orderInstructionIds = new ArrayList<>();
    }
    this.orderInstructionIds.add(orderInstructionIdsItem);
    return this;
  }

   /**
   * Related order instruction ids.
   * @return orderInstructionIds
  **/
  @jakarta.annotation.Nonnull
  public List<ResourceId> getOrderInstructionIds() {
    return orderInstructionIds;
  }


  public void setOrderInstructionIds(List<ResourceId> orderInstructionIds) {
    this.orderInstructionIds = orderInstructionIds;
  }


  public PackageRequest properties(Map<String, PerpetualProperty> properties) {
    
    this.properties = properties;
    return this;
  }

  public PackageRequest putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Client-defined properties associated with this execution.
   * @return properties
  **/
  @jakarta.annotation.Nullable
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageRequest packageRequest = (PackageRequest) o;
    return Objects.equals(this.id, packageRequest.id) &&
        Objects.equals(this.orderIds, packageRequest.orderIds) &&
        Objects.equals(this.orderInstructionIds, packageRequest.orderInstructionIds) &&
        Objects.equals(this.properties, packageRequest.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderIds, orderInstructionIds, properties);
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
    sb.append("class PackageRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    orderInstructionIds: ").append(toIndentedString(orderInstructionIds)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("orderIds");
    openapiFields.add("orderInstructionIds");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("orderIds");
    openapiRequiredFields.add("orderInstructionIds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PackageRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PackageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PackageRequest is not found in the empty JSON string", PackageRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PackageRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      ResourceId.validateJsonElement(jsonObj.get("id"));
      // ensure the json data is an array
      if (!jsonObj.get("orderIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderIds` to be an array in the JSON string but got `%s`", jsonObj.get("orderIds").toString()));
      }

      JsonArray jsonArrayorderIds = jsonObj.getAsJsonArray("orderIds");
      // validate the required field `orderIds` (array)
      for (int i = 0; i < jsonArrayorderIds.size(); i++) {
        ResourceId.validateJsonElement(jsonArrayorderIds.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("orderInstructionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderInstructionIds` to be an array in the JSON string but got `%s`", jsonObj.get("orderInstructionIds").toString()));
      }

      JsonArray jsonArrayorderInstructionIds = jsonObj.getAsJsonArray("orderInstructionIds");
      // validate the required field `orderInstructionIds` (array)
      for (int i = 0; i < jsonArrayorderInstructionIds.size(); i++) {
        ResourceId.validateJsonElement(jsonArrayorderInstructionIds.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PackageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PackageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PackageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PackageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PackageRequest>() {
           @Override
           public void write(JsonWriter out, PackageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PackageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PackageRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PackageRequest
  * @throws IOException if the JSON string is invalid with respect to PackageRequest
  */
  public static PackageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PackageRequest.class);
  }

 /**
  * Convert an instance of PackageRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
