

# PlacementRequest

A request to create or update a Placement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | 
**parentPlacementId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**blockIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The IDs of the Blocks associated with this placement. | 
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. |  [optional]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | 
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | 
**state** | **String** | The state of this placement (typically a FIX state; Open, Filled, etc). | 
**side** | **String** | The side (Buy, Sell, ...) of this placement. | 
**timeInForce** | **String** | The time in force applicable to this placement (GTC, FOK, Day, etc) | 
**type** | **String** | The type of this placement (Market, Limit, etc). | 
**createdDate** | **OffsetDateTime** | The active date of this placement. | 
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional]
**counterparty** | **String** | Optionally specifies the market entity this placement is placed with. |  [optional]
**executionSystem** | **String** | Optionally specifies the execution system in use. |  [optional]
**entryType** | **String** | Optionally specifies the entry type of this placement. |  [optional]



