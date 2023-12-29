

# ClosePeriodDiaryEntryRequest

A definition for the period you wish to close

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**diaryEntryCode** | **String** | Unique code assigned to a period. When left blank a code will be created by the system in the format &#39;yyyyMMDD&#39;. |  [optional] |
|**name** | **String** | Identifiable Name assigned to the period. Where left blank, the system will generate a name in the format &#39;yyyyMMDD&#39;. |  [optional] |
|**effectiveAt** | **OffsetDateTime** | The effective time of the diary entry. |  [optional] |
|**queryAsAt** | **OffsetDateTime** | The query time of the diary entry. Defaults to latest. |  [optional] |
|**status** | **String** | The status of the diary entry. Defaults to &#39;Undefined&#39; for valuation points and &#39;Estimate&#39; for closing periods. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. |  [optional] |



