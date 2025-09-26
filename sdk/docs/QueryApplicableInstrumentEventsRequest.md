# com.finbourne.lusid.model.QueryApplicableInstrumentEventsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the window. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the window. | [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The Effective date that splits query window into two parts: factual period and forecast period | [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**forecastingRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.lusid.model.QueryApplicableInstrumentEventsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime WindowStart = OffsetDateTime.now();
OffsetDateTime WindowEnd = OffsetDateTime.now();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
ResourceId ForecastingRecipeId = new ResourceId();


QueryApplicableInstrumentEventsRequest queryApplicableInstrumentEventsRequestInstance = new QueryApplicableInstrumentEventsRequest()
    .WindowStart(WindowStart)
    .WindowEnd(WindowEnd)
    .EffectiveAt(EffectiveAt)
    .PortfolioEntityIds(PortfolioEntityIds)
    .ForecastingRecipeId(ForecastingRecipeId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
