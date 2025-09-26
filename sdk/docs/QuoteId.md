# com.finbourne.lusid.model.QuoteId
The unique identifier of the quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteSeriesId** | [**QuoteSeriesId**](QuoteSeriesId.md) |  | [default to QuoteSeriesId]
**effectiveAt** | **String** | The effective datetime or cut label at which the quote is valid from. | [default to String]

```java
import com.finbourne.lusid.model.QuoteId;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuoteSeriesId QuoteSeriesId = new QuoteSeriesId();
String EffectiveAt = "example EffectiveAt";


QuoteId quoteIdInstance = new QuoteId()
    .QuoteSeriesId(QuoteSeriesId)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
