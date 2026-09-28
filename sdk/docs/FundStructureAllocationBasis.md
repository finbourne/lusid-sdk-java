# com.finbourne.lusid.model.FundStructureAllocationBasis
The default apportionment basis of a Fund Structure member.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | How the apportionment is weighted. ValueWeighted apportions pro rata to each investing member&#39;s value; PropertyWeighted apportions pro rata to the property named in &#39;property&#39;; FixedPercentage defers to factors held on an allocation map. A ValueWeighted basis is rejected where a holder of this member also holds an unrelated member, because the member could not be finalised before that sibling is valued. Available values: ValueWeighted, PropertyWeighted, FixedPercentage. | [optional] [default to String]
**property** | [**ApportionmentMethodProperty**](ApportionmentMethodProperty.md) |  | [optional] [default to ApportionmentMethodProperty]
**scopedToMember** | **Boolean** | Whether the basis is evaluated only over amounts booked against this member rather than fund-wide. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.FundStructureAllocationBasis;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Kind = "example Kind";
ApportionmentMethodProperty Property = new ApportionmentMethodProperty();
Boolean ScopedToMember = true;


FundStructureAllocationBasis fundStructureAllocationBasisInstance = new FundStructureAllocationBasis()
    .Kind(Kind)
    .Property(Property)
    .ScopedToMember(ScopedToMember);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
