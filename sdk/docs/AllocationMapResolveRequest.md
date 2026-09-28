# com.finbourne.lusid.model.AllocationMapResolveRequest
A dry run of an Allocation Map: the event to share, and the basis values to share it by.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event to resolve: CapitalCall, Distribution, FeeExpense or ValuationMove. The map must define a basis for it. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [default to String]
**amount** | **java.math.BigDecimal** | The amount of the event to share between the participants, in the event currency. | [default to java.math.BigDecimal]
**currency** | **String** | The currency of the amount. | [default to String]
**basisValues** | [**List&lt;AllocationMapBasisValue&gt;**](AllocationMapBasisValue.md) | For a ValueWeighted or PropertyWeighted basis, the basis value of each participating investor record, supplied by the caller until investor records are read from LUSID. Under the AllCommittedToMembers rule these also name the committed investor records. Not needed for a FixedPercentage basis. | [optional] [default to List<AllocationMapBasisValue>]

```java
import com.finbourne.lusid.model.AllocationMapResolveRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EventType = "example EventType";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
@jakarta.annotation.Nullable List<AllocationMapBasisValue> BasisValues = new List<AllocationMapBasisValue>();


AllocationMapResolveRequest allocationMapResolveRequestInstance = new AllocationMapResolveRequest()
    .EventType(EventType)
    .Amount(Amount)
    .Currency(Currency)
    .BasisValues(BasisValues);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
