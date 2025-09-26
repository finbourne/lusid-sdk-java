# com.finbourne.lusid.model.MoveOrdersToDifferentBlocksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;BlockAndOrderIdRequest&gt;**](BlockAndOrderIdRequest.md) | A collection of BlockAndOrderId. | [default to List<BlockAndOrderIdRequest>]

```java
import com.finbourne.lusid.model.MoveOrdersToDifferentBlocksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<BlockAndOrderIdRequest> Requests = new List<BlockAndOrderIdRequest>();


MoveOrdersToDifferentBlocksRequest moveOrdersToDifferentBlocksRequestInstance = new MoveOrdersToDifferentBlocksRequest()
    .Requests(Requests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
