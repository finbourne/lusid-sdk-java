# com.finbourne.lusid.model.AllocationRule
The allocation character of one P&L or fees bucket of the allocation bucket set, and optionally how its pools  are shared, echoed as stored. The effective block, overridden fields and source are derived on the way out and  ignored on the way in, so a read written back pins nothing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The bucket of the allocation bucket set the rule applies to. | [default to String]
**character** | **String** | The allocation character of the bucket&#39;s lines, which decides the capital account row. Available values: Income, RealisedGain, UnrealisedGain, OtherIncome, ManagementFee, Expense. Fixed by the set, and so omitted, when the allocation bucket set is a system set. | [optional] [default to String]
**basis** | **String** | The register balance the bucket&#39;s pools are shared on. Available values: CommittedCapital, PaidInCapital. Omit to take the character&#39;s default from allocationBases or the built-in default; returned as stored, with what the fund uses under effective. A pool that names its origin member is shared on deal paid-in unless its rule names a basis, and a rule may not ask for deal paid-in. Available values: CommittedCapital, PaidInCapital. | [optional] [default to String]
**exemption** | **String** | Which register flag sits a partner out of the bucket&#39;s pools. Available values: None, FeeExempt, ExpenseExempt. Omit to take the character&#39;s default (FeeExempt for ManagementFee, ExpenseExempt for Expense, otherwise None); returned as stored, with what the fund uses under effective. Available values: None, FeeExempt, ExpenseExempt. | [optional] [default to String]
**excludedInvestorRecordIds** | **List&lt;String&gt;** | Investor records that sit out every pool of the bucket. Optional. | [optional] [default to List<String>]
**effective** | [**AllocationRuleEffective**](AllocationRuleEffective.md) |  | [optional] [default to AllocationRuleEffective]
**overriddenFields** | **List&lt;String&gt;** | On a system set&#39;s rule, the fields this configuration overrides; absent on a configuration&#39;s own rule. Read-only. | [optional] [default to List<String>]
**source** | **String** | Where the rule&#39;s character comes from: System for a released system set, Configuration for the configuration&#39;s own set. Read-only. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BucketId = "example BucketId";
@jakarta.annotation.Nullable String Character = "example Character";
@jakarta.annotation.Nullable String Basis = "example Basis";
@jakarta.annotation.Nullable String Exemption = "example Exemption";
@jakarta.annotation.Nullable List<String> ExcludedInvestorRecordIds = new List<String>();
AllocationRuleEffective Effective = new AllocationRuleEffective();
@jakarta.annotation.Nullable List<String> OverriddenFields = new List<String>();
@jakarta.annotation.Nullable String Source = "example Source";


AllocationRule allocationRuleInstance = new AllocationRule()
    .BucketId(BucketId)
    .Character(Character)
    .Basis(Basis)
    .Exemption(Exemption)
    .ExcludedInvestorRecordIds(ExcludedInvestorRecordIds)
    .Effective(Effective)
    .OverriddenFields(OverriddenFields)
    .Source(Source);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
