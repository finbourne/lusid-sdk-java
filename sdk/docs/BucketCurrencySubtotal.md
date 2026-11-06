# com.finbourne.lusid.model.BucketCurrencySubtotal
A bucket's balances for one payment currency, summed across portfolios and sub-holding keys.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the period the subtotal covers. | [optional] [default to OffsetDateTime]
**bucketEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the period the subtotal covers. | [optional] [default to OffsetDateTime]
**currency** | **String** | The payment currency. | [optional] [default to String]
**open** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**activityTotal** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**close** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketCurrencySubtotal;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BucketStart = OffsetDateTime.now();
OffsetDateTime BucketEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable String Currency = "example Currency";
BucketAmounts Open = new BucketAmounts();
BucketAmounts ActivityTotal = new BucketAmounts();
BucketAmounts Close = new BucketAmounts();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketCurrencySubtotal bucketCurrencySubtotalInstance = new BucketCurrencySubtotal()
    .BucketStart(BucketStart)
    .BucketEnd(BucketEnd)
    .Currency(Currency)
    .Open(Open)
    .ActivityTotal(ActivityTotal)
    .Close(Close)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
