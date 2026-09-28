# com.finbourne.lusid.model.AllocationMapFixedFactor
The weight of one investor record under a FixedPercentage basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the factor belongs to. | [default to String]
**factor** | **java.math.BigDecimal** | The weight of the investor record. Weights are normalised over the participants that receive the remainder, so they need not sum to 1. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationMapFixedFactor;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal Factor = new java.math.BigDecimal("100.00");


AllocationMapFixedFactor allocationMapFixedFactorInstance = new AllocationMapFixedFactor()
    .InvestorRecordId(InvestorRecordId)
    .Factor(Factor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
