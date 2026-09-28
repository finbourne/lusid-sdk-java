# com.finbourne.lusid.model.AllocationMapBasis
How an allocation event is weighted between the participants of an Allocation Map.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | How the event is weighted between the participants. ValueWeighted apportions pro rata to each participant&#39;s value; PropertyWeighted apportions pro rata to the property named in &#39;property&#39;; FixedPercentage apportions by the factors in fixedFactors. Available values: ValueWeighted, PropertyWeighted, FixedPercentage. | [optional] [default to String]
**property** | [**ApportionmentMethodProperty**](ApportionmentMethodProperty.md) |  | [optional] [default to ApportionmentMethodProperty]
**fixedFactors** | [**List&lt;AllocationMapFixedFactor&gt;**](AllocationMapFixedFactor.md) | For a FixedPercentage basis, the share of the amount each participating investor record takes. At least one is required under that kind, every factor must be positive, and the factors must sum to 1. | [optional] [default to List<AllocationMapFixedFactor>]
**scopedToMember** | **Boolean** | Whether the basis is evaluated only over amounts booked against the structure member rather than fund-wide. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.AllocationMapBasis;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Kind = "example Kind";
ApportionmentMethodProperty Property = new ApportionmentMethodProperty();
@jakarta.annotation.Nullable List<AllocationMapFixedFactor> FixedFactors = new List<AllocationMapFixedFactor>();
Boolean ScopedToMember = true;


AllocationMapBasis allocationMapBasisInstance = new AllocationMapBasis()
    .Kind(Kind)
    .Property(Property)
    .FixedFactors(FixedFactors)
    .ScopedToMember(ScopedToMember);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
