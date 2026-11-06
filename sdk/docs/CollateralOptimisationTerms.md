# com.finbourne.lusid.model.CollateralOptimisationTerms
When a cheaper arrangement for the agreement's trades is worth recommending.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**novationCost** | **java.math.BigDecimal** | The one-off cost of novating trades away from the counterparty, in the agreement&#39;s base currency. At least 0. | [default to java.math.BigDecimal]
**minSavingPerDay** | **java.math.BigDecimal** | A change saving no more than this a day is not recommended. At least 0. | [default to java.math.BigDecimal]
**maxPaybackDays** | **Integer** | A change whose one-off cost takes longer than this many days to earn back is not recommended. At least 0. | [default to Integer]
**maxPerAgreement** | **Integer** | The most recommendations kept for the agreement, best first. Zero means no cap. At least 0. | [default to Integer]

```java
import com.finbourne.lusid.model.CollateralOptimisationTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal NovationCost = new java.math.BigDecimal("100.00");
java.math.BigDecimal MinSavingPerDay = new java.math.BigDecimal("100.00");
Integer MaxPaybackDays = new Integer("100.00");
Integer MaxPerAgreement = new Integer("100.00");


CollateralOptimisationTerms collateralOptimisationTermsInstance = new CollateralOptimisationTerms()
    .NovationCost(NovationCost)
    .MinSavingPerDay(MinSavingPerDay)
    .MaxPaybackDays(MaxPaybackDays)
    .MaxPerAgreement(MaxPerAgreement);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
