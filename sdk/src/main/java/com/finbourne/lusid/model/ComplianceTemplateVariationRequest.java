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
import com.finbourne.lusid.model.ComplianceStepRequest;
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
 * ComplianceTemplateVariationRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplianceTemplateVariationRequest {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OUTCOME_DESCRIPTION = "outcomeDescription";
  @SerializedName(SERIALIZED_NAME_OUTCOME_DESCRIPTION)
  private String outcomeDescription;

  public static final String SERIALIZED_NAME_REFERENCED_GROUP_LABEL = "referencedGroupLabel";
  @SerializedName(SERIALIZED_NAME_REFERENCED_GROUP_LABEL)
  private String referencedGroupLabel;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<ComplianceStepRequest> steps = new ArrayList<>();

  public ComplianceTemplateVariationRequest() {
  }

  public ComplianceTemplateVariationRequest label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @jakarta.annotation.Nonnull
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ComplianceTemplateVariationRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ComplianceTemplateVariationRequest outcomeDescription(String outcomeDescription) {
    
    this.outcomeDescription = outcomeDescription;
    return this;
  }

   /**
   * Get outcomeDescription
   * @return outcomeDescription
  **/
  @jakarta.annotation.Nullable
  public String getOutcomeDescription() {
    return outcomeDescription;
  }


  public void setOutcomeDescription(String outcomeDescription) {
    this.outcomeDescription = outcomeDescription;
  }


  public ComplianceTemplateVariationRequest referencedGroupLabel(String referencedGroupLabel) {
    
    this.referencedGroupLabel = referencedGroupLabel;
    return this;
  }

   /**
   * Get referencedGroupLabel
   * @return referencedGroupLabel
  **/
  @jakarta.annotation.Nullable
  public String getReferencedGroupLabel() {
    return referencedGroupLabel;
  }


  public void setReferencedGroupLabel(String referencedGroupLabel) {
    this.referencedGroupLabel = referencedGroupLabel;
  }


  public ComplianceTemplateVariationRequest steps(List<ComplianceStepRequest> steps) {
    
    this.steps = steps;
    return this;
  }

  public ComplianceTemplateVariationRequest addStepsItem(ComplianceStepRequest stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @jakarta.annotation.Nonnull
  public List<ComplianceStepRequest> getSteps() {
    return steps;
  }


  public void setSteps(List<ComplianceStepRequest> steps) {
    this.steps = steps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceTemplateVariationRequest complianceTemplateVariationRequest = (ComplianceTemplateVariationRequest) o;
    return Objects.equals(this.label, complianceTemplateVariationRequest.label) &&
        Objects.equals(this.description, complianceTemplateVariationRequest.description) &&
        Objects.equals(this.outcomeDescription, complianceTemplateVariationRequest.outcomeDescription) &&
        Objects.equals(this.referencedGroupLabel, complianceTemplateVariationRequest.referencedGroupLabel) &&
        Objects.equals(this.steps, complianceTemplateVariationRequest.steps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, description, outcomeDescription, referencedGroupLabel, steps);
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
    sb.append("class ComplianceTemplateVariationRequest {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    outcomeDescription: ").append(toIndentedString(outcomeDescription)).append("\n");
    sb.append("    referencedGroupLabel: ").append(toIndentedString(referencedGroupLabel)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("description");
    openapiFields.add("outcomeDescription");
    openapiFields.add("referencedGroupLabel");
    openapiFields.add("steps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("steps");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ComplianceTemplateVariationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ComplianceTemplateVariationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComplianceTemplateVariationRequest is not found in the empty JSON string", ComplianceTemplateVariationRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ComplianceTemplateVariationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("outcomeDescription") != null && !jsonObj.get("outcomeDescription").isJsonNull()) && !jsonObj.get("outcomeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcomeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outcomeDescription").toString()));
      }
      if ((jsonObj.get("referencedGroupLabel") != null && !jsonObj.get("referencedGroupLabel").isJsonNull()) && !jsonObj.get("referencedGroupLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referencedGroupLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referencedGroupLabel").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
      }

      JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
      // validate the required field `steps` (array)
      for (int i = 0; i < jsonArraysteps.size(); i++) {
        ComplianceStepRequest.validateJsonElement(jsonArraysteps.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComplianceTemplateVariationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComplianceTemplateVariationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComplianceTemplateVariationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComplianceTemplateVariationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ComplianceTemplateVariationRequest>() {
           @Override
           public void write(JsonWriter out, ComplianceTemplateVariationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComplianceTemplateVariationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ComplianceTemplateVariationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ComplianceTemplateVariationRequest
  * @throws IOException if the JSON string is invalid with respect to ComplianceTemplateVariationRequest
  */
  public static ComplianceTemplateVariationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComplianceTemplateVariationRequest.class);
  }

 /**
  * Convert an instance of ComplianceTemplateVariationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}