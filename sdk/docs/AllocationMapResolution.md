# com.finbourne.lusid.model.AllocationMapResolution
The result of resolving an Allocation Map for one event: how much each investor record receives, and why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event that was resolved. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount that was shared. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The currency of the amount. | [optional] [default to String]
**basisRule** | **String** | The basis the map applies to this event type. Available values: ValueWeighted, PropertyWeighted, FixedPercentage. | [optional] [default to String]
**basisPool** | **java.math.BigDecimal** | The sum of the basis values over the participants that share the remainder pro rata. | [optional] [default to java.math.BigDecimal]
**fixedTotal** | **java.math.BigDecimal** | The total taken off the top by FixedPercentage exceptions before the remainder is shared. | [optional] [default to java.math.BigDecimal]
**participantCount** | **Integer** | The number of investor records that receive a share, whether fixed or pro rata. | [optional] [default to Integer]
**excludedCount** | **Integer** | The number of investor records an exception removed from the allocation. | [optional] [default to Integer]
**allocations** | [**List&lt;AllocationMapAllocation&gt;**](AllocationMapAllocation.md) | The share of each investor record, including those excluded, which receive nothing. | [optional] [default to List<AllocationMapAllocation>]
**reconciles** | **Boolean** | Whether the allocated amounts sum exactly to the requested amount. Amounts are rounded to two decimal places with the largest-remainder method, so an amount with more decimal places does not reconcile. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.AllocationMapResolution;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EventType = "example EventType";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String BasisRule = "example BasisRule";
java.math.BigDecimal BasisPool = new java.math.BigDecimal("100.00");
java.math.BigDecimal FixedTotal = new java.math.BigDecimal("100.00");
Integer ParticipantCount = new Integer("100.00");
Integer ExcludedCount = new Integer("100.00");
@jakarta.annotation.Nullable List<AllocationMapAllocation> Allocations = new List<AllocationMapAllocation>();
Boolean Reconciles = true;


AllocationMapResolution allocationMapResolutionInstance = new AllocationMapResolution()
    .EventType(EventType)
    .Amount(Amount)
    .Currency(Currency)
    .BasisRule(BasisRule)
    .BasisPool(BasisPool)
    .FixedTotal(FixedTotal)
    .ParticipantCount(ParticipantCount)
    .ExcludedCount(ExcludedCount)
    .Allocations(Allocations)
    .Reconciles(Reconciles);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
