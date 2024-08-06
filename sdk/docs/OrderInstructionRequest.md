

# OrderInstructionRequest

A request to create or update a Order Instruction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**createdDate** | **OffsetDateTime** | The active date of this order instruction. |  |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. |  [optional] |
|**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. |  [optional] |
|**weight** | **java.math.BigDecimal** | The weight of given instrument ordered. |  [optional] |
|**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  [optional] |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


