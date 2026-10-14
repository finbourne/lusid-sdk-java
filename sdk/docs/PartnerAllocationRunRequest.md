# com.finbourne.lusid.model.PartnerAllocationRunRequest
The request to allocate a period's income summary to the partners of a partnership fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the period to allocate, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the period to allocate, inclusive. A valuation point must end on this date. | [default to OffsetDateTime]
**navTypeCode** | **String** | The NAV type to allocate under. Defaults to the fund&#39;s primary NAV type. | [optional] [default to String]
**dryRun** | **Boolean** | When true, the allocation is computed and returned but nothing is booked. | [optional] [default to Boolean]
**correction** | **Boolean** | When true, a period that has already been allocated may be re-allocated. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.PartnerAllocationRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";
Boolean DryRun = true;
Boolean Correction = true;


PartnerAllocationRunRequest partnerAllocationRunRequestInstance = new PartnerAllocationRunRequest()
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .NavTypeCode(NavTypeCode)
    .DryRun(DryRun)
    .Correction(Correction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
