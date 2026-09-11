# com.finbourne.lusid.model.SellEntitlementElection
Election to sell the entitlement in the market rather than exercise it (SLLE).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.SellEntitlementElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsDefault = true;
Boolean IsChosen = true;


SellEntitlementElection sellEntitlementElectionInstance = new SellEntitlementElection()
    .ElectionKey(ElectionKey)
    .IsDefault(IsDefault)
    .IsChosen(IsChosen);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
