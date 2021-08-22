

# GetInstrumentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**values** | [**Map&lt;String, Instrument&gt;**](Instrument.md) | The instrument definitions, keyed by the identifier used to retrieve them. Only instruments that were found will be contained in this collection. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The identifiers that did not resolve to an instrument along with the nature of the failure. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



