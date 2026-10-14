# com.finbourne.lusid.model.PartnerAllocationPool
One pool of an allocation run: an amount of a given character, split across the partners on a basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**character** | **String** | The character of the pool&#39;s amount, for example Income, RealisedGain or Expense. | [default to String]
**originMemberShortCode** | **String** | For a deal-linked pool, the short code of the member fund the amount originates from. | [optional] [default to String]
**poolAmount** | **java.math.BigDecimal** | The amount in the pool. | [default to java.math.BigDecimal]
**basis** | **String** | The basis the pool was shared on. Available values: CommittedCapital, PaidInCapital, DealPaidIn. | [default to String]
**allocations** | [**List&lt;PartnerAllocation&gt;**](PartnerAllocation.md) | Each partner&#39;s share of the pool. | [default to List<PartnerAllocation>]
**residual** | **java.math.BigDecimal** | The rounding residual, carried by the largest allocation. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerAllocationPool;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Character = "example Character";
@jakarta.annotation.Nullable String OriginMemberShortCode = "example OriginMemberShortCode";
java.math.BigDecimal PoolAmount = new java.math.BigDecimal("100.00");
String Basis = "example Basis";
List<PartnerAllocation> Allocations = new List<PartnerAllocation>();
java.math.BigDecimal Residual = new java.math.BigDecimal("100.00");


PartnerAllocationPool partnerAllocationPoolInstance = new PartnerAllocationPool()
    .Character(Character)
    .OriginMemberShortCode(OriginMemberShortCode)
    .PoolAmount(PoolAmount)
    .Basis(Basis)
    .Allocations(Allocations)
    .Residual(Residual);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
