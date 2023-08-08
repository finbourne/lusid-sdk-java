

# TranslateInstrumentDefinitionsResponse

A response from a request to translate a collection of instruments to a given target dialect.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**values** | [**Map&lt;String, LusidInstrument&gt;**](LusidInstrument.md) | The instruments which have been successfully translated. |  [optional] |
|**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The instruments that could not be translated along with a reason for their failure. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



