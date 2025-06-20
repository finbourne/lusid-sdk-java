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
import com.finbourne.lusid.model.ModelOptions;
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
 * Model options for credit default instrument.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CdsModelOptions extends ModelOptions {
  public static final String SERIALIZED_NAME_USE_FACTORS_FOR_CURRENT_NOTIONAL = "useFactorsForCurrentNotional";
  @SerializedName(SERIALIZED_NAME_USE_FACTORS_FOR_CURRENT_NOTIONAL)
  private Boolean useFactorsForCurrentNotional;

  public CdsModelOptions() {
    // this.modelOptionsType = this.getClass().getSimpleName();
  }

  public CdsModelOptions useFactorsForCurrentNotional(Boolean useFactorsForCurrentNotional) {
    
    this.useFactorsForCurrentNotional = useFactorsForCurrentNotional;
    return this;
  }

   /**
   * Determines if calculations that use current notional apply use a constituent weight factor from a quote representing a default.
   * @return useFactorsForCurrentNotional
  **/
  @jakarta.annotation.Nonnull
  public Boolean getUseFactorsForCurrentNotional() {
    return useFactorsForCurrentNotional;
  }


  public void setUseFactorsForCurrentNotional(Boolean useFactorsForCurrentNotional) {
    this.useFactorsForCurrentNotional = useFactorsForCurrentNotional;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdsModelOptions cdsModelOptions = (CdsModelOptions) o;
    return Objects.equals(this.useFactorsForCurrentNotional, cdsModelOptions.useFactorsForCurrentNotional) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useFactorsForCurrentNotional, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdsModelOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    useFactorsForCurrentNotional: ").append(toIndentedString(useFactorsForCurrentNotional)).append("\n");
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
    openapiFields.add("modelOptionsType");
    openapiFields.add("useFactorsForCurrentNotional");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("useFactorsForCurrentNotional");
    openapiRequiredFields.add("modelOptionsType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CdsModelOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CdsModelOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CdsModelOptions is not found in the empty JSON string", CdsModelOptions.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CdsModelOptions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CdsModelOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CdsModelOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CdsModelOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CdsModelOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CdsModelOptions>() {
           @Override
           public void write(JsonWriter out, CdsModelOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CdsModelOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CdsModelOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CdsModelOptions
  * @throws IOException if the JSON string is invalid with respect to CdsModelOptions
  */
  public static CdsModelOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CdsModelOptions.class);
  }

 /**
  * Convert an instance of CdsModelOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
