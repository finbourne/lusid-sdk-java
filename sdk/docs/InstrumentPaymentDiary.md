# com.finbourne.lusid.model.InstrumentPaymentDiary
A payment diary containing all the cashflows on a single instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdType** | **String** | The identifier type of the instrument. | [optional] [default to String]
**instrumentId** | **String** | The identifier for the instrument. | [optional] [default to String]
**instrumentScope** | **String** | The scope of the instrument. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**legs** | [**List&lt;InstrumentPaymentDiaryLeg&gt;**](InstrumentPaymentDiaryLeg.md) | Aggregated sets of Cashflows. | [optional] [default to List<InstrumentPaymentDiaryLeg>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.InstrumentPaymentDiary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentIdType = "example InstrumentIdType";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
Version Version = new Version();
@jakarta.annotation.Nullable List<InstrumentPaymentDiaryLeg> Legs = new List<InstrumentPaymentDiaryLeg>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


InstrumentPaymentDiary instrumentPaymentDiaryInstance = new InstrumentPaymentDiary()
    .InstrumentIdType(InstrumentIdType)
    .InstrumentId(InstrumentId)
    .InstrumentScope(InstrumentScope)
    .Version(Version)
    .Legs(Legs)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
