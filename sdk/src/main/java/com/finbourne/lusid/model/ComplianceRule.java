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
import com.finbourne.lusid.model.Version;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ComplianceRule
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplianceRule {
  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PROPERTY_KEY = "propertyKey";
  @SerializedName(SERIALIZED_NAME_PROPERTY_KEY)
  private String propertyKey;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_ADDRESS_KEY = "addressKey";
  @SerializedName(SERIALIZED_NAME_ADDRESS_KEY)
  private String addressKey;

  public static final String SERIALIZED_NAME_LOWER_BOUND = "lowerBound";
  @SerializedName(SERIALIZED_NAME_LOWER_BOUND)
  private java.math.BigDecimal lowerBound;

  public static final String SERIALIZED_NAME_UPPER_BOUND = "upperBound";
  @SerializedName(SERIALIZED_NAME_UPPER_BOUND)
  private java.math.BigDecimal upperBound;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_HARD_REQUIREMENT = "hardRequirement";
  @SerializedName(SERIALIZED_NAME_HARD_REQUIREMENT)
  private Boolean hardRequirement;

  public static final String SERIALIZED_NAME_TARGET_PORTFOLIO_IDS = "targetPortfolioIds";
  @SerializedName(SERIALIZED_NAME_TARGET_PORTFOLIO_IDS)
  private List<ResourceId> targetPortfolioIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public ComplianceRule() {
  }

  public ComplianceRule scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * 
   * @return scope
  **/
  @jakarta.annotation.Nonnull
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public ComplianceRule code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @jakarta.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ComplianceRule displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * 
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ComplianceRule type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ComplianceRule propertyKey(String propertyKey) {
    
    this.propertyKey = propertyKey;
    return this;
  }

   /**
   * 
   * @return propertyKey
  **/
  @jakarta.annotation.Nullable
  public String getPropertyKey() {
    return propertyKey;
  }


  public void setPropertyKey(String propertyKey) {
    this.propertyKey = propertyKey;
  }


  public ComplianceRule value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @jakarta.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ComplianceRule addressKey(String addressKey) {
    
    this.addressKey = addressKey;
    return this;
  }

   /**
   * 
   * @return addressKey
  **/
  @jakarta.annotation.Nullable
  public String getAddressKey() {
    return addressKey;
  }


  public void setAddressKey(String addressKey) {
    this.addressKey = addressKey;
  }


  public ComplianceRule lowerBound(java.math.BigDecimal lowerBound) {
    
    this.lowerBound = lowerBound;
    return this;
  }

   /**
   * 
   * @return lowerBound
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getLowerBound() {
    return lowerBound;
  }


  public void setLowerBound(java.math.BigDecimal lowerBound) {
    this.lowerBound = lowerBound;
  }


  public ComplianceRule upperBound(java.math.BigDecimal upperBound) {
    
    this.upperBound = upperBound;
    return this;
  }

   /**
   * 
   * @return upperBound
  **/
  @jakarta.annotation.Nonnull
  public java.math.BigDecimal getUpperBound() {
    return upperBound;
  }


  public void setUpperBound(java.math.BigDecimal upperBound) {
    this.upperBound = upperBound;
  }


  public ComplianceRule schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * 
   * @return schedule
  **/
  @jakarta.annotation.Nonnull
  public String getSchedule() {
    return schedule;
  }


  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public ComplianceRule hardRequirement(Boolean hardRequirement) {
    
    this.hardRequirement = hardRequirement;
    return this;
  }

   /**
   * 
   * @return hardRequirement
  **/
  @jakarta.annotation.Nonnull
  public Boolean getHardRequirement() {
    return hardRequirement;
  }


  public void setHardRequirement(Boolean hardRequirement) {
    this.hardRequirement = hardRequirement;
  }


  public ComplianceRule targetPortfolioIds(List<ResourceId> targetPortfolioIds) {
    
    this.targetPortfolioIds = targetPortfolioIds;
    return this;
  }

  public ComplianceRule addTargetPortfolioIdsItem(ResourceId targetPortfolioIdsItem) {
    if (this.targetPortfolioIds == null) {
      this.targetPortfolioIds = new ArrayList<>();
    }
    this.targetPortfolioIds.add(targetPortfolioIdsItem);
    return this;
  }

   /**
   * 
   * @return targetPortfolioIds
  **/
  @jakarta.annotation.Nonnull
  public List<ResourceId> getTargetPortfolioIds() {
    return targetPortfolioIds;
  }


  public void setTargetPortfolioIds(List<ResourceId> targetPortfolioIds) {
    this.targetPortfolioIds = targetPortfolioIds;
  }


  public ComplianceRule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ComplianceRule version(Version version) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceRule complianceRule = (ComplianceRule) o;
    return Objects.equals(this.scope, complianceRule.scope) &&
        Objects.equals(this.code, complianceRule.code) &&
        Objects.equals(this.displayName, complianceRule.displayName) &&
        Objects.equals(this.type, complianceRule.type) &&
        Objects.equals(this.propertyKey, complianceRule.propertyKey) &&
        Objects.equals(this.value, complianceRule.value) &&
        Objects.equals(this.addressKey, complianceRule.addressKey) &&
        (this.lowerBound.compareTo(complianceRule.getLowerBound()) == 0) &&
        (this.upperBound.compareTo(complianceRule.getUpperBound()) == 0) &&
        Objects.equals(this.schedule, complianceRule.schedule) &&
        Objects.equals(this.hardRequirement, complianceRule.hardRequirement) &&
        Objects.equals(this.targetPortfolioIds, complianceRule.targetPortfolioIds) &&
        Objects.equals(this.description, complianceRule.description) &&
        Objects.equals(this.version, complianceRule.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, code, displayName, type, propertyKey, value, addressKey, lowerBound, upperBound, schedule, hardRequirement, targetPortfolioIds, description, version);
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
    sb.append("class ComplianceRule {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    propertyKey: ").append(toIndentedString(propertyKey)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    addressKey: ").append(toIndentedString(addressKey)).append("\n");
    sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
    sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    hardRequirement: ").append(toIndentedString(hardRequirement)).append("\n");
    sb.append("    targetPortfolioIds: ").append(toIndentedString(targetPortfolioIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("scope");
    openapiFields.add("code");
    openapiFields.add("displayName");
    openapiFields.add("type");
    openapiFields.add("propertyKey");
    openapiFields.add("value");
    openapiFields.add("addressKey");
    openapiFields.add("lowerBound");
    openapiFields.add("upperBound");
    openapiFields.add("schedule");
    openapiFields.add("hardRequirement");
    openapiFields.add("targetPortfolioIds");
    openapiFields.add("description");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("lowerBound");
    openapiRequiredFields.add("upperBound");
    openapiRequiredFields.add("schedule");
    openapiRequiredFields.add("hardRequirement");
    openapiRequiredFields.add("targetPortfolioIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ComplianceRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ComplianceRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComplianceRule is not found in the empty JSON string", ComplianceRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ComplianceRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComplianceRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ComplianceRule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("propertyKey") != null && !jsonObj.get("propertyKey").isJsonNull()) && !jsonObj.get("propertyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyKey").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("addressKey") != null && !jsonObj.get("addressKey").isJsonNull()) && !jsonObj.get("addressKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressKey").toString()));
      }
      if (!jsonObj.get("schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedule").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("targetPortfolioIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetPortfolioIds` to be an array in the JSON string but got `%s`", jsonObj.get("targetPortfolioIds").toString()));
      }

      JsonArray jsonArraytargetPortfolioIds = jsonObj.getAsJsonArray("targetPortfolioIds");
      // validate the required field `targetPortfolioIds` (array)
      for (int i = 0; i < jsonArraytargetPortfolioIds.size(); i++) {
        ResourceId.validateJsonObject(jsonArraytargetPortfolioIds.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Version.validateJsonObject(jsonObj.getAsJsonObject("version"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComplianceRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComplianceRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComplianceRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComplianceRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ComplianceRule>() {
           @Override
           public void write(JsonWriter out, ComplianceRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComplianceRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ComplianceRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ComplianceRule
  * @throws IOException if the JSON string is invalid with respect to ComplianceRule
  */
  public static ComplianceRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComplianceRule.class);
  }

 /**
  * Convert an instance of ComplianceRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}