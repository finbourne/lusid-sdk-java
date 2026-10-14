# com.finbourne.lusid.model.PartnerAllocation
One partner's share of an allocation pool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the allocation belongs to. | [default to String]
**basisWeight** | **java.math.BigDecimal** | The partner&#39;s weight in the pool&#39;s basis. | [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The amount allocated to the partner. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal BasisWeight = new java.math.BigDecimal("100.00");
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


PartnerAllocation partnerAllocationInstance = new PartnerAllocation()
    .InvestorRecordId(InvestorRecordId)
    .BasisWeight(BasisWeight)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
