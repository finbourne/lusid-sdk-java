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
import com.finbourne.lusid.model.GroupReconciliationAggregateComparisonRuleOperand;
import com.finbourne.lusid.model.GroupReconciliationComparisonRuleTolerance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * GroupReconciliationAggregateAttributeRule
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupReconciliationAggregateAttributeRule {
  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private GroupReconciliationAggregateComparisonRuleOperand left;

  public static final String SERIALIZED_NAME_RIGHT = "right";
  @SerializedName(SERIALIZED_NAME_RIGHT)
  private GroupReconciliationAggregateComparisonRuleOperand right;

  public static final String SERIALIZED_NAME_TOLERANCE = "tolerance";
  @SerializedName(SERIALIZED_NAME_TOLERANCE)
  private GroupReconciliationComparisonRuleTolerance tolerance;

  public GroupReconciliationAggregateAttributeRule() {
  }

  public GroupReconciliationAggregateAttributeRule left(GroupReconciliationAggregateComparisonRuleOperand left) {
    
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @jakarta.annotation.Nonnull
  public GroupReconciliationAggregateComparisonRuleOperand getLeft() {
    return left;
  }


  public void setLeft(GroupReconciliationAggregateComparisonRuleOperand left) {
    this.left = left;
  }


  public GroupReconciliationAggregateAttributeRule right(GroupReconciliationAggregateComparisonRuleOperand right) {
    
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @jakarta.annotation.Nonnull
  public GroupReconciliationAggregateComparisonRuleOperand getRight() {
    return right;
  }


  public void setRight(GroupReconciliationAggregateComparisonRuleOperand right) {
    this.right = right;
  }


  public GroupReconciliationAggregateAttributeRule tolerance(GroupReconciliationComparisonRuleTolerance tolerance) {
    
    this.tolerance = tolerance;
    return this;
  }

   /**
   * Get tolerance
   * @return tolerance
  **/
  @jakarta.annotation.Nullable
  public GroupReconciliationComparisonRuleTolerance getTolerance() {
    return tolerance;
  }


  public void setTolerance(GroupReconciliationComparisonRuleTolerance tolerance) {
    this.tolerance = tolerance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupReconciliationAggregateAttributeRule groupReconciliationAggregateAttributeRule = (GroupReconciliationAggregateAttributeRule) o;
    return Objects.equals(this.left, groupReconciliationAggregateAttributeRule.left) &&
        Objects.equals(this.right, groupReconciliationAggregateAttributeRule.right) &&
        Objects.equals(this.tolerance, groupReconciliationAggregateAttributeRule.tolerance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right, tolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupReconciliationAggregateAttributeRule {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    tolerance: ").append(toIndentedString(tolerance)).append("\n");
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
    openapiFields.add("tolerance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("left");
    openapiRequiredFields.add("right");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupReconciliationAggregateAttributeRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupReconciliationAggregateAttributeRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupReconciliationAggregateAttributeRule is not found in the empty JSON string", GroupReconciliationAggregateAttributeRule.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupReconciliationAggregateAttributeRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `left`
      GroupReconciliationAggregateComparisonRuleOperand.validateJsonElement(jsonObj.get("left"));
      // validate the required field `right`
      GroupReconciliationAggregateComparisonRuleOperand.validateJsonElement(jsonObj.get("right"));
      // validate the optional field `tolerance`
      if (jsonObj.get("tolerance") != null && !jsonObj.get("tolerance").isJsonNull()) {
        GroupReconciliationComparisonRuleTolerance.validateJsonElement(jsonObj.get("tolerance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupReconciliationAggregateAttributeRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupReconciliationAggregateAttributeRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupReconciliationAggregateAttributeRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupReconciliationAggregateAttributeRule.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupReconciliationAggregateAttributeRule>() {
           @Override
           public void write(JsonWriter out, GroupReconciliationAggregateAttributeRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupReconciliationAggregateAttributeRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupReconciliationAggregateAttributeRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupReconciliationAggregateAttributeRule
  * @throws IOException if the JSON string is invalid with respect to GroupReconciliationAggregateAttributeRule
  */
  public static GroupReconciliationAggregateAttributeRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupReconciliationAggregateAttributeRule.class);
  }

 /**
  * Convert an instance of GroupReconciliationAggregateAttributeRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
