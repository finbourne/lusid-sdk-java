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
import com.finbourne.lusid.model.PortfolioEntityId;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Instrument event query.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryInstrumentEventsRequest {
  public static final String SERIALIZED_NAME_AS_AT = "asAt";
  @SerializedName(SERIALIZED_NAME_AS_AT)
  private OffsetDateTime asAt;

  public static final String SERIALIZED_NAME_WINDOW_START = "windowStart";
  @SerializedName(SERIALIZED_NAME_WINDOW_START)
  private OffsetDateTime windowStart;

  public static final String SERIALIZED_NAME_WINDOW_END = "windowEnd";
  @SerializedName(SERIALIZED_NAME_WINDOW_END)
  private OffsetDateTime windowEnd;

  public static final String SERIALIZED_NAME_PORTFOLIO_ENTITY_IDS = "portfolioEntityIds";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ENTITY_IDS)
  private List<PortfolioEntityId> portfolioEntityIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_EFFECTIVE_AT = "effectiveAt";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT)
  private OffsetDateTime effectiveAt;

  public static final String SERIALIZED_NAME_RECIPE_ID = "recipeId";
  @SerializedName(SERIALIZED_NAME_RECIPE_ID)
  private ResourceId recipeId;

  public static final String SERIALIZED_NAME_FILTER_INSTRUMENT_EVENTS = "filterInstrumentEvents";
  @SerializedName(SERIALIZED_NAME_FILTER_INSTRUMENT_EVENTS)
  private String filterInstrumentEvents;

  public QueryInstrumentEventsRequest() {
  }

  public QueryInstrumentEventsRequest asAt(OffsetDateTime asAt) {
    
    this.asAt = asAt;
    return this;
  }

   /**
   * The time of the system at which to query for bucketed cashflows.
   * @return asAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAsAt() {
    return asAt;
  }


  public void setAsAt(OffsetDateTime asAt) {
    this.asAt = asAt;
  }


  public QueryInstrumentEventsRequest windowStart(OffsetDateTime windowStart) {
    
    this.windowStart = windowStart;
    return this;
  }

   /**
   * The start date of the window.
   * @return windowStart
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getWindowStart() {
    return windowStart;
  }


  public void setWindowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
  }


  public QueryInstrumentEventsRequest windowEnd(OffsetDateTime windowEnd) {
    
    this.windowEnd = windowEnd;
    return this;
  }

   /**
   * The end date of the window.
   * @return windowEnd
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getWindowEnd() {
    return windowEnd;
  }


  public void setWindowEnd(OffsetDateTime windowEnd) {
    this.windowEnd = windowEnd;
  }


  public QueryInstrumentEventsRequest portfolioEntityIds(List<PortfolioEntityId> portfolioEntityIds) {
    
    this.portfolioEntityIds = portfolioEntityIds;
    return this;
  }

  public QueryInstrumentEventsRequest addPortfolioEntityIdsItem(PortfolioEntityId portfolioEntityIdsItem) {
    if (this.portfolioEntityIds == null) {
      this.portfolioEntityIds = new ArrayList<>();
    }
    this.portfolioEntityIds.add(portfolioEntityIdsItem);
    return this;
  }

   /**
   * The set of portfolios and portfolio groups to which the instrument events must belong.
   * @return portfolioEntityIds
  **/
  @jakarta.annotation.Nonnull
  public List<PortfolioEntityId> getPortfolioEntityIds() {
    return portfolioEntityIds;
  }


  public void setPortfolioEntityIds(List<PortfolioEntityId> portfolioEntityIds) {
    this.portfolioEntityIds = portfolioEntityIds;
  }


  public QueryInstrumentEventsRequest effectiveAt(OffsetDateTime effectiveAt) {
    
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * The Effective date used in the valuation of the cashflows.
   * @return effectiveAt
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getEffectiveAt() {
    return effectiveAt;
  }


  public void setEffectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  public QueryInstrumentEventsRequest recipeId(ResourceId recipeId) {
    
    this.recipeId = recipeId;
    return this;
  }

   /**
   * Get recipeId
   * @return recipeId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getRecipeId() {
    return recipeId;
  }


  public void setRecipeId(ResourceId recipeId) {
    this.recipeId = recipeId;
  }


  public QueryInstrumentEventsRequest filterInstrumentEvents(String filterInstrumentEvents) {
    
    this.filterInstrumentEvents = filterInstrumentEvents;
    return this;
  }

   /**
   * Expression to filter the result set.
   * @return filterInstrumentEvents
  **/
  @jakarta.annotation.Nullable
  public String getFilterInstrumentEvents() {
    return filterInstrumentEvents;
  }


  public void setFilterInstrumentEvents(String filterInstrumentEvents) {
    this.filterInstrumentEvents = filterInstrumentEvents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInstrumentEventsRequest queryInstrumentEventsRequest = (QueryInstrumentEventsRequest) o;
    return Objects.equals(this.asAt, queryInstrumentEventsRequest.asAt) &&
        Objects.equals(this.windowStart, queryInstrumentEventsRequest.windowStart) &&
        Objects.equals(this.windowEnd, queryInstrumentEventsRequest.windowEnd) &&
        Objects.equals(this.portfolioEntityIds, queryInstrumentEventsRequest.portfolioEntityIds) &&
        Objects.equals(this.effectiveAt, queryInstrumentEventsRequest.effectiveAt) &&
        Objects.equals(this.recipeId, queryInstrumentEventsRequest.recipeId) &&
        Objects.equals(this.filterInstrumentEvents, queryInstrumentEventsRequest.filterInstrumentEvents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(asAt, windowStart, windowEnd, portfolioEntityIds, effectiveAt, recipeId, filterInstrumentEvents);
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
    sb.append("class QueryInstrumentEventsRequest {\n");
    sb.append("    asAt: ").append(toIndentedString(asAt)).append("\n");
    sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
    sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
    sb.append("    portfolioEntityIds: ").append(toIndentedString(portfolioEntityIds)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    recipeId: ").append(toIndentedString(recipeId)).append("\n");
    sb.append("    filterInstrumentEvents: ").append(toIndentedString(filterInstrumentEvents)).append("\n");
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
    openapiFields.add("asAt");
    openapiFields.add("windowStart");
    openapiFields.add("windowEnd");
    openapiFields.add("portfolioEntityIds");
    openapiFields.add("effectiveAt");
    openapiFields.add("recipeId");
    openapiFields.add("filterInstrumentEvents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("windowStart");
    openapiRequiredFields.add("windowEnd");
    openapiRequiredFields.add("portfolioEntityIds");
    openapiRequiredFields.add("effectiveAt");
    openapiRequiredFields.add("recipeId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QueryInstrumentEventsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryInstrumentEventsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryInstrumentEventsRequest is not found in the empty JSON string", QueryInstrumentEventsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryInstrumentEventsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("portfolioEntityIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `portfolioEntityIds` to be an array in the JSON string but got `%s`", jsonObj.get("portfolioEntityIds").toString()));
      }

      JsonArray jsonArrayportfolioEntityIds = jsonObj.getAsJsonArray("portfolioEntityIds");
      // validate the required field `portfolioEntityIds` (array)
      for (int i = 0; i < jsonArrayportfolioEntityIds.size(); i++) {
        PortfolioEntityId.validateJsonElement(jsonArrayportfolioEntityIds.get(i));
      };
      // validate the required field `recipeId`
      ResourceId.validateJsonElement(jsonObj.get("recipeId"));
      if ((jsonObj.get("filterInstrumentEvents") != null && !jsonObj.get("filterInstrumentEvents").isJsonNull()) && !jsonObj.get("filterInstrumentEvents").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterInstrumentEvents` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filterInstrumentEvents").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInstrumentEventsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInstrumentEventsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInstrumentEventsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInstrumentEventsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInstrumentEventsRequest>() {
           @Override
           public void write(JsonWriter out, QueryInstrumentEventsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInstrumentEventsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInstrumentEventsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInstrumentEventsRequest
  * @throws IOException if the JSON string is invalid with respect to QueryInstrumentEventsRequest
  */
  public static QueryInstrumentEventsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInstrumentEventsRequest.class);
  }

 /**
  * Convert an instance of QueryInstrumentEventsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
