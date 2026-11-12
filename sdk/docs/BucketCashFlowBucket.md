# com.finbourne.lusid.model.BucketCashFlowBucket
One tenor bucket for one portfolio, payment currency and set of sub-holding keys: its opening balance, closing balance and the  cash flows that make up its activity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | Identifies the bucket: a 32 character lowercase hexadecimal hash of its period (start and end), payment currency, portfolio and sub-holding keys. It is stable, the same bucket has the same id in every response, and it is opaque: compare it, do not take it apart. | [optional] [default to String]
**bucketStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the period the bucket covers. | [optional] [default to OffsetDateTime]
**bucketEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the period the bucket covers. | [optional] [default to OffsetDateTime]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**currency** | **String** | The payment currency of the bucket. | [optional] [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding keys the bucket is for, limited to those the caller may read. | [optional] [default to Map<String, PerpetualProperty>]
**open** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**activityTotal** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**activity** | [**List&lt;CashFlowDetail&gt;**](CashFlowDetail.md) | The cash flows in the bucket, with the attributes a cash flow has in Values. | [optional] [default to List<CashFlowDetail>]
**close** | [**BucketAmounts**](BucketAmounts.md) |  | [optional] [default to BucketAmounts]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BucketCashFlowBucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String BucketId = "example BucketId";
OffsetDateTime BucketStart = OffsetDateTime.now();
OffsetDateTime BucketEnd = OffsetDateTime.now();
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
BucketAmounts Open = new BucketAmounts();
BucketAmounts ActivityTotal = new BucketAmounts();
@jakarta.annotation.Nullable List<CashFlowDetail> Activity = new List<CashFlowDetail>();
BucketAmounts Close = new BucketAmounts();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BucketCashFlowBucket bucketCashFlowBucketInstance = new BucketCashFlowBucket()
    .BucketId(BucketId)
    .BucketStart(BucketStart)
    .BucketEnd(BucketEnd)
    .PortfolioId(PortfolioId)
    .Currency(Currency)
    .SubHoldingKeys(SubHoldingKeys)
    .Open(Open)
    .ActivityTotal(ActivityTotal)
    .Activity(Activity)
    .Close(Close)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
