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
import com.finbourne.lusid.model.Placement;
import com.finbourne.lusid.model.ResourceId;
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
 * CancelledPlacementResult
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CancelledPlacementResult {
  public static final String SERIALIZED_NAME_PLACEMENT_STATE = "placementState";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_STATE)
  private Placement placementState;

  public static final String SERIALIZED_NAME_CANCELLED_CHILD_PLACEMENTS = "cancelledChildPlacements";
  @SerializedName(SERIALIZED_NAME_CANCELLED_CHILD_PLACEMENTS)
  private List<ResourceId> cancelledChildPlacements = new ArrayList<>();

  public CancelledPlacementResult() {
  }

  public CancelledPlacementResult placementState(Placement placementState) {
    
    this.placementState = placementState;
    return this;
  }

   /**
   * Get placementState
   * @return placementState
  **/
  @jakarta.annotation.Nullable
  public Placement getPlacementState() {
    return placementState;
  }


  public void setPlacementState(Placement placementState) {
    this.placementState = placementState;
  }


  public CancelledPlacementResult cancelledChildPlacements(List<ResourceId> cancelledChildPlacements) {
    
    this.cancelledChildPlacements = cancelledChildPlacements;
    return this;
  }

  public CancelledPlacementResult addCancelledChildPlacementsItem(ResourceId cancelledChildPlacementsItem) {
    if (this.cancelledChildPlacements == null) {
      this.cancelledChildPlacements = new ArrayList<>();
    }
    this.cancelledChildPlacements.add(cancelledChildPlacementsItem);
    return this;
  }

   /**
   * Child placements which have also been cancelled following cancellation of the parent
   * @return cancelledChildPlacements
  **/
  @jakarta.annotation.Nonnull
  public List<ResourceId> getCancelledChildPlacements() {
    return cancelledChildPlacements;
  }


  public void setCancelledChildPlacements(List<ResourceId> cancelledChildPlacements) {
    this.cancelledChildPlacements = cancelledChildPlacements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelledPlacementResult cancelledPlacementResult = (CancelledPlacementResult) o;
    return Objects.equals(this.placementState, cancelledPlacementResult.placementState) &&
        Objects.equals(this.cancelledChildPlacements, cancelledPlacementResult.cancelledChildPlacements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementState, cancelledChildPlacements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelledPlacementResult {\n");
    sb.append("    placementState: ").append(toIndentedString(placementState)).append("\n");
    sb.append("    cancelledChildPlacements: ").append(toIndentedString(cancelledChildPlacements)).append("\n");
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
    openapiFields.add("placementState");
    openapiFields.add("cancelledChildPlacements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cancelledChildPlacements");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CancelledPlacementResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CancelledPlacementResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CancelledPlacementResult is not found in the empty JSON string", CancelledPlacementResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CancelledPlacementResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `placementState`
      if (jsonObj.get("placementState") != null && !jsonObj.get("placementState").isJsonNull()) {
        Placement.validateJsonElement(jsonObj.get("placementState"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("cancelledChildPlacements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancelledChildPlacements` to be an array in the JSON string but got `%s`", jsonObj.get("cancelledChildPlacements").toString()));
      }

      JsonArray jsonArraycancelledChildPlacements = jsonObj.getAsJsonArray("cancelledChildPlacements");
      // validate the required field `cancelledChildPlacements` (array)
      for (int i = 0; i < jsonArraycancelledChildPlacements.size(); i++) {
        ResourceId.validateJsonElement(jsonArraycancelledChildPlacements.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CancelledPlacementResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CancelledPlacementResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CancelledPlacementResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CancelledPlacementResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CancelledPlacementResult>() {
           @Override
           public void write(JsonWriter out, CancelledPlacementResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CancelledPlacementResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CancelledPlacementResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CancelledPlacementResult
  * @throws IOException if the JSON string is invalid with respect to CancelledPlacementResult
  */
  public static CancelledPlacementResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CancelledPlacementResult.class);
  }

 /**
  * Convert an instance of CancelledPlacementResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}