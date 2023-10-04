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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.TransactionTypeAlias;
import com.finbourne.lusid.model.TransactionTypeCalculation;
import com.finbourne.lusid.model.TransactionTypeMovement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * TransactionType
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionType {
  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<TransactionTypeAlias> aliases = new ArrayList<>();

  public static final String SERIALIZED_NAME_MOVEMENTS = "movements";
  @SerializedName(SERIALIZED_NAME_MOVEMENTS)
  private List<TransactionTypeMovement> movements = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties;

  public static final String SERIALIZED_NAME_CALCULATIONS = "calculations";
  @SerializedName(SERIALIZED_NAME_CALCULATIONS)
  private List<TransactionTypeCalculation> calculations;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public TransactionType() {
  }

  public TransactionType aliases(List<TransactionTypeAlias> aliases) {
    
    this.aliases = aliases;
    return this;
  }

  public TransactionType addAliasesItem(TransactionTypeAlias aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * List of transaction types that map to this specific transaction configuration
   * @return aliases
  **/
  @jakarta.annotation.Nonnull
  public List<TransactionTypeAlias> getAliases() {
    return aliases;
  }


  public void setAliases(List<TransactionTypeAlias> aliases) {
    this.aliases = aliases;
  }


  public TransactionType movements(List<TransactionTypeMovement> movements) {
    
    this.movements = movements;
    return this;
  }

  public TransactionType addMovementsItem(TransactionTypeMovement movementsItem) {
    if (this.movements == null) {
      this.movements = new ArrayList<>();
    }
    this.movements.add(movementsItem);
    return this;
  }

   /**
   * Movement data for the transaction type
   * @return movements
  **/
  @jakarta.annotation.Nonnull
  public List<TransactionTypeMovement> getMovements() {
    return movements;
  }


  public void setMovements(List<TransactionTypeMovement> movements) {
    this.movements = movements;
  }


  public TransactionType properties(Map<String, PerpetualProperty> properties) {
    
    this.properties = properties;
    return this;
  }

  public TransactionType putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties attached to the transaction type
   * @return properties
  **/
  @jakarta.annotation.Nullable
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }


  public TransactionType calculations(List<TransactionTypeCalculation> calculations) {
    
    this.calculations = calculations;
    return this;
  }

  public TransactionType addCalculationsItem(TransactionTypeCalculation calculationsItem) {
    if (this.calculations == null) {
      this.calculations = new ArrayList<>();
    }
    this.calculations.add(calculationsItem);
    return this;
  }

   /**
   * Calculations to be performed for the transaction type
   * @return calculations
  **/
  @jakarta.annotation.Nullable
  public List<TransactionTypeCalculation> getCalculations() {
    return calculations;
  }


  public void setCalculations(List<TransactionTypeCalculation> calculations) {
    this.calculations = calculations;
  }


  public TransactionType links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public TransactionType addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionType transactionType = (TransactionType) o;
    return Objects.equals(this.aliases, transactionType.aliases) &&
        Objects.equals(this.movements, transactionType.movements) &&
        Objects.equals(this.properties, transactionType.properties) &&
        Objects.equals(this.calculations, transactionType.calculations) &&
        Objects.equals(this.links, transactionType.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, movements, properties, calculations, links);
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
    sb.append("class TransactionType {\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    movements: ").append(toIndentedString(movements)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    calculations: ").append(toIndentedString(calculations)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("aliases");
    openapiFields.add("movements");
    openapiFields.add("properties");
    openapiFields.add("calculations");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aliases");
    openapiRequiredFields.add("movements");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionType is not found in the empty JSON string", TransactionType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionType.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("aliases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
      }

      JsonArray jsonArrayaliases = jsonObj.getAsJsonArray("aliases");
      // validate the required field `aliases` (array)
      for (int i = 0; i < jsonArrayaliases.size(); i++) {
        TransactionTypeAlias.validateJsonObject(jsonArrayaliases.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("movements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `movements` to be an array in the JSON string but got `%s`", jsonObj.get("movements").toString()));
      }

      JsonArray jsonArraymovements = jsonObj.getAsJsonArray("movements");
      // validate the required field `movements` (array)
      for (int i = 0; i < jsonArraymovements.size(); i++) {
        TransactionTypeMovement.validateJsonObject(jsonArraymovements.get(i).getAsJsonObject());
      };
      if (jsonObj.get("calculations") != null && !jsonObj.get("calculations").isJsonNull()) {
        JsonArray jsonArraycalculations = jsonObj.getAsJsonArray("calculations");
        if (jsonArraycalculations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("calculations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `calculations` to be an array in the JSON string but got `%s`", jsonObj.get("calculations").toString()));
          }

          // validate the optional field `calculations` (array)
          for (int i = 0; i < jsonArraycalculations.size(); i++) {
            TransactionTypeCalculation.validateJsonObject(jsonArraycalculations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionType.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionType>() {
           @Override
           public void write(JsonWriter out, TransactionType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionType
  * @throws IOException if the JSON string is invalid with respect to TransactionType
  */
  public static TransactionType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionType.class);
  }

 /**
  * Convert an instance of TransactionType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}