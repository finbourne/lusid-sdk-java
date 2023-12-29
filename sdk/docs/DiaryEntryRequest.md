

# DiaryEntryRequest

The request to add a diary entry

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the diary entry. |  [optional] |
|**status** | **String** | The status of the diary entry. Defaults to &#39;Undefined&#39; for valuation points and &#39;Estimate&#39; for closing periods. |  [optional] |
|**effectiveAt** | **OffsetDateTime** | The effective time of the diary entry. |  |
|**queryAsAt** | **OffsetDateTime** | The query time of the diary entry. Defaults to latest. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. |  [optional] |



