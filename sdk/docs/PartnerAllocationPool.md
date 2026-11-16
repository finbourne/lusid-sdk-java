# com.finbourne.lusid.model.PartnerAllocationPool
One pool of an allocation run: an amount of a given character, split across the partners on a basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**character** | **String** | The character of the pool&#39;s amount, for example Income, RealisedGain or Expense. | [default to String]
**originMemberShortCode** | **String** | For a deal-linked pool, the short code of the member fund the amount originates from. | [optional] [default to String]
**poolAmount** | **java.math.BigDecimal** | The amount in the pool. | [default to java.math.BigDecimal]
**basis** | **String** | The basis the pool was shared on. Available values: CommittedCapital, PaidInCapital, DealPaidIn. | [default to String]
**basisSource** | **String** | Where the figures a deal pool was shared on came from; absent on a fund-level pool, which is shared on the register&#39;s balances. Available values: DealContributions (what each partner paid into the pool&#39;s deal, from the booked allocation events), Fallback (a deal pool no partner has paid into, shared on its character&#39;s fund-level basis instead). | [optional] [default to String]
**allocations** | [**List&lt;PartnerAllocation&gt;**](PartnerAllocation.md) | Each partner&#39;s share of the pool. | [default to List<PartnerAllocation>]
**residual** | **java.math.BigDecimal** | The rounding residual, carried by the largest allocation. | [default to java.math.BigDecimal]
**poolId** | **String** | The pool&#39;s identifier: the allocation rule&#39;s bucket id, or TAG: followed by the character for lines pooled by their distribution character tag. | [default to String]
**bucketSet** | **String** | The code of the allocation bucket set the pool was classified by, with its version, for example PA-ALLOCATION-v1. | [default to String]
**basisLevel** | **String** | Which level of the basis precedence decided the pool&#39;s basis. Available values: Rule (the bucket rule&#39;s own basis), CharacterDefault (the configuration&#39;s allocationBases entry for the character), BuiltIn (the built-in default for the character). | [default to String]
**exemption** | **String** | The register flag that sat partners out of the pool. Available values: None, FeeExempt, ExpenseExempt. | [default to String]
**excludedInvestorRecordIds** | **List&lt;String&gt;** | The partners the pool&#39;s rule left out of it. | [optional] [default to List<String>]
**reportRow** | **String** | The capital account row the pool&#39;s allocations land on, derived from the character. Available values: NetOperatingIncome, ManagementFeesGross, RealisedGainLoss, UnrealisedGainLoss. | [optional] [default to String]
**sources** | [**PartnerAllocationPoolSources**](PartnerAllocationPoolSources.md) |  | [default to PartnerAllocationPoolSources]

```java
import com.finbourne.lusid.model.PartnerAllocationPool;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Character = "example Character";
@jakarta.annotation.Nullable String OriginMemberShortCode = "example OriginMemberShortCode";
java.math.BigDecimal PoolAmount = new java.math.BigDecimal("100.00");
String Basis = "example Basis";
@jakarta.annotation.Nullable String BasisSource = "example BasisSource";
List<PartnerAllocation> Allocations = new List<PartnerAllocation>();
java.math.BigDecimal Residual = new java.math.BigDecimal("100.00");
String PoolId = "example PoolId";
String BucketSet = "example BucketSet";
String BasisLevel = "example BasisLevel";
String Exemption = "example Exemption";
@jakarta.annotation.Nullable List<String> ExcludedInvestorRecordIds = new List<String>();
@jakarta.annotation.Nullable String ReportRow = "example ReportRow";
PartnerAllocationPoolSources Sources = new PartnerAllocationPoolSources();


PartnerAllocationPool partnerAllocationPoolInstance = new PartnerAllocationPool()
    .Character(Character)
    .OriginMemberShortCode(OriginMemberShortCode)
    .PoolAmount(PoolAmount)
    .Basis(Basis)
    .BasisSource(BasisSource)
    .Allocations(Allocations)
    .Residual(Residual)
    .PoolId(PoolId)
    .BucketSet(BucketSet)
    .BasisLevel(BasisLevel)
    .Exemption(Exemption)
    .ExcludedInvestorRecordIds(ExcludedInvestorRecordIds)
    .ReportRow(ReportRow)
    .Sources(Sources);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
