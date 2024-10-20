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
import com.finbourne.lusid.model.FlowConventions;
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
 * Flow conventions that is to be stored in the convention data store.  Only one of these must be present.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpsertFlowConventionsRequest {
  public static final String SERIALIZED_NAME_FLOW_CONVENTIONS = "flowConventions";
  @SerializedName(SERIALIZED_NAME_FLOW_CONVENTIONS)
  private FlowConventions flowConventions;

  public UpsertFlowConventionsRequest() {
  }

  public UpsertFlowConventionsRequest flowConventions(FlowConventions flowConventions) {
    
    this.flowConventions = flowConventions;
    return this;
  }

   /**
   * Get flowConventions
   * @return flowConventions
  **/
  @jakarta.annotation.Nullable
  public FlowConventions getFlowConventions() {
    return flowConventions;
  }


  public void setFlowConventions(FlowConventions flowConventions) {
    this.flowConventions = flowConventions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertFlowConventionsRequest upsertFlowConventionsRequest = (UpsertFlowConventionsRequest) o;
    return Objects.equals(this.flowConventions, upsertFlowConventionsRequest.flowConventions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowConventions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertFlowConventionsRequest {\n");
    sb.append("    flowConventions: ").append(toIndentedString(flowConventions)).append("\n");
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
    openapiFields.add("flowConventions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpsertFlowConventionsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertFlowConventionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertFlowConventionsRequest is not found in the empty JSON string", UpsertFlowConventionsRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `flowConventions`
      if (jsonObj.get("flowConventions") != null && !jsonObj.get("flowConventions").isJsonNull()) {
        FlowConventions.validateJsonElement(jsonObj.get("flowConventions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertFlowConventionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertFlowConventionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertFlowConventionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertFlowConventionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertFlowConventionsRequest>() {
           @Override
           public void write(JsonWriter out, UpsertFlowConventionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertFlowConventionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpsertFlowConventionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpsertFlowConventionsRequest
  * @throws IOException if the JSON string is invalid with respect to UpsertFlowConventionsRequest
  */
  public static UpsertFlowConventionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertFlowConventionsRequest.class);
  }

 /**
  * Convert an instance of UpsertFlowConventionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
