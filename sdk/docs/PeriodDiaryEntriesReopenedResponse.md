# com.finbourne.lusid.model.PeriodDiaryEntriesReopenedResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the deletion became valid. May be null in the case where multiple date times are applicable. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the deletion was committed to LUSID. | [default to OffsetDateTime]
**periodDiaryEntriesRemoved** | **Integer** | Number of Diary Entries removed as a result of reopening periods | [default to Integer]
**periodDiaryEntriesFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The start point where periods were removed from | [default to OffsetDateTime]
**periodDiaryEntriesTo** | [**OffsetDateTime**](OffsetDateTime.md) | The end point where periods were removed to | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PeriodDiaryEntriesReopenedResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();
Integer PeriodDiaryEntriesRemoved = new Integer("100.00");
OffsetDateTime PeriodDiaryEntriesFrom = OffsetDateTime.now();
OffsetDateTime PeriodDiaryEntriesTo = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PeriodDiaryEntriesReopenedResponse periodDiaryEntriesReopenedResponseInstance = new PeriodDiaryEntriesReopenedResponse()
    .Href(Href)
    .EffectiveFrom(EffectiveFrom)
    .AsAt(AsAt)
    .PeriodDiaryEntriesRemoved(PeriodDiaryEntriesRemoved)
    .PeriodDiaryEntriesFrom(PeriodDiaryEntriesFrom)
    .PeriodDiaryEntriesTo(PeriodDiaryEntriesTo)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
