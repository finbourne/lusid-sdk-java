# com.finbourne.lusid.model.BucketNetOfHaircutBalance
A bucket's balances with the haircut taken. The starting balance is not haircut; each cash flow is net of its haircut, and  so the opening balance is net of the haircuts on the cash flows before the bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**local** | [**BucketBalanceFigures**](BucketBalanceFigures.md) |  | [optional] [default to BucketBalanceFigures]
**reportCurrency** | [**BucketBalanceFigures**](BucketBalanceFigures.md) |  | [optional] [default to BucketBalanceFigures]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketNetOfHaircutBalance;
import java.util.*;
import java.lang.System;
import java.net.URI;

BucketBalanceFigures Local = new BucketBalanceFigures();
BucketBalanceFigures ReportCurrency = new BucketBalanceFigures();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketNetOfHaircutBalance bucketNetOfHaircutBalanceInstance = new BucketNetOfHaircutBalance()
    .Local(Local)
    .ReportCurrency(ReportCurrency)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
