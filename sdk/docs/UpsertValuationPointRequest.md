

# UpsertValuationPointRequest

A definition for the period you wish to close

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**diaryEntryCode** | **String** | Unique code for the Valuation Point. |  [optional] |
|**name** | **String** | Identifiable Name assigned to the Valuation Point. |  [optional] |
|**effectiveAt** | **OffsetDateTime** | The effective time of the diary entry. |  [optional] |
|**queryAsAt** | **OffsetDateTime** | The query time of the diary entry. Defaults to latest. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. |  [optional] |



