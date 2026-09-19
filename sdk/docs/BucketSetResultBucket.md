# com.finbourne.lusid.model.BucketSetResultBucket
One bucket's values within a bucket set node: the movement in the period plus the cumulative values before  and after it (CumulativeValue = Value + PreviousCumulativeValue), and - on share class nodes - the breakdown  of the movement by the source that contributed it and the same values restated per unit in issue.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The identifier of the bucket. | [default to String]
**bucketType** | **String** | The type of the bucket (for example Dealing or PnL). | [default to String]
**value** | **java.math.BigDecimal** | The movement in the bucket over the valuation point&#39;s period. | [default to java.math.BigDecimal]
**previousCumulativeValue** | **java.math.BigDecimal** | The cumulative value of the bucket up to the start of the period. | [default to java.math.BigDecimal]
**cumulativeValue** | **java.math.BigDecimal** | The cumulative value of the bucket up to the end of the period (Value + PreviousCumulativeValue). | [default to java.math.BigDecimal]
**sourceBreakdown** | **Map&lt;String, java.math.BigDecimal&gt;** | The bucket&#39;s movement broken down by the source that contributed it, which always sums to Value. Reported on share class nodes and omitted on the fund node; on a share class node it is present even when nothing contributed in the period, as an empty map. The keys are &#39;classSpecific&#39; for amounts booked directly to the share class, &#39;nonClassSpecific&#39; for fund-level amounts apportioned to it, and an allocation group&#39;s code for amounts allocated to that group and apportioned to the share class. Sources contributing nothing to the bucket are omitted. | [optional] [default to Map<String, java.math.BigDecimal>]
**perUnitValue** | **java.math.BigDecimal** | The bucket&#39;s movement over the period per unit in issue (Value divided by UnitsInIssue), in the fund currency, rounded to the share class&#39;s PricePrecision. Omitted where either the share class or the bucket is not unitised, and where a unitised share class has no units in issue to divide by (UnitsInIssue is then reported as zero). | [optional] [default to java.math.BigDecimal]
**unitsInIssue** | **java.math.BigDecimal** | The share class&#39;s units in issue at the end of the period. Omitted where either the share class or the bucket is not unitised. | [optional] [default to java.math.BigDecimal]
**previousCumulativePerUnitValue** | **java.math.BigDecimal** | The bucket&#39;s cumulative value at the start of the period, per unit in issue at that point - so it reads as it did at the previous valuation point rather than being restated at this period&#39;s unit count. Omitted where the bucket had no per-unit value at the previous valuation point: on the fund node, where the share class or the bucket is not unitised, where the share class then had no units in issue, and at the fund&#39;s first valuation point. | [optional] [default to java.math.BigDecimal]
**cumulativePerUnitValue** | **java.math.BigDecimal** | The bucket&#39;s cumulative value at the end of the period per unit in issue (CumulativeValue divided by UnitsInIssue). Omitted where either the share class or the bucket is not unitised, and where a unitised share class has no units in issue to divide by. | [optional] [default to java.math.BigDecimal]
**displayName** | **String** | The display name of the bucket, as configured on the fund configuration. | [optional] [default to String]

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
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> SourceBreakdown = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable java.math.BigDecimal PerUnitValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal UnitsInIssue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreviousCumulativePerUnitValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CumulativePerUnitValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";


BucketSetResultBucket bucketSetResultBucketInstance = new BucketSetResultBucket()
    .BucketId(BucketId)
    .BucketType(BucketType)
    .Value(Value)
    .PreviousCumulativeValue(PreviousCumulativeValue)
    .CumulativeValue(CumulativeValue)
    .SourceBreakdown(SourceBreakdown)
    .PerUnitValue(PerUnitValue)
    .UnitsInIssue(UnitsInIssue)
    .PreviousCumulativePerUnitValue(PreviousCumulativePerUnitValue)
    .CumulativePerUnitValue(CumulativePerUnitValue)
    .DisplayName(DisplayName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
