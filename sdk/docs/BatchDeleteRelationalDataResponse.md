# com.finbourne.lusid.model.BatchDeleteRelationalDataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **Map&lt;String, String&gt;** | A list of data points that were successfully upserted. | [default to Map<String, String>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A list of data points that failed to be upserted, along with the associated error message. | [optional] [default to Map<String, ErrorDetail>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]

```java
import com.finbourne.lusid.model.BatchDeleteRelationalDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> Values = new Map<String, String>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");


BatchDeleteRelationalDataResponse batchDeleteRelationalDataResponseInstance = new BatchDeleteRelationalDataResponse()
    .Values(Values)
    .Failed(Failed)
    .Href(Href);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
