# com.finbourne.lusid.model.SweepBlocksRequest
A request to sweep specified blocks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockIds** | [**Map&lt;String, ResourceId&gt;**](ResourceId.md) | A dictionary mapping ephemeral identifiers, which live as long as the request, to specific blocks to sweep. | [default to Map<String, ResourceId>]
**latestAllowableModificationTime** | **String** | Timestamp or cut label which the block or related entities must not have been updated after. | [default to String]

```java
import com.finbourne.lusid.model.SweepBlocksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ResourceId> BlockIds = new Map<String, ResourceId>();
String LatestAllowableModificationTime = "example LatestAllowableModificationTime";


SweepBlocksRequest sweepBlocksRequestInstance = new SweepBlocksRequest()
    .BlockIds(BlockIds)
    .LatestAllowableModificationTime(LatestAllowableModificationTime);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
