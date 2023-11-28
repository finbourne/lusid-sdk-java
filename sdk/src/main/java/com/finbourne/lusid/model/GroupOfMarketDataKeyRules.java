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
import com.finbourne.lusid.model.MarketDataKeyRule;
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
 * Represents a collection of MarketDataKeyRules that should be resolved together when resolving market data.  That is, market data resolution will always attempt to resolve with all rules in the group  before deciding what market data to return.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupOfMarketDataKeyRules {
  public static final String SERIALIZED_NAME_MARKET_DATA_KEY_RULE_GROUP_OPERATION = "marketDataKeyRuleGroupOperation";
  @SerializedName(SERIALIZED_NAME_MARKET_DATA_KEY_RULE_GROUP_OPERATION)
  private String marketDataKeyRuleGroupOperation;

  public static final String SERIALIZED_NAME_MARKET_RULES = "marketRules";
  @SerializedName(SERIALIZED_NAME_MARKET_RULES)
  private List<MarketDataKeyRule> marketRules = new ArrayList<>();

  public GroupOfMarketDataKeyRules() {
  }

  public GroupOfMarketDataKeyRules marketDataKeyRuleGroupOperation(String marketDataKeyRuleGroupOperation) {
    
    this.marketDataKeyRuleGroupOperation = marketDataKeyRuleGroupOperation;
    return this;
  }

   /**
   * The operation that will be used to process the collection of market data items and failures found on resolution  into a single market data item or failure to be used.
   * @return marketDataKeyRuleGroupOperation
  **/
  @jakarta.annotation.Nonnull
  public String getMarketDataKeyRuleGroupOperation() {
    return marketDataKeyRuleGroupOperation;
  }


  public void setMarketDataKeyRuleGroupOperation(String marketDataKeyRuleGroupOperation) {
    this.marketDataKeyRuleGroupOperation = marketDataKeyRuleGroupOperation;
  }


  public GroupOfMarketDataKeyRules marketRules(List<MarketDataKeyRule> marketRules) {
    
    this.marketRules = marketRules;
    return this;
  }

  public GroupOfMarketDataKeyRules addMarketRulesItem(MarketDataKeyRule marketRulesItem) {
    if (this.marketRules == null) {
      this.marketRules = new ArrayList<>();
    }
    this.marketRules.add(marketRulesItem);
    return this;
  }

   /**
   * The rules that should be grouped together in market data resolution.
   * @return marketRules
  **/
  @jakarta.annotation.Nonnull
  public List<MarketDataKeyRule> getMarketRules() {
    return marketRules;
  }


  public void setMarketRules(List<MarketDataKeyRule> marketRules) {
    this.marketRules = marketRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupOfMarketDataKeyRules groupOfMarketDataKeyRules = (GroupOfMarketDataKeyRules) o;
    return Objects.equals(this.marketDataKeyRuleGroupOperation, groupOfMarketDataKeyRules.marketDataKeyRuleGroupOperation) &&
        Objects.equals(this.marketRules, groupOfMarketDataKeyRules.marketRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketDataKeyRuleGroupOperation, marketRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupOfMarketDataKeyRules {\n");
    sb.append("    marketDataKeyRuleGroupOperation: ").append(toIndentedString(marketDataKeyRuleGroupOperation)).append("\n");
    sb.append("    marketRules: ").append(toIndentedString(marketRules)).append("\n");
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
    openapiFields.add("marketDataKeyRuleGroupOperation");
    openapiFields.add("marketRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketDataKeyRuleGroupOperation");
    openapiRequiredFields.add("marketRules");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GroupOfMarketDataKeyRules
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupOfMarketDataKeyRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupOfMarketDataKeyRules is not found in the empty JSON string", GroupOfMarketDataKeyRules.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupOfMarketDataKeyRules.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("marketDataKeyRuleGroupOperation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketDataKeyRuleGroupOperation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketDataKeyRuleGroupOperation").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("marketRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketRules` to be an array in the JSON string but got `%s`", jsonObj.get("marketRules").toString()));
      }

      JsonArray jsonArraymarketRules = jsonObj.getAsJsonArray("marketRules");
      // validate the required field `marketRules` (array)
      for (int i = 0; i < jsonArraymarketRules.size(); i++) {
        MarketDataKeyRule.validateJsonElement(jsonArraymarketRules.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupOfMarketDataKeyRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupOfMarketDataKeyRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupOfMarketDataKeyRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupOfMarketDataKeyRules.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupOfMarketDataKeyRules>() {
           @Override
           public void write(JsonWriter out, GroupOfMarketDataKeyRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupOfMarketDataKeyRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupOfMarketDataKeyRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupOfMarketDataKeyRules
  * @throws IOException if the JSON string is invalid with respect to GroupOfMarketDataKeyRules
  */
  public static GroupOfMarketDataKeyRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupOfMarketDataKeyRules.class);
  }

 /**
  * Convert an instance of GroupOfMarketDataKeyRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}