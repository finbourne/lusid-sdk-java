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
import com.finbourne.lusid.model.DescribedAddressKey;
import com.finbourne.lusid.model.EconomicDependency;
import com.finbourne.lusid.model.Link;
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
 * Instrument capabilities containing useful information about the instrument and the model. This includes  - features corresponding to the instrument i.e. Optionality:American, Other:InflationLinked  - supported addresses (if model provided) i.e. Valuation/Pv, Valuation/DirtyPriceKey, Valuation/Accrued  - economic dependencies (if model provided) i.e. Cash:USD, Fx:GBP.USD, Rates:GBP.GBPOIS
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstrumentCapabilities {
  public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrumentId";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
  private String instrumentId;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private Map<String, String> features;

  public static final String SERIALIZED_NAME_SUPPORTED_ADDRESSES = "supportedAddresses";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_ADDRESSES)
  private List<DescribedAddressKey> supportedAddresses;

  public static final String SERIALIZED_NAME_ECONOMIC_DEPENDENCIES = "economicDependencies";
  @SerializedName(SERIALIZED_NAME_ECONOMIC_DEPENDENCIES)
  private List<EconomicDependency> economicDependencies;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public InstrumentCapabilities() {
  }

  public InstrumentCapabilities instrumentId(String instrumentId) {
    
    this.instrumentId = instrumentId;
    return this;
  }

   /**
   * The Lusid instrument id for the instrument e.g. &#39;LUID_00003D4X&#39;.
   * @return instrumentId
  **/
  @jakarta.annotation.Nullable
  public String getInstrumentId() {
    return instrumentId;
  }


  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }


  public InstrumentCapabilities model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * The pricing model e.g. &#39;Discounting&#39;.
   * @return model
  **/
  @jakarta.annotation.Nullable
  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public InstrumentCapabilities features(Map<String, String> features) {
    
    this.features = features;
    return this;
  }

  public InstrumentCapabilities putFeaturesItem(String key, String featuresItem) {
    if (this.features == null) {
      this.features = new HashMap<>();
    }
    this.features.put(key, featuresItem);
    return this;
  }

   /**
   * Features of the instrument describing its optionality, payoff type and more e.g. &#39;Instrument/Features/Exercise: American&#39;, &#39;Instrument/Features/Product: Option&#39;
   * @return features
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getFeatures() {
    return features;
  }


  public void setFeatures(Map<String, String> features) {
    this.features = features;
  }


  public InstrumentCapabilities supportedAddresses(List<DescribedAddressKey> supportedAddresses) {
    
    this.supportedAddresses = supportedAddresses;
    return this;
  }

  public InstrumentCapabilities addSupportedAddressesItem(DescribedAddressKey supportedAddressesItem) {
    if (this.supportedAddresses == null) {
      this.supportedAddresses = new ArrayList<>();
    }
    this.supportedAddresses.add(supportedAddressesItem);
    return this;
  }

   /**
   * Queryable addresses supported by the model, e.g. &#39;Valuation/Pv&#39;, &#39;Valuation/Accrued&#39;.
   * @return supportedAddresses
  **/
  @jakarta.annotation.Nullable
  public List<DescribedAddressKey> getSupportedAddresses() {
    return supportedAddresses;
  }


  public void setSupportedAddresses(List<DescribedAddressKey> supportedAddresses) {
    this.supportedAddresses = supportedAddresses;
  }


  public InstrumentCapabilities economicDependencies(List<EconomicDependency> economicDependencies) {
    
    this.economicDependencies = economicDependencies;
    return this;
  }

  public InstrumentCapabilities addEconomicDependenciesItem(EconomicDependency economicDependenciesItem) {
    if (this.economicDependencies == null) {
      this.economicDependencies = new ArrayList<>();
    }
    this.economicDependencies.add(economicDependenciesItem);
    return this;
  }

   /**
   * Economic dependencies for the model, e.g. &#39;Fx:GBP.USD&#39;, &#39;Cash:GBP&#39;, &#39;Rates:GBP.GBPOIS&#39;.
   * @return economicDependencies
  **/
  @jakarta.annotation.Nullable
  public List<EconomicDependency> getEconomicDependencies() {
    return economicDependencies;
  }


  public void setEconomicDependencies(List<EconomicDependency> economicDependencies) {
    this.economicDependencies = economicDependencies;
  }


  public InstrumentCapabilities links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public InstrumentCapabilities addLinksItem(Link linksItem) {
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
    InstrumentCapabilities instrumentCapabilities = (InstrumentCapabilities) o;
    return Objects.equals(this.instrumentId, instrumentCapabilities.instrumentId) &&
        Objects.equals(this.model, instrumentCapabilities.model) &&
        Objects.equals(this.features, instrumentCapabilities.features) &&
        Objects.equals(this.supportedAddresses, instrumentCapabilities.supportedAddresses) &&
        Objects.equals(this.economicDependencies, instrumentCapabilities.economicDependencies) &&
        Objects.equals(this.links, instrumentCapabilities.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentId, model, features, supportedAddresses, economicDependencies, links);
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
    sb.append("class InstrumentCapabilities {\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    supportedAddresses: ").append(toIndentedString(supportedAddresses)).append("\n");
    sb.append("    economicDependencies: ").append(toIndentedString(economicDependencies)).append("\n");
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
    openapiFields.add("instrumentId");
    openapiFields.add("model");
    openapiFields.add("features");
    openapiFields.add("supportedAddresses");
    openapiFields.add("economicDependencies");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstrumentCapabilities
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InstrumentCapabilities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstrumentCapabilities is not found in the empty JSON string", InstrumentCapabilities.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("instrumentId") != null && !jsonObj.get("instrumentId").isJsonNull()) && !jsonObj.get("instrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrumentId").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if (jsonObj.get("supportedAddresses") != null && !jsonObj.get("supportedAddresses").isJsonNull()) {
        JsonArray jsonArraysupportedAddresses = jsonObj.getAsJsonArray("supportedAddresses");
        if (jsonArraysupportedAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supportedAddresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supportedAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("supportedAddresses").toString()));
          }

          // validate the optional field `supportedAddresses` (array)
          for (int i = 0; i < jsonArraysupportedAddresses.size(); i++) {
            DescribedAddressKey.validateJsonElement(jsonArraysupportedAddresses.get(i));
          };
        }
      }
      if (jsonObj.get("economicDependencies") != null && !jsonObj.get("economicDependencies").isJsonNull()) {
        JsonArray jsonArrayeconomicDependencies = jsonObj.getAsJsonArray("economicDependencies");
        if (jsonArrayeconomicDependencies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("economicDependencies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `economicDependencies` to be an array in the JSON string but got `%s`", jsonObj.get("economicDependencies").toString()));
          }

          // validate the optional field `economicDependencies` (array)
          for (int i = 0; i < jsonArrayeconomicDependencies.size(); i++) {
            EconomicDependency.validateJsonElement(jsonArrayeconomicDependencies.get(i));
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
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstrumentCapabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstrumentCapabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstrumentCapabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstrumentCapabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<InstrumentCapabilities>() {
           @Override
           public void write(JsonWriter out, InstrumentCapabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstrumentCapabilities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstrumentCapabilities given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstrumentCapabilities
  * @throws IOException if the JSON string is invalid with respect to InstrumentCapabilities
  */
  public static InstrumentCapabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstrumentCapabilities.class);
  }

 /**
  * Convert an instance of InstrumentCapabilities to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
