

# LusidTradeTicket

A LUSID Trade Ticket comprising an instrument, a transaction, and a counterparty.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | Transaction ID. Must be unique. |  |
|**transactionType** | **String** | Type of transaction for processing. Referenced by Transaction Configuration. |  |
|**source** | **String** | Transaction Source. Referenced by Transaction Configuration. |  [optional] |
|**transactionDate** | **String** | Transaction Date. Date at which transaction is known. |  |
|**settlementDate** | **String** | Transaction settlement. Date at which transaction is finalised and realised into the system. |  |
|**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**units** | **java.math.BigDecimal** | Number of units in the transaction. For an OTC this is somewhat interchangeable with the quantity booked in the  instrument. As M x N or N x M are equivalent it is advised a client chooses one approach and sticks to it.  Arguably either the unit or holding is best unitised. |  |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Identifiers for the instrument. |  |
|**instrumentScope** | **String** | Scope of instrument |  [optional] |
|**instrumentName** | **String** | Name of instrument |  [optional] |
|**instrumentDefinition** | [**LusidInstrument**](LusidInstrument.md) |  |  [optional] |
|**counterpartyAgreementId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**counterparty** | **String** | Counterparty |  [optional] |
|**instrumentProperties** | [**List&lt;Property&gt;**](Property.md) | Set of instrument properties (as defined by client/user). |  [optional] |
|**transactionProperties** | [**List&lt;Property&gt;**](Property.md) | Set of transaction properties (as defined by client/user). |  [optional] |
|**tradeTicketType** | [**TradeTicketTypeEnum**](#TradeTicketTypeEnum) | The available values are: LusidTradeTicket, ExternalTradeTicket |  |



## Enum: TradeTicketTypeEnum

| Name | Value |
|---- | -----|
| LUSIDTRADETICKET | &quot;LusidTradeTicket&quot; |
| EXTERNALTRADETICKET | &quot;ExternalTradeTicket&quot; |



