# com.finbourne.lusid.model.ParticipationRequest
A request to create or update a Participation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**placementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.lusid.model.ParticipationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
ResourceId PlacementId = new ResourceId();
ResourceId OrderId = new ResourceId();


ParticipationRequest participationRequestInstance = new ParticipationRequest()
    .Id(Id)
    .PlacementId(PlacementId)
    .OrderId(OrderId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
