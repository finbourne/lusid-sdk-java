

# CreateClosedPeriodRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**closedPeriodId** | **String** | The unique Id of the Closed Period. The ClosedPeriodId, together with the Timeline Scope and Code, uniquely identifies a Closed Period |  |
|**effectiveEnd** | **OffsetDateTime** | The effective end of the Closed Period |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Closed Periods properties. These will be from the &#39;ClosedPeriod&#39; domain. |  [optional] |
|**asAtClosed** | **OffsetDateTime** | The asAt closed datetime for the Closed Period |  [optional] |
|**displayName** | **String** | The name of the Closed Period. |  [optional] |
|**description** | **String** | A description for the Closed Period. |  [optional] |
|**holdingsAsAtClosedOverride** | **OffsetDateTime** | The optional AsAtClosed Override to use for building holdings in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


