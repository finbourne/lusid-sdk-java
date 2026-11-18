# com.finbourne.lusid.model.PartnerAllocation
One partner's share of an allocation pool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the allocation belongs to. | [default to String]
**basisWeight** | **java.math.BigDecimal** | The partner&#39;s weight in the pool&#39;s basis. | [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The amount allocated to the partner. | [default to java.math.BigDecimal]
**reason** | **String** | Why a partner listed at 0.00 took no share of the pool. Available values: Excluded (the bucket&#39;s rule leaves the partner out), Exempt (the partner&#39;s register flag sits it out), ZeroBasis (the partner has nothing on the pool&#39;s basis). Absent on a partner that shares; a partner at 0.00 with no reason shares the pool, but its share rounded to nothing at the pool&#39;s scale. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PartnerAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal BasisWeight = new java.math.BigDecimal("100.00");
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Reason = "example Reason";


PartnerAllocation partnerAllocationInstance = new PartnerAllocation()
    .InvestorRecordId(InvestorRecordId)
    .BasisWeight(BasisWeight)
    .Amount(Amount)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
