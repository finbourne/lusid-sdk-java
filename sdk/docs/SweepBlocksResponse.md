# com.finbourne.lusid.model.SweepBlocksResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The identifiers of blocks which have been successfully swept. | [optional] [default to List<ResourceId>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The identifiers of blocks that could not be swept, along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]

```java
import com.finbourne.lusid.model.SweepBlocksResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ResourceId> Values = new List<ResourceId>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();


SweepBlocksResponse sweepBlocksResponseInstance = new SweepBlocksResponse()
    .Values(Values)
    .Failed(Failed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
