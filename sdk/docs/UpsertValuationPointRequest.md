

# UpsertValuationPointRequest

A definition for the period you wish to close

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**diaryEntryCode** | **String** | Unique code for the Valuation Point. |  |
|**name** | **String** | Identifiable Name assigned to the Valuation Point. |  [optional] |
|**effectiveAt** | **OffsetDateTime** | The effective time of the diary entry. |  |
|**queryAsAt** | **OffsetDateTime** | The query time of the diary entry. Defaults to latest. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. |  [optional] |
|**applyClearDown** | **Boolean** | Defaults to false. Set to true if you want that the closed period to have the clear down applied. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


