# com.finbourne.lusid.model.BucketSetResult
A valuation point's results for one bucket set: whether the set is the apportionment set, and its per-node  (fund and share class) buckets and NAV. Allocation-group nodes are not included here - they are surfaced via  the apportionment results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isApportionment** | **Boolean** | Whether this bucket set is the apportionment set (apportioning non-class-specific P&amp;L across share classes). | [default to Boolean]
**nodes** | [**List&lt;BucketSetNode&gt;**](BucketSetNode.md) | The nodes making up the bucket set: the fund aggregate and one per share class. | [default to List<BucketSetNode>]

```java
import com.finbourne.lusid.model.BucketSetResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean IsApportionment = true;
List<BucketSetNode> Nodes = new List<BucketSetNode>();


BucketSetResult bucketSetResultInstance = new BucketSetResult()
    .IsApportionment(IsApportionment)
    .Nodes(Nodes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
