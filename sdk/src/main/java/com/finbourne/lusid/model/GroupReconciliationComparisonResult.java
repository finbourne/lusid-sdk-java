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
import com.finbourne.lusid.model.GroupReconciliationAggregateAttributeValues;
import com.finbourne.lusid.model.GroupReconciliationCoreAttributeValues;
import com.finbourne.lusid.model.GroupReconciliationDates;
import com.finbourne.lusid.model.GroupReconciliationInstanceId;
import com.finbourne.lusid.model.GroupReconciliationUserReview;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.Version;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * GroupReconciliationComparisonResult
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupReconciliationComparisonResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_RECONCILIATION_TYPE = "reconciliationType";
  @SerializedName(SERIALIZED_NAME_RECONCILIATION_TYPE)
  private String reconciliationType;

  public static final String SERIALIZED_NAME_GROUP_RECONCILIATION_DEFINITION_ID = "groupReconciliationDefinitionId";
  @SerializedName(SERIALIZED_NAME_GROUP_RECONCILIATION_DEFINITION_ID)
  private ResourceId groupReconciliationDefinitionId;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private GroupReconciliationInstanceId instanceId;

  public static final String SERIALIZED_NAME_COMPARISON_RESULT_ID = "comparisonResultId";
  @SerializedName(SERIALIZED_NAME_COMPARISON_RESULT_ID)
  private String comparisonResultId;

  public static final String SERIALIZED_NAME_RECONCILIATION_RUN_AS_AT = "reconciliationRunAsAt";
  @SerializedName(SERIALIZED_NAME_RECONCILIATION_RUN_AS_AT)
  private OffsetDateTime reconciliationRunAsAt;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "resultType";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  private String resultType;

  public static final String SERIALIZED_NAME_RESULT_STATUS = "resultStatus";
  @SerializedName(SERIALIZED_NAME_RESULT_STATUS)
  private String resultStatus;

  public static final String SERIALIZED_NAME_REVIEW_STATUS = "reviewStatus";
  @SerializedName(SERIALIZED_NAME_REVIEW_STATUS)
  private String reviewStatus;

  public static final String SERIALIZED_NAME_DATES_RECONCILED = "datesReconciled";
  @SerializedName(SERIALIZED_NAME_DATES_RECONCILED)
  private GroupReconciliationDates datesReconciled;

  public static final String SERIALIZED_NAME_CORE_ATTRIBUTES = "coreAttributes";
  @SerializedName(SERIALIZED_NAME_CORE_ATTRIBUTES)
  private GroupReconciliationCoreAttributeValues coreAttributes;

  public static final String SERIALIZED_NAME_AGGREGATE_ATTRIBUTES = "aggregateAttributes";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_ATTRIBUTES)
  private GroupReconciliationAggregateAttributeValues aggregateAttributes;

  public static final String SERIALIZED_NAME_USER_REVIEW = "userReview";
  @SerializedName(SERIALIZED_NAME_USER_REVIEW)
  private GroupReconciliationUserReview userReview;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public GroupReconciliationComparisonResult() {
  }

  public GroupReconciliationComparisonResult id(ResourceId id) {
    
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


  public GroupReconciliationComparisonResult reconciliationType(String reconciliationType) {
    
    this.reconciliationType = reconciliationType;
    return this;
  }

   /**
   * The type of reconciliation to perform. \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot;
   * @return reconciliationType
  **/
  @jakarta.annotation.Nonnull
  public String getReconciliationType() {
    return reconciliationType;
  }


  public void setReconciliationType(String reconciliationType) {
    this.reconciliationType = reconciliationType;
  }


  public GroupReconciliationComparisonResult groupReconciliationDefinitionId(ResourceId groupReconciliationDefinitionId) {
    
    this.groupReconciliationDefinitionId = groupReconciliationDefinitionId;
    return this;
  }

   /**
   * Get groupReconciliationDefinitionId
   * @return groupReconciliationDefinitionId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getGroupReconciliationDefinitionId() {
    return groupReconciliationDefinitionId;
  }


  public void setGroupReconciliationDefinitionId(ResourceId groupReconciliationDefinitionId) {
    this.groupReconciliationDefinitionId = groupReconciliationDefinitionId;
  }


  public GroupReconciliationComparisonResult instanceId(GroupReconciliationInstanceId instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @jakarta.annotation.Nonnull
  public GroupReconciliationInstanceId getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(GroupReconciliationInstanceId instanceId) {
    this.instanceId = instanceId;
  }


  public GroupReconciliationComparisonResult comparisonResultId(String comparisonResultId) {
    
    this.comparisonResultId = comparisonResultId;
    return this;
  }

   /**
   * Comparison result identifier, encoded value for core attribute results, aggregate attribute results, reconciliation type and run instanceId.
   * @return comparisonResultId
  **/
  @jakarta.annotation.Nonnull
  public String getComparisonResultId() {
    return comparisonResultId;
  }


  public void setComparisonResultId(String comparisonResultId) {
    this.comparisonResultId = comparisonResultId;
  }


  public GroupReconciliationComparisonResult reconciliationRunAsAt(OffsetDateTime reconciliationRunAsAt) {
    
    this.reconciliationRunAsAt = reconciliationRunAsAt;
    return this;
  }

   /**
   * The timestamp when the run occurred.
   * @return reconciliationRunAsAt
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getReconciliationRunAsAt() {
    return reconciliationRunAsAt;
  }


  public void setReconciliationRunAsAt(OffsetDateTime reconciliationRunAsAt) {
    this.reconciliationRunAsAt = reconciliationRunAsAt;
  }


  public GroupReconciliationComparisonResult resultType(String resultType) {
    
    this.resultType = resultType;
    return this;
  }

   /**
   * Reconciliation run general result. \&quot;Break\&quot; | \&quot;Match\&quot; | \&quot;PartialMatch\&quot; | \&quot;NotFound
   * @return resultType
  **/
  @jakarta.annotation.Nonnull
  public String getResultType() {
    return resultType;
  }


  public void setResultType(String resultType) {
    this.resultType = resultType;
  }


  public GroupReconciliationComparisonResult resultStatus(String resultStatus) {
    
    this.resultStatus = resultStatus;
    return this;
  }

   /**
   * Indicates how a particular result evolves from one run to the next. \&quot;New\&quot; | \&quot;Confirmed\&quot; | \&quot;Changed\&quot;
   * @return resultStatus
  **/
  @jakarta.annotation.Nonnull
  public String getResultStatus() {
    return resultStatus;
  }


  public void setResultStatus(String resultStatus) {
    this.resultStatus = resultStatus;
  }


  public GroupReconciliationComparisonResult reviewStatus(String reviewStatus) {
    
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Status of whether user has provided any input (comments, manual matches, break codes). \&quot;Pending\&quot; | \&quot;Reviewed\&quot; | \&quot;Matched\&quot; | \&quot;Invalid\&quot;
   * @return reviewStatus
  **/
  @jakarta.annotation.Nonnull
  public String getReviewStatus() {
    return reviewStatus;
  }


  public void setReviewStatus(String reviewStatus) {
    this.reviewStatus = reviewStatus;
  }


  public GroupReconciliationComparisonResult datesReconciled(GroupReconciliationDates datesReconciled) {
    
    this.datesReconciled = datesReconciled;
    return this;
  }

   /**
   * Get datesReconciled
   * @return datesReconciled
  **/
  @jakarta.annotation.Nonnull
  public GroupReconciliationDates getDatesReconciled() {
    return datesReconciled;
  }


  public void setDatesReconciled(GroupReconciliationDates datesReconciled) {
    this.datesReconciled = datesReconciled;
  }


  public GroupReconciliationComparisonResult coreAttributes(GroupReconciliationCoreAttributeValues coreAttributes) {
    
    this.coreAttributes = coreAttributes;
    return this;
  }

   /**
   * Get coreAttributes
   * @return coreAttributes
  **/
  @jakarta.annotation.Nonnull
  public GroupReconciliationCoreAttributeValues getCoreAttributes() {
    return coreAttributes;
  }


  public void setCoreAttributes(GroupReconciliationCoreAttributeValues coreAttributes) {
    this.coreAttributes = coreAttributes;
  }


  public GroupReconciliationComparisonResult aggregateAttributes(GroupReconciliationAggregateAttributeValues aggregateAttributes) {
    
    this.aggregateAttributes = aggregateAttributes;
    return this;
  }

   /**
   * Get aggregateAttributes
   * @return aggregateAttributes
  **/
  @jakarta.annotation.Nonnull
  public GroupReconciliationAggregateAttributeValues getAggregateAttributes() {
    return aggregateAttributes;
  }


  public void setAggregateAttributes(GroupReconciliationAggregateAttributeValues aggregateAttributes) {
    this.aggregateAttributes = aggregateAttributes;
  }


  public GroupReconciliationComparisonResult userReview(GroupReconciliationUserReview userReview) {
    
    this.userReview = userReview;
    return this;
  }

   /**
   * Get userReview
   * @return userReview
  **/
  @jakarta.annotation.Nullable
  public GroupReconciliationUserReview getUserReview() {
    return userReview;
  }


  public void setUserReview(GroupReconciliationUserReview userReview) {
    this.userReview = userReview;
  }


  public GroupReconciliationComparisonResult href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @jakarta.annotation.Nullable
  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public GroupReconciliationComparisonResult version(Version version) {
    
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


  public GroupReconciliationComparisonResult links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public GroupReconciliationComparisonResult addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupReconciliationComparisonResult groupReconciliationComparisonResult = (GroupReconciliationComparisonResult) o;
    return Objects.equals(this.id, groupReconciliationComparisonResult.id) &&
        Objects.equals(this.reconciliationType, groupReconciliationComparisonResult.reconciliationType) &&
        Objects.equals(this.groupReconciliationDefinitionId, groupReconciliationComparisonResult.groupReconciliationDefinitionId) &&
        Objects.equals(this.instanceId, groupReconciliationComparisonResult.instanceId) &&
        Objects.equals(this.comparisonResultId, groupReconciliationComparisonResult.comparisonResultId) &&
        Objects.equals(this.reconciliationRunAsAt, groupReconciliationComparisonResult.reconciliationRunAsAt) &&
        Objects.equals(this.resultType, groupReconciliationComparisonResult.resultType) &&
        Objects.equals(this.resultStatus, groupReconciliationComparisonResult.resultStatus) &&
        Objects.equals(this.reviewStatus, groupReconciliationComparisonResult.reviewStatus) &&
        Objects.equals(this.datesReconciled, groupReconciliationComparisonResult.datesReconciled) &&
        Objects.equals(this.coreAttributes, groupReconciliationComparisonResult.coreAttributes) &&
        Objects.equals(this.aggregateAttributes, groupReconciliationComparisonResult.aggregateAttributes) &&
        Objects.equals(this.userReview, groupReconciliationComparisonResult.userReview) &&
        Objects.equals(this.href, groupReconciliationComparisonResult.href) &&
        Objects.equals(this.version, groupReconciliationComparisonResult.version) &&
        Objects.equals(this.links, groupReconciliationComparisonResult.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reconciliationType, groupReconciliationDefinitionId, instanceId, comparisonResultId, reconciliationRunAsAt, resultType, resultStatus, reviewStatus, datesReconciled, coreAttributes, aggregateAttributes, userReview, href, version, links);
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
    sb.append("class GroupReconciliationComparisonResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reconciliationType: ").append(toIndentedString(reconciliationType)).append("\n");
    sb.append("    groupReconciliationDefinitionId: ").append(toIndentedString(groupReconciliationDefinitionId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    comparisonResultId: ").append(toIndentedString(comparisonResultId)).append("\n");
    sb.append("    reconciliationRunAsAt: ").append(toIndentedString(reconciliationRunAsAt)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    datesReconciled: ").append(toIndentedString(datesReconciled)).append("\n");
    sb.append("    coreAttributes: ").append(toIndentedString(coreAttributes)).append("\n");
    sb.append("    aggregateAttributes: ").append(toIndentedString(aggregateAttributes)).append("\n");
    sb.append("    userReview: ").append(toIndentedString(userReview)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("reconciliationType");
    openapiFields.add("groupReconciliationDefinitionId");
    openapiFields.add("instanceId");
    openapiFields.add("comparisonResultId");
    openapiFields.add("reconciliationRunAsAt");
    openapiFields.add("resultType");
    openapiFields.add("resultStatus");
    openapiFields.add("reviewStatus");
    openapiFields.add("datesReconciled");
    openapiFields.add("coreAttributes");
    openapiFields.add("aggregateAttributes");
    openapiFields.add("userReview");
    openapiFields.add("href");
    openapiFields.add("version");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("reconciliationType");
    openapiRequiredFields.add("groupReconciliationDefinitionId");
    openapiRequiredFields.add("instanceId");
    openapiRequiredFields.add("comparisonResultId");
    openapiRequiredFields.add("reconciliationRunAsAt");
    openapiRequiredFields.add("resultType");
    openapiRequiredFields.add("resultStatus");
    openapiRequiredFields.add("reviewStatus");
    openapiRequiredFields.add("datesReconciled");
    openapiRequiredFields.add("coreAttributes");
    openapiRequiredFields.add("aggregateAttributes");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupReconciliationComparisonResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupReconciliationComparisonResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupReconciliationComparisonResult is not found in the empty JSON string", GroupReconciliationComparisonResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupReconciliationComparisonResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      ResourceId.validateJsonElement(jsonObj.get("id"));
      if (!jsonObj.get("reconciliationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reconciliationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reconciliationType").toString()));
      }
      // validate the required field `groupReconciliationDefinitionId`
      ResourceId.validateJsonElement(jsonObj.get("groupReconciliationDefinitionId"));
      // validate the required field `instanceId`
      GroupReconciliationInstanceId.validateJsonElement(jsonObj.get("instanceId"));
      if (!jsonObj.get("comparisonResultId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comparisonResultId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comparisonResultId").toString()));
      }
      if (!jsonObj.get("resultType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultType").toString()));
      }
      if (!jsonObj.get("resultStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultStatus").toString()));
      }
      if (!jsonObj.get("reviewStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewStatus").toString()));
      }
      // validate the required field `datesReconciled`
      GroupReconciliationDates.validateJsonElement(jsonObj.get("datesReconciled"));
      // validate the required field `coreAttributes`
      GroupReconciliationCoreAttributeValues.validateJsonElement(jsonObj.get("coreAttributes"));
      // validate the required field `aggregateAttributes`
      GroupReconciliationAggregateAttributeValues.validateJsonElement(jsonObj.get("aggregateAttributes"));
      // validate the optional field `userReview`
      if (jsonObj.get("userReview") != null && !jsonObj.get("userReview").isJsonNull()) {
        GroupReconciliationUserReview.validateJsonElement(jsonObj.get("userReview"));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Version.validateJsonElement(jsonObj.get("version"));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupReconciliationComparisonResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupReconciliationComparisonResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupReconciliationComparisonResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupReconciliationComparisonResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupReconciliationComparisonResult>() {
           @Override
           public void write(JsonWriter out, GroupReconciliationComparisonResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupReconciliationComparisonResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupReconciliationComparisonResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupReconciliationComparisonResult
  * @throws IOException if the JSON string is invalid with respect to GroupReconciliationComparisonResult
  */
  public static GroupReconciliationComparisonResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupReconciliationComparisonResult.class);
  }

 /**
  * Convert an instance of GroupReconciliationComparisonResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}