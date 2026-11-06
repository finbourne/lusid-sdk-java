# com.finbourne.lusid.model.BucketCashFlowBalance
The balances of a bucket in one payment currency and, when a report currency was requested, in the report currency, and,  when haircut rules were supplied, net of the haircuts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The payment currency of the cash flows. Balances of different currencies are never added together. | [optional] [default to String]
**local** | [**BucketBalanceFigures**](BucketBalanceFigures.md) |  | [optional] [default to BucketBalanceFigures]
**reportCurrency** | [**BucketBalanceFigures**](BucketBalanceFigures.md) |  | [optional] [default to BucketBalanceFigures]
**startingBalanceRate** | **java.math.BigDecimal** | With an FxRateType other than FxSpot, the spot rate that converts the ladder&#39;s starting balance in this currency into the report currency, when that balance is not zero: the spot as at the window start for FxSpotAtCashFlowDate (or as at the valuation date when the window starts after it, as nothing is known of a later spot rate), and as at the valuation date for FxForward and ForwardThenSpot. | [optional] [default to java.math.BigDecimal]
**netOfHaircut** | [**BucketNetOfHaircutBalance**](BucketNetOfHaircutBalance.md) |  | [optional] [default to BucketNetOfHaircutBalance]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketCashFlowBalance;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Currency = "example Currency";
BucketBalanceFigures Local = new BucketBalanceFigures();
BucketBalanceFigures ReportCurrency = new BucketBalanceFigures();
@jakarta.annotation.Nullable java.math.BigDecimal StartingBalanceRate = new java.math.BigDecimal("100.00");
BucketNetOfHaircutBalance NetOfHaircut = new BucketNetOfHaircutBalance();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketCashFlowBalance bucketCashFlowBalanceInstance = new BucketCashFlowBalance()
    .Currency(Currency)
    .Local(Local)
    .ReportCurrency(ReportCurrency)
    .StartingBalanceRate(StartingBalanceRate)
    .NetOfHaircut(NetOfHaircut)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
