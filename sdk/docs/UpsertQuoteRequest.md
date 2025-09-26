# com.finbourne.lusid.model.UpsertQuoteRequest
The details of the quote including its unique identifier, value and lineage.  Please note the Unit field on MetricValue is nullable on the upsert but there  is validation within the quote store to make sure this field is populated.  In the absence of a real unit then we recommend putting something in line with  the data in QuoteId.QuoteSeriesId.quoteType e.g. InterestRate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | [**QuoteId**](QuoteId.md) |  | [default to QuoteId]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [optional] [default to MetricValue]
**lineage** | **String** | Description of the quote&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**scaleFactor** | **java.math.BigDecimal** | An optional scale factor for non-standard scaling of quotes against the instrument. For example, if you wish the quote&#39;s Value to be scaled down by a factor of 100, enter 100. If not supplied, the default ScaleFactor is 1. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.UpsertQuoteRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuoteId QuoteId = new QuoteId();
MetricValue MetricValue = new MetricValue();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
@jakarta.annotation.Nullable java.math.BigDecimal ScaleFactor = new java.math.BigDecimal("100.00");


UpsertQuoteRequest upsertQuoteRequestInstance = new UpsertQuoteRequest()
    .QuoteId(QuoteId)
    .MetricValue(MetricValue)
    .Lineage(Lineage)
    .ScaleFactor(ScaleFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
