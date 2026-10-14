# com.finbourne.lusid.model.PartnershipAccountingValuationPointData
The partnership accounting view of a valuation point: what is left on the income summary to allocate to the  partners, and the configuration pack the allocation books under.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unallocatedIncomeSummary** | **java.math.BigDecimal** | The balance on the income summary account over the valuation point&#39;s period that has not yet been allocated to the partners. Must be zero before the valuation point can be finalised. | [default to java.math.BigDecimal]
**configPackScope** | **String** | The scope of the configuration pack. | [default to String]
**configPackCode** | **String** | The code of the configuration pack. | [default to String]

```java
import com.finbourne.lusid.model.PartnershipAccountingValuationPointData;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal UnallocatedIncomeSummary = new java.math.BigDecimal("100.00");
String ConfigPackScope = "example ConfigPackScope";
String ConfigPackCode = "example ConfigPackCode";


PartnershipAccountingValuationPointData partnershipAccountingValuationPointDataInstance = new PartnershipAccountingValuationPointData()
    .UnallocatedIncomeSummary(UnallocatedIncomeSummary)
    .ConfigPackScope(ConfigPackScope)
    .ConfigPackCode(ConfigPackCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
