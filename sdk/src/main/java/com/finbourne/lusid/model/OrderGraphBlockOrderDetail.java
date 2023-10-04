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
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * OrderGraphBlockOrderDetail
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderGraphBlockOrderDetail {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_COMPLIANCE_STATE = "complianceState";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_STATE)
  private String complianceState;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "portfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private ResourceId portfolioId;

  public static final String SERIALIZED_NAME_PORTFOLIO_NAME = "portfolioName";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_NAME)
  private String portfolioName;

  public OrderGraphBlockOrderDetail() {
  }

  public OrderGraphBlockOrderDetail id(ResourceId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getId() {
    return id;
  }


  public void setId(ResourceId id) {
    this.id = id;
  }


  public OrderGraphBlockOrderDetail complianceState(String complianceState) {
    
    this.complianceState = complianceState;
    return this;
  }

   /**
   * The compliance state of this order. Possible values are &#39;Pending&#39;, &#39;Failed&#39;, &#39;Manually approved&#39; and &#39;Passed&#39;.
   * @return complianceState
  **/
  @jakarta.annotation.Nonnull
  public String getComplianceState() {
    return complianceState;
  }


  public void setComplianceState(String complianceState) {
    this.complianceState = complianceState;
  }


  public OrderGraphBlockOrderDetail portfolioId(ResourceId portfolioId) {
    
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @jakarta.annotation.Nullable
  public ResourceId getPortfolioId() {
    return portfolioId;
  }


  public void setPortfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId;
  }


  public OrderGraphBlockOrderDetail portfolioName(String portfolioName) {
    
    this.portfolioName = portfolioName;
    return this;
  }

   /**
   * The name of the order&#39;s referenced Portfolio.
   * @return portfolioName
  **/
  @jakarta.annotation.Nullable
  public String getPortfolioName() {
    return portfolioName;
  }


  public void setPortfolioName(String portfolioName) {
    this.portfolioName = portfolioName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderGraphBlockOrderDetail orderGraphBlockOrderDetail = (OrderGraphBlockOrderDetail) o;
    return Objects.equals(this.id, orderGraphBlockOrderDetail.id) &&
        Objects.equals(this.complianceState, orderGraphBlockOrderDetail.complianceState) &&
        Objects.equals(this.portfolioId, orderGraphBlockOrderDetail.portfolioId) &&
        Objects.equals(this.portfolioName, orderGraphBlockOrderDetail.portfolioName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, complianceState, portfolioId, portfolioName);
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
    sb.append("class OrderGraphBlockOrderDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    portfolioName: ").append(toIndentedString(portfolioName)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("complianceState");
    openapiFields.add("portfolioId");
    openapiFields.add("portfolioName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("complianceState");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderGraphBlockOrderDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderGraphBlockOrderDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderGraphBlockOrderDetail is not found in the empty JSON string", OrderGraphBlockOrderDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderGraphBlockOrderDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderGraphBlockOrderDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderGraphBlockOrderDetail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `id`
      ResourceId.validateJsonObject(jsonObj.getAsJsonObject("id"));
      if (!jsonObj.get("complianceState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complianceState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complianceState").toString()));
      }
      // validate the optional field `portfolioId`
      if (jsonObj.get("portfolioId") != null && !jsonObj.get("portfolioId").isJsonNull()) {
        ResourceId.validateJsonObject(jsonObj.getAsJsonObject("portfolioId"));
      }
      if ((jsonObj.get("portfolioName") != null && !jsonObj.get("portfolioName").isJsonNull()) && !jsonObj.get("portfolioName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portfolioName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portfolioName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderGraphBlockOrderDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderGraphBlockOrderDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderGraphBlockOrderDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderGraphBlockOrderDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderGraphBlockOrderDetail>() {
           @Override
           public void write(JsonWriter out, OrderGraphBlockOrderDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderGraphBlockOrderDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderGraphBlockOrderDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderGraphBlockOrderDetail
  * @throws IOException if the JSON string is invalid with respect to OrderGraphBlockOrderDetail
  */
  public static OrderGraphBlockOrderDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderGraphBlockOrderDetail.class);
  }

 /**
  * Convert an instance of OrderGraphBlockOrderDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}