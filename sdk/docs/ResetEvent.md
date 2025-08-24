

# ResetEvent

Definition of a reset event.  This is an event that describes a reset or fixing for an instrument such as the floating payment on  a swap cash flow.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **java.math.BigDecimal** | The quantity associated with the reset. This will only be populated if the information is known. |  [optional] |
|**resetType** | **String** | The type of the reset; e.g. RIC, Currency-pair |  |
|**fixingSource** | **String** | Fixing identification source, if available. |  [optional] |
|**fixingDate** | **OffsetDateTime** | The date the reset fixes, or is observed upon. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


