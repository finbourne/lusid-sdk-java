# com.finbourne.lusid.model.CashFlowDetail
An individual cashflow inside a cashflow bucket, annotated with the source that produced it  in the cash flow waterfall (SRS > Transaction > Instrument).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the cashflow is paid. | [default to OffsetDateTime]
**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**sourceType** | **String** | The source that produced the cashflow in the cash flow waterfall. One of &#39;Instrument&#39; (produced by the valuation engine), &#39;Transaction&#39; (produced from a booked transaction or movement) or &#39;SRS&#39; (sourced from the structured results store). | [default to String]
**instrumentId** | **String** | The LUSID instrument identifier of the instrument that produced the cashflow. | [default to String]
**instrumentDisplayName** | **String** | The display name of the instrument that produced the cashflow. Not present when the instrument cannot be resolved (e.g. deleted, no permission). | [optional] [default to String]
**transactionId** | **String** | The identifier of the transaction from which the cashflow originates, where known. | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**flowType** | **String** | The type of the cashflow, e.g. Coupon, Principal or Premium. | [optional] [default to String]
**movementName** | **String** | The name of the movement that produced the cashflow (e.g. Coupon, Side1), falling back to the flow type when the movement is unnamed. Not present when the cashflow could not be valued. | [optional] [default to String]
**payReceive** | **String** | Indicates whether the cashflow is paid or received. | [optional] [default to String]
**grossAmount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**haircutFraction** | **java.math.BigDecimal** | The fraction of the gross amount removed by the haircut, in the range [0, 1]. Zero for outflows and for cashflows no rule matched. Only populated when haircut rules were supplied on the request. | [optional] [default to java.math.BigDecimal]
**netAmount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**haircutRuleApplied** | **String** | The identifier of the haircut rule that was applied to the cashflow, or not present when no rule matched or no haircut rules were supplied on the request. | [optional] [default to String]
**error** | **String** | Present when the cashflow could not be valued, for example because of missing market data: the valuation error, matching the CashflowError diagnostic reported by the QueryCashFlows endpoint. In that case the amount is null rather than zero. Error may also be set when only the report-currency FX lookup failed (see ReportCurrencyAmount), in which case the base Amount remains populated and only ReportCurrencyAmount and TradeToReportCurrencyRate are null. | [optional] [default to String]
**reportCurrencyAmount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**tradeToReportCurrencyRate** | **java.math.BigDecimal** | The FX rate used to convert the cashflow amount from its own payment currency (see Amount) into the request&#39;s report currency, resolved at the cashflow&#39;s transaction (trade) date, not its payment date. Only present when ReportCurrency was supplied on the request; not present when it was omitted, or when the rate could not be resolved (see Error). | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CashFlowDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
CurrencyAndAmount Amount = new CurrencyAndAmount();
String SourceType = "example SourceType";
String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentDisplayName = "example InstrumentDisplayName";
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String FlowType = "example FlowType";
@jakarta.annotation.Nullable String MovementName = "example MovementName";
@jakarta.annotation.Nullable String PayReceive = "example PayReceive";
CurrencyAndAmount GrossAmount = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal HaircutFraction = new java.math.BigDecimal("100.00");
CurrencyAndAmount NetAmount = new CurrencyAndAmount();
@jakarta.annotation.Nullable String HaircutRuleApplied = "example HaircutRuleApplied";
@jakarta.annotation.Nullable String Error = "example Error";
CurrencyAndAmount ReportCurrencyAmount = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal TradeToReportCurrencyRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CashFlowDetail cashFlowDetailInstance = new CashFlowDetail()
    .PaymentDate(PaymentDate)
    .Amount(Amount)
    .SourceType(SourceType)
    .InstrumentId(InstrumentId)
    .InstrumentDisplayName(InstrumentDisplayName)
    .TransactionId(TransactionId)
    .PortfolioId(PortfolioId)
    .FlowType(FlowType)
    .MovementName(MovementName)
    .PayReceive(PayReceive)
    .GrossAmount(GrossAmount)
    .HaircutFraction(HaircutFraction)
    .NetAmount(NetAmount)
    .HaircutRuleApplied(HaircutRuleApplied)
    .Error(Error)
    .ReportCurrencyAmount(ReportCurrencyAmount)
    .TradeToReportCurrencyRate(TradeToReportCurrencyRate)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
