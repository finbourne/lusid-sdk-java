# com.finbourne.lusid.model.CarryTierAmount
A partner's carry split by waterfall tier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tier** | **String** | The waterfall tier. | [default to String]
**realised** | **java.math.BigDecimal** | The carry realised in the tier. | [default to java.math.BigDecimal]
**hypothetical** | **java.math.BigDecimal** | The carry the tier would pay if the fund liquidated at the period end. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CarryTierAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Tier = "example Tier";
java.math.BigDecimal Realised = new java.math.BigDecimal("100.00");
java.math.BigDecimal Hypothetical = new java.math.BigDecimal("100.00");


CarryTierAmount carryTierAmountInstance = new CarryTierAmount()
    .Tier(Tier)
    .Realised(Realised)
    .Hypothetical(Hypothetical);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
