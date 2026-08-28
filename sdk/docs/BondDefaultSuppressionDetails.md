# com.finbourne.lusid.model.BondDefaultSuppressionDetails
How much of each component of a bond keeps paying after a default, as a fraction from 0.0 (fully  suppressed) to 1.0 (unaffected). An unset field means 1.0. Omitting the whole section is different: that  suppresses coupons and principal outright and leaves interest accruing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accrualPercentage** | **java.math.BigDecimal** | Fraction of the computed accrued interest returned from the default onwards, between 0.0 and 1.0.  Accrued interest supplied through a results store is returned unchanged. Optional, defaulting to 1.0. | [optional] [default to java.math.BigDecimal]
**couponPercentage** | **java.math.BigDecimal** | Fraction of each coupon from the default onwards that is still paid, between 0.0 and 1.0. Optional,  defaulting to 1.0. | [optional] [default to java.math.BigDecimal]
**principalPercentage** | **java.math.BigDecimal** | Fraction of each principal repayment from the default onwards still paid, between 0.0 and 1.0.  Optional, defaulting to 1.0. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BondDefaultSuppressionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal AccrualPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CouponPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PrincipalPercentage = new java.math.BigDecimal("100.00");


BondDefaultSuppressionDetails bondDefaultSuppressionDetailsInstance = new BondDefaultSuppressionDetails()
    .AccrualPercentage(AccrualPercentage)
    .CouponPercentage(CouponPercentage)
    .PrincipalPercentage(PrincipalPercentage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
