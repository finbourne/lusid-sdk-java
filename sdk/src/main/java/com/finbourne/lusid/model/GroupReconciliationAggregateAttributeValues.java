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
import com.finbourne.lusid.model.ComparisonAttributeValuePair;
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
 * GroupReconciliationAggregateAttributeValues
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupReconciliationAggregateAttributeValues {
  public static final String SERIALIZED_NAME_LEFT_AGGREGATE_ATTRIBUTES = "leftAggregateAttributes";
  @SerializedName(SERIALIZED_NAME_LEFT_AGGREGATE_ATTRIBUTES)
  private List<ComparisonAttributeValuePair> leftAggregateAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_RIGHT_AGGREGATE_ATTRIBUTES = "rightAggregateAttributes";
  @SerializedName(SERIALIZED_NAME_RIGHT_AGGREGATE_ATTRIBUTES)
  private List<ComparisonAttributeValuePair> rightAggregateAttributes = new ArrayList<>();

  public GroupReconciliationAggregateAttributeValues() {
  }

  public GroupReconciliationAggregateAttributeValues leftAggregateAttributes(List<ComparisonAttributeValuePair> leftAggregateAttributes) {
    
    this.leftAggregateAttributes = leftAggregateAttributes;
    return this;
  }

  public GroupReconciliationAggregateAttributeValues addLeftAggregateAttributesItem(ComparisonAttributeValuePair leftAggregateAttributesItem) {
    if (this.leftAggregateAttributes == null) {
      this.leftAggregateAttributes = new ArrayList<>();
    }
    this.leftAggregateAttributes.add(leftAggregateAttributesItem);
    return this;
  }

   /**
   * Aggregate attribute names and values for the left hand entity being reconciled.
   * @return leftAggregateAttributes
  **/
  @jakarta.annotation.Nonnull
  public List<ComparisonAttributeValuePair> getLeftAggregateAttributes() {
    return leftAggregateAttributes;
  }


  public void setLeftAggregateAttributes(List<ComparisonAttributeValuePair> leftAggregateAttributes) {
    this.leftAggregateAttributes = leftAggregateAttributes;
  }


  public GroupReconciliationAggregateAttributeValues rightAggregateAttributes(List<ComparisonAttributeValuePair> rightAggregateAttributes) {
    
    this.rightAggregateAttributes = rightAggregateAttributes;
    return this;
  }

  public GroupReconciliationAggregateAttributeValues addRightAggregateAttributesItem(ComparisonAttributeValuePair rightAggregateAttributesItem) {
    if (this.rightAggregateAttributes == null) {
      this.rightAggregateAttributes = new ArrayList<>();
    }
    this.rightAggregateAttributes.add(rightAggregateAttributesItem);
    return this;
  }

   /**
   * Aggregate attribute names and values for the right hand entity being reconciled.
   * @return rightAggregateAttributes
  **/
  @jakarta.annotation.Nonnull
  public List<ComparisonAttributeValuePair> getRightAggregateAttributes() {
    return rightAggregateAttributes;
  }


  public void setRightAggregateAttributes(List<ComparisonAttributeValuePair> rightAggregateAttributes) {
    this.rightAggregateAttributes = rightAggregateAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupReconciliationAggregateAttributeValues groupReconciliationAggregateAttributeValues = (GroupReconciliationAggregateAttributeValues) o;
    return Objects.equals(this.leftAggregateAttributes, groupReconciliationAggregateAttributeValues.leftAggregateAttributes) &&
        Objects.equals(this.rightAggregateAttributes, groupReconciliationAggregateAttributeValues.rightAggregateAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftAggregateAttributes, rightAggregateAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupReconciliationAggregateAttributeValues {\n");
    sb.append("    leftAggregateAttributes: ").append(toIndentedString(leftAggregateAttributes)).append("\n");
    sb.append("    rightAggregateAttributes: ").append(toIndentedString(rightAggregateAttributes)).append("\n");
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
    openapiFields.add("leftAggregateAttributes");
    openapiFields.add("rightAggregateAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("leftAggregateAttributes");
    openapiRequiredFields.add("rightAggregateAttributes");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupReconciliationAggregateAttributeValues
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupReconciliationAggregateAttributeValues.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupReconciliationAggregateAttributeValues is not found in the empty JSON string", GroupReconciliationAggregateAttributeValues.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupReconciliationAggregateAttributeValues.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("leftAggregateAttributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `leftAggregateAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("leftAggregateAttributes").toString()));
      }

      JsonArray jsonArrayleftAggregateAttributes = jsonObj.getAsJsonArray("leftAggregateAttributes");
      // validate the required field `leftAggregateAttributes` (array)
      for (int i = 0; i < jsonArrayleftAggregateAttributes.size(); i++) {
        ComparisonAttributeValuePair.validateJsonElement(jsonArrayleftAggregateAttributes.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("rightAggregateAttributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rightAggregateAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("rightAggregateAttributes").toString()));
      }

      JsonArray jsonArrayrightAggregateAttributes = jsonObj.getAsJsonArray("rightAggregateAttributes");
      // validate the required field `rightAggregateAttributes` (array)
      for (int i = 0; i < jsonArrayrightAggregateAttributes.size(); i++) {
        ComparisonAttributeValuePair.validateJsonElement(jsonArrayrightAggregateAttributes.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupReconciliationAggregateAttributeValues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupReconciliationAggregateAttributeValues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupReconciliationAggregateAttributeValues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupReconciliationAggregateAttributeValues.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupReconciliationAggregateAttributeValues>() {
           @Override
           public void write(JsonWriter out, GroupReconciliationAggregateAttributeValues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupReconciliationAggregateAttributeValues read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupReconciliationAggregateAttributeValues given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupReconciliationAggregateAttributeValues
  * @throws IOException if the JSON string is invalid with respect to GroupReconciliationAggregateAttributeValues
  */
  public static GroupReconciliationAggregateAttributeValues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupReconciliationAggregateAttributeValues.class);
  }

 /**
  * Convert an instance of GroupReconciliationAggregateAttributeValues to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}