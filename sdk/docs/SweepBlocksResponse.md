# com.finbourne.lusid.model.SweepBlocksResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, ResourceId&gt;**](ResourceId.md) | The identifiers of blocks which have been successfully swept, indexed by ephemeral request-lived id. | [optional] [default to Map<String, ResourceId>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The identifiers of blocks that could not be swept, along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]

```java
import com.finbourne.lusid.model.SweepBlocksResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, ResourceId> Values = new Map<String, ResourceId>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();


SweepBlocksResponse sweepBlocksResponseInstance = new SweepBlocksResponse()
    .Values(Values)
    .Failed(Failed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
