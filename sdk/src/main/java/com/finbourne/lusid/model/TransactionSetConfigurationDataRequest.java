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
import com.finbourne.lusid.model.SideConfigurationDataRequest;
import com.finbourne.lusid.model.TransactionConfigurationDataRequest;
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
 * A bundle of requests to configure a set of transaction types.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionSetConfigurationDataRequest {
  public static final String SERIALIZED_NAME_TRANSACTION_CONFIG_REQUESTS = "transactionConfigRequests";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CONFIG_REQUESTS)
  private List<TransactionConfigurationDataRequest> transactionConfigRequests = new ArrayList<>();

  public static final String SERIALIZED_NAME_SIDE_CONFIG_REQUESTS = "sideConfigRequests";
  @SerializedName(SERIALIZED_NAME_SIDE_CONFIG_REQUESTS)
  private List<SideConfigurationDataRequest> sideConfigRequests;

  public TransactionSetConfigurationDataRequest() {
  }

  public TransactionSetConfigurationDataRequest transactionConfigRequests(List<TransactionConfigurationDataRequest> transactionConfigRequests) {
    
    this.transactionConfigRequests = transactionConfigRequests;
    return this;
  }

  public TransactionSetConfigurationDataRequest addTransactionConfigRequestsItem(TransactionConfigurationDataRequest transactionConfigRequestsItem) {
    if (this.transactionConfigRequests == null) {
      this.transactionConfigRequests = new ArrayList<>();
    }
    this.transactionConfigRequests.add(transactionConfigRequestsItem);
    return this;
  }

   /**
   * Collection of transaction type models
   * @return transactionConfigRequests
  **/
  @jakarta.annotation.Nonnull
  public List<TransactionConfigurationDataRequest> getTransactionConfigRequests() {
    return transactionConfigRequests;
  }


  public void setTransactionConfigRequests(List<TransactionConfigurationDataRequest> transactionConfigRequests) {
    this.transactionConfigRequests = transactionConfigRequests;
  }


  public TransactionSetConfigurationDataRequest sideConfigRequests(List<SideConfigurationDataRequest> sideConfigRequests) {
    
    this.sideConfigRequests = sideConfigRequests;
    return this;
  }

  public TransactionSetConfigurationDataRequest addSideConfigRequestsItem(SideConfigurationDataRequest sideConfigRequestsItem) {
    if (this.sideConfigRequests == null) {
      this.sideConfigRequests = new ArrayList<>();
    }
    this.sideConfigRequests.add(sideConfigRequestsItem);
    return this;
  }

   /**
   * Collection of side definition requests.
   * @return sideConfigRequests
  **/
  @jakarta.annotation.Nullable
  public List<SideConfigurationDataRequest> getSideConfigRequests() {
    return sideConfigRequests;
  }


  public void setSideConfigRequests(List<SideConfigurationDataRequest> sideConfigRequests) {
    this.sideConfigRequests = sideConfigRequests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSetConfigurationDataRequest transactionSetConfigurationDataRequest = (TransactionSetConfigurationDataRequest) o;
    return Objects.equals(this.transactionConfigRequests, transactionSetConfigurationDataRequest.transactionConfigRequests) &&
        Objects.equals(this.sideConfigRequests, transactionSetConfigurationDataRequest.sideConfigRequests);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionConfigRequests, sideConfigRequests);
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
    sb.append("class TransactionSetConfigurationDataRequest {\n");
    sb.append("    transactionConfigRequests: ").append(toIndentedString(transactionConfigRequests)).append("\n");
    sb.append("    sideConfigRequests: ").append(toIndentedString(sideConfigRequests)).append("\n");
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
    openapiFields.add("transactionConfigRequests");
    openapiFields.add("sideConfigRequests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transactionConfigRequests");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionSetConfigurationDataRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionSetConfigurationDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionSetConfigurationDataRequest is not found in the empty JSON string", TransactionSetConfigurationDataRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionSetConfigurationDataRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("transactionConfigRequests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionConfigRequests` to be an array in the JSON string but got `%s`", jsonObj.get("transactionConfigRequests").toString()));
      }

      JsonArray jsonArraytransactionConfigRequests = jsonObj.getAsJsonArray("transactionConfigRequests");
      // validate the required field `transactionConfigRequests` (array)
      for (int i = 0; i < jsonArraytransactionConfigRequests.size(); i++) {
        TransactionConfigurationDataRequest.validateJsonElement(jsonArraytransactionConfigRequests.get(i));
      };
      if (jsonObj.get("sideConfigRequests") != null && !jsonObj.get("sideConfigRequests").isJsonNull()) {
        JsonArray jsonArraysideConfigRequests = jsonObj.getAsJsonArray("sideConfigRequests");
        if (jsonArraysideConfigRequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sideConfigRequests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sideConfigRequests` to be an array in the JSON string but got `%s`", jsonObj.get("sideConfigRequests").toString()));
          }

          // validate the optional field `sideConfigRequests` (array)
          for (int i = 0; i < jsonArraysideConfigRequests.size(); i++) {
            SideConfigurationDataRequest.validateJsonElement(jsonArraysideConfigRequests.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionSetConfigurationDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionSetConfigurationDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionSetConfigurationDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionSetConfigurationDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionSetConfigurationDataRequest>() {
           @Override
           public void write(JsonWriter out, TransactionSetConfigurationDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionSetConfigurationDataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionSetConfigurationDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionSetConfigurationDataRequest
  * @throws IOException if the JSON string is invalid with respect to TransactionSetConfigurationDataRequest
  */
  public static TransactionSetConfigurationDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionSetConfigurationDataRequest.class);
  }

 /**
  * Convert an instance of TransactionSetConfigurationDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
