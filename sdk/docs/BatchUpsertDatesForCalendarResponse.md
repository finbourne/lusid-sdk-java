

# BatchUpsertDatesForCalendarResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**values** | [**Map&lt;String, CalendarDate&gt;**](CalendarDate.md) | The dates which have been successfully upserted. |  [optional] |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The dates that could not be upserted along with a reason for their failure. |  [optional] |
|**metadata** | **Map&lt;String, List&lt;ResponseMetaData&gt;&gt;** | Contains warnings related to the upserted dates |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


