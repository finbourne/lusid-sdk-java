# com.finbourne.lusid.model.CarryAccrualAmount
A partner's carry to date as produced by the waterfall.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the amount belongs to. | [default to String]
**carryToDate** | **java.math.BigDecimal** | The cumulative carry the partner has earned to the period end. | [default to java.math.BigDecimal]
**byTier** | [**List&lt;CarryTierAmount&gt;**](CarryTierAmount.md) | The carry by waterfall tier. | [optional] [default to List<CarryTierAmount>]
**clawbackExposure** | **java.math.BigDecimal** | The carry that would have to be returned if the fund liquidated at the period end. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CarryAccrualAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal CarryToDate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<CarryTierAmount> ByTier = new List<CarryTierAmount>();
java.math.BigDecimal ClawbackExposure = new java.math.BigDecimal("100.00");


CarryAccrualAmount carryAccrualAmountInstance = new CarryAccrualAmount()
    .InvestorRecordId(InvestorRecordId)
    .CarryToDate(CarryToDate)
    .ByTier(ByTier)
    .ClawbackExposure(ClawbackExposure);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
