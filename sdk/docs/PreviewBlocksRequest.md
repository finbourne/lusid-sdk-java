# com.finbourne.lusid.model.PreviewBlocksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orders** | [**List&lt;OrderRequest&gt;**](OrderRequest.md) | The orders to group into blocks. Properties in the Block domain are taken as the block&#39;s properties and form part of the grouping key. | [default to List<OrderRequest>]
**groupingMode** | **String** | How orders are grouped. None: one block per order. SameSide: orders sharing instrument, side, type, time in force, price (for Limit and Stop), basis, date and block properties share a block. CrossSide: as SameSide but ignoring side, so opposing orders may net into one block, provided each portfolio&#39;s net for the instrument has the same sign as the block&#39;s first portfolio. Available values: None, SameSide, CrossSide. | [optional] [default to String]
**blockId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.PreviewBlocksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OrderRequest> Orders = new List<OrderRequest>();
@jakarta.annotation.Nullable String GroupingMode = "example GroupingMode";
ResourceId BlockId = new ResourceId();


PreviewBlocksRequest previewBlocksRequestInstance = new PreviewBlocksRequest()
    .Orders(Orders)
    .GroupingMode(GroupingMode)
    .BlockId(BlockId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
