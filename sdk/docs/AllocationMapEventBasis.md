# com.finbourne.lusid.model.AllocationMapEventBasis
The basis an Allocation Map applies to one kind of allocation event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event the basis applies to: CapitalCall, Distribution, FeeExpense or ValuationMove. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [default to String]
**basis** | [**AllocationMapBasis**](AllocationMapBasis.md) |  | [default to AllocationMapBasis]

```java
import com.finbourne.lusid.model.AllocationMapEventBasis;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EventType = "example EventType";
AllocationMapBasis Basis = new AllocationMapBasis();


AllocationMapEventBasis allocationMapEventBasisInstance = new AllocationMapEventBasis()
    .EventType(EventType)
    .Basis(Basis);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
