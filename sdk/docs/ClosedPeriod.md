

# ClosedPeriod


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**closedPeriodId** | **String** | The unique Id of the Closed Period. The ClosedPeriodId, together with the Timeline Scope and Code, uniquely identifies a Closed Period |  [optional] |
|**displayName** | **String** | The name of the Closed Period. |  [optional] |
|**description** | **String** | A description for the Closed Period. |  [optional] |
|**effectiveStart** | **OffsetDateTime** | The effective start of the Closed Period |  [optional] |
|**effectiveEnd** | **OffsetDateTime** | The effective end of the Closed Period |  [optional] |
|**asAtClosed** | **OffsetDateTime** | The asAt closed datetime for the Closed Period |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Closed Periods properties. These will be from the &#39;ClosedPeriod&#39; domain. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**postCloseActivities** | [**List&lt;PostCloseActivity&gt;**](PostCloseActivity.md) | All the post close activities for the closed period. |  [optional] |
|**holdingsAsAtClosedOverride** | **OffsetDateTime** | The optional AsAtClosed Override to use for building holdings in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. |  [optional] |
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


