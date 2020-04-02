

# UpsertInstrumentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**values** | [**Map&lt;String, Instrument&gt;**](Instrument.md) | The instruments which have been successfully updated or inserted. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The instruments that could not be updated or inserted along with a reason for their failure. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



