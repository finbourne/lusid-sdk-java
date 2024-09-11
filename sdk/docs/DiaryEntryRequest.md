

# DiaryEntryRequest

The request to add a diary entry

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**diaryEntryCode** | **String** | The code of the diary entry. |  |
|**name** | **String** | The name of the diary entry. |  [optional] |
|**status** | **String** | The status of a Diary Entry of Type &#39;Other&#39;. Defaults to &#39;Undefined&#39; and supports &#39;Undefined&#39;, &#39;Estimate&#39;, &#39;Candidate&#39;, and &#39;Final&#39;. |  [optional] |
|**effectiveAt** | **OffsetDateTime** | The effective time of the diary entry. |  |
|**queryAsAt** | **OffsetDateTime** | The query time of the diary entry. Defaults to latest. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


