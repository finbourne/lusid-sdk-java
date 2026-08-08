# com.finbourne.lusid.model.CashFlowDetail
An individual cashflow inside a cashflow bucket, annotated with the source that produced it  in the cash flow waterfall (SRS > Transaction > Instrument).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the cashflow is paid. | [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The signed amount of the cashflow. A positive amount indicates money is received, a negative amount indicates money is paid. The amount is always the gross (pre-haircut) signed amount; when haircut rules are supplied the haircut and net amounts are reported separately. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The payment currency of the cashflow. | [default to String]
**sourceType** | **String** | The source that produced the cashflow in the cash flow waterfall. One of &#39;Instrument&#39; (produced by the valuation engine), &#39;Transaction&#39; (produced from a booked transaction or movement) or &#39;SRS&#39; (sourced from the structured results store). | [default to String]
**instrumentId** | **String** | The LUSID instrument identifier of the instrument that produced the cashflow. | [default to String]
**transactionId** | **String** | The identifier of the transaction from which the cashflow originates, where known. | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**flowType** | **String** | The type of the cashflow, e.g. Coupon, Principal or Premium. | [optional] [default to String]
**payReceive** | **String** | Indicates whether the cashflow is paid or received. | [optional] [default to String]
**grossAmount** | **java.math.BigDecimal** | The signed amount of the cashflow before any haircut was applied. Only populated when haircut rules were supplied on the request. | [optional] [default to java.math.BigDecimal]
**haircutFraction** | **java.math.BigDecimal** | The fraction of the gross amount removed by the haircut, in the range [0, 1]. Zero for outflows and for cashflows no rule matched. Only populated when haircut rules were supplied on the request. | [optional] [default to java.math.BigDecimal]
**netAmount** | **java.math.BigDecimal** | The signed amount of the cashflow net of the haircut. Only populated when haircut rules were supplied on the request. | [optional] [default to java.math.BigDecimal]
**haircutRuleApplied** | **String** | The identifier of the haircut rule that was applied to the cashflow, or not present when no rule matched or no haircut rules were supplied on the request. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CashFlowDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
String SourceType = "example SourceType";
String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String FlowType = "example FlowType";
@jakarta.annotation.Nullable String PayReceive = "example PayReceive";
@jakarta.annotation.Nullable java.math.BigDecimal GrossAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal HaircutFraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NetAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String HaircutRuleApplied = "example HaircutRuleApplied";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CashFlowDetail cashFlowDetailInstance = new CashFlowDetail()
    .PaymentDate(PaymentDate)
    .Amount(Amount)
    .Currency(Currency)
    .SourceType(SourceType)
    .InstrumentId(InstrumentId)
    .TransactionId(TransactionId)
    .PortfolioId(PortfolioId)
    .FlowType(FlowType)
    .PayReceive(PayReceive)
    .GrossAmount(GrossAmount)
    .HaircutFraction(HaircutFraction)
    .NetAmount(NetAmount)
    .HaircutRuleApplied(HaircutRuleApplied)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
