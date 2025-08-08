

# Execution

The record of a number of executions against a single Placement (directly analogous to  a partial or full fill against a street order).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**placementId** | [**ResourceId**](ResourceId.md) |  |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. |  [optional] |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. |  |
|**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument execution. |  |
|**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. |  |
|**state** | **String** | The state of this execution (typically a FIX state; Open, Filled, etc). |  |
|**side** | **String** | The side (Buy, Sell, ...) of this execution. |  |
|**type** | **String** | The type of this execution (Market, Limit, etc). |  |
|**createdDate** | **OffsetDateTime** | The active date of this execution. |  |
|**settlementDate** | **OffsetDateTime** | The (optional) settlement date for this execution |  [optional] |
|**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**settlementCurrency** | **String** | The execution&#39;s settlement currency. |  |
|**settlementCurrencyFxRate** | **java.math.BigDecimal** | The exectuion&#39;s settlement currency rate. |  |
|**counterparty** | **String** | The market entity this placement is placed with. |  |
|**averagePrice** | **java.math.BigDecimal** | The average price of all executions for a given placement at the time of upsert |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


