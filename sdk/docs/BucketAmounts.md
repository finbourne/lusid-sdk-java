# com.finbourne.lusid.model.BucketAmounts
An amount in the payment currency and, when a report currency was requested, in the report currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**local** | **java.math.BigDecimal** | The amount in the payment currency. | [optional] [default to java.math.BigDecimal]
**report** | **java.math.BigDecimal** | The amount in the report currency; absent when no report currency was requested, or when a rate needed to convert it could not be found or a cash flow could not be converted (the response&#39;s Issues says which). Under the default FxSpot rate type an opening or closing balance is the payment currency balance converted at the spot rate as at the effective date, the rate every cash flow is converted at, so it agrees with the report currency balances QueryBucketedCashFlows gives for the same date. Under any other rate type a balance is a running sum, not the value of the payment currency balance: the starting balance converted at the spot rate (see StartingBalanceRate) plus every cash flow up to that date, each at the rate that rate type gave it. It is the cumulative cash flow in the report currency, so it can have the opposite sign to Local when the rate has moved. Under FxForward a cash flow paid on or before the effective date has no forward rate, so a series with one before the bucket has no report currency balances. In both, Open + ActivityTotal &#x3D; Close and each Close equals the next Open. The activity total is the sum of its cash flows&#39; own report currency amounts. | [optional] [default to java.math.BigDecimal]
**rate** | **java.math.BigDecimal** | Under FxSpot, on an opening or closing balance, the spot rate it was converted at. On an activity total, the effective rate, Report divided by Local, which is a blended rate when its cash flows were converted at different rates. Absent when Report is, on a balance under any other rate type (a running sum has no single rate), or when the effective rate&#39;s Local is 0. | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketAmounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Local = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Report = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketAmounts bucketAmountsInstance = new BucketAmounts()
    .Local(Local)
    .Report(Report)
    .Rate(Rate)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
