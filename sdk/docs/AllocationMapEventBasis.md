# com.finbourne.lusid.model.AllocationMapEventBasis
The basis an Allocation Map applies to one kind of allocation event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event the basis applies to: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default, Commitment or DealFunding. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove, Commitment, Equalisation, RecallExpiry, Transfer, Default, DealFunding. | [default to String]
**basis** | [**AllocationMapBasis**](AllocationMapBasis.md) |  | [default to AllocationMapBasis]
**component** | **String** | The component of the event the basis applies to, for example MgmtFee or OrgCost. Absent means the entry is the default for every component of the event type without an entry of its own. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationMapEventBasis;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EventType = "example EventType";
AllocationMapBasis Basis = new AllocationMapBasis();
@jakarta.annotation.Nullable String Component = "example Component";


AllocationMapEventBasis allocationMapEventBasisInstance = new AllocationMapEventBasis()
    .EventType(EventType)
    .Basis(Basis)
    .Component(Component);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
