# com.finbourne.lusid.model.UpsertReturnsResponse
Response from upserting Returns

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**List&lt;Map&lt;String, OffsetDateTime&gt;&gt;**](Map.md) | The set of values that were successfully retrieved. | [optional] [default to List<Map<String, OffsetDateTime>>]
**failed** | [**List&lt;Map&lt;String, ErrorDetail&gt;&gt;**](Map.md) | The set of values that could not be retrieved due along with a reason for this, e.g badly formed request. | [optional] [default to List<Map<String, ErrorDetail>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertReturnsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Map<String, OffsetDateTime>> Values = new List<Map<String, OffsetDateTime>>();
@jakarta.annotation.Nullable List<Map<String, ErrorDetail>> Failed = new List<Map<String, ErrorDetail>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertReturnsResponse upsertReturnsResponseInstance = new UpsertReturnsResponse()
    .Version(Version)
    .Href(Href)
    .Values(Values)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
