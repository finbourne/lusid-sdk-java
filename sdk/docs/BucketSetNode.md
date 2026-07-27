# com.finbourne.lusid.model.BucketSetNode
One node within a bucket set result: the fund aggregate or a single share class. Both carry NAV and buckets; the  capital ratio is set only on share class nodes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeType** | **String** | The kind of node: the fund aggregate or a single share class. Available values: Fund, Class. | [default to String]
**shareClassShortCode** | **String** | The short code of the share class this node is for, or null for the fund node. | [optional] [default to String]
**nav** | **java.math.BigDecimal** | The net asset value at this node, in the fund currency, or null where it does not apply to the node type. | [optional] [default to java.math.BigDecimal]
**capitalRatio** | **java.math.BigDecimal** | The share class&#39;s capital ratio (its share of the fund NAV), set only on share class nodes. | [optional] [default to java.math.BigDecimal]
**buckets** | [**List&lt;BucketSetResultBucket&gt;**](BucketSetResultBucket.md) | The buckets on this node, each with its period movement and cumulative values. | [default to List<BucketSetResultBucket>]

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


BucketSetNode bucketSetNodeInstance = new BucketSetNode()
    .NodeType(NodeType)
    .ShareClassShortCode(ShareClassShortCode)
    .Nav(Nav)
    .CapitalRatio(CapitalRatio)
    .Buckets(Buckets);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
