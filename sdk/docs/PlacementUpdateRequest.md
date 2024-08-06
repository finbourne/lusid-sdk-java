

# PlacementUpdateRequest

A request to create or update a Placement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this placement. |  [optional] |
|**counterparty** | **String** | Optionally specifies the market entity this placement is placed with. |  [optional] |
|**executionSystem** | **String** | Optionally specifies the execution system in use. |  [optional] |
|**entryType** | **String** | Optionally specifies the entry type of this placement. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


