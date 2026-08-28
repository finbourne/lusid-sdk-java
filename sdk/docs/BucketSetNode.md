# com.finbourne.lusid.model.BucketSetNode
One node within a bucket set result: the fund aggregate or a single share class. Both carry NAV and buckets; the  capital ratio, the unit counts and the per-unit values are set only on share class nodes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeType** | **String** | The kind of node: the fund aggregate or a single share class. Available values: Fund, Class. | [default to String]
**shareClassShortCode** | **String** | The short code of the share class this node is for, or null for the fund node. | [optional] [default to String]
**nav** | **java.math.BigDecimal** | The net asset value at this node, in the fund currency, or null where it does not apply to the node type. | [optional] [default to java.math.BigDecimal]
**capitalRatio** | **java.math.BigDecimal** | The share class&#39;s capital ratio (its share of the fund NAV), set only on share class nodes. | [optional] [default to java.math.BigDecimal]
**buckets** | [**List&lt;BucketSetResultBucket&gt;**](BucketSetResultBucket.md) | The buckets on this node, each with its period movement and cumulative values. | [default to List<BucketSetResultBucket>]
**perUnitValue** | **java.math.BigDecimal** | The share class&#39;s NAV per unit in issue, in the fund currency, rounded to the share class&#39;s PricePrecision (left unrounded where the share class declares none). Reported only for a share class that is unitised and has units in issue to divide by. The dealing price - in the share class currency, with its instrument&#39;s rounding convention applied - is on the share class breakdown&#39;s unitisation data. | [optional] [default to java.math.BigDecimal]
**sharesInIssue** | **java.math.BigDecimal** | The share class&#39;s units in issue at the end of the period. Reported only for a share class that is unitised. | [optional] [default to java.math.BigDecimal]
**previousPerUnitValue** | **java.math.BigDecimal** | The share class&#39;s NAV per unit at the previous valuation point, on the same basis as PerUnitValue. | [optional] [default to java.math.BigDecimal]
**previousSharesInIssue** | **java.math.BigDecimal** | The share class&#39;s units in issue at the start of the period. Reported only for a share class that is unitised. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BucketSetNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NodeType = "example NodeType";
@jakarta.annotation.Nullable String ShareClassShortCode = "example ShareClassShortCode";
@jakarta.annotation.Nullable java.math.BigDecimal Nav = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CapitalRatio = new java.math.BigDecimal("100.00");
List<BucketSetResultBucket> Buckets = new List<BucketSetResultBucket>();
@jakarta.annotation.Nullable java.math.BigDecimal PerUnitValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal SharesInIssue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreviousPerUnitValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreviousSharesInIssue = new java.math.BigDecimal("100.00");


BucketSetNode bucketSetNodeInstance = new BucketSetNode()
    .NodeType(NodeType)
    .ShareClassShortCode(ShareClassShortCode)
    .Nav(Nav)
    .CapitalRatio(CapitalRatio)
    .Buckets(Buckets)
    .PerUnitValue(PerUnitValue)
    .SharesInIssue(SharesInIssue)
    .PreviousPerUnitValue(PreviousPerUnitValue)
    .PreviousSharesInIssue(PreviousSharesInIssue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
