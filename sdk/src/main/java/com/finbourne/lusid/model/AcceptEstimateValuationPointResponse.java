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
import com.finbourne.lusid.model.ValuationPointDataResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * The Valuation Point Data Response for AcceptEstimate called on the Fund and specified date.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AcceptEstimateValuationPointResponse {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_CANDIDATE_VALUATION_POINT = "candidateValuationPoint";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_VALUATION_POINT)
  private ValuationPointDataResponse candidateValuationPoint;

  public static final String SERIALIZED_NAME_LATEST_VALUATION_POINT = "latestValuationPoint";
  @SerializedName(SERIALIZED_NAME_LATEST_VALUATION_POINT)
  private ValuationPointDataResponse latestValuationPoint;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public AcceptEstimateValuationPointResponse() {
  }

  public AcceptEstimateValuationPointResponse href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @jakarta.annotation.Nullable
  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public AcceptEstimateValuationPointResponse candidateValuationPoint(ValuationPointDataResponse candidateValuationPoint) {
    
    this.candidateValuationPoint = candidateValuationPoint;
    return this;
  }

   /**
   * Get candidateValuationPoint
   * @return candidateValuationPoint
  **/
  @jakarta.annotation.Nonnull
  public ValuationPointDataResponse getCandidateValuationPoint() {
    return candidateValuationPoint;
  }


  public void setCandidateValuationPoint(ValuationPointDataResponse candidateValuationPoint) {
    this.candidateValuationPoint = candidateValuationPoint;
  }


  public AcceptEstimateValuationPointResponse latestValuationPoint(ValuationPointDataResponse latestValuationPoint) {
    
    this.latestValuationPoint = latestValuationPoint;
    return this;
  }

   /**
   * Get latestValuationPoint
   * @return latestValuationPoint
  **/
  @jakarta.annotation.Nullable
  public ValuationPointDataResponse getLatestValuationPoint() {
    return latestValuationPoint;
  }


  public void setLatestValuationPoint(ValuationPointDataResponse latestValuationPoint) {
    this.latestValuationPoint = latestValuationPoint;
  }


  public AcceptEstimateValuationPointResponse links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public AcceptEstimateValuationPointResponse addLinksItem(Link linksItem) {
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
    AcceptEstimateValuationPointResponse acceptEstimateValuationPointResponse = (AcceptEstimateValuationPointResponse) o;
    return Objects.equals(this.href, acceptEstimateValuationPointResponse.href) &&
        Objects.equals(this.candidateValuationPoint, acceptEstimateValuationPointResponse.candidateValuationPoint) &&
        Objects.equals(this.latestValuationPoint, acceptEstimateValuationPointResponse.latestValuationPoint) &&
        Objects.equals(this.links, acceptEstimateValuationPointResponse.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, candidateValuationPoint, latestValuationPoint, links);
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
    sb.append("class AcceptEstimateValuationPointResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    candidateValuationPoint: ").append(toIndentedString(candidateValuationPoint)).append("\n");
    sb.append("    latestValuationPoint: ").append(toIndentedString(latestValuationPoint)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("candidateValuationPoint");
    openapiFields.add("latestValuationPoint");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("candidateValuationPoint");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AcceptEstimateValuationPointResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcceptEstimateValuationPointResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcceptEstimateValuationPointResponse is not found in the empty JSON string", AcceptEstimateValuationPointResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AcceptEstimateValuationPointResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the required field `candidateValuationPoint`
      ValuationPointDataResponse.validateJsonElement(jsonObj.get("candidateValuationPoint"));
      // validate the optional field `latestValuationPoint`
      if (jsonObj.get("latestValuationPoint") != null && !jsonObj.get("latestValuationPoint").isJsonNull()) {
        ValuationPointDataResponse.validateJsonElement(jsonObj.get("latestValuationPoint"));
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
       if (!AcceptEstimateValuationPointResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcceptEstimateValuationPointResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcceptEstimateValuationPointResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcceptEstimateValuationPointResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AcceptEstimateValuationPointResponse>() {
           @Override
           public void write(JsonWriter out, AcceptEstimateValuationPointResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcceptEstimateValuationPointResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AcceptEstimateValuationPointResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AcceptEstimateValuationPointResponse
  * @throws IOException if the JSON string is invalid with respect to AcceptEstimateValuationPointResponse
  */
  public static AcceptEstimateValuationPointResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcceptEstimateValuationPointResponse.class);
  }

 /**
  * Convert an instance of AcceptEstimateValuationPointResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}