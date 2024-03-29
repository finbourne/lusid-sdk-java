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
 * When importing data from an external data source, in order for it to be reliable queryable, LUSID needs to know something about it.  A data definition tells LUSID, what a given external data item is, what type it is and whether it in some way identifies items of data.  Consider presenting LUSID with a list of dictionaries where each dictionary contains the same set of keys (names). Each data item pointed to by  a key would be expected to be of the same type (integer, string, decimal etc.). To identify a particular dictionary from the list, a tuple of  one or more of the items in the dictionary would make it unique. If only a single item is required then the
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataDefinition {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_KEY_TYPE = "keyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private String keyType;

  public static final String SERIALIZED_NAME_ALLOW_NULL = "allowNull";
  @SerializedName(SERIALIZED_NAME_ALLOW_NULL)
  private Boolean allowNull;

  public static final String SERIALIZED_NAME_ALLOW_MISSING = "allowMissing";
  @SerializedName(SERIALIZED_NAME_ALLOW_MISSING)
  private Boolean allowMissing;

  public DataDefinition() {
  }

  public DataDefinition address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The internal address (LUSID native) of the unit in the provided data itself and corresponds to the external name of the data item
   * @return address
  **/
  @jakarta.annotation.Nonnull
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public DataDefinition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the data item. This is the name that will appear
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DataDefinition dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * A member of the set of possible data types, that all data passed under that key is expected to be of.  Currently limited to one of [string, integer, decimal, result0d].
   * @return dataType
  **/
  @jakarta.annotation.Nullable
  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public DataDefinition keyType(String keyType) {
    
    this.keyType = keyType;
    return this;
  }

   /**
   * Is the item either a unique key for the dictionary, i.e. does it identify a unique index or conceptual &#39;row&#39; within the list of dictionaries,  or a partial key or is it simply a data item within that dictionary. Must be one of [Unique,PartOfUnique,Leaf, CompositeLeaf]
   * @return keyType
  **/
  @jakarta.annotation.Nullable
  public String getKeyType() {
    return keyType;
  }


  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  public DataDefinition allowNull(Boolean allowNull) {
    
    this.allowNull = allowNull;
    return this;
  }

   /**
   * The path to the field must exist (unless AllowMissing is true) but the actual value is allowed to be null.
   * @return allowNull
  **/
  @jakarta.annotation.Nullable
  public Boolean getAllowNull() {
    return allowNull;
  }


  public void setAllowNull(Boolean allowNull) {
    this.allowNull = allowNull;
  }


  public DataDefinition allowMissing(Boolean allowMissing) {
    
    this.allowMissing = allowMissing;
    return this;
  }

   /**
   * The path (or column) is allowed to be missing but if it is present it is not allowed to be null unless AllowNull is true.
   * @return allowMissing
  **/
  @jakarta.annotation.Nullable
  public Boolean getAllowMissing() {
    return allowMissing;
  }


  public void setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataDefinition dataDefinition = (DataDefinition) o;
    return Objects.equals(this.address, dataDefinition.address) &&
        Objects.equals(this.name, dataDefinition.name) &&
        Objects.equals(this.dataType, dataDefinition.dataType) &&
        Objects.equals(this.keyType, dataDefinition.keyType) &&
        Objects.equals(this.allowNull, dataDefinition.allowNull) &&
        Objects.equals(this.allowMissing, dataDefinition.allowMissing);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, dataType, keyType, allowNull, allowMissing);
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
    sb.append("class DataDefinition {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    allowNull: ").append(toIndentedString(allowNull)).append("\n");
    sb.append("    allowMissing: ").append(toIndentedString(allowMissing)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("name");
    openapiFields.add("dataType");
    openapiFields.add("keyType");
    openapiFields.add("allowNull");
    openapiFields.add("allowMissing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataDefinition is not found in the empty JSON string", DataDefinition.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataDefinition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if ((jsonObj.get("keyType") != null && !jsonObj.get("keyType").isJsonNull()) && !jsonObj.get("keyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<DataDefinition>() {
           @Override
           public void write(JsonWriter out, DataDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataDefinition
  * @throws IOException if the JSON string is invalid with respect to DataDefinition
  */
  public static DataDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataDefinition.class);
  }

 /**
  * Convert an instance of DataDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
