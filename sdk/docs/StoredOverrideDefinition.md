# com.finbourne.lusid.model.StoredOverrideDefinition
A single replacement transaction definition as it was persisted against a virtual transaction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier of the replacement transaction. | [optional] [default to String]
**type** | **String** | The type of the replacement transaction, for example &#39;Buy&#39; or &#39;Sell&#39;. | [optional] [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that resolve the replacement transaction to a unique instrument. | [optional] [default to Map<String, String>]
**tradeDate** | **String** | The trade date of the replacement transaction. | [optional] [default to String]
**settlementDate** | **String** | The settlement date of the replacement transaction. | [optional] [default to String]
**units** | **java.math.BigDecimal** | The number of units of the transacted instrument. | [optional] [default to java.math.BigDecimal]
**tradePrice** | [**TransactionPrice**](TransactionPrice.md) |  | [optional] [default to TransactionPrice]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**exchangeRate** | **java.math.BigDecimal** | The exchange rate between the trade and settlement currency. | [optional] [default to java.math.BigDecimal]
**tradeCurrency** | **String** | The trade currency of the replacement transaction. | [optional] [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The transaction properties stored for the replacement transaction. | [optional] [default to Map<String, PerpetualProperty>]
**counterpartyId** | **String** | The identifier for the counterparty of the replacement transaction. | [optional] [default to String]
**source** | **String** | The source of the replacement transaction. | [optional] [default to String]

```java
import com.finbourne.lusid.model.StoredOverrideDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String TradeDate = "example TradeDate";
@jakarta.annotation.Nullable String SettlementDate = "example SettlementDate";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
TransactionPrice TradePrice = new TransactionPrice();
CurrencyAndAmount TotalConsideration = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal ExchangeRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String TradeCurrency = "example TradeCurrency";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String CounterpartyId = "example CounterpartyId";
@jakarta.annotation.Nullable String Source = "example Source";


StoredOverrideDefinition storedOverrideDefinitionInstance = new StoredOverrideDefinition()
    .TransactionId(TransactionId)
    .Type(Type)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .TradeDate(TradeDate)
    .SettlementDate(SettlementDate)
    .Units(Units)
    .TradePrice(TradePrice)
    .TotalConsideration(TotalConsideration)
    .ExchangeRate(ExchangeRate)
    .TradeCurrency(TradeCurrency)
    .Properties(Properties)
    .CounterpartyId(CounterpartyId)
    .Source(Source);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
