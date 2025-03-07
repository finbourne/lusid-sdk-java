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
import com.finbourne.lusid.model.UnitsRatio;
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
 * Election for events that result in cash via a merger or acquisition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityOfferElection {
  public static final String SERIALIZED_NAME_ELECTION_KEY = "electionKey";
  @SerializedName(SERIALIZED_NAME_ELECTION_KEY)
  private String electionKey;

  public static final String SERIALIZED_NAME_IS_CHOSEN = "isChosen";
  @SerializedName(SERIALIZED_NAME_IS_CHOSEN)
  private Boolean isChosen;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_UNITS_RATIO = "unitsRatio";
  @SerializedName(SERIALIZED_NAME_UNITS_RATIO)
  private UnitsRatio unitsRatio;

  public SecurityOfferElection() {
  }

  public SecurityOfferElection electionKey(String electionKey) {
    
    this.electionKey = electionKey;
    return this;
  }

   /**
   * Unique key associated to this election.
   * @return electionKey
  **/
  @jakarta.annotation.Nonnull
  public String getElectionKey() {
    return electionKey;
  }


  public void setElectionKey(String electionKey) {
    this.electionKey = electionKey;
  }


  public SecurityOfferElection isChosen(Boolean isChosen) {
    
    this.isChosen = isChosen;
    return this;
  }

   /**
   * Is this the election that has been explicitly chosen from multiple options.
   * @return isChosen
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsChosen() {
    return isChosen;
  }


  public void setIsChosen(Boolean isChosen) {
    this.isChosen = isChosen;
  }


  public SecurityOfferElection isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided.
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public SecurityOfferElection unitsRatio(UnitsRatio unitsRatio) {
    
    this.unitsRatio = unitsRatio;
    return this;
  }

   /**
   * Get unitsRatio
   * @return unitsRatio
  **/
  @jakarta.annotation.Nonnull
  public UnitsRatio getUnitsRatio() {
    return unitsRatio;
  }


  public void setUnitsRatio(UnitsRatio unitsRatio) {
    this.unitsRatio = unitsRatio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityOfferElection securityOfferElection = (SecurityOfferElection) o;
    return Objects.equals(this.electionKey, securityOfferElection.electionKey) &&
        Objects.equals(this.isChosen, securityOfferElection.isChosen) &&
        Objects.equals(this.isDefault, securityOfferElection.isDefault) &&
        Objects.equals(this.unitsRatio, securityOfferElection.unitsRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electionKey, isChosen, isDefault, unitsRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityOfferElection {\n");
    sb.append("    electionKey: ").append(toIndentedString(electionKey)).append("\n");
    sb.append("    isChosen: ").append(toIndentedString(isChosen)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    unitsRatio: ").append(toIndentedString(unitsRatio)).append("\n");
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
    openapiFields.add("electionKey");
    openapiFields.add("isChosen");
    openapiFields.add("isDefault");
    openapiFields.add("unitsRatio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("electionKey");
    openapiRequiredFields.add("unitsRatio");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SecurityOfferElection
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SecurityOfferElection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecurityOfferElection is not found in the empty JSON string", SecurityOfferElection.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SecurityOfferElection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("electionKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `electionKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("electionKey").toString()));
      }
      // validate the required field `unitsRatio`
      UnitsRatio.validateJsonElement(jsonObj.get("unitsRatio"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityOfferElection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityOfferElection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityOfferElection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityOfferElection.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityOfferElection>() {
           @Override
           public void write(JsonWriter out, SecurityOfferElection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityOfferElection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityOfferElection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityOfferElection
  * @throws IOException if the JSON string is invalid with respect to SecurityOfferElection
  */
  public static SecurityOfferElection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityOfferElection.class);
  }

 /**
  * Convert an instance of SecurityOfferElection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
