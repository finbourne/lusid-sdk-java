# com.finbourne.lusid.model.Transaction
A list of transactions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier for the transaction. | [default to String]
**type** | **String** | The type of the transaction e.g. &#39;Buy&#39;, &#39;Sell&#39;. The transaction type should have been pre-configured via the System Configuration API endpoint. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the transaction to a unique instrument. | [optional] [default to Map<String, String>]
**instrumentScope** | **String** | The scope in which the transaction&#39;s instrument lies. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the transaction is in. | [default to String]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the transaction. | [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the transaction. | [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The number of units transacted in the associated instrument. | [default to java.math.BigDecimal]
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  | [optional] [default to TransactionPrice]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**exchangeRate** | **java.math.BigDecimal** | The exchange rate between the transaction and settlement currency (settlement currency being represented by the TotalConsideration.Currency). For example if the transaction currency is in USD and the settlement currency is in GBP this this the USD/GBP rate. | [optional] [default to java.math.BigDecimal]
**transactionCurrency** | **String** | The transaction currency. | [optional] [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique transaction properties and associated values to stored with the transaction. Each property will be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**counterpartyId** | **String** | The identifier for the counterparty of the transaction. | [optional] [default to String]
**source** | **String** | The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. | [optional] [default to String]
**entryDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime that the transaction was added to LUSID. | [optional] [default to OffsetDateTime]
**otcConfirmation** | [**OtcConfirmation**](OtcConfirmation.md) |  | [optional] [default to OtcConfirmation]
**transactionStatus** | **String** | The status of the transaction. The available values are: Active, Amended, Cancelled, ActiveReversal, ActiveTrueUp, CancelledTrueUp | [optional] [default to String]
**cancelDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | If the transaction has been cancelled, the asAt datetime that the transaction was cancelled. | [optional] [default to OffsetDateTime]
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**allocationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccount** | [**CustodianAccount**](CustodianAccount.md) |  | [optional] [default to CustodianAccount]
**transactionGroupId** | **String** | The identifier for grouping economic events across multiple transactions | [optional] [default to String]
**strategyTag** | [**List&lt;Strategy&gt;**](Strategy.md) | A list of strategies representing the allocation of units across multiple sub-holding keys | [optional] [default to List<Strategy>]
**resolvedTransactionTypeDetails** | [**TransactionTypeDetails**](TransactionTypeDetails.md) |  | [optional] [default to TransactionTypeDetails]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]

```java
import com.finbourne.lusid.model.Transaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
String Type = "example Type";
@jakarta.annotation.Nullable Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String InstrumentUid = "example InstrumentUid";
OffsetDateTime TransactionDate = OffsetDateTime.now();
OffsetDateTime SettlementDate = OffsetDateTime.now();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
TransactionPrice TransactionPrice = new TransactionPrice();
CurrencyAndAmount TotalConsideration = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal ExchangeRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String TransactionCurrency = "example TransactionCurrency";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String CounterpartyId = "example CounterpartyId";
@jakarta.annotation.Nullable String Source = "example Source";
OffsetDateTime EntryDateTime = OffsetDateTime.now();
OtcConfirmation OtcConfirmation = new OtcConfirmation();
String TransactionStatus = "example TransactionStatus";
@jakarta.annotation.Nullable OffsetDateTime CancelDateTime = OffsetDateTime.now();
ResourceId OrderId = new ResourceId();
ResourceId AllocationId = new ResourceId();
CustodianAccount CustodianAccount = new CustodianAccount();
@jakarta.annotation.Nullable String TransactionGroupId = "example TransactionGroupId";
@jakarta.annotation.Nullable List<Strategy> StrategyTag = new List<Strategy>();
TransactionTypeDetails ResolvedTransactionTypeDetails = new TransactionTypeDetails();
DataModelMembership DataModelMembership = new DataModelMembership();


Transaction transactionInstance = new Transaction()
    .TransactionId(TransactionId)
    .Type(Type)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .InstrumentScope(InstrumentScope)
    .InstrumentUid(InstrumentUid)
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
    .EntryDateTime(EntryDateTime)
    .OtcConfirmation(OtcConfirmation)
    .TransactionStatus(TransactionStatus)
    .CancelDateTime(CancelDateTime)
    .OrderId(OrderId)
    .AllocationId(AllocationId)
    .CustodianAccount(CustodianAccount)
    .TransactionGroupId(TransactionGroupId)
    .StrategyTag(StrategyTag)
    .ResolvedTransactionTypeDetails(ResolvedTransactionTypeDetails)
    .DataModelMembership(DataModelMembership);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
