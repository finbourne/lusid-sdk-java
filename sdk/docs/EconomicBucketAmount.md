# com.finbourne.lusid.model.EconomicBucketAmount
An amount in one economic bucket, in the holding's currency and the portfolio currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **String** | The economic bucket, such as &#39;NA_Cost&#39;, &#39;NA_Accrued&#39;, &#39;PL_Carry&#39; or &#39;PL_RealPriceGL&#39;. | [optional] [default to String]
**component** | **String** | The component of the economic bucket, such as &#39;TradedInterest&#39;, &#39;Income&#39;, &#39;Expense&#39; or &#39;CoreMarket&#39;. Null where the bucket has no component. | [optional] [default to String]
**variant** | **String** | The variant of the economic bucket, such as &#39;Bought&#39;, &#39;Sold&#39;, &#39;Coupon&#39;, &#39;Dividend&#39;, &#39;Fee&#39;, &#39;Tax&#39;, &#39;ShortTerm&#39; or &#39;LongTerm&#39;. Null where the bucket has no variant. | [optional] [default to String]
**local** | **java.math.BigDecimal** | The amount in the holding&#39;s currency. | [optional] [default to java.math.BigDecimal]
**portfolio** | **java.math.BigDecimal** | The amount in the portfolio currency. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.EconomicBucketAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Bucket = "example Bucket";
@jakarta.annotation.Nullable String Component = "example Component";
@jakarta.annotation.Nullable String Variant = "example Variant";
java.math.BigDecimal Local = new java.math.BigDecimal("100.00");
java.math.BigDecimal Portfolio = new java.math.BigDecimal("100.00");


EconomicBucketAmount economicBucketAmountInstance = new EconomicBucketAmount()
    .Bucket(Bucket)
    .Component(Component)
    .Variant(Variant)
    .Local(Local)
    .Portfolio(Portfolio);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
