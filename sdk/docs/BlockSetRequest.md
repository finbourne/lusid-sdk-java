# com.finbourne.lusid.model.BlockSetRequest
A request to create or update multiple Blocks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;BlockRequest&gt;**](BlockRequest.md) | A collection of BlockRequests. | [optional] [default to List<BlockRequest>]

```java
import com.finbourne.lusid.model.BlockSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<BlockRequest> Requests = new List<BlockRequest>();


BlockSetRequest blockSetRequestInstance = new BlockSetRequest()
    .Requests(Requests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
