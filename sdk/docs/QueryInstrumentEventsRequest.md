# com.finbourne.lusid.model.QueryInstrumentEventsRequest
Instrument event query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for bucketed cashflows. | [optional] [default to OffsetDateTime]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the window. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the window. | [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The Effective date used in the valuation of the cashflows. | [default to OffsetDateTime]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**filterInstrumentEvents** | **String** | Expression to filter the result set. | [optional] [default to String]

```java
import com.finbourne.lusid.model.QueryInstrumentEventsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
OffsetDateTime WindowStart = OffsetDateTime.now();
OffsetDateTime WindowEnd = OffsetDateTime.now();
List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable String FilterInstrumentEvents = "example FilterInstrumentEvents";


QueryInstrumentEventsRequest queryInstrumentEventsRequestInstance = new QueryInstrumentEventsRequest()
    .AsAt(AsAt)
    .WindowStart(WindowStart)
    .WindowEnd(WindowEnd)
    .PortfolioEntityIds(PortfolioEntityIds)
    .EffectiveAt(EffectiveAt)
    .RecipeId(RecipeId)
    .FilterInstrumentEvents(FilterInstrumentEvents);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
