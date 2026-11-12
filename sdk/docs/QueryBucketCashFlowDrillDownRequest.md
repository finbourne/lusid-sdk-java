# com.finbourne.lusid.model.QueryBucketCashFlowDrillDownRequest
Query for the individual cashflows inside a single cashflow bucket, with their source lineage.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the system at which to query for cashflows. | [optional] [default to OffsetDateTime]
**bucketStart** | [**OffsetDateTime**](OffsetDateTime.md) | The lower bound effective datetime of the bucket from which to retrieve the cashflows. | [default to OffsetDateTime]
**bucketEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The upper bound effective datetime of the bucket from which to retrieve the cashflows. | [default to OffsetDateTime]
**startInclusive** | **Boolean** | Whether a cashflow paid exactly on the bucket start is included in the bucket. Defaults to true. | [optional] [default to Boolean]
**endInclusive** | **Boolean** | Whether a cashflow paid exactly on the bucket end is included in the bucket. Defaults to true. | [optional] [default to Boolean]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolios and portfolio groups to which the cashflows must belong. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up. | [default to OffsetDateTime]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**reportCurrency** | **String** | Optional three letter ISO currency string to convert cashflow amounts into. When supplied, each returned cashflow additionally carries ReportCurrencyAmount and TradeToReportCurrencyRate, converted from its own payment (instrument) currency. When omitted, those two fields are not present on any cashflow: Amount (always in the cashflow&#39;s own payment currency) are unaffected either way. | [optional] [default to String]
**excludeUnsettledTrades** | **Boolean** | If set to true, unsettled trades are excluded from the result set. Set this to match the value used on the bucketed cash flow query being drilled into, so the individual cash flows reconcile with the bucket. Note that the drill-down returns the complete resolved stream including transaction-sourced cashflows; if the bucketed query used the (default) InstrumentCashFlow representation, also exclude rows with a sourceType of &#39;Transaction&#39; when reconciling. | [optional] [default to Boolean]
**haircutRules** | [**List&lt;CashFlowHaircutRule&gt;**](CashFlowHaircutRule.md) | Optional ordered haircut rules applied to cashflow inflows; the first matching rule wins and a rule with no criteria acts as a catch-all. When supplied, each returned cashflow carries its gross amount, haircut fraction, net amount and the rule that was applied; with no rules those fields are omitted and the results are unchanged. | [optional] [default to List<CashFlowHaircutRule>]
**cashType** | **String** | Which date basis buckets cash flows: TradeDate uses each cash flow&#39;s transaction date, SettleDate (default) uses its payment date. The response&#39;s CashFlowDetail.PaymentDate reflects whichever basis was used. Available values: TradeDate, SettleDate. | [optional] [default to String]
**fxRateType** | **String** | Which FX rate converts each cashflow into the ReportCurrency. FxSpot (default) uses the spot rate as at the valuation (EffectiveAt) date for every cashflow, as QueryBucketedCashFlows converts them. FxSpotAtCashFlowDate uses the spot rate as at the cashflow&#39;s own date, or as at the valuation date for a cashflow dated after it. FxForward uses the forward rate for the cashflow&#39;s payment date, read from the FX forward curve the recipe resolves for the currency pair as at the valuation (EffectiveAt) date; a cashflow with no such forward rate reports an Error and has no converted amount. ForwardThenSpot uses the forward rate where the recipe resolves one and the spot rate where it does not. All but FxSpot require a ReportCurrency. A cashflow paid after the last point of the recipe&#39;s forward curve takes the last point&#39;s forward rate when the curve&#39;s back extrapolation is Flat (the default), and reports an Error when it is None. Where ForwardThenSpot falls back, the spot rate is the one FxSpot uses: as at the valuation date. The balances in the report currency are those QueryBucketedCashFlows returns for FxSpot. With any other rate type they are a running balance of the cashflows at the rates above, with a starting balance at the spot as at the window start for FxSpotAtCashFlowDate and as at the valuation date for FxForward and ForwardThenSpot; it chains across buckets, and is not QueryBucketedCashFlows&#39; figure. The response&#39;s CashFlowDetail.FxRateTypeApplied says which rate each cashflow received. Available values: FxSpot, FxForward, ForwardThenSpot, FxSpotAtCashFlowDate. | [optional] [default to String]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | Where the ladder opens: the window start of the bucketed request being drilled into, on or before BucketStart. The opening balance of the first bucket is the ladder&#39;s balance at BucketStart. Required. | [default to OffsetDateTime]
**startingBalance** | **String** | The balance the ladder opens with: &#39;Zero&#39; (default) or &#39;PortfolioCashBalance&#39;. &#39;PortfolioCashBalance&#39; is not supported with a CashType of &#39;TradeDate&#39;. Available values: PortfolioCashBalance, Zero. | [optional] [default to String]
**bucketingSchedule** | [**BucketingSchedule**](BucketingSchedule.md) |  | [default to BucketingSchedule]
**roundingMethod** | **String** | How a cash flow is allocated to a period. Only RoundUp, the default, is supported; RoundDown is refused. Which period a cash flow on a boundary falls in is decided by StartInclusive and EndInclusive. Available values: RoundUp, RoundDown. | [optional] [default to String]

```java
import com.finbourne.lusid.model.QueryBucketCashFlowDrillDownRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
OffsetDateTime BucketStart = OffsetDateTime.now();
OffsetDateTime BucketEnd = OffsetDateTime.now();
Boolean StartInclusive = true;
Boolean EndInclusive = true;
List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable String ReportCurrency = "example ReportCurrency";
Boolean ExcludeUnsettledTrades = true;
@jakarta.annotation.Nullable List<CashFlowHaircutRule> HaircutRules = new List<CashFlowHaircutRule>();
@jakarta.annotation.Nullable String CashType = "example CashType";
@jakarta.annotation.Nullable String FxRateType = "example FxRateType";
OffsetDateTime WindowStart = OffsetDateTime.now();
@jakarta.annotation.Nullable String StartingBalance = "example StartingBalance";
BucketingSchedule BucketingSchedule = new BucketingSchedule();
@jakarta.annotation.Nullable String RoundingMethod = "example RoundingMethod";


QueryBucketCashFlowDrillDownRequest queryBucketCashFlowDrillDownRequestInstance = new QueryBucketCashFlowDrillDownRequest()
    .AsAt(AsAt)
    .BucketStart(BucketStart)
    .BucketEnd(BucketEnd)
    .StartInclusive(StartInclusive)
    .EndInclusive(EndInclusive)
    .PortfolioEntityIds(PortfolioEntityIds)
    .EffectiveAt(EffectiveAt)
    .RecipeId(RecipeId)
    .ReportCurrency(ReportCurrency)
    .ExcludeUnsettledTrades(ExcludeUnsettledTrades)
    .HaircutRules(HaircutRules)
    .CashType(CashType)
    .FxRateType(FxRateType)
    .WindowStart(WindowStart)
    .StartingBalance(StartingBalance)
    .BucketingSchedule(BucketingSchedule)
    .RoundingMethod(RoundingMethod);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
