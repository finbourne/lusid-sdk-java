# com.finbourne.lusid.model.TransactionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier of the transaction. | [default to String]
**type** | **String** | The type of the transaction, for example &#39;Buy&#39; or &#39;Sell&#39;. The transaction type must have been pre-configured using the System Configuration API. If not, this operation will succeed but you are not able to calculate holdings for the portfolio that include this transaction. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the transaction to a unique instrument. | [default to Map<String, String>]
**transactionDate** | **String** | The date of the transaction. | [default to String]
**settlementDate** | **String** | The settlement date of the transaction. | [default to String]
**units** | **java.math.BigDecimal** | The number of units of the transacted instrument. | [default to java.math.BigDecimal]
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  | [optional] [default to TransactionPrice]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**exchangeRate** | **java.math.BigDecimal** | The exchange rate between the transaction and settlement currency (settlement currency being represented by TotalConsideration.Currency). For example, if the transaction currency is USD and the settlement currency is GBP, this would be the appropriate USD/GBP rate. | [optional] [default to java.math.BigDecimal]
**transactionCurrency** | **String** | The transaction currency. | [optional] [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | A list of unique transaction properties and associated values to store for the transaction. Each property must be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**counterpartyId** | **String** | The identifier for the counterparty of the transaction. | [optional] [default to String]
**source** | **String** | The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. | [optional] [default to String]
**otcConfirmation** | [**OtcConfirmation**](OtcConfirmation.md) |  | [optional] [default to OtcConfirmation]
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**allocationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionGroupId** | **String** | The identifier for grouping economic events across multiple transactions | [optional] [default to String]
**strategyTag** | [**List&lt;Strategy&gt;**](Strategy.md) | A list of strategies representing the allocation of units across multiple sub-holding keys | [optional] [default to List<Strategy>]

```java
import com.finbourne.lusid.model.TransactionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
String Type = "example Type";
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
String TransactionDate = "example TransactionDate";
String SettlementDate = "example SettlementDate";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
TransactionPrice TransactionPrice = new TransactionPrice();
CurrencyAndAmount TotalConsideration = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal ExchangeRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String TransactionCurrency = "example TransactionCurrency";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String CounterpartyId = "example CounterpartyId";
@jakarta.annotation.Nullable String Source = "example Source";
OtcConfirmation OtcConfirmation = new OtcConfirmation();
ResourceId OrderId = new ResourceId();
ResourceId AllocationId = new ResourceId();
ResourceId CustodianAccountId = new ResourceId();
@jakarta.annotation.Nullable String TransactionGroupId = "example TransactionGroupId";
@jakarta.annotation.Nullable List<Strategy> StrategyTag = new List<Strategy>();


TransactionRequest transactionRequestInstance = new TransactionRequest()
    .TransactionId(TransactionId)
    .Type(Type)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .TransactionDate(TransactionDate)
    .SettlementDate(SettlementDate)
    .Units(Units)
    .TransactionPrice(TransactionPrice)
    .TotalConsideration(TotalConsideration)
    .ExchangeRate(ExchangeRate)
    .TransactionCurrency(TransactionCurrency)
    .Properties(Properties)
    .CounterpartyId(CounterpartyId)
    .Source(Source)
    .OtcConfirmation(OtcConfirmation)
    .OrderId(OrderId)
    .AllocationId(AllocationId)
    .CustodianAccountId(CustodianAccountId)
    .TransactionGroupId(TransactionGroupId)
    .StrategyTag(StrategyTag);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
