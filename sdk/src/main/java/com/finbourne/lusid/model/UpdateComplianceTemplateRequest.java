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
import com.finbourne.lusid.model.ComplianceTemplateVariationRequest;
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
 * UpdateComplianceTemplateRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateComplianceTemplateRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VARIATIONS = "variations";
  @SerializedName(SERIALIZED_NAME_VARIATIONS)
  private List<ComplianceTemplateVariationRequest> variations = new ArrayList<>();

  public UpdateComplianceTemplateRequest() {
  }

  public UpdateComplianceTemplateRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code given for the Compliance Template
   * @return code
  **/
  @jakarta.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public UpdateComplianceTemplateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Compliance Template
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateComplianceTemplateRequest variations(List<ComplianceTemplateVariationRequest> variations) {
    
    this.variations = variations;
    return this;
  }

  public UpdateComplianceTemplateRequest addVariationsItem(ComplianceTemplateVariationRequest variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<>();
    }
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * Variation details of a Compliance Template
   * @return variations
  **/
  @jakarta.annotation.Nonnull
  public List<ComplianceTemplateVariationRequest> getVariations() {
    return variations;
  }


  public void setVariations(List<ComplianceTemplateVariationRequest> variations) {
    this.variations = variations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateComplianceTemplateRequest updateComplianceTemplateRequest = (UpdateComplianceTemplateRequest) o;
    return Objects.equals(this.code, updateComplianceTemplateRequest.code) &&
        Objects.equals(this.description, updateComplianceTemplateRequest.description) &&
        Objects.equals(this.variations, updateComplianceTemplateRequest.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, variations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateComplianceTemplateRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("description");
    openapiFields.add("variations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("variations");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateComplianceTemplateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateComplianceTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateComplianceTemplateRequest is not found in the empty JSON string", UpdateComplianceTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateComplianceTemplateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("variations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variations` to be an array in the JSON string but got `%s`", jsonObj.get("variations").toString()));
      }

      JsonArray jsonArrayvariations = jsonObj.getAsJsonArray("variations");
      // validate the required field `variations` (array)
      for (int i = 0; i < jsonArrayvariations.size(); i++) {
        ComplianceTemplateVariationRequest.validateJsonElement(jsonArrayvariations.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateComplianceTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateComplianceTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateComplianceTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateComplianceTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateComplianceTemplateRequest>() {
           @Override
           public void write(JsonWriter out, UpdateComplianceTemplateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateComplianceTemplateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateComplianceTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateComplianceTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateComplianceTemplateRequest
  */
  public static UpdateComplianceTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateComplianceTemplateRequest.class);
  }

 /**
  * Convert an instance of UpdateComplianceTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}