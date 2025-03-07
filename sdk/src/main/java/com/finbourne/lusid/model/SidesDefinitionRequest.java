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
import com.finbourne.lusid.model.SideDefinitionRequest;
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
 * SidesDefinitionRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SidesDefinitionRequest {
  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private String side;

  public static final String SERIALIZED_NAME_SIDE_REQUEST = "sideRequest";
  @SerializedName(SERIALIZED_NAME_SIDE_REQUEST)
  private SideDefinitionRequest sideRequest;

  public SidesDefinitionRequest() {
  }

  public SidesDefinitionRequest side(String side) {
    
    this.side = side;
    return this;
  }

   /**
   * A unique label identifying the side definition.
   * @return side
  **/
  @jakarta.annotation.Nonnull
  public String getSide() {
    return side;
  }


  public void setSide(String side) {
    this.side = side;
  }


  public SidesDefinitionRequest sideRequest(SideDefinitionRequest sideRequest) {
    
    this.sideRequest = sideRequest;
    return this;
  }

   /**
   * Get sideRequest
   * @return sideRequest
  **/
  @jakarta.annotation.Nonnull
  public SideDefinitionRequest getSideRequest() {
    return sideRequest;
  }


  public void setSideRequest(SideDefinitionRequest sideRequest) {
    this.sideRequest = sideRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SidesDefinitionRequest sidesDefinitionRequest = (SidesDefinitionRequest) o;
    return Objects.equals(this.side, sidesDefinitionRequest.side) &&
        Objects.equals(this.sideRequest, sidesDefinitionRequest.sideRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(side, sideRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SidesDefinitionRequest {\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    sideRequest: ").append(toIndentedString(sideRequest)).append("\n");
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
    openapiFields.add("side");
    openapiFields.add("sideRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("side");
    openapiRequiredFields.add("sideRequest");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SidesDefinitionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SidesDefinitionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SidesDefinitionRequest is not found in the empty JSON string", SidesDefinitionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SidesDefinitionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("side").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `side` to be a primitive type in the JSON string but got `%s`", jsonObj.get("side").toString()));
      }
      // validate the required field `sideRequest`
      SideDefinitionRequest.validateJsonElement(jsonObj.get("sideRequest"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SidesDefinitionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SidesDefinitionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SidesDefinitionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SidesDefinitionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SidesDefinitionRequest>() {
           @Override
           public void write(JsonWriter out, SidesDefinitionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SidesDefinitionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SidesDefinitionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SidesDefinitionRequest
  * @throws IOException if the JSON string is invalid with respect to SidesDefinitionRequest
  */
  public static SidesDefinitionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SidesDefinitionRequest.class);
  }

 /**
  * Convert an instance of SidesDefinitionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
