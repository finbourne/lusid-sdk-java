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
import com.finbourne.lusid.model.InvestorRecord;
import com.finbourne.lusid.model.Property;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * An Account Holder of an Investment Account.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountHolder {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Map<String, Property> identifiers;

  public static final String SERIALIZED_NAME_ENTITY_UNIQUE_ID = "entityUniqueId";
  @SerializedName(SERIALIZED_NAME_ENTITY_UNIQUE_ID)
  private String entityUniqueId;

  public static final String SERIALIZED_NAME_INVESTOR_RECORD = "investorRecord";
  @SerializedName(SERIALIZED_NAME_INVESTOR_RECORD)
  private InvestorRecord investorRecord;

  public AccountHolder() {
  }

  public AccountHolder key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * A client-defined key used to identify the Account Holder, unique within the Investment Account
   * @return key
  **/
  @jakarta.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public AccountHolder identifiers(Map<String, Property> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public AccountHolder putIdentifiersItem(String key, Property identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new HashMap<>();
    }
    this.identifiers.put(key, identifiersItem);
    return this;
  }

   /**
   * Single Account Holder identifier that should target the desired Investor Record.
   * @return identifiers
  **/
  @jakarta.annotation.Nullable
  public Map<String, Property> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(Map<String, Property> identifiers) {
    this.identifiers = identifiers;
  }


  public AccountHolder entityUniqueId(String entityUniqueId) {
    
    this.entityUniqueId = entityUniqueId;
    return this;
  }

   /**
   * The unique InvestorRecord entity identifier
   * @return entityUniqueId
  **/
  @jakarta.annotation.Nullable
  public String getEntityUniqueId() {
    return entityUniqueId;
  }


  public void setEntityUniqueId(String entityUniqueId) {
    this.entityUniqueId = entityUniqueId;
  }


  public AccountHolder investorRecord(InvestorRecord investorRecord) {
    
    this.investorRecord = investorRecord;
    return this;
  }

   /**
   * Get investorRecord
   * @return investorRecord
  **/
  @jakarta.annotation.Nullable
  public InvestorRecord getInvestorRecord() {
    return investorRecord;
  }


  public void setInvestorRecord(InvestorRecord investorRecord) {
    this.investorRecord = investorRecord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolder accountHolder = (AccountHolder) o;
    return Objects.equals(this.key, accountHolder.key) &&
        Objects.equals(this.identifiers, accountHolder.identifiers) &&
        Objects.equals(this.entityUniqueId, accountHolder.entityUniqueId) &&
        Objects.equals(this.investorRecord, accountHolder.investorRecord);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, identifiers, entityUniqueId, investorRecord);
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
    sb.append("class AccountHolder {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    entityUniqueId: ").append(toIndentedString(entityUniqueId)).append("\n");
    sb.append("    investorRecord: ").append(toIndentedString(investorRecord)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("identifiers");
    openapiFields.add("entityUniqueId");
    openapiFields.add("investorRecord");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountHolder
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountHolder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountHolder is not found in the empty JSON string", AccountHolder.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("entityUniqueId") != null && !jsonObj.get("entityUniqueId").isJsonNull()) && !jsonObj.get("entityUniqueId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityUniqueId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityUniqueId").toString()));
      }
      // validate the optional field `investorRecord`
      if (jsonObj.get("investorRecord") != null && !jsonObj.get("investorRecord").isJsonNull()) {
        InvestorRecord.validateJsonElement(jsonObj.get("investorRecord"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountHolder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountHolder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountHolder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountHolder.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountHolder>() {
           @Override
           public void write(JsonWriter out, AccountHolder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountHolder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountHolder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountHolder
  * @throws IOException if the JSON string is invalid with respect to AccountHolder
  */
  public static AccountHolder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountHolder.class);
  }

 /**
  * Convert an instance of AccountHolder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
