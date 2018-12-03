
# GetInstrumentsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** |  |  [optional]
**values** | [**Map&lt;String, Instrument&gt;**](Instrument.md) | The instruments, keyed by their requested identifier. Only instruments that were found  will be contained in this collection. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | If any instruments were not found, then they will be listed in as &#39;Failed&#39;, along with the nature  of their failure. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



