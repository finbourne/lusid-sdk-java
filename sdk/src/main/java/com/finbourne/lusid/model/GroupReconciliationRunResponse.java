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
import com.finbourne.lusid.model.GroupReconciliationSummary;
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
 * GroupReconciliationRunResponse
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupReconciliationRunResponse {
  public static final String SERIALIZED_NAME_RECONCILIATION_SUMMARIES = "reconciliationSummaries";
  @SerializedName(SERIALIZED_NAME_RECONCILIATION_SUMMARIES)
  private List<GroupReconciliationSummary> reconciliationSummaries = new ArrayList<>();

  public GroupReconciliationRunResponse() {
  }

  public GroupReconciliationRunResponse reconciliationSummaries(List<GroupReconciliationSummary> reconciliationSummaries) {
    
    this.reconciliationSummaries = reconciliationSummaries;
    return this;
  }

  public GroupReconciliationRunResponse addReconciliationSummariesItem(GroupReconciliationSummary reconciliationSummariesItem) {
    if (this.reconciliationSummaries == null) {
      this.reconciliationSummaries = new ArrayList<>();
    }
    this.reconciliationSummaries.add(reconciliationSummariesItem);
    return this;
  }

   /**
   * One summary record for each of the \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; reconciliations performed
   * @return reconciliationSummaries
  **/
  @jakarta.annotation.Nonnull
  public List<GroupReconciliationSummary> getReconciliationSummaries() {
    return reconciliationSummaries;
  }


  public void setReconciliationSummaries(List<GroupReconciliationSummary> reconciliationSummaries) {
    this.reconciliationSummaries = reconciliationSummaries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupReconciliationRunResponse groupReconciliationRunResponse = (GroupReconciliationRunResponse) o;
    return Objects.equals(this.reconciliationSummaries, groupReconciliationRunResponse.reconciliationSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reconciliationSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupReconciliationRunResponse {\n");
    sb.append("    reconciliationSummaries: ").append(toIndentedString(reconciliationSummaries)).append("\n");
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
    openapiFields.add("reconciliationSummaries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("reconciliationSummaries");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupReconciliationRunResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupReconciliationRunResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupReconciliationRunResponse is not found in the empty JSON string", GroupReconciliationRunResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupReconciliationRunResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("reconciliationSummaries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reconciliationSummaries` to be an array in the JSON string but got `%s`", jsonObj.get("reconciliationSummaries").toString()));
      }

      JsonArray jsonArrayreconciliationSummaries = jsonObj.getAsJsonArray("reconciliationSummaries");
      // validate the required field `reconciliationSummaries` (array)
      for (int i = 0; i < jsonArrayreconciliationSummaries.size(); i++) {
        GroupReconciliationSummary.validateJsonElement(jsonArrayreconciliationSummaries.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupReconciliationRunResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupReconciliationRunResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupReconciliationRunResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupReconciliationRunResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupReconciliationRunResponse>() {
           @Override
           public void write(JsonWriter out, GroupReconciliationRunResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupReconciliationRunResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupReconciliationRunResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupReconciliationRunResponse
  * @throws IOException if the JSON string is invalid with respect to GroupReconciliationRunResponse
  */
  public static GroupReconciliationRunResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupReconciliationRunResponse.class);
  }

 /**
  * Convert an instance of GroupReconciliationRunResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}