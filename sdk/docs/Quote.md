# com.finbourne.lusid.model.Quote
The quote id, value and lineage of the quotes all keyed by a unique correlation id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | [**QuoteId**](QuoteId.md) |  | [default to QuoteId]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [optional] [default to MetricValue]
**lineage** | **String** | Description of the quote&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**cutLabel** | **String** | The cut label that this quote was updated or inserted with. | [optional] [default to String]
**uploadedBy** | **String** | The unique id of the user that updated or inserted the quote. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the quote was committed to LUSID. | [default to OffsetDateTime]
**scaleFactor** | **java.math.BigDecimal** | An optional scale factor for non-standard scaling of quotes against the instrument. For example, if you wish the quote&#39;s Value to be scaled down by a factor of 100, enter 100. If not supplied, the default ScaleFactor is 1. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.Quote;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuoteId QuoteId = new QuoteId();
MetricValue MetricValue = new MetricValue();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
@jakarta.annotation.Nullable String CutLabel = "example CutLabel";
String UploadedBy = "example UploadedBy";
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal ScaleFactor = new java.math.BigDecimal("100.00");


Quote quoteInstance = new Quote()
    .QuoteId(QuoteId)
    .MetricValue(MetricValue)
    .Lineage(Lineage)
    .CutLabel(CutLabel)
    .UploadedBy(UploadedBy)
    .AsAt(AsAt)
    .ScaleFactor(ScaleFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
