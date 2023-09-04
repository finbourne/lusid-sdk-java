

# GetVirtualDocumentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**values** | [**Map&lt;String, VirtualDocument&gt;**](VirtualDocument.md) | The set of values that were successfully retrieved. |  [optional] |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The set of calues that could not be retrieved along with a reason for this, e.g. badly formed request. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



