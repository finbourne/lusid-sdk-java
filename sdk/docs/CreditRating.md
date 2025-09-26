# com.finbourne.lusid.model.CreditRating
Object describing a credit rating,  which assesses the stability and credit worthiness of a legal entity  and hence its likelihood of defaulting on its outstanding obligations (typically debt).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ratingSource** | **String** | The provider of the credit rating, which will typically be an agency such as Moody&#39;s or Standard and Poor. | [default to String]
**rating** | **String** | The credit rating provided by the rating source. This would expected to be consistent with the rating scheme of that agency/source. | [default to String]

```java
import com.finbourne.lusid.model.CreditRating;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RatingSource = "example RatingSource";
String Rating = "example Rating";


CreditRating creditRatingInstance = new CreditRating()
    .RatingSource(RatingSource)
    .Rating(Rating);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
