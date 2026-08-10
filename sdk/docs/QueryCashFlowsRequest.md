# com.finbourne.lusid.model.QueryCashFlowsRequest
Query for cashflows from one or more portfolios

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for cashflows. | [optional] [default to OffsetDateTime]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the window. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the window. | [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The Effective date used in the valuation of the cashflows. | [default to OffsetDateTime]
**cashFlowCalculationVersion** | **String** | The version of the cash flow calculation logic to use. Defaults to &#39;1&#39; if not specified. Valid values are &#39;1&#39; and &#39;2&#39;.  &#39;1&#39; is the current production behaviour: cash flows booked as transactions are de-duplicated against the  instrument cash flows by identifier, and movements are treated as factual when they settle on or before the effective date.  &#39;2&#39; resolves cash flows via a deterministic source waterfall (structured result store &gt; transaction &gt; instrument),  classifies cash flows as factual by the transaction trade date (so trades dealt on or before the effective date  that settle afterwards are factual), and applies corporate action date filtering.  Bucketed responses calculated under version &#39;2&#39; always include the bucket interval metadata columns  (&#39;Valuation/Bucket/Start&#39;, &#39;Valuation/Bucket/End&#39;, &#39;Valuation/Bucket/StartInclusive&#39;, &#39;Valuation/Bucket/EndInclusive&#39;),  which are the required input of the bucket cash flow drill-down endpoint. Without a border configuration the  metadata describes the window-clamped interval of cash flow dates that the rounding method allocates to each bucket point. | [optional] [default to String]

```java
import com.finbourne.lusid.model.QueryCashFlowsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
OffsetDateTime WindowStart = OffsetDateTime.now();
OffsetDateTime WindowEnd = OffsetDateTime.now();
List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
ResourceId RecipeId = new ResourceId();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String CashFlowCalculationVersion = "example CashFlowCalculationVersion";


QueryCashFlowsRequest queryCashFlowsRequestInstance = new QueryCashFlowsRequest()
    .AsAt(AsAt)
    .WindowStart(WindowStart)
    .WindowEnd(WindowEnd)
    .PortfolioEntityIds(PortfolioEntityIds)
    .RecipeId(RecipeId)
    .EffectiveAt(EffectiveAt)
    .CashFlowCalculationVersion(CashFlowCalculationVersion);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
