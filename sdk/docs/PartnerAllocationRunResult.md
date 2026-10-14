# com.finbourne.lusid.model.PartnerAllocationRunResult
The outcome of a partner allocation run: the pools the period's income was split into and what, if anything,  could not be attributed to a pool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the period to allocate, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the period to allocate, inclusive. A valuation point must end on this date. | [default to OffsetDateTime]
**navTypeCode** | **String** | The NAV type to allocate under. Defaults to the fund&#39;s primary NAV type. | [default to String]
**status** | **String** | The outcome of the run. Available values: Computed, Booked, DryRun. | [default to String]
**runId** | **String** | The identifier of the run, which prefixes every transaction it books. | [default to String]
**pools** | [**List&lt;PartnerAllocationPool&gt;**](PartnerAllocationPool.md) | The pools of fund-level amount that were allocated. | [default to List<PartnerAllocationPool>]
**unattributed** | [**List&lt;UnattributedAmount&gt;**](UnattributedAmount.md) | Fund-level amounts that no pool claimed. | [default to List<UnattributedAmount>]
**bookedTransactionIds** | **List&lt;String&gt;** | The identifiers of the transactions the run booked, if any. | [default to List<String>]

```java
import com.finbourne.lusid.model.PartnerAllocationRunResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
String NavTypeCode = "example NavTypeCode";
String Status = "example Status";
String RunId = "example RunId";
List<PartnerAllocationPool> Pools = new List<PartnerAllocationPool>();
List<UnattributedAmount> Unattributed = new List<UnattributedAmount>();
List<String> BookedTransactionIds = new List<String>();


PartnerAllocationRunResult partnerAllocationRunResultInstance = new PartnerAllocationRunResult()
    .FundId(FundId)
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .NavTypeCode(NavTypeCode)
    .Status(Status)
    .RunId(RunId)
    .Pools(Pools)
    .Unattributed(Unattributed)
    .BookedTransactionIds(BookedTransactionIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
