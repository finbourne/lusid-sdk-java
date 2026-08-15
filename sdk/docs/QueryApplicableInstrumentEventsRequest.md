# com.finbourne.lusid.model.QueryApplicableInstrumentEventsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the window. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the window. | [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The Effective date that splits query window into two parts: factual period and forecast period. Optional - a timeline (with an optional closed period) may be supplied instead to derive the effective date. | [optional] [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the instrument events must belong. | [default to List<PortfolioEntityId>]
**forecastingRecipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**timelineScope** | **String** | The scope of the timeline to be used when building the instrument events. | [optional] [default to String]
**timelineCode** | **String** | The code of the timeline to be used when building the instrument events. This can optionally include a colon, followed by the Closed Period Id to use at the head of the timeline, for a timeline with unconfirmed periods. | [optional] [default to String]
**closedPeriodId** | **String** | The id of the closed period, on the given timeline, to be used when building the instrument events. | [optional] [default to String]

```java
import com.finbourne.lusid.model.QueryApplicableInstrumentEventsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime WindowStart = OffsetDateTime.now();
OffsetDateTime WindowEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
ResourceId ForecastingRecipeId = new ResourceId();
@jakarta.annotation.Nullable String TimelineScope = "example TimelineScope";
@jakarta.annotation.Nullable String TimelineCode = "example TimelineCode";
@jakarta.annotation.Nullable String ClosedPeriodId = "example ClosedPeriodId";


QueryApplicableInstrumentEventsRequest queryApplicableInstrumentEventsRequestInstance = new QueryApplicableInstrumentEventsRequest()
    .WindowStart(WindowStart)
    .WindowEnd(WindowEnd)
    .EffectiveAt(EffectiveAt)
    .PortfolioEntityIds(PortfolioEntityIds)
    .ForecastingRecipeId(ForecastingRecipeId)
    .TimelineScope(TimelineScope)
    .TimelineCode(TimelineCode)
    .ClosedPeriodId(ClosedPeriodId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
