

# PeriodDiaryEntriesReopenedResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**effectiveFrom** | **OffsetDateTime** | The effective datetime at which the deletion became valid. May be null in the case where multiple date times are applicable. |  [optional] |
|**asAt** | **OffsetDateTime** | The asAt datetime at which the deletion was committed to LUSID. |  |
|**periodDiaryEntriesRemoved** | **Integer** | Number of Diary Entries removed as a result of reopening periods |  |
|**periodDiaryEntriesFrom** | **OffsetDateTime** | The start point where periods were removed from |  |
|**periodDiaryEntriesTo** | **OffsetDateTime** | The end point where periods were removed to |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


