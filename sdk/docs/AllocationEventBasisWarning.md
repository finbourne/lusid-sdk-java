# com.finbourne.lusid.model.AllocationEventBasisWarning
One thing the basis source had to work around when it read the register for an Allocation Event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The warning, for example MissingFeeRate or RoundingPartnerNotParticipant. | [optional] [default to String]
**investorRecordId** | **String** | The investor record the warning concerns, or absent when it concerns the event as a whole. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventBasisWarning;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";


AllocationEventBasisWarning allocationEventBasisWarningInstance = new AllocationEventBasisWarning()
    .Code(Code)
    .InvestorRecordId(InvestorRecordId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
