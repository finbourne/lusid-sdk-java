# com.finbourne.lusid.model.UpsertInstrumentPropertiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which properties were created or updated. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertInstrumentPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAtDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertInstrumentPropertiesResponse upsertInstrumentPropertiesResponseInstance = new UpsertInstrumentPropertiesResponse()
    .AsAtDate(AsAtDate)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
