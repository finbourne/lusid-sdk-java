# com.finbourne.lusid.model.LusidTradeTicket
A LUSID Trade Ticket comprising an instrument, a transaction, and a counterparty.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Transaction ID. Must be unique. | [default to String]
**transactionType** | **String** | Type of transaction for processing. Referenced by Transaction Configuration. | [default to String]
**source** | **String** | Transaction Source. Referenced by Transaction Configuration. | [optional] [default to String]
**transactionDate** | **String** | Transaction Date. Date at which transaction is known. | [default to String]
**settlementDate** | **String** | Transaction settlement. Date at which transaction is finalised and realised into the system. | [default to String]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**units** | **java.math.BigDecimal** | Number of units in the transaction. For an OTC this is somewhat interchangeable with the quantity booked in the  instrument. As M x N or N x M are equivalent it is advised a client chooses one approach and sticks to it.  Arguably either the unit or holding is best unitised. | [default to java.math.BigDecimal]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Identifiers for the instrument. | [default to Map<String, String>]
**instrumentScope** | **String** | Scope of instrument | [optional] [default to String]
**instrumentName** | **String** | Name of instrument | [optional] [default to String]
**instrumentDefinition** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**counterpartyAgreementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**counterparty** | **String** | Counterparty | [optional] [default to String]
**instrumentProperties** | [**List&lt;Property&gt;**](Property.md) | Set of instrument properties (as defined by client/user). | [optional] [default to List<Property>]
**transactionProperties** | [**List&lt;Property&gt;**](Property.md) | Set of transaction properties (as defined by client/user). | [optional] [default to List<Property>]
**tradeTicketType** | **String** | The available values are: LusidTradeTicket, ExternalTradeTicket | [default to String]

```java
import com.finbourne.lusid.model.LusidTradeTicket;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionId = "example TransactionId";
String TransactionType = "example TransactionType";
@jakarta.annotation.Nullable String Source = "example Source";
String TransactionDate = "example TransactionDate";
String SettlementDate = "example SettlementDate";
CurrencyAndAmount TotalConsideration = new CurrencyAndAmount();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
LusidInstrument InstrumentDefinition = new LusidInstrument();
ResourceId CounterpartyAgreementId = new ResourceId();
@jakarta.annotation.Nullable String Counterparty = "example Counterparty";
@jakarta.annotation.Nullable List<Property> InstrumentProperties = new List<Property>();
@jakarta.annotation.Nullable List<Property> TransactionProperties = new List<Property>();
String TradeTicketType = "example TradeTicketType";


LusidTradeTicket lusidTradeTicketInstance = new LusidTradeTicket()
    .TransactionId(TransactionId)
    .TransactionType(TransactionType)
    .Source(Source)
    .TransactionDate(TransactionDate)
    .SettlementDate(SettlementDate)
    .TotalConsideration(TotalConsideration)
    .Units(Units)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .InstrumentScope(InstrumentScope)
    .InstrumentName(InstrumentName)
    .InstrumentDefinition(InstrumentDefinition)
    .CounterpartyAgreementId(CounterpartyAgreementId)
    .Counterparty(Counterparty)
    .InstrumentProperties(InstrumentProperties)
    .TransactionProperties(TransactionProperties)
    .TradeTicketType(TradeTicketType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
