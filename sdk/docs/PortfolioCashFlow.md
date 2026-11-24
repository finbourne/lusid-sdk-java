# com.finbourne.lusid.model.PortfolioCashFlow
The details for the cashflow for a given portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupById** | **Integer** | The groupBy subHoldings and currency. | [default to Integer]
**sequenceNumber** | **Integer** | Sequence number determining the order of the cash flow records. | [default to Integer]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Indicates the date when the cash-flow settles. | [optional] [default to OffsetDateTime]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**type** | **String** | Indicates the record type (Closed, Open, Activity). | [default to String]
**movementName** | **String** | Indicates the specific movement of the transaction that generated this cash flow. | [default to String]
**cashflow** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**balance** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**fxRate** | **java.math.BigDecimal** | Exchange rate between the currency of this cash flow and the reporting currency. | [default to java.math.BigDecimal]
**cashflowReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**balanceReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**translationGainLoss** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**costBasisReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**transaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**unrealisedGainLossReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**tradeDateToSettlementDateGainLossReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**balanceFxRate** | **java.math.BigDecimal** | The exchange rate the balance in the reporting currency was struck at: on an Activity row the recipe&#39;s quote for the row&#39;s date, after the recipe&#39;s quote lookback. Differs from FxRate when the cash flow was booked at another rate. The cash flow&#39;s own rate (FxRate) when no quote could be found; see BalanceFailureReason. | [optional] [default to java.math.BigDecimal]
**balanceFailureReason** | **String** | Why the balance in the reporting currency could not be struck at the recipe&#39;s quote for the row&#39;s date and is at the cash flow&#39;s own rate instead; absent when it was struck at the quote, including on a row whose local balance is zero. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PortfolioCashFlow;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer GroupById = new Integer("100.00");
Integer SequenceNumber = new Integer("100.00");
OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
String Type = "example Type";
String MovementName = "example MovementName";
CurrencyAndAmount Cashflow = new CurrencyAndAmount();
CurrencyAndAmount Balance = new CurrencyAndAmount();
java.math.BigDecimal FxRate = new java.math.BigDecimal("100.00");
CurrencyAndAmount CashflowReportingCurrency = new CurrencyAndAmount();
CurrencyAndAmount BalanceReportingCurrency = new CurrencyAndAmount();
CurrencyAndAmount TranslationGainLoss = new CurrencyAndAmount();
CurrencyAndAmount CostBasisReportingCurrency = new CurrencyAndAmount();
Transaction Transaction = new Transaction();
CurrencyAndAmount UnrealisedGainLossReportingCurrency = new CurrencyAndAmount();
CurrencyAndAmount TradeDateToSettlementDateGainLossReportingCurrency = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal BalanceFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String BalanceFailureReason = "example BalanceFailureReason";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PortfolioCashFlow portfolioCashFlowInstance = new PortfolioCashFlow()
    .GroupById(GroupById)
    .SequenceNumber(SequenceNumber)
    .EffectiveDate(EffectiveDate)
    .SubHoldingKeys(SubHoldingKeys)
    .Type(Type)
    .MovementName(MovementName)
    .Cashflow(Cashflow)
    .Balance(Balance)
    .FxRate(FxRate)
    .CashflowReportingCurrency(CashflowReportingCurrency)
    .BalanceReportingCurrency(BalanceReportingCurrency)
    .TranslationGainLoss(TranslationGainLoss)
    .CostBasisReportingCurrency(CostBasisReportingCurrency)
    .Transaction(Transaction)
    .UnrealisedGainLossReportingCurrency(UnrealisedGainLossReportingCurrency)
    .TradeDateToSettlementDateGainLossReportingCurrency(TradeDateToSettlementDateGainLossReportingCurrency)
    .BalanceFxRate(BalanceFxRate)
    .BalanceFailureReason(BalanceFailureReason)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
