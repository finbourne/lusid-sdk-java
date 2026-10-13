# com.finbourne.lusid.model.CapabilityOverride

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capability** | **String** | Available values: RecallableDistributions, RecallCalls, ReturnOfExcessContributions, SubsequentCloseEqualisation, PartnerPnlAllocation, DistributionMechanism, DistributionCharacterSource, SecondaryTransfer, ExcuseExclude, DealScopedPnl, NettedCallAndDistribution. | [default to String]
**setting** | **String** | Available values: Allowed, Forbidden. | [default to String]
**reason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.CapabilityOverride;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Capability = "example Capability";
String Setting = "example Setting";
@jakarta.annotation.Nullable String Reason = "example Reason";


CapabilityOverride capabilityOverrideInstance = new CapabilityOverride()
    .Capability(Capability)
    .Setting(Setting)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
