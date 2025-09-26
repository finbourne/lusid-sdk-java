# com.finbourne.lusid.model.CreateTradeTicketsResponse
Batch trade ticket creation response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;LusidTradeTicket&gt;**](LusidTradeTicket.md) |  | [default to List<LusidTradeTicket>]
**failures** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) |  | [default to List<ErrorDetail>]

```java
import com.finbourne.lusid.model.CreateTradeTicketsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<LusidTradeTicket> Values = new List<LusidTradeTicket>();
List<ErrorDetail> Failures = new List<ErrorDetail>();


CreateTradeTicketsResponse createTradeTicketsResponseInstance = new CreateTradeTicketsResponse()
    .Values(Values)
    .Failures(Failures);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
