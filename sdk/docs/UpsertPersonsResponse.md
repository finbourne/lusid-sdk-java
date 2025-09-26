# com.finbourne.lusid.model.UpsertPersonsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, Person&gt;**](Person.md) | The Person(s) that have been successfully upserted | [default to Map<String, Person>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The Person(s) that could not be upserted along with a reason for their failure. | [default to Map<String, ErrorDetail>]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which Person(s) were created or updated. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertPersonsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, Person> Values = new Map<String, Person>();
Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
OffsetDateTime AsAtDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertPersonsResponse upsertPersonsResponseInstance = new UpsertPersonsResponse()
    .Values(Values)
    .Failed(Failed)
    .AsAtDate(AsAtDate)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
