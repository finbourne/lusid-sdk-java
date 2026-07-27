# com.finbourne.lusid.model.BucketSetResultBucket
One bucket's values within a bucket set node: the movement in the period plus the cumulative values before  and after it (CumulativeValue = Value + PreviousCumulativeValue).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The identifier of the bucket. | [default to String]
**bucketType** | **String** | The type of the bucket (for example Dealing or PnL). | [default to String]
**value** | **java.math.BigDecimal** | The movement in the bucket over the valuation point&#39;s period. | [default to java.math.BigDecimal]
**previousCumulativeValue** | **java.math.BigDecimal** | The cumulative value of the bucket up to the start of the period. | [default to java.math.BigDecimal]
**cumulativeValue** | **java.math.BigDecimal** | The cumulative value of the bucket up to the end of the period (Value + PreviousCumulativeValue). | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BucketSetResultBucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BucketId = "example BucketId";
String BucketType = "example BucketType";
java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
java.math.BigDecimal PreviousCumulativeValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal CumulativeValue = new java.math.BigDecimal("100.00");


BucketSetResultBucket bucketSetResultBucketInstance = new BucketSetResultBucket()
    .BucketId(BucketId)
    .BucketType(BucketType)
    .Value(Value)
    .PreviousCumulativeValue(PreviousCumulativeValue)
    .CumulativeValue(CumulativeValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
