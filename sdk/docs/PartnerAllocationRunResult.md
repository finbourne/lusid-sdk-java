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
**pools** | [**List&lt;PartnerAllocationPool&gt;**](PartnerAllocationPool.md) | The pools of fund-level amount that were allocated, in the allocation bucket set&#39;s bucket order with any tag pools after. | [default to List<PartnerAllocationPool>]
**unattributed** | [**List&lt;UnattributedAmount&gt;**](UnattributedAmount.md) | Always empty: every profit and loss line is pooled or the run is refused. No longer required; removed once no published SDK requires it. | [optional] [default to List<UnattributedAmount>]
**bookedTransactionIds** | **List&lt;String&gt;** | The identifiers of the transactions the run booked, if any. | [default to List<String>]
**warnings** | **List&lt;String&gt;** | What the run noticed but did not refuse, for example an excluded investor record that is not on the register at the period end, or a fee accrual naming no investor that was pooled as unaccrued fee (AccruedFeeWithoutInvestor). | [optional] [default to List<String>]
**ignoredTags** | [**List&lt;IgnoredDistributionTag&gt;**](IgnoredDistributionTag.md) | The distribution character tags the run did not pool by, by account. | [optional] [default to List<IgnoredDistributionTag>]
**accruedFees** | [**List&lt;AccruedFeeLine&gt;**](AccruedFeeLine.md) | The management fees accrued per partner in the period, which the accrual allocates and the run therefore leaves out of the pools. | [optional] [default to List<AccruedFeeLine>]

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
@jakarta.annotation.Nullable List<UnattributedAmount> Unattributed = new List<UnattributedAmount>();
List<String> BookedTransactionIds = new List<String>();
@jakarta.annotation.Nullable List<String> Warnings = new List<String>();
@jakarta.annotation.Nullable List<IgnoredDistributionTag> IgnoredTags = new List<IgnoredDistributionTag>();
@jakarta.annotation.Nullable List<AccruedFeeLine> AccruedFees = new List<AccruedFeeLine>();


PartnerAllocationRunResult partnerAllocationRunResultInstance = new PartnerAllocationRunResult()
    .FundId(FundId)
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .NavTypeCode(NavTypeCode)
    .Status(Status)
    .RunId(RunId)
    .Pools(Pools)
    .Unattributed(Unattributed)
    .BookedTransactionIds(BookedTransactionIds)
    .Warnings(Warnings)
    .IgnoredTags(IgnoredTags)
    .AccruedFees(AccruedFees);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
