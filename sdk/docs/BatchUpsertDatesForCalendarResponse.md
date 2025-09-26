# com.finbourne.lusid.model.BatchUpsertDatesForCalendarResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, CalendarDate&gt;**](CalendarDate.md) | The dates which have been successfully upserted. | [optional] [default to Map<String, CalendarDate>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The dates that could not be upserted along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to the upserted dates | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BatchUpsertDatesForCalendarResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, CalendarDate> Values = new Map<String, CalendarDate>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchUpsertDatesForCalendarResponse batchUpsertDatesForCalendarResponseInstance = new BatchUpsertDatesForCalendarResponse()
    .Values(Values)
    .Failed(Failed)
    .Metadata(Metadata)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
