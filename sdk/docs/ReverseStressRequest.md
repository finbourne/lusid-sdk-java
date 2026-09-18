# com.finbourne.lusid.model.ReverseStressRequest
Request to solve a reverse stress test: instead of asking what a given market move does to a  portfolio, it asks how far the market has to move along a given direction to produce a given  loss. The direction is a stored scenario; the answer is the factor its shifts are multiplied by.     A single effective date is solved, not a schedule. \"How far must the market move to lose this  much\" has one answer per date, and returning a factor per date under one target would invite the  answer being read as a single portfolio-wide number when it is not.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The portfolios or portfolio groups whose value the target loss is measured against. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date to value at. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at time to read portfolios, instruments, market data and the scenario definition at.  Defaults to the latest. | [optional] [default to OffsetDateTime]
**scenario** | [**ScenarioReference**](ScenarioReference.md) |  | [default to ScenarioReference]
**targetPnl** | **java.math.BigDecimal** | The change in value to solve for, signed and in the report currency: negative for a loss.  Expressed as an amount rather than a percentage so that the same target can be stated against  a portfolio whose base value is not known to the caller. | [default to java.math.BigDecimal]
**metric** | **String** | The measure the target is expressed in. Defaults to Valuation/PV. Must be a measure that  supports scenario decoration, which the request is rejected for if it is not. | [optional] [default to String]
**reportCurrency** | **String** | Three to five letter currency string to report in. If absent the portfolio&#39;s own currency is used,  which makes the target ambiguous across a multi-currency portfolio group - supply it there. | [optional] [default to String]
**filters** | [**List&lt;PropertyFilter&gt;**](PropertyFilter.md) | Filters reducing the holdings the target is measured over, matching the valuation endpoint&#39;s. | [optional] [default to List<PropertyFilter>]
**maxScale** | **java.math.BigDecimal** | The largest factor to evaluate. A target beyond the loss reached at this factor is reported as  out of reach rather than extrapolated to: extrapolating past the evaluated range is exactly  where a locally linear P&amp;L stops being linear. | [optional] [default to java.math.BigDecimal]
**ladderPoints** | **Integer** | How many factors to evaluate between zero and MaxScale. All of them are valued in  one request - the rungs share market data resolution - so a finer ladder costs far less than  its rung count suggests, and a coarse one is the main source of a missed bracket. | [optional] [default to Integer]
**tolerance** | **java.math.BigDecimal** | How close the achieved loss must be to the target, relative to the target&#39;s own size. Relative  rather than absolute because the same reverse stress is asked of books whose value differs by  orders of magnitude. | [optional] [default to java.math.BigDecimal]
**maxIterations** | **Integer** | How many refinement rounds are allowed after the opening ladder. Each round costs one  valuation; on a near-linear P&amp;L the first interpolation is usually already inside tolerance,  so the default exists for the mildly curved case rather than the normal one. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.ReverseStressRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RecipeId = new ResourceId();
List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
ScenarioReference Scenario = new ScenarioReference();
java.math.BigDecimal TargetPnl = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Metric = "example Metric";
@jakarta.annotation.Nullable String ReportCurrency = "example ReportCurrency";
@jakarta.annotation.Nullable List<PropertyFilter> Filters = new List<PropertyFilter>();
java.math.BigDecimal MaxScale = new java.math.BigDecimal("100.00");
Integer LadderPoints = new Integer("100.00");
java.math.BigDecimal Tolerance = new java.math.BigDecimal("100.00");
Integer MaxIterations = new Integer("100.00");


ReverseStressRequest reverseStressRequestInstance = new ReverseStressRequest()
    .RecipeId(RecipeId)
    .PortfolioEntityIds(PortfolioEntityIds)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .Scenario(Scenario)
    .TargetPnl(TargetPnl)
    .Metric(Metric)
    .ReportCurrency(ReportCurrency)
    .Filters(Filters)
    .MaxScale(MaxScale)
    .LadderPoints(LadderPoints)
    .Tolerance(Tolerance)
    .MaxIterations(MaxIterations);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
