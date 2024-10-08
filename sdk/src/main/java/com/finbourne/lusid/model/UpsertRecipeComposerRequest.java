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
import com.finbourne.lusid.model.RecipeComposer;
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
 * A recipe composer that is to be stored in the recipe composer data store or used for inline resolving.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpsertRecipeComposerRequest {
  public static final String SERIALIZED_NAME_RECIPE_COMPOSER = "recipeComposer";
  @SerializedName(SERIALIZED_NAME_RECIPE_COMPOSER)
  private RecipeComposer recipeComposer;

  public UpsertRecipeComposerRequest() {
  }

  public UpsertRecipeComposerRequest recipeComposer(RecipeComposer recipeComposer) {
    
    this.recipeComposer = recipeComposer;
    return this;
  }

   /**
   * Get recipeComposer
   * @return recipeComposer
  **/
  @jakarta.annotation.Nullable
  public RecipeComposer getRecipeComposer() {
    return recipeComposer;
  }


  public void setRecipeComposer(RecipeComposer recipeComposer) {
    this.recipeComposer = recipeComposer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertRecipeComposerRequest upsertRecipeComposerRequest = (UpsertRecipeComposerRequest) o;
    return Objects.equals(this.recipeComposer, upsertRecipeComposerRequest.recipeComposer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipeComposer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertRecipeComposerRequest {\n");
    sb.append("    recipeComposer: ").append(toIndentedString(recipeComposer)).append("\n");
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
    openapiFields.add("recipeComposer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpsertRecipeComposerRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertRecipeComposerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertRecipeComposerRequest is not found in the empty JSON string", UpsertRecipeComposerRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `recipeComposer`
      if (jsonObj.get("recipeComposer") != null && !jsonObj.get("recipeComposer").isJsonNull()) {
        RecipeComposer.validateJsonElement(jsonObj.get("recipeComposer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertRecipeComposerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertRecipeComposerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertRecipeComposerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertRecipeComposerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertRecipeComposerRequest>() {
           @Override
           public void write(JsonWriter out, UpsertRecipeComposerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertRecipeComposerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpsertRecipeComposerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpsertRecipeComposerRequest
  * @throws IOException if the JSON string is invalid with respect to UpsertRecipeComposerRequest
  */
  public static UpsertRecipeComposerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertRecipeComposerRequest.class);
  }

 /**
  * Convert an instance of UpsertRecipeComposerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
