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
import com.finbourne.lusid.model.ComplianceSummaryRuleResult;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * UpsertComplianceRunSummaryResult
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpsertComplianceRunSummaryResult {
  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private ResourceId runId;

  public static final String SERIALIZED_NAME_INSTIGATED_AT = "instigatedAt";
  @SerializedName(SERIALIZED_NAME_INSTIGATED_AT)
  private OffsetDateTime instigatedAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completedAt";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<ComplianceSummaryRuleResult> results = new ArrayList<>();

  public UpsertComplianceRunSummaryResult() {
  }

  public UpsertComplianceRunSummaryResult runId(ResourceId runId) {
    
    this.runId = runId;
    return this;
  }

   /**
   * Get runId
   * @return runId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getRunId() {
    return runId;
  }


  public void setRunId(ResourceId runId) {
    this.runId = runId;
  }


  public UpsertComplianceRunSummaryResult instigatedAt(OffsetDateTime instigatedAt) {
    
    this.instigatedAt = instigatedAt;
    return this;
  }

   /**
   * Get instigatedAt
   * @return instigatedAt
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getInstigatedAt() {
    return instigatedAt;
  }


  public void setInstigatedAt(OffsetDateTime instigatedAt) {
    this.instigatedAt = instigatedAt;
  }


  public UpsertComplianceRunSummaryResult completedAt(OffsetDateTime completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public UpsertComplianceRunSummaryResult schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @jakarta.annotation.Nonnull
  public String getSchedule() {
    return schedule;
  }


  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public UpsertComplianceRunSummaryResult results(List<ComplianceSummaryRuleResult> results) {
    
    this.results = results;
    return this;
  }

  public UpsertComplianceRunSummaryResult addResultsItem(ComplianceSummaryRuleResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nonnull
  public List<ComplianceSummaryRuleResult> getResults() {
    return results;
  }


  public void setResults(List<ComplianceSummaryRuleResult> results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertComplianceRunSummaryResult upsertComplianceRunSummaryResult = (UpsertComplianceRunSummaryResult) o;
    return Objects.equals(this.runId, upsertComplianceRunSummaryResult.runId) &&
        Objects.equals(this.instigatedAt, upsertComplianceRunSummaryResult.instigatedAt) &&
        Objects.equals(this.completedAt, upsertComplianceRunSummaryResult.completedAt) &&
        Objects.equals(this.schedule, upsertComplianceRunSummaryResult.schedule) &&
        Objects.equals(this.results, upsertComplianceRunSummaryResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, instigatedAt, completedAt, schedule, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertComplianceRunSummaryResult {\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    instigatedAt: ").append(toIndentedString(instigatedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("runId");
    openapiFields.add("instigatedAt");
    openapiFields.add("completedAt");
    openapiFields.add("schedule");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("runId");
    openapiRequiredFields.add("instigatedAt");
    openapiRequiredFields.add("completedAt");
    openapiRequiredFields.add("schedule");
    openapiRequiredFields.add("results");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpsertComplianceRunSummaryResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertComplianceRunSummaryResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertComplianceRunSummaryResult is not found in the empty JSON string", UpsertComplianceRunSummaryResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpsertComplianceRunSummaryResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `runId`
      ResourceId.validateJsonElement(jsonObj.get("runId"));
      if (!jsonObj.get("schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedule").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        ComplianceSummaryRuleResult.validateJsonElement(jsonArrayresults.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertComplianceRunSummaryResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertComplianceRunSummaryResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertComplianceRunSummaryResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertComplianceRunSummaryResult.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertComplianceRunSummaryResult>() {
           @Override
           public void write(JsonWriter out, UpsertComplianceRunSummaryResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertComplianceRunSummaryResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpsertComplianceRunSummaryResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpsertComplianceRunSummaryResult
  * @throws IOException if the JSON string is invalid with respect to UpsertComplianceRunSummaryResult
  */
  public static UpsertComplianceRunSummaryResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertComplianceRunSummaryResult.class);
  }

 /**
  * Convert an instance of UpsertComplianceRunSummaryResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
