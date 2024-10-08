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
 * TransactionTypeAlias
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionTypeAlias {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TRANSACTION_CLASS = "transactionClass";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CLASS)
  private String transactionClass;

  public static final String SERIALIZED_NAME_TRANSACTION_ROLES = "transactionRoles";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ROLES)
  private String transactionRoles;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public TransactionTypeAlias() {
  }

  public TransactionTypeAlias type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The transaction type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public TransactionTypeAlias description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Brief description of the transaction
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionTypeAlias transactionClass(String transactionClass) {
    
    this.transactionClass = transactionClass;
    return this;
  }

   /**
   * Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut
   * @return transactionClass
  **/
  @jakarta.annotation.Nonnull
  public String getTransactionClass() {
    return transactionClass;
  }


  public void setTransactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
  }


  public TransactionTypeAlias transactionRoles(String transactionRoles) {
    
    this.transactionRoles = transactionRoles;
    return this;
  }

   /**
   * Transactions role within a class. E.g. Increase a long position
   * @return transactionRoles
  **/
  @jakarta.annotation.Nonnull
  public String getTransactionRoles() {
    return transactionRoles;
  }


  public void setTransactionRoles(String transactionRoles) {
    this.transactionRoles = transactionRoles;
  }


  public TransactionTypeAlias isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * IsDefault is a flag that denotes the default alias for a source. There can only be, at most, one per source.
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionTypeAlias transactionTypeAlias = (TransactionTypeAlias) o;
    return Objects.equals(this.type, transactionTypeAlias.type) &&
        Objects.equals(this.description, transactionTypeAlias.description) &&
        Objects.equals(this.transactionClass, transactionTypeAlias.transactionClass) &&
        Objects.equals(this.transactionRoles, transactionTypeAlias.transactionRoles) &&
        Objects.equals(this.isDefault, transactionTypeAlias.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, transactionClass, transactionRoles, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionTypeAlias {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transactionClass: ").append(toIndentedString(transactionClass)).append("\n");
    sb.append("    transactionRoles: ").append(toIndentedString(transactionRoles)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("description");
    openapiFields.add("transactionClass");
    openapiFields.add("transactionRoles");
    openapiFields.add("isDefault");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("transactionClass");
    openapiRequiredFields.add("transactionRoles");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionTypeAlias
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionTypeAlias.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionTypeAlias is not found in the empty JSON string", TransactionTypeAlias.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionTypeAlias.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("transactionClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionClass").toString()));
      }
      if (!jsonObj.get("transactionRoles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionRoles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionRoles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionTypeAlias.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionTypeAlias' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionTypeAlias> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionTypeAlias.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionTypeAlias>() {
           @Override
           public void write(JsonWriter out, TransactionTypeAlias value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionTypeAlias read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionTypeAlias given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionTypeAlias
  * @throws IOException if the JSON string is invalid with respect to TransactionTypeAlias
  */
  public static TransactionTypeAlias fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionTypeAlias.class);
  }

 /**
  * Convert an instance of TransactionTypeAlias to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
