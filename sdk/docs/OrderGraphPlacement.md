# com.finbourne.lusid.model.OrderGraphPlacement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placement** | [**Placement**](Placement.md) |  | [default to Placement]
**blockId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**ordered** | [**OrderGraphPlacementOrderSynopsis**](OrderGraphPlacementOrderSynopsis.md) |  | [default to OrderGraphPlacementOrderSynopsis]
**placed** | [**OrderGraphPlacementPlacementSynopsis**](OrderGraphPlacementPlacementSynopsis.md) |  | [default to OrderGraphPlacementPlacementSynopsis]
**executed** | [**OrderGraphPlacementExecutionSynopsis**](OrderGraphPlacementExecutionSynopsis.md) |  | [default to OrderGraphPlacementExecutionSynopsis]
**allocated** | [**OrderGraphPlacementAllocationSynopsis**](OrderGraphPlacementAllocationSynopsis.md) |  | [default to OrderGraphPlacementAllocationSynopsis]
**derivedState** | **String** | A simple description of the overall state of a placement. | [default to String]
**calculatedAveragePrice** | **java.math.BigDecimal** | Average price realised on executions for a given placement | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.OrderGraphPlacement;
import java.util.*;
import java.lang.System;
import java.net.URI;

Placement Placement = new Placement();
ResourceId BlockId = new ResourceId();
OrderGraphPlacementOrderSynopsis Ordered = new OrderGraphPlacementOrderSynopsis();
OrderGraphPlacementPlacementSynopsis Placed = new OrderGraphPlacementPlacementSynopsis();
OrderGraphPlacementExecutionSynopsis Executed = new OrderGraphPlacementExecutionSynopsis();
OrderGraphPlacementAllocationSynopsis Allocated = new OrderGraphPlacementAllocationSynopsis();
String DerivedState = "example DerivedState";
@jakarta.annotation.Nullable java.math.BigDecimal CalculatedAveragePrice = new java.math.BigDecimal("100.00");


OrderGraphPlacement orderGraphPlacementInstance = new OrderGraphPlacement()
    .Placement(Placement)
    .BlockId(BlockId)
    .Ordered(Ordered)
    .Placed(Placed)
    .Executed(Executed)
    .Allocated(Allocated)
    .DerivedState(DerivedState)
    .CalculatedAveragePrice(CalculatedAveragePrice);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
