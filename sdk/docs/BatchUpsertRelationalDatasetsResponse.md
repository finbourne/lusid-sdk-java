# com.finbourne.lusid.model.BatchUpsertRelationalDatasetsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, RelationalDataPointResponse&gt;**](RelationalDataPointResponse.md) | A list of data points that were successfully upserted. | [default to Map<String, RelationalDataPointResponse>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A list of data points that failed to be upserted, along with the associated error message. | [optional] [default to Map<String, ErrorDetail>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BatchUpsertRelationalDatasetsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, RelationalDataPointResponse> Values = new Map<String, RelationalDataPointResponse>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchUpsertRelationalDatasetsResponse batchUpsertRelationalDatasetsResponseInstance = new BatchUpsertRelationalDatasetsResponse()
    .Values(Values)
    .Failed(Failed)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
