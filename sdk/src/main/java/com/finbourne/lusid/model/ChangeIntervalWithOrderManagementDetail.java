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
import com.finbourne.lusid.model.PropertyValue;
import com.finbourne.lusid.model.StagedModificationEffectiveRange;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Defines a change that occured for an entity, with extra detail about the change
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChangeIntervalWithOrderManagementDetail {
  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private Map<String, String> detail;

  public static final String SERIALIZED_NAME_ACTION_DESCRIPTION = "actionDescription";
  @SerializedName(SERIALIZED_NAME_ACTION_DESCRIPTION)
  private String actionDescription;

  public static final String SERIALIZED_NAME_AS_AT_MODIFIED = "asAtModified";
  @SerializedName(SERIALIZED_NAME_AS_AT_MODIFIED)
  private OffsetDateTime asAtModified;

  public static final String SERIALIZED_NAME_USER_ID_MODIFIED = "userIdModified";
  @SerializedName(SERIALIZED_NAME_USER_ID_MODIFIED)
  private String userIdModified;

  public static final String SERIALIZED_NAME_REQUEST_ID_MODIFIED = "requestIdModified";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID_MODIFIED)
  private String requestIdModified;

  public static final String SERIALIZED_NAME_AS_AT_VERSION_NUMBER = "asAtVersionNumber";
  @SerializedName(SERIALIZED_NAME_AS_AT_VERSION_NUMBER)
  private Integer asAtVersionNumber;

  public static final String SERIALIZED_NAME_STAGED_MODIFICATION_ID_MODIFIED = "stagedModificationIdModified";
  @SerializedName(SERIALIZED_NAME_STAGED_MODIFICATION_ID_MODIFIED)
  private String stagedModificationIdModified;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ATTRIBUTE_NAME = "attributeName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NAME)
  private String attributeName;

  public static final String SERIALIZED_NAME_PREVIOUS_VALUE = "previousValue";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_VALUE)
  private PropertyValue previousValue;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private PropertyValue newValue;

  public static final String SERIALIZED_NAME_EFFECTIVE_RANGE = "effectiveRange";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_RANGE)
  private StagedModificationEffectiveRange effectiveRange;

  public ChangeIntervalWithOrderManagementDetail() {
  }

  public ChangeIntervalWithOrderManagementDetail detail(Map<String, String> detail) {
    
    this.detail = detail;
    return this;
  }

  public ChangeIntervalWithOrderManagementDetail putDetailItem(String key, String detailItem) {
    if (this.detail == null) {
      this.detail = new HashMap<>();
    }
    this.detail.put(key, detailItem);
    return this;
  }

   /**
   * Information about the particular instance of the ChangeInterval (supplied information depends on the type of Action). Contains extra detail for order management actions such as related entity ids and compliance run details.
   * @return detail
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getDetail() {
    return detail;
  }


  public void setDetail(Map<String, String> detail) {
    this.detail = detail;
  }


  public ChangeIntervalWithOrderManagementDetail actionDescription(String actionDescription) {
    
    this.actionDescription = actionDescription;
    return this;
  }

   /**
   * Description of the action performed on the entity.
   * @return actionDescription
  **/
  @jakarta.annotation.Nullable
  public String getActionDescription() {
    return actionDescription;
  }


  public void setActionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
  }


  public ChangeIntervalWithOrderManagementDetail asAtModified(OffsetDateTime asAtModified) {
    
    this.asAtModified = asAtModified;
    return this;
  }

   /**
   * The date/time of the change.
   * @return asAtModified
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAsAtModified() {
    return asAtModified;
  }


  public void setAsAtModified(OffsetDateTime asAtModified) {
    this.asAtModified = asAtModified;
  }


  public ChangeIntervalWithOrderManagementDetail userIdModified(String userIdModified) {
    
    this.userIdModified = userIdModified;
    return this;
  }

   /**
   * The unique identifier of the user that made the change.
   * @return userIdModified
  **/
  @jakarta.annotation.Nullable
  public String getUserIdModified() {
    return userIdModified;
  }


  public void setUserIdModified(String userIdModified) {
    this.userIdModified = userIdModified;
  }


  public ChangeIntervalWithOrderManagementDetail requestIdModified(String requestIdModified) {
    
    this.requestIdModified = requestIdModified;
    return this;
  }

   /**
   * The unique identifier of the request that the changes were part of.
   * @return requestIdModified
  **/
  @jakarta.annotation.Nullable
  public String getRequestIdModified() {
    return requestIdModified;
  }


  public void setRequestIdModified(String requestIdModified) {
    this.requestIdModified = requestIdModified;
  }


  public ChangeIntervalWithOrderManagementDetail asAtVersionNumber(Integer asAtVersionNumber) {
    
    this.asAtVersionNumber = asAtVersionNumber;
    return this;
  }

   /**
   * The version number for the entity (the entity was created at version 1). This may refer to the version number of a changed related entity, not a change for the entity itself.
   * @return asAtVersionNumber
  **/
  @jakarta.annotation.Nullable
  public Integer getAsAtVersionNumber() {
    return asAtVersionNumber;
  }


  public void setAsAtVersionNumber(Integer asAtVersionNumber) {
    this.asAtVersionNumber = asAtVersionNumber;
  }


  public ChangeIntervalWithOrderManagementDetail stagedModificationIdModified(String stagedModificationIdModified) {
    
    this.stagedModificationIdModified = stagedModificationIdModified;
    return this;
  }

   /**
   * The id of the staged modification that was approved. Will be null if the change didn&#39;t come from a staged modification.
   * @return stagedModificationIdModified
  **/
  @jakarta.annotation.Nullable
  public String getStagedModificationIdModified() {
    return stagedModificationIdModified;
  }


  public void setStagedModificationIdModified(String stagedModificationIdModified) {
    this.stagedModificationIdModified = stagedModificationIdModified;
  }


  public ChangeIntervalWithOrderManagementDetail action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * The action performed on the entity.
   * @return action
  **/
  @jakarta.annotation.Nullable
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public ChangeIntervalWithOrderManagementDetail attributeName(String attributeName) {
    
    this.attributeName = attributeName;
    return this;
  }

   /**
   * The name of the field or property that has been changed.
   * @return attributeName
  **/
  @jakarta.annotation.Nullable
  public String getAttributeName() {
    return attributeName;
  }


  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  public ChangeIntervalWithOrderManagementDetail previousValue(PropertyValue previousValue) {
    
    this.previousValue = previousValue;
    return this;
  }

   /**
   * Get previousValue
   * @return previousValue
  **/
  @jakarta.annotation.Nullable
  public PropertyValue getPreviousValue() {
    return previousValue;
  }


  public void setPreviousValue(PropertyValue previousValue) {
    this.previousValue = previousValue;
  }


  public ChangeIntervalWithOrderManagementDetail newValue(PropertyValue newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @jakarta.annotation.Nullable
  public PropertyValue getNewValue() {
    return newValue;
  }


  public void setNewValue(PropertyValue newValue) {
    this.newValue = newValue;
  }


  public ChangeIntervalWithOrderManagementDetail effectiveRange(StagedModificationEffectiveRange effectiveRange) {
    
    this.effectiveRange = effectiveRange;
    return this;
  }

   /**
   * Get effectiveRange
   * @return effectiveRange
  **/
  @jakarta.annotation.Nullable
  public StagedModificationEffectiveRange getEffectiveRange() {
    return effectiveRange;
  }


  public void setEffectiveRange(StagedModificationEffectiveRange effectiveRange) {
    this.effectiveRange = effectiveRange;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeIntervalWithOrderManagementDetail changeIntervalWithOrderManagementDetail = (ChangeIntervalWithOrderManagementDetail) o;
    return Objects.equals(this.detail, changeIntervalWithOrderManagementDetail.detail) &&
        Objects.equals(this.actionDescription, changeIntervalWithOrderManagementDetail.actionDescription) &&
        Objects.equals(this.asAtModified, changeIntervalWithOrderManagementDetail.asAtModified) &&
        Objects.equals(this.userIdModified, changeIntervalWithOrderManagementDetail.userIdModified) &&
        Objects.equals(this.requestIdModified, changeIntervalWithOrderManagementDetail.requestIdModified) &&
        Objects.equals(this.asAtVersionNumber, changeIntervalWithOrderManagementDetail.asAtVersionNumber) &&
        Objects.equals(this.stagedModificationIdModified, changeIntervalWithOrderManagementDetail.stagedModificationIdModified) &&
        Objects.equals(this.action, changeIntervalWithOrderManagementDetail.action) &&
        Objects.equals(this.attributeName, changeIntervalWithOrderManagementDetail.attributeName) &&
        Objects.equals(this.previousValue, changeIntervalWithOrderManagementDetail.previousValue) &&
        Objects.equals(this.newValue, changeIntervalWithOrderManagementDetail.newValue) &&
        Objects.equals(this.effectiveRange, changeIntervalWithOrderManagementDetail.effectiveRange);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, actionDescription, asAtModified, userIdModified, requestIdModified, asAtVersionNumber, stagedModificationIdModified, action, attributeName, previousValue, newValue, effectiveRange);
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
    sb.append("class ChangeIntervalWithOrderManagementDetail {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    actionDescription: ").append(toIndentedString(actionDescription)).append("\n");
    sb.append("    asAtModified: ").append(toIndentedString(asAtModified)).append("\n");
    sb.append("    userIdModified: ").append(toIndentedString(userIdModified)).append("\n");
    sb.append("    requestIdModified: ").append(toIndentedString(requestIdModified)).append("\n");
    sb.append("    asAtVersionNumber: ").append(toIndentedString(asAtVersionNumber)).append("\n");
    sb.append("    stagedModificationIdModified: ").append(toIndentedString(stagedModificationIdModified)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    effectiveRange: ").append(toIndentedString(effectiveRange)).append("\n");
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
    openapiFields.add("detail");
    openapiFields.add("actionDescription");
    openapiFields.add("asAtModified");
    openapiFields.add("userIdModified");
    openapiFields.add("requestIdModified");
    openapiFields.add("asAtVersionNumber");
    openapiFields.add("stagedModificationIdModified");
    openapiFields.add("action");
    openapiFields.add("attributeName");
    openapiFields.add("previousValue");
    openapiFields.add("newValue");
    openapiFields.add("effectiveRange");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangeIntervalWithOrderManagementDetail
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeIntervalWithOrderManagementDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeIntervalWithOrderManagementDetail is not found in the empty JSON string", ChangeIntervalWithOrderManagementDetail.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("actionDescription") != null && !jsonObj.get("actionDescription").isJsonNull()) && !jsonObj.get("actionDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionDescription").toString()));
      }
      if ((jsonObj.get("userIdModified") != null && !jsonObj.get("userIdModified").isJsonNull()) && !jsonObj.get("userIdModified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIdModified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIdModified").toString()));
      }
      if ((jsonObj.get("requestIdModified") != null && !jsonObj.get("requestIdModified").isJsonNull()) && !jsonObj.get("requestIdModified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestIdModified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestIdModified").toString()));
      }
      if ((jsonObj.get("stagedModificationIdModified") != null && !jsonObj.get("stagedModificationIdModified").isJsonNull()) && !jsonObj.get("stagedModificationIdModified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stagedModificationIdModified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stagedModificationIdModified").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("attributeName") != null && !jsonObj.get("attributeName").isJsonNull()) && !jsonObj.get("attributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeName").toString()));
      }
      // validate the optional field `previousValue`
      if (jsonObj.get("previousValue") != null && !jsonObj.get("previousValue").isJsonNull()) {
        PropertyValue.validateJsonElement(jsonObj.get("previousValue"));
      }
      // validate the optional field `newValue`
      if (jsonObj.get("newValue") != null && !jsonObj.get("newValue").isJsonNull()) {
        PropertyValue.validateJsonElement(jsonObj.get("newValue"));
      }
      // validate the optional field `effectiveRange`
      if (jsonObj.get("effectiveRange") != null && !jsonObj.get("effectiveRange").isJsonNull()) {
        StagedModificationEffectiveRange.validateJsonElement(jsonObj.get("effectiveRange"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeIntervalWithOrderManagementDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeIntervalWithOrderManagementDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeIntervalWithOrderManagementDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeIntervalWithOrderManagementDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeIntervalWithOrderManagementDetail>() {
           @Override
           public void write(JsonWriter out, ChangeIntervalWithOrderManagementDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeIntervalWithOrderManagementDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeIntervalWithOrderManagementDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeIntervalWithOrderManagementDetail
  * @throws IOException if the JSON string is invalid with respect to ChangeIntervalWithOrderManagementDetail
  */
  public static ChangeIntervalWithOrderManagementDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeIntervalWithOrderManagementDetail.class);
  }

 /**
  * Convert an instance of ChangeIntervalWithOrderManagementDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}