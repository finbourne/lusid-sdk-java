# com.finbourne.lusid.model.AllocationEventBasisDiagnostics
What the basis source found when it read the register for an Allocation Event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**participantCount** | **Integer** | The number of investor records whose basis values were read. | [optional] [default to Integer]
**excluded** | **List&lt;String&gt;** | The investor records the map&#39;s exceptions kept out of the event. | [optional] [default to List<String>]
**warnings** | [**List&lt;AllocationEventBasisWarning&gt;**](AllocationEventBasisWarning.md) | Anything the source had to work around, for example MissingFeeRate on a line without a management fee rate. | [optional] [default to List<AllocationEventBasisWarning>]

```java
import com.finbourne.lusid.model.AllocationEventBasisDiagnostics;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer ParticipantCount = new Integer("100.00");
@jakarta.annotation.Nullable List<String> Excluded = new List<String>();
@jakarta.annotation.Nullable List<AllocationEventBasisWarning> Warnings = new List<AllocationEventBasisWarning>();


AllocationEventBasisDiagnostics allocationEventBasisDiagnosticsInstance = new AllocationEventBasisDiagnostics()
    .ParticipantCount(ParticipantCount)
    .Excluded(Excluded)
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
