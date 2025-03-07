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
import com.finbourne.lusid.model.BucketingSchedule;
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
 * Query for bucketed cashflows from one or more portfolios.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryBucketedCashFlowsRequest {
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

  public static final String SERIALIZED_NAME_ROUNDING_METHOD = "roundingMethod";
  @SerializedName(SERIALIZED_NAME_ROUNDING_METHOD)
  private String roundingMethod;

  public static final String SERIALIZED_NAME_BUCKETING_DATES = "bucketingDates";
  @SerializedName(SERIALIZED_NAME_BUCKETING_DATES)
  private List<OffsetDateTime> bucketingDates;

  public static final String SERIALIZED_NAME_BUCKETING_TENORS = "bucketingTenors";
  @SerializedName(SERIALIZED_NAME_BUCKETING_TENORS)
  private List<String> bucketingTenors;

  public static final String SERIALIZED_NAME_REPORT_CURRENCY = "reportCurrency";
  @SerializedName(SERIALIZED_NAME_REPORT_CURRENCY)
  private String reportCurrency;

  public static final String SERIALIZED_NAME_GROUP_BY = "groupBy";
  @SerializedName(SERIALIZED_NAME_GROUP_BY)
  private List<String> groupBy;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses;

  public static final String SERIALIZED_NAME_EQUIP_WITH_SUBTOTALS = "equipWithSubtotals";
  @SerializedName(SERIALIZED_NAME_EQUIP_WITH_SUBTOTALS)
  private Boolean equipWithSubtotals;

  public static final String SERIALIZED_NAME_EXCLUDE_UNSETTLED_TRADES = "excludeUnsettledTrades";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_UNSETTLED_TRADES)
  private Boolean excludeUnsettledTrades;

  public static final String SERIALIZED_NAME_CASH_FLOW_TYPE = "cashFlowType";
  @SerializedName(SERIALIZED_NAME_CASH_FLOW_TYPE)
  private String cashFlowType;

  public static final String SERIALIZED_NAME_BUCKETING_SCHEDULE = "bucketingSchedule";
  @SerializedName(SERIALIZED_NAME_BUCKETING_SCHEDULE)
  private BucketingSchedule bucketingSchedule;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public QueryBucketedCashFlowsRequest() {
  }

  public QueryBucketedCashFlowsRequest asAt(OffsetDateTime asAt) {
    
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


  public QueryBucketedCashFlowsRequest windowStart(OffsetDateTime windowStart) {
    
    this.windowStart = windowStart;
    return this;
  }

   /**
   * The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  There is no lower bound if this is not specified.
   * @return windowStart
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getWindowStart() {
    return windowStart;
  }


  public void setWindowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
  }


  public QueryBucketedCashFlowsRequest windowEnd(OffsetDateTime windowEnd) {
    
    this.windowEnd = windowEnd;
    return this;
  }

   /**
   * The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.  The upper bound defaults to &#39;today&#39; if it is not specified
   * @return windowEnd
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getWindowEnd() {
    return windowEnd;
  }


  public void setWindowEnd(OffsetDateTime windowEnd) {
    this.windowEnd = windowEnd;
  }


  public QueryBucketedCashFlowsRequest portfolioEntityIds(List<PortfolioEntityId> portfolioEntityIds) {
    
    this.portfolioEntityIds = portfolioEntityIds;
    return this;
  }

  public QueryBucketedCashFlowsRequest addPortfolioEntityIdsItem(PortfolioEntityId portfolioEntityIdsItem) {
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


  public QueryBucketedCashFlowsRequest effectiveAt(OffsetDateTime effectiveAt) {
    
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today.
   * @return effectiveAt
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getEffectiveAt() {
    return effectiveAt;
  }


  public void setEffectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  public QueryBucketedCashFlowsRequest recipeId(ResourceId recipeId) {
    
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


  public QueryBucketedCashFlowsRequest roundingMethod(String roundingMethod) {
    
    this.roundingMethod = roundingMethod;
    return this;
  }

   /**
   * When bucketing, there is not a unique way to allocate the bucket points.  RoundingMethod Supported string (enumeration) values are: [RoundDown, RoundUp].
   * @return roundingMethod
  **/
  @jakarta.annotation.Nonnull
  public String getRoundingMethod() {
    return roundingMethod;
  }


  public void setRoundingMethod(String roundingMethod) {
    this.roundingMethod = roundingMethod;
  }


  public QueryBucketedCashFlowsRequest bucketingDates(List<OffsetDateTime> bucketingDates) {
    
    this.bucketingDates = bucketingDates;
    return this;
  }

  public QueryBucketedCashFlowsRequest addBucketingDatesItem(OffsetDateTime bucketingDatesItem) {
    if (this.bucketingDates == null) {
      this.bucketingDates = new ArrayList<>();
    }
    this.bucketingDates.add(bucketingDatesItem);
    return this;
  }

   /**
   * A list of dates to perform cashflow bucketing upon.  If this is provided, the list of tenors for bucketing should be empty.
   * @return bucketingDates
  **/
  @jakarta.annotation.Nullable
  public List<OffsetDateTime> getBucketingDates() {
    return bucketingDates;
  }


  public void setBucketingDates(List<OffsetDateTime> bucketingDates) {
    this.bucketingDates = bucketingDates;
  }


  public QueryBucketedCashFlowsRequest bucketingTenors(List<String> bucketingTenors) {
    
    this.bucketingTenors = bucketingTenors;
    return this;
  }

  public QueryBucketedCashFlowsRequest addBucketingTenorsItem(String bucketingTenorsItem) {
    if (this.bucketingTenors == null) {
      this.bucketingTenors = new ArrayList<>();
    }
    this.bucketingTenors.add(bucketingTenorsItem);
    return this;
  }

   /**
   * A list of tenors to perform cashflow bucketing upon.  If this is provided, the list of dates for bucketing should be empty.
   * @return bucketingTenors
  **/
  @jakarta.annotation.Nullable
  public List<String> getBucketingTenors() {
    return bucketingTenors;
  }


  public void setBucketingTenors(List<String> bucketingTenors) {
    this.bucketingTenors = bucketingTenors;
  }


  public QueryBucketedCashFlowsRequest reportCurrency(String reportCurrency) {
    
    this.reportCurrency = reportCurrency;
    return this;
  }

   /**
   * Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries.
   * @return reportCurrency
  **/
  @jakarta.annotation.Nonnull
  public String getReportCurrency() {
    return reportCurrency;
  }


  public void setReportCurrency(String reportCurrency) {
    this.reportCurrency = reportCurrency;
  }


  public QueryBucketedCashFlowsRequest groupBy(List<String> groupBy) {
    
    this.groupBy = groupBy;
    return this;
  }

  public QueryBucketedCashFlowsRequest addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

   /**
   * The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out.
   * @return groupBy
  **/
  @jakarta.annotation.Nullable
  public List<String> getGroupBy() {
    return groupBy;
  }


  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }


  public QueryBucketedCashFlowsRequest addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public QueryBucketedCashFlowsRequest addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * The set of items that the user wishes to see in the results. If empty, will be defaulted to standard ones.
   * @return addresses
  **/
  @jakarta.annotation.Nullable
  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public QueryBucketedCashFlowsRequest equipWithSubtotals(Boolean equipWithSubtotals) {
    
    this.equipWithSubtotals = equipWithSubtotals;
    return this;
  }

   /**
   * Flag directing the Valuation call to populate the results with subtotals of aggregates.
   * @return equipWithSubtotals
  **/
  @jakarta.annotation.Nullable
  public Boolean getEquipWithSubtotals() {
    return equipWithSubtotals;
  }


  public void setEquipWithSubtotals(Boolean equipWithSubtotals) {
    this.equipWithSubtotals = equipWithSubtotals;
  }


  public QueryBucketedCashFlowsRequest excludeUnsettledTrades(Boolean excludeUnsettledTrades) {
    
    this.excludeUnsettledTrades = excludeUnsettledTrades;
    return this;
  }

   /**
   * Flag directing the Valuation call to exclude cashflows from unsettled trades.  If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set.
   * @return excludeUnsettledTrades
  **/
  @jakarta.annotation.Nullable
  public Boolean getExcludeUnsettledTrades() {
    return excludeUnsettledTrades;
  }


  public void setExcludeUnsettledTrades(Boolean excludeUnsettledTrades) {
    this.excludeUnsettledTrades = excludeUnsettledTrades;
  }


  public QueryBucketedCashFlowsRequest cashFlowType(String cashFlowType) {
    
    this.cashFlowType = cashFlowType;
    return this;
  }

   /**
   * Indicate the requested cash flow representation InstrumentCashFlows or PortfolioCashFlows (GetCashLadder uses this)  Options: [InstrumentCashFlow, PortfolioCashFlow]
   * @return cashFlowType
  **/
  @jakarta.annotation.Nullable
  public String getCashFlowType() {
    return cashFlowType;
  }


  public void setCashFlowType(String cashFlowType) {
    this.cashFlowType = cashFlowType;
  }


  public QueryBucketedCashFlowsRequest bucketingSchedule(BucketingSchedule bucketingSchedule) {
    
    this.bucketingSchedule = bucketingSchedule;
    return this;
  }

   /**
   * Get bucketingSchedule
   * @return bucketingSchedule
  **/
  @jakarta.annotation.Nullable
  public BucketingSchedule getBucketingSchedule() {
    return bucketingSchedule;
  }


  public void setBucketingSchedule(BucketingSchedule bucketingSchedule) {
    this.bucketingSchedule = bucketingSchedule;
  }


  public QueryBucketedCashFlowsRequest filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * 
   * @return filter
  **/
  @jakarta.annotation.Nullable
  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryBucketedCashFlowsRequest queryBucketedCashFlowsRequest = (QueryBucketedCashFlowsRequest) o;
    return Objects.equals(this.asAt, queryBucketedCashFlowsRequest.asAt) &&
        Objects.equals(this.windowStart, queryBucketedCashFlowsRequest.windowStart) &&
        Objects.equals(this.windowEnd, queryBucketedCashFlowsRequest.windowEnd) &&
        Objects.equals(this.portfolioEntityIds, queryBucketedCashFlowsRequest.portfolioEntityIds) &&
        Objects.equals(this.effectiveAt, queryBucketedCashFlowsRequest.effectiveAt) &&
        Objects.equals(this.recipeId, queryBucketedCashFlowsRequest.recipeId) &&
        Objects.equals(this.roundingMethod, queryBucketedCashFlowsRequest.roundingMethod) &&
        Objects.equals(this.bucketingDates, queryBucketedCashFlowsRequest.bucketingDates) &&
        Objects.equals(this.bucketingTenors, queryBucketedCashFlowsRequest.bucketingTenors) &&
        Objects.equals(this.reportCurrency, queryBucketedCashFlowsRequest.reportCurrency) &&
        Objects.equals(this.groupBy, queryBucketedCashFlowsRequest.groupBy) &&
        Objects.equals(this.addresses, queryBucketedCashFlowsRequest.addresses) &&
        Objects.equals(this.equipWithSubtotals, queryBucketedCashFlowsRequest.equipWithSubtotals) &&
        Objects.equals(this.excludeUnsettledTrades, queryBucketedCashFlowsRequest.excludeUnsettledTrades) &&
        Objects.equals(this.cashFlowType, queryBucketedCashFlowsRequest.cashFlowType) &&
        Objects.equals(this.bucketingSchedule, queryBucketedCashFlowsRequest.bucketingSchedule) &&
        Objects.equals(this.filter, queryBucketedCashFlowsRequest.filter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(asAt, windowStart, windowEnd, portfolioEntityIds, effectiveAt, recipeId, roundingMethod, bucketingDates, bucketingTenors, reportCurrency, groupBy, addresses, equipWithSubtotals, excludeUnsettledTrades, cashFlowType, bucketingSchedule, filter);
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
    sb.append("class QueryBucketedCashFlowsRequest {\n");
    sb.append("    asAt: ").append(toIndentedString(asAt)).append("\n");
    sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
    sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
    sb.append("    portfolioEntityIds: ").append(toIndentedString(portfolioEntityIds)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    recipeId: ").append(toIndentedString(recipeId)).append("\n");
    sb.append("    roundingMethod: ").append(toIndentedString(roundingMethod)).append("\n");
    sb.append("    bucketingDates: ").append(toIndentedString(bucketingDates)).append("\n");
    sb.append("    bucketingTenors: ").append(toIndentedString(bucketingTenors)).append("\n");
    sb.append("    reportCurrency: ").append(toIndentedString(reportCurrency)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    equipWithSubtotals: ").append(toIndentedString(equipWithSubtotals)).append("\n");
    sb.append("    excludeUnsettledTrades: ").append(toIndentedString(excludeUnsettledTrades)).append("\n");
    sb.append("    cashFlowType: ").append(toIndentedString(cashFlowType)).append("\n");
    sb.append("    bucketingSchedule: ").append(toIndentedString(bucketingSchedule)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("roundingMethod");
    openapiFields.add("bucketingDates");
    openapiFields.add("bucketingTenors");
    openapiFields.add("reportCurrency");
    openapiFields.add("groupBy");
    openapiFields.add("addresses");
    openapiFields.add("equipWithSubtotals");
    openapiFields.add("excludeUnsettledTrades");
    openapiFields.add("cashFlowType");
    openapiFields.add("bucketingSchedule");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("windowStart");
    openapiRequiredFields.add("windowEnd");
    openapiRequiredFields.add("portfolioEntityIds");
    openapiRequiredFields.add("effectiveAt");
    openapiRequiredFields.add("recipeId");
    openapiRequiredFields.add("roundingMethod");
    openapiRequiredFields.add("reportCurrency");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QueryBucketedCashFlowsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryBucketedCashFlowsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryBucketedCashFlowsRequest is not found in the empty JSON string", QueryBucketedCashFlowsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryBucketedCashFlowsRequest.openapiRequiredFields) {
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
      if (!jsonObj.get("roundingMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roundingMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roundingMethod").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bucketingDates") != null && !jsonObj.get("bucketingDates").isJsonNull() && !jsonObj.get("bucketingDates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucketingDates` to be an array in the JSON string but got `%s`", jsonObj.get("bucketingDates").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bucketingTenors") != null && !jsonObj.get("bucketingTenors").isJsonNull() && !jsonObj.get("bucketingTenors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucketingTenors` to be an array in the JSON string but got `%s`", jsonObj.get("bucketingTenors").toString()));
      }
      if (!jsonObj.get("reportCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportCurrency").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupBy") != null && !jsonObj.get("groupBy").isJsonNull() && !jsonObj.get("groupBy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupBy` to be an array in the JSON string but got `%s`", jsonObj.get("groupBy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull() && !jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      if ((jsonObj.get("cashFlowType") != null && !jsonObj.get("cashFlowType").isJsonNull()) && !jsonObj.get("cashFlowType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cashFlowType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cashFlowType").toString()));
      }
      // validate the optional field `bucketingSchedule`
      if (jsonObj.get("bucketingSchedule") != null && !jsonObj.get("bucketingSchedule").isJsonNull()) {
        BucketingSchedule.validateJsonElement(jsonObj.get("bucketingSchedule"));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryBucketedCashFlowsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryBucketedCashFlowsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryBucketedCashFlowsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryBucketedCashFlowsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryBucketedCashFlowsRequest>() {
           @Override
           public void write(JsonWriter out, QueryBucketedCashFlowsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryBucketedCashFlowsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryBucketedCashFlowsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryBucketedCashFlowsRequest
  * @throws IOException if the JSON string is invalid with respect to QueryBucketedCashFlowsRequest
  */
  public static QueryBucketedCashFlowsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryBucketedCashFlowsRequest.class);
  }

 /**
  * Convert an instance of QueryBucketedCashFlowsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
