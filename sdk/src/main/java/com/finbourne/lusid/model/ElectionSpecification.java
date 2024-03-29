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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ElectionSpecification
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ElectionSpecification {
  public static final String SERIALIZED_NAME_ELECTION_TYPE = "electionType";
  @SerializedName(SERIALIZED_NAME_ELECTION_TYPE)
  private String electionType;

  public static final String SERIALIZED_NAME_CARDINALITY = "cardinality";
  @SerializedName(SERIALIZED_NAME_CARDINALITY)
  private Map<String, String> cardinality = new HashMap<>();

  public static final String SERIALIZED_NAME_REFERENCED_AS = "referencedAs";
  @SerializedName(SERIALIZED_NAME_REFERENCED_AS)
  private List<String> referencedAs = new ArrayList<>();

  public ElectionSpecification() {
  }

  public ElectionSpecification electionType(String electionType) {
    
    this.electionType = electionType;
    return this;
  }

   /**
   * Get electionType
   * @return electionType
  **/
  @jakarta.annotation.Nonnull
  public String getElectionType() {
    return electionType;
  }


  public void setElectionType(String electionType) {
    this.electionType = electionType;
  }


  public ElectionSpecification cardinality(Map<String, String> cardinality) {
    
    this.cardinality = cardinality;
    return this;
  }

  public ElectionSpecification putCardinalityItem(String key, String cardinalityItem) {
    if (this.cardinality == null) {
      this.cardinality = new HashMap<>();
    }
    this.cardinality.put(key, cardinalityItem);
    return this;
  }

   /**
   * Get cardinality
   * @return cardinality
  **/
  @jakarta.annotation.Nonnull
  public Map<String, String> getCardinality() {
    return cardinality;
  }


  public void setCardinality(Map<String, String> cardinality) {
    this.cardinality = cardinality;
  }


  public ElectionSpecification referencedAs(List<String> referencedAs) {
    
    this.referencedAs = referencedAs;
    return this;
  }

  public ElectionSpecification addReferencedAsItem(String referencedAsItem) {
    if (this.referencedAs == null) {
      this.referencedAs = new ArrayList<>();
    }
    this.referencedAs.add(referencedAsItem);
    return this;
  }

   /**
   * Get referencedAs
   * @return referencedAs
  **/
  @jakarta.annotation.Nonnull
  public List<String> getReferencedAs() {
    return referencedAs;
  }


  public void setReferencedAs(List<String> referencedAs) {
    this.referencedAs = referencedAs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectionSpecification electionSpecification = (ElectionSpecification) o;
    return Objects.equals(this.electionType, electionSpecification.electionType) &&
        Objects.equals(this.cardinality, electionSpecification.cardinality) &&
        Objects.equals(this.referencedAs, electionSpecification.referencedAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electionType, cardinality, referencedAs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectionSpecification {\n");
    sb.append("    electionType: ").append(toIndentedString(electionType)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    referencedAs: ").append(toIndentedString(referencedAs)).append("\n");
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
    openapiFields.add("electionType");
    openapiFields.add("cardinality");
    openapiFields.add("referencedAs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("electionType");
    openapiRequiredFields.add("cardinality");
    openapiRequiredFields.add("referencedAs");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ElectionSpecification
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElectionSpecification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElectionSpecification is not found in the empty JSON string", ElectionSpecification.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ElectionSpecification.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("electionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `electionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("electionType").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("referencedAs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("referencedAs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `referencedAs` to be an array in the JSON string but got `%s`", jsonObj.get("referencedAs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElectionSpecification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElectionSpecification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElectionSpecification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElectionSpecification.class));

       return (TypeAdapter<T>) new TypeAdapter<ElectionSpecification>() {
           @Override
           public void write(JsonWriter out, ElectionSpecification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElectionSpecification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ElectionSpecification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ElectionSpecification
  * @throws IOException if the JSON string is invalid with respect to ElectionSpecification
  */
  public static ElectionSpecification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElectionSpecification.class);
  }

 /**
  * Convert an instance of ElectionSpecification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
