# com.finbourne.lusid.model.ResourceListOfApplicableInstrumentEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ApplicableInstrumentEvent&gt;**](ApplicableInstrumentEvent.md) |  | [default to List<ApplicableInstrumentEvent>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ResourceListOfApplicableInstrumentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ApplicableInstrumentEvent> Values = new List<ApplicableInstrumentEvent>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";


ResourceListOfApplicableInstrumentEvent resourceListOfApplicableInstrumentEventInstance = new ResourceListOfApplicableInstrumentEvent()
    .Values(Values)
    .Href(Href)
    .Links(Links)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
