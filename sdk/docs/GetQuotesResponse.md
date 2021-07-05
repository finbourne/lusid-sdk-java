

# GetQuotesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**values** | [**Map&lt;String, Quote&gt;**](Quote.md) | The quotes which have been successfully retrieved. |  [optional]
**notFound** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The quotes that could not be found along with a reason why. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The quotes that could not be retrieved due to an error along with a reason for their failure. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



