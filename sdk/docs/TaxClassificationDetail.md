# com.finbourne.lusid.model.TaxClassificationDetail
A single instrument's classification with the version history of every input behind it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**classification** | [**TaxClassification**](TaxClassification.md) |  | [default to TaxClassification]
**history** | [**List&lt;TaxClassificationFieldVersion&gt;**](TaxClassificationFieldVersion.md) | Every version of every classification input and override for the instrument, oldest first. | [default to List<TaxClassificationFieldVersion>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TaxClassificationDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
TaxClassification Classification = new TaxClassification();
List<TaxClassificationFieldVersion> History = new List<TaxClassificationFieldVersion>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TaxClassificationDetail taxClassificationDetailInstance = new TaxClassificationDetail()
    .Href(Href)
    .Classification(Classification)
    .History(History)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
