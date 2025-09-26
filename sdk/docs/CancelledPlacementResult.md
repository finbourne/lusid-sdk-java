# com.finbourne.lusid.model.CancelledPlacementResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementState** | [**Placement**](Placement.md) |  | [optional] [default to Placement]
**cancelledChildPlacements** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Child placements which have also been cancelled following cancellation of the parent | [default to List<ResourceId>]

```java
import com.finbourne.lusid.model.CancelledPlacementResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

Placement PlacementState = new Placement();
List<ResourceId> CancelledChildPlacements = new List<ResourceId>();


CancelledPlacementResult cancelledPlacementResultInstance = new CancelledPlacementResult()
    .PlacementState(PlacementState)
    .CancelledChildPlacements(CancelledChildPlacements);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
