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
 * StagedModificationStagingRule
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StagedModificationStagingRule {
  public static final String SERIALIZED_NAME_STAGING_RULE_SET_ID = "stagingRuleSetId";
  @SerializedName(SERIALIZED_NAME_STAGING_RULE_SET_ID)
  private String stagingRuleSetId;

  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_REQUIRED_APPROVALS = "requiredApprovals";
  @SerializedName(SERIALIZED_NAME_REQUIRED_APPROVALS)
  private Integer requiredApprovals;

  public static final String SERIALIZED_NAME_CURRENT_USER_CAN_DECIDE = "currentUserCanDecide";
  @SerializedName(SERIALIZED_NAME_CURRENT_USER_CAN_DECIDE)
  private Boolean currentUserCanDecide;

  public StagedModificationStagingRule() {
  }

  public StagedModificationStagingRule stagingRuleSetId(String stagingRuleSetId) {
    
    this.stagingRuleSetId = stagingRuleSetId;
    return this;
  }

   /**
   * System generated unique id for the staging rule set.
   * @return stagingRuleSetId
  **/
  @jakarta.annotation.Nullable
  public String getStagingRuleSetId() {
    return stagingRuleSetId;
  }


  public void setStagingRuleSetId(String stagingRuleSetId) {
    this.stagingRuleSetId = stagingRuleSetId;
  }


  public StagedModificationStagingRule ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * The ID of the staging rule.
   * @return ruleId
  **/
  @jakarta.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public StagedModificationStagingRule requiredApprovals(Integer requiredApprovals) {
    
    this.requiredApprovals = requiredApprovals;
    return this;
  }

   /**
   * The number of approvals required. If left blank, one approval is needed.
   * @return requiredApprovals
  **/
  @jakarta.annotation.Nullable
  public Integer getRequiredApprovals() {
    return requiredApprovals;
  }


  public void setRequiredApprovals(Integer requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
  }


  public StagedModificationStagingRule currentUserCanDecide(Boolean currentUserCanDecide) {
    
    this.currentUserCanDecide = currentUserCanDecide;
    return this;
  }

   /**
   * True or False indicating whether the current user can make a decision on the staged modification.
   * @return currentUserCanDecide
  **/
  @jakarta.annotation.Nullable
  public Boolean getCurrentUserCanDecide() {
    return currentUserCanDecide;
  }


  public void setCurrentUserCanDecide(Boolean currentUserCanDecide) {
    this.currentUserCanDecide = currentUserCanDecide;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StagedModificationStagingRule stagedModificationStagingRule = (StagedModificationStagingRule) o;
    return Objects.equals(this.stagingRuleSetId, stagedModificationStagingRule.stagingRuleSetId) &&
        Objects.equals(this.ruleId, stagedModificationStagingRule.ruleId) &&
        Objects.equals(this.requiredApprovals, stagedModificationStagingRule.requiredApprovals) &&
        Objects.equals(this.currentUserCanDecide, stagedModificationStagingRule.currentUserCanDecide);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stagingRuleSetId, ruleId, requiredApprovals, currentUserCanDecide);
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
    sb.append("class StagedModificationStagingRule {\n");
    sb.append("    stagingRuleSetId: ").append(toIndentedString(stagingRuleSetId)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    requiredApprovals: ").append(toIndentedString(requiredApprovals)).append("\n");
    sb.append("    currentUserCanDecide: ").append(toIndentedString(currentUserCanDecide)).append("\n");
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
    openapiFields.add("stagingRuleSetId");
    openapiFields.add("ruleId");
    openapiFields.add("requiredApprovals");
    openapiFields.add("currentUserCanDecide");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StagedModificationStagingRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StagedModificationStagingRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StagedModificationStagingRule is not found in the empty JSON string", StagedModificationStagingRule.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("stagingRuleSetId") != null && !jsonObj.get("stagingRuleSetId").isJsonNull()) && !jsonObj.get("stagingRuleSetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stagingRuleSetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stagingRuleSetId").toString()));
      }
      if ((jsonObj.get("ruleId") != null && !jsonObj.get("ruleId").isJsonNull()) && !jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StagedModificationStagingRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StagedModificationStagingRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StagedModificationStagingRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StagedModificationStagingRule.class));

       return (TypeAdapter<T>) new TypeAdapter<StagedModificationStagingRule>() {
           @Override
           public void write(JsonWriter out, StagedModificationStagingRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StagedModificationStagingRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StagedModificationStagingRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StagedModificationStagingRule
  * @throws IOException if the JSON string is invalid with respect to StagedModificationStagingRule
  */
  public static StagedModificationStagingRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StagedModificationStagingRule.class);
  }

 /**
  * Convert an instance of StagedModificationStagingRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}