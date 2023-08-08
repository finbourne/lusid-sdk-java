

# AnnulStructuredDataResponse

The response to a request to annul (delete) a set of structured data from Lusid. This might have been for market data or some other structured entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**values** | **Map&lt;String, OffsetDateTime&gt;** | The set of values that were removed. |  [optional] |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The set of values where removal failed, with a description as to why that is the case, e.g. badly formed request |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



