# com.finbourne.lusid.model.PlacementSetRequest
A request to create or update multiple Placements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;PlacementRequest&gt;**](PlacementRequest.md) | A collection of PlacementRequests. | [optional] [default to List<PlacementRequest>]

```java
import com.finbourne.lusid.model.PlacementSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<PlacementRequest> Requests = new List<PlacementRequest>();


PlacementSetRequest placementSetRequestInstance = new PlacementSetRequest()
    .Requests(Requests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
