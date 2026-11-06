# com.finbourne.lusid.model.CollateralFundingTerms
What margin posted under the agreement costs us: the annual rate it is funded at and the basis it accrues on.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **java.math.BigDecimal** | The annual rate posted margin is funded at, as a fraction, for example 0.053 for 5.3%. Between -1 and 1. | [default to java.math.BigDecimal]
**dayCountBasis** | **Integer** | The number of days in the year the funding rate accrues over. Either 360 or 365. | [default to Integer]

```java
import com.finbourne.lusid.model.CollateralFundingTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
Integer DayCountBasis = new Integer("100.00");


CollateralFundingTerms collateralFundingTermsInstance = new CollateralFundingTerms()
    .Rate(Rate)
    .DayCountBasis(DayCountBasis);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
