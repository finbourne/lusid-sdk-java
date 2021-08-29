

# Quote

The quote id, value and lineage of the quotes all keyed by a unique correlation id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | [**QuoteId**](QuoteId.md) |  | 
**metricValue** | [**MetricValue**](MetricValue.md) |  |  [optional]
**lineage** | **String** | Description of the quote&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional]
**cutLabel** | **String** | The cut label that this quote was updated or inserted with. |  [optional]
**uploadedBy** | **String** | The unique id of the user that updated or inserted the quote. | 
**asAt** | **OffsetDateTime** | The asAt datetime at which the quote was committed to LUSID. | 
**scaleFactor** | **Double** | An optional scale factor for non-standard scaling of quotes against the instrument. If not supplied, the default ScaleFactor is 1. |  [optional]



