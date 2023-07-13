

# UpsertInstrumentEventsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**values** | [**Map&lt;String, InstrumentEventHolder&gt;**](InstrumentEventHolder.md) | The corporate actions which have been successfully updated or inserted. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The corporate actions that could not be updated or inserted along with a reason for their failure. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



