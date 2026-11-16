# com.finbourne.lusid.model.PartnershipAccountingValuationPointData
The partnership accounting view of a valuation point: what is left on the income summary to allocate to the  partners, the configuration pack the allocation books under and, when the period cannot be allocated as it  stands, why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unallocatedIncomeSummary** | **java.math.BigDecimal** | The profit and loss of the valuation point&#39;s period that has not yet been allocated to the partners: what the period&#39;s profit and loss lines, as the allocation bucket set classifies them, would pool, less what the partner allocation has posted for the period. Lines no bucket claims count as unallocated. Must be zero before the valuation point can be finalised. | [default to java.math.BigDecimal]
**configPackScope** | **String** | The scope of the configuration pack. | [default to String]
**configPackCode** | **String** | The code of the configuration pack. | [default to String]
**allocationProblem** | [**PartnershipAllocationProblem**](PartnershipAllocationProblem.md) |  | [optional] [default to PartnershipAllocationProblem]

```java
import com.finbourne.lusid.model.PartnershipAccountingValuationPointData;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal UnallocatedIncomeSummary = new java.math.BigDecimal("100.00");
String ConfigPackScope = "example ConfigPackScope";
String ConfigPackCode = "example ConfigPackCode";
PartnershipAllocationProblem AllocationProblem = new PartnershipAllocationProblem();


PartnershipAccountingValuationPointData partnershipAccountingValuationPointDataInstance = new PartnershipAccountingValuationPointData()
    .UnallocatedIncomeSummary(UnallocatedIncomeSummary)
    .ConfigPackScope(ConfigPackScope)
    .ConfigPackCode(ConfigPackCode)
    .AllocationProblem(AllocationProblem);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
