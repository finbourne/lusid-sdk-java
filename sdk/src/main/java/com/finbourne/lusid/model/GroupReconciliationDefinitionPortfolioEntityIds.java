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
import com.finbourne.lusid.model.PortfolioEntityId;
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
 * GroupReconciliationDefinitionPortfolioEntityIds
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupReconciliationDefinitionPortfolioEntityIds {
  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private List<PortfolioEntityId> left = new ArrayList<>();

  public static final String SERIALIZED_NAME_RIGHT = "right";
  @SerializedName(SERIALIZED_NAME_RIGHT)
  private List<PortfolioEntityId> right = new ArrayList<>();

  public GroupReconciliationDefinitionPortfolioEntityIds() {
  }

  public GroupReconciliationDefinitionPortfolioEntityIds left(List<PortfolioEntityId> left) {
    
    this.left = left;
    return this;
  }

  public GroupReconciliationDefinitionPortfolioEntityIds addLeftItem(PortfolioEntityId leftItem) {
    if (this.left == null) {
      this.left = new ArrayList<>();
    }
    this.left.add(leftItem);
    return this;
  }

   /**
   * Portfolio Entity Id of the left side of a reconciliation
   * @return left
  **/
  @jakarta.annotation.Nonnull
  public List<PortfolioEntityId> getLeft() {
    return left;
  }


  public void setLeft(List<PortfolioEntityId> left) {
    this.left = left;
  }


  public GroupReconciliationDefinitionPortfolioEntityIds right(List<PortfolioEntityId> right) {
    
    this.right = right;
    return this;
  }

  public GroupReconciliationDefinitionPortfolioEntityIds addRightItem(PortfolioEntityId rightItem) {
    if (this.right == null) {
      this.right = new ArrayList<>();
    }
    this.right.add(rightItem);
    return this;
  }

   /**
   * Portfolio Entity Id of the right side of a reconciliation
   * @return right
  **/
  @jakarta.annotation.Nonnull
  public List<PortfolioEntityId> getRight() {
    return right;
  }


  public void setRight(List<PortfolioEntityId> right) {
    this.right = right;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupReconciliationDefinitionPortfolioEntityIds groupReconciliationDefinitionPortfolioEntityIds = (GroupReconciliationDefinitionPortfolioEntityIds) o;
    return Objects.equals(this.left, groupReconciliationDefinitionPortfolioEntityIds.left) &&
        Objects.equals(this.right, groupReconciliationDefinitionPortfolioEntityIds.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupReconciliationDefinitionPortfolioEntityIds {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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
    openapiFields.add("left");
    openapiFields.add("right");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("left");
    openapiRequiredFields.add("right");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupReconciliationDefinitionPortfolioEntityIds
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupReconciliationDefinitionPortfolioEntityIds.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupReconciliationDefinitionPortfolioEntityIds is not found in the empty JSON string", GroupReconciliationDefinitionPortfolioEntityIds.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupReconciliationDefinitionPortfolioEntityIds.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("left").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `left` to be an array in the JSON string but got `%s`", jsonObj.get("left").toString()));
      }

      JsonArray jsonArrayleft = jsonObj.getAsJsonArray("left");
      // validate the required field `left` (array)
      for (int i = 0; i < jsonArrayleft.size(); i++) {
        PortfolioEntityId.validateJsonElement(jsonArrayleft.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("right").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `right` to be an array in the JSON string but got `%s`", jsonObj.get("right").toString()));
      }

      JsonArray jsonArrayright = jsonObj.getAsJsonArray("right");
      // validate the required field `right` (array)
      for (int i = 0; i < jsonArrayright.size(); i++) {
        PortfolioEntityId.validateJsonElement(jsonArrayright.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupReconciliationDefinitionPortfolioEntityIds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupReconciliationDefinitionPortfolioEntityIds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupReconciliationDefinitionPortfolioEntityIds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupReconciliationDefinitionPortfolioEntityIds.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupReconciliationDefinitionPortfolioEntityIds>() {
           @Override
           public void write(JsonWriter out, GroupReconciliationDefinitionPortfolioEntityIds value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupReconciliationDefinitionPortfolioEntityIds read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupReconciliationDefinitionPortfolioEntityIds given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupReconciliationDefinitionPortfolioEntityIds
  * @throws IOException if the JSON string is invalid with respect to GroupReconciliationDefinitionPortfolioEntityIds
  */
  public static GroupReconciliationDefinitionPortfolioEntityIds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupReconciliationDefinitionPortfolioEntityIds.class);
  }

 /**
  * Convert an instance of GroupReconciliationDefinitionPortfolioEntityIds to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
