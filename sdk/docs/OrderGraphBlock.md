# com.finbourne.lusid.model.OrderGraphBlock

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block** | [**Block**](Block.md) |  | [default to Block]
**ordered** | [**OrderGraphBlockOrderSynopsis**](OrderGraphBlockOrderSynopsis.md) |  | [default to OrderGraphBlockOrderSynopsis]
**placed** | [**OrderGraphBlockPlacementSynopsis**](OrderGraphBlockPlacementSynopsis.md) |  | [default to OrderGraphBlockPlacementSynopsis]
**executed** | [**OrderGraphBlockExecutionSynopsis**](OrderGraphBlockExecutionSynopsis.md) |  | [default to OrderGraphBlockExecutionSynopsis]
**allocated** | [**OrderGraphBlockAllocationSynopsis**](OrderGraphBlockAllocationSynopsis.md) |  | [default to OrderGraphBlockAllocationSynopsis]
**booked** | [**OrderGraphBlockTransactionSynopsis**](OrderGraphBlockTransactionSynopsis.md) |  | [default to OrderGraphBlockTransactionSynopsis]
**derivedState** | **String** | A simple description of the overall state of a block. | [default to String]
**derivedComplianceState** | **String** | The overall compliance state of a block, derived from the block&#39;s orders. Possible values are &#39;Pending&#39;, &#39;Failed&#39;, &#39;Manually approved&#39; and &#39;Passed&#39;. | [default to String]
**derivedApprovalState** | **String** | The overall approval state of a block, derived from approval of the block&#39;s orders. Possible values are &#39;Pending&#39;, &#39;Approved&#39; and &#39;Rejected&#39;. | [default to String]

```java
import com.finbourne.lusid.model.OrderGraphBlock;
import java.util.*;
import java.lang.System;
import java.net.URI;

Block Block = new Block();
OrderGraphBlockOrderSynopsis Ordered = new OrderGraphBlockOrderSynopsis();
OrderGraphBlockPlacementSynopsis Placed = new OrderGraphBlockPlacementSynopsis();
OrderGraphBlockExecutionSynopsis Executed = new OrderGraphBlockExecutionSynopsis();
OrderGraphBlockAllocationSynopsis Allocated = new OrderGraphBlockAllocationSynopsis();
OrderGraphBlockTransactionSynopsis Booked = new OrderGraphBlockTransactionSynopsis();
String DerivedState = "example DerivedState";
String DerivedComplianceState = "example DerivedComplianceState";
String DerivedApprovalState = "example DerivedApprovalState";


OrderGraphBlock orderGraphBlockInstance = new OrderGraphBlock()
    .Block(Block)
    .Ordered(Ordered)
    .Placed(Placed)
    .Executed(Executed)
    .Allocated(Allocated)
    .Booked(Booked)
    .DerivedState(DerivedState)
    .DerivedComplianceState(DerivedComplianceState)
    .DerivedApprovalState(DerivedApprovalState);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
