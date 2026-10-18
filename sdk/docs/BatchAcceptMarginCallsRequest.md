# com.finbourne.lusid.model.BatchAcceptMarginCallsRequest
Accepts several margin calls at their default agreed amounts, reporting the ones that could not be accepted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calls** | [**List&lt;MarginCallKey&gt;**](MarginCallKey.md) | The calls to accept, each at its default agreed amount. A call that cannot be accepted is reported in failed and does not stop the others. | [default to List<MarginCallKey>]

```java
import com.finbourne.lusid.model.BatchAcceptMarginCallsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<MarginCallKey> Calls = new List<MarginCallKey>();


BatchAcceptMarginCallsRequest batchAcceptMarginCallsRequestInstance = new BatchAcceptMarginCallsRequest()
    .Calls(Calls);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
