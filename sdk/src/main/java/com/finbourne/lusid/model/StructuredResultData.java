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
import com.finbourne.lusid.model.DataMapKey;
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
 * An item of structured result data that is to be inserted into Lusid. This will typically be a Json or Xml document that  contains a set of result data appropriate to a specific entity such as an instrument or potentially an index.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StructuredResultData {
  public static final String SERIALIZED_NAME_DOCUMENT_FORMAT = "documentFormat";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_FORMAT)
  private String documentFormat;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private String document;

  public static final String SERIALIZED_NAME_DATA_MAP_KEY = "dataMapKey";
  @SerializedName(SERIALIZED_NAME_DATA_MAP_KEY)
  private DataMapKey dataMapKey;

  public StructuredResultData() {
  }

  public StructuredResultData documentFormat(String documentFormat) {
    
    this.documentFormat = documentFormat;
    return this;
  }

   /**
   * The format of the accompanying document.
   * @return documentFormat
  **/
  @jakarta.annotation.Nonnull
  public String getDocumentFormat() {
    return documentFormat;
  }


  public void setDocumentFormat(String documentFormat) {
    this.documentFormat = documentFormat;
  }


  public StructuredResultData version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The semantic version of the document format; MAJOR.MINOR.PATCH
   * @return version
  **/
  @jakarta.annotation.Nullable
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public StructuredResultData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name or description for the document
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StructuredResultData document(String document) {
    
    this.document = document;
    return this;
  }

   /**
   * The document that will be stored (or retrieved) and which describes a unit result data entity such as a set of prices or yields
   * @return document
  **/
  @jakarta.annotation.Nonnull
  public String getDocument() {
    return document;
  }


  public void setDocument(String document) {
    this.document = document;
  }


  public StructuredResultData dataMapKey(DataMapKey dataMapKey) {
    
    this.dataMapKey = dataMapKey;
    return this;
  }

   /**
   * Get dataMapKey
   * @return dataMapKey
  **/
  @jakarta.annotation.Nullable
  public DataMapKey getDataMapKey() {
    return dataMapKey;
  }


  public void setDataMapKey(DataMapKey dataMapKey) {
    this.dataMapKey = dataMapKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredResultData structuredResultData = (StructuredResultData) o;
    return Objects.equals(this.documentFormat, structuredResultData.documentFormat) &&
        Objects.equals(this.version, structuredResultData.version) &&
        Objects.equals(this.name, structuredResultData.name) &&
        Objects.equals(this.document, structuredResultData.document) &&
        Objects.equals(this.dataMapKey, structuredResultData.dataMapKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentFormat, version, name, document, dataMapKey);
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
    sb.append("class StructuredResultData {\n");
    sb.append("    documentFormat: ").append(toIndentedString(documentFormat)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    dataMapKey: ").append(toIndentedString(dataMapKey)).append("\n");
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
    openapiFields.add("documentFormat");
    openapiFields.add("version");
    openapiFields.add("name");
    openapiFields.add("document");
    openapiFields.add("dataMapKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("documentFormat");
    openapiRequiredFields.add("document");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StructuredResultData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StructuredResultData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructuredResultData is not found in the empty JSON string", StructuredResultData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StructuredResultData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("documentFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentFormat").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("document").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document").toString()));
      }
      // validate the optional field `dataMapKey`
      if (jsonObj.get("dataMapKey") != null && !jsonObj.get("dataMapKey").isJsonNull()) {
        DataMapKey.validateJsonElement(jsonObj.get("dataMapKey"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructuredResultData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructuredResultData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructuredResultData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructuredResultData.class));

       return (TypeAdapter<T>) new TypeAdapter<StructuredResultData>() {
           @Override
           public void write(JsonWriter out, StructuredResultData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructuredResultData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructuredResultData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructuredResultData
  * @throws IOException if the JSON string is invalid with respect to StructuredResultData
  */
  public static StructuredResultData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructuredResultData.class);
  }

 /**
  * Convert an instance of StructuredResultData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
