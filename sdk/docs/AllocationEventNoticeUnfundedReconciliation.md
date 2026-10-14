# com.finbourne.lusid.model.AllocationEventNoticeUnfundedReconciliation
The partner's unfunded commitment rolled through the event on the notice.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**opening** | **java.math.BigDecimal** | The unfunded commitment before the event. | [default to java.math.BigDecimal]
**calls** | **java.math.BigDecimal** | Capital calls reducing the unfunded commitment. | [default to java.math.BigDecimal]
**distributionsRecallable** | **java.math.BigDecimal** | Recallable distributions restoring the unfunded commitment. | [default to java.math.BigDecimal]
**expiries** | **java.math.BigDecimal** | Recallable amounts that expired. | [default to java.math.BigDecimal]
**commitmentChanges** | **java.math.BigDecimal** | Changes to the commitment itself. | [default to java.math.BigDecimal]
**transfers** | **java.math.BigDecimal** | Transfers of unfunded commitment between partners. | [default to java.math.BigDecimal]
**closing** | **java.math.BigDecimal** | The unfunded commitment after the event. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationEventNoticeUnfundedReconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Opening = new java.math.BigDecimal("100.00");
java.math.BigDecimal Calls = new java.math.BigDecimal("100.00");
java.math.BigDecimal DistributionsRecallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal Expiries = new java.math.BigDecimal("100.00");
java.math.BigDecimal CommitmentChanges = new java.math.BigDecimal("100.00");
java.math.BigDecimal Transfers = new java.math.BigDecimal("100.00");
java.math.BigDecimal Closing = new java.math.BigDecimal("100.00");


AllocationEventNoticeUnfundedReconciliation allocationEventNoticeUnfundedReconciliationInstance = new AllocationEventNoticeUnfundedReconciliation()
    .Opening(Opening)
    .Calls(Calls)
    .DistributionsRecallable(DistributionsRecallable)
    .Expiries(Expiries)
    .CommitmentChanges(CommitmentChanges)
    .Transfers(Transfers)
    .Closing(Closing);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
