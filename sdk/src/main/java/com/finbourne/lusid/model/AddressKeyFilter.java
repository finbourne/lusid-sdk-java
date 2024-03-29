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
import com.finbourne.lusid.model.ResultValue;
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
 * Class specifying a filtering operation
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddressKeyFilter {
  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private String left;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_RIGHT = "right";
  @SerializedName(SERIALIZED_NAME_RIGHT)
  private ResultValue right;

  public AddressKeyFilter() {
  }

  public AddressKeyFilter left(String left) {
    
    this.left = left;
    return this;
  }

   /**
   * Address for the value in the row
   * @return left
  **/
  @jakarta.annotation.Nullable
  public String getLeft() {
    return left;
  }


  public void setLeft(String left) {
    this.left = left;
  }


  public AddressKeyFilter operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * What sort of comparison is the filter performing. Can be either \&quot;eq\&quot; for equals or \&quot;neq\&quot; for not equals.
   * @return operator
  **/
  @jakarta.annotation.Nullable
  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public AddressKeyFilter right(ResultValue right) {
    
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @jakarta.annotation.Nullable
  public ResultValue getRight() {
    return right;
  }


  public void setRight(ResultValue right) {
    this.right = right;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressKeyFilter addressKeyFilter = (AddressKeyFilter) o;
    return Objects.equals(this.left, addressKeyFilter.left) &&
        Objects.equals(this.operator, addressKeyFilter.operator) &&
        Objects.equals(this.right, addressKeyFilter.right);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, operator, right);
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
    sb.append("class AddressKeyFilter {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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
    openapiFields.add("left");
    openapiFields.add("operator");
    openapiFields.add("right");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressKeyFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressKeyFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressKeyFilter is not found in the empty JSON string", AddressKeyFilter.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("left") != null && !jsonObj.get("left").isJsonNull()) && !jsonObj.get("left").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `left` to be a primitive type in the JSON string but got `%s`", jsonObj.get("left").toString()));
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // validate the optional field `right`
      if (jsonObj.get("right") != null && !jsonObj.get("right").isJsonNull()) {
        ResultValue.validateJsonElement(jsonObj.get("right"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressKeyFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressKeyFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressKeyFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressKeyFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressKeyFilter>() {
           @Override
           public void write(JsonWriter out, AddressKeyFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressKeyFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressKeyFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressKeyFilter
  * @throws IOException if the JSON string is invalid with respect to AddressKeyFilter
  */
  public static AddressKeyFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressKeyFilter.class);
  }

 /**
  * Convert an instance of AddressKeyFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
