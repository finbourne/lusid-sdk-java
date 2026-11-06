# com.finbourne.lusid.model.BucketCashFlowSubtotal
The balances of a bucket summed across all payment currencies, in the report currency. It carries only report currency  figures, as a total across currencies has no meaning in any single payment currency, and no rate, as there is no single rate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportCurrency** | [**BucketBalanceFigures**](BucketBalanceFigures.md) |  | [optional] [default to BucketBalanceFigures]
**netOfHaircut** | [**BucketBalanceFigures**](BucketBalanceFigures.md) |  | [optional] [default to BucketBalanceFigures]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketCashFlowSubtotal;
import java.util.*;
import java.lang.System;
import java.net.URI;

BucketBalanceFigures ReportCurrency = new BucketBalanceFigures();
BucketBalanceFigures NetOfHaircut = new BucketBalanceFigures();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketCashFlowSubtotal bucketCashFlowSubtotalInstance = new BucketCashFlowSubtotal()
    .ReportCurrency(ReportCurrency)
    .NetOfHaircut(NetOfHaircut)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
