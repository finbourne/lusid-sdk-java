

# UpsertQuotesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**values** | [**Map&lt;String, Quote&gt;**](Quote.md) | The quotes which have been successfully updated or inserted. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The quotes that could not be updated or inserted along with a reason for their failure. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



