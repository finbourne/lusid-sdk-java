

# OrderInstruction

Record of an order instruction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**createdDate** | **OffsetDateTime** | The active date of this order instruction. |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. |  |
|**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. |  [optional] |
|**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. |  [optional] |
|**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**instrumentScope** | **String** | The scope in which the instrument lies |  [optional] |
|**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument ordered. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


