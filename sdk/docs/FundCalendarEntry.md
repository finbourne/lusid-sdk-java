

# FundCalendarEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The unique Code of the Calendar Entry. The Calendar Entry, together with the Fund Scope and Code, uniquely identifies a Fund Calendar Entry |  |
|**displayName** | **String** | The name of the Fund Calendar entry. |  |
|**description** | **String** | A description for the Fund Calendar entry. |  [optional] |
|**navTypeCode** | **String** | The navTypeCode of the Fund Calendar Entry. This is the code of the NAV type that this Calendar Entry is associated with. |  |
|**effectiveAt** | **OffsetDateTime** | The effective at of the Calendar Entry. |  [optional] |
|**asAt** | **OffsetDateTime** | The asAt datetime for the Calendar Entry. |  [optional] |
|**entryType** | [**EntryTypeEnum**](#EntryTypeEnum) | The type of the Fund Calendar Entry. Only &#39;ValuationPoint&#39; currently supported. The available values are: ValuationPointFundCalendarEntry |  |
|**version** | [**Version**](Version.md) |  |  |
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. |  [optional] |



## Enum: EntryTypeEnum

| Name | Value |
|---- | -----|
| VALUATIONPOINTFUNDCALENDARENTRY | &quot;ValuationPointFundCalendarEntry&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


