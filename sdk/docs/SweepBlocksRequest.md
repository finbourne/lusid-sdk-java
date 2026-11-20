# com.finbourne.lusid.model.SweepBlocksRequest
A request to sweep specified blocks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The identifiers of the blocks to sweep. | [default to List<ResourceId>]
**latestAllowableModificationTime** | **String** | Timestamp, cut label or tenor. A block can only be swept if none of its executions or allocations were modified after this time. A tenor is relative to the current time, for example &#39;1D&#39; means one day ago. A business day tenor, for example &#39;1BD&#39;, requires calendarId. A tenor cannot go back further than 1 January 1900. For more information on tenors, see [Specifying tenors in LUSID](https://support.lusid.com/docs/specifying-tenors-in-lusid) | [default to String]
**calendarId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.SweepBlocksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> BlockIds = new List<ResourceId>();
String LatestAllowableModificationTime = "example LatestAllowableModificationTime";
ResourceId CalendarId = new ResourceId();


SweepBlocksRequest sweepBlocksRequestInstance = new SweepBlocksRequest()
    .BlockIds(BlockIds)
    .LatestAllowableModificationTime(LatestAllowableModificationTime)
    .CalendarId(CalendarId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
