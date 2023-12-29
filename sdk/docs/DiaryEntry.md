

# DiaryEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**aborId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**diaryEntryCode** | **String** | The code of the diary entry. |  [optional] |
|**type** | **String** | The type of the diary entry. |  |
|**name** | **String** | The name of the diary entry. |  [optional] |
|**status** | **String** | The status of the diary entry. Defaults to &#39;Undefined&#39; for valuation points and &#39;Estimate&#39; for closing periods. |  |
|**effectiveAt** | **OffsetDateTime** | The effective time of the diary entry. |  |
|**queryAsAt** | **OffsetDateTime** | The query time of the diary entry. Defaults to latest. |  [optional] |
|**previousEntryTime** | **OffsetDateTime** | The entry time of the previous diary entry. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



