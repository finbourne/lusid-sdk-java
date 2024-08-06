

# UpsertReturnsResponse

Response from upserting Returns

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | [**Version**](Version.md) |  |  |
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**values** | **List&lt;Map&lt;String, OffsetDateTime&gt;&gt;** | The set of values that were successfully retrieved. |  [optional] |
|**failed** | **List&lt;Map&lt;String, ErrorDetail&gt;&gt;** | The set of values that could not be retrieved due along with a reason for this, e.g badly formed request. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


