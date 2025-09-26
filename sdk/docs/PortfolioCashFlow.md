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
**balanceReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**translationGainLoss** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**costBasisReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**transaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**unrealisedGainLossReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
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
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
