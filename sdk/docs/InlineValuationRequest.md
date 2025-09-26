# com.finbourne.lusid.model.InlineValuationRequest
Specification object for the parameters of an inline valuation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to use | [optional] [default to OffsetDateTime]
**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) | The set of specifications to calculate or retrieve during the valuation and present in the results. For example:  AggregateSpec(&#39;Valuation/PV&#39;,&#39;Sum&#39;) for returning the PV (present value) of holdings  AggregateSpec(&#39;Holding/default/Units&#39;,&#39;Sum&#39;) for returning the units of holidays  AggregateSpec(&#39;Instrument/default/LusidInstrumentId&#39;,&#39;Value&#39;) for returning the Lusid Instrument identifier | [default to List<AggregateSpec>]
**groupBy** | **List&lt;String&gt;** | The set of items by which to perform grouping. This primarily matters when one or more of the metric operators is a mapping  that reduces set size, e.g. sum or proportion. The group-by statement determines the set of keys by which to break the results out. | [optional] [default to List<String>]
**filters** | [**List&lt;PropertyFilter&gt;**](PropertyFilter.md) | A set of filters to use to reduce the data found in a request. Equivalent to the &#39;where ...&#39; part of a Sql select statement.  For example, filter a set of values within a given range or matching a particular value. | [optional] [default to List<PropertyFilter>]
**sort** | [**List&lt;OrderBySpec&gt;**](OrderBySpec.md) | A (possibly empty/null) set of specifications for how to order the results. | [optional] [default to List<OrderBySpec>]
**reportCurrency** | **String** | Three letter ISO currency string indicating what currency to report in for ReportCurrency denominated queries.  If not present, then the currency of the relevant portfolio will be used in its place. | [optional] [default to String]
**equipWithSubtotals** | **Boolean** | Flag directing the Valuation call to populate the results with subtotals of aggregates. | [optional] [default to Boolean]
**returnResultAsExpandedTypes** | **Boolean** | Financially meaningful results can be presented as either simple flat types or more complex expanded types.  For example, the present value (PV) of a holding could be represented either as a simple decimal (with currency implied)  or as a decimal-currency pair. This flag allows either representation to be returned. In the PV example,  the returned value would be the decimal-currency pair if this flag is true, or the decimal only if this flag is false. | [optional] [default to Boolean]
**valuationSchedule** | [**ValuationSchedule**](ValuationSchedule.md) |  | [optional] [default to ValuationSchedule]
**instruments** | [**List&lt;WeightedInstrument&gt;**](WeightedInstrument.md) | The set of instruments, weighted by the quantities held that are required.  It is identified by an identifier tag that can be used to identify it externally.  For a single, unique trade or transaction this can be thought of as equivalent to the transaction identifier, or  a composite of the sub-holding keys for a regular sub-holding. When there are multiple transactions sharing the same underlying instrument  such as purchase of shares on multiple dates where tax implications are different this would not be the case. | [default to List<WeightedInstrument>]
**marketDataOverrides** | [**MarketDataOverrides**](MarketDataOverrides.md) |  | [optional] [default to MarketDataOverrides]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.InlineValuationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
List<AggregateSpec> Metrics = new List<AggregateSpec>();
@jakarta.annotation.Nullable List<String> GroupBy = new List<String>();
@jakarta.annotation.Nullable List<PropertyFilter> Filters = new List<PropertyFilter>();
@jakarta.annotation.Nullable List<OrderBySpec> Sort = new List<OrderBySpec>();
@jakarta.annotation.Nullable String ReportCurrency = "example ReportCurrency";
Boolean EquipWithSubtotals = true;
Boolean ReturnResultAsExpandedTypes = true;
ValuationSchedule ValuationSchedule = new ValuationSchedule();
List<WeightedInstrument> Instruments = new List<WeightedInstrument>();
MarketDataOverrides MarketDataOverrides = new MarketDataOverrides();
ResourceId CorporateActionSourceId = new ResourceId();


InlineValuationRequest inlineValuationRequestInstance = new InlineValuationRequest()
    .RecipeId(RecipeId)
    .AsAt(AsAt)
    .Metrics(Metrics)
    .GroupBy(GroupBy)
    .Filters(Filters)
    .Sort(Sort)
    .ReportCurrency(ReportCurrency)
    .EquipWithSubtotals(EquipWithSubtotals)
    .ReturnResultAsExpandedTypes(ReturnResultAsExpandedTypes)
    .ValuationSchedule(ValuationSchedule)
    .Instruments(Instruments)
    .MarketDataOverrides(MarketDataOverrides)
    .CorporateActionSourceId(CorporateActionSourceId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
