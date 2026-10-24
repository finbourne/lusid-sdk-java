# com.finbourne.lusid.model.AllocationBasisRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**character** | **String** |  | [default to String]
**basis** | **String** | Available values: CommittedCapital, PaidInCapital, DealPaidIn. | [default to String]

```java
import com.finbourne.lusid.model.AllocationBasisRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Character = "example Character";
String Basis = "example Basis";


AllocationBasisRule allocationBasisRuleInstance = new AllocationBasisRule()
    .Character(Character)
    .Basis(Basis);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
