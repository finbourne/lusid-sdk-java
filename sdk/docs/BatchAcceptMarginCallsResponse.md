# com.finbourne.lusid.model.BatchAcceptMarginCallsResponse
The outcome of accepting several margin calls: those accepted, and those refused with the reason.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;MarginCall&gt;**](MarginCall.md) | The calls that were accepted. | [default to List<MarginCall>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The calls that could not be accepted, keyed by call id, with the reason. | [default to Map<String, ErrorDetail>]

```java
import com.finbourne.lusid.model.BatchAcceptMarginCallsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<MarginCall> Values = new List<MarginCall>();
Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();


BatchAcceptMarginCallsResponse batchAcceptMarginCallsResponseInstance = new BatchAcceptMarginCallsResponse()
    .Values(Values)
    .Failed(Failed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
