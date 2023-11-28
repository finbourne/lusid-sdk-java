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
 * A Cleardown rule
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CleardownModuleRule {
  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_GENERAL_LEDGER_ACCOUNT_CODE = "generalLedgerAccountCode";
  @SerializedName(SERIALIZED_NAME_GENERAL_LEDGER_ACCOUNT_CODE)
  private String generalLedgerAccountCode;

  public static final String SERIALIZED_NAME_RULE_FILTER = "ruleFilter";
  @SerializedName(SERIALIZED_NAME_RULE_FILTER)
  private String ruleFilter;

  public CleardownModuleRule() {
  }

  public CleardownModuleRule ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * The identifier for the Cleardown Rule.
   * @return ruleId
  **/
  @jakarta.annotation.Nonnull
  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public CleardownModuleRule generalLedgerAccountCode(String generalLedgerAccountCode) {
    
    this.generalLedgerAccountCode = generalLedgerAccountCode;
    return this;
  }

   /**
   * The account to post the residual P&amp;L to.
   * @return generalLedgerAccountCode
  **/
  @jakarta.annotation.Nonnull
  public String getGeneralLedgerAccountCode() {
    return generalLedgerAccountCode;
  }


  public void setGeneralLedgerAccountCode(String generalLedgerAccountCode) {
    this.generalLedgerAccountCode = generalLedgerAccountCode;
  }


  public CleardownModuleRule ruleFilter(String ruleFilter) {
    
    this.ruleFilter = ruleFilter;
    return this;
  }

   /**
   * The filter syntax for the Cleardown Rule. See https://support.lusid.com/knowledgebase/article/KA-02140 for more information on filter syntax.
   * @return ruleFilter
  **/
  @jakarta.annotation.Nonnull
  public String getRuleFilter() {
    return ruleFilter;
  }


  public void setRuleFilter(String ruleFilter) {
    this.ruleFilter = ruleFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleardownModuleRule cleardownModuleRule = (CleardownModuleRule) o;
    return Objects.equals(this.ruleId, cleardownModuleRule.ruleId) &&
        Objects.equals(this.generalLedgerAccountCode, cleardownModuleRule.generalLedgerAccountCode) &&
        Objects.equals(this.ruleFilter, cleardownModuleRule.ruleFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, generalLedgerAccountCode, ruleFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleardownModuleRule {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    generalLedgerAccountCode: ").append(toIndentedString(generalLedgerAccountCode)).append("\n");
    sb.append("    ruleFilter: ").append(toIndentedString(ruleFilter)).append("\n");
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
    openapiFields.add("ruleId");
    openapiFields.add("generalLedgerAccountCode");
    openapiFields.add("ruleFilter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ruleId");
    openapiRequiredFields.add("generalLedgerAccountCode");
    openapiRequiredFields.add("ruleFilter");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CleardownModuleRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CleardownModuleRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CleardownModuleRule is not found in the empty JSON string", CleardownModuleRule.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CleardownModuleRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
      if (!jsonObj.get("generalLedgerAccountCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generalLedgerAccountCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generalLedgerAccountCode").toString()));
      }
      if (!jsonObj.get("ruleFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleFilter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CleardownModuleRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CleardownModuleRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CleardownModuleRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CleardownModuleRule.class));

       return (TypeAdapter<T>) new TypeAdapter<CleardownModuleRule>() {
           @Override
           public void write(JsonWriter out, CleardownModuleRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CleardownModuleRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CleardownModuleRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CleardownModuleRule
  * @throws IOException if the JSON string is invalid with respect to CleardownModuleRule
  */
  public static CleardownModuleRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CleardownModuleRule.class);
  }

 /**
  * Convert an instance of CleardownModuleRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}