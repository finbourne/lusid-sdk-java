# com.finbourne.lusid.model.TransferAgencyOrdersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyOrderResult&gt;**](TransferAgencyOrderResult.md) | A dictionary of successfully processed orders, keyed by the request key. | [optional] [default to Map<String, TransferAgencyOrderResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed order processing attempts, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TransferAgencyOrdersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, TransferAgencyOrderResult> Successes = new Map<String, TransferAgencyOrderResult>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TransferAgencyOrdersResponse transferAgencyOrdersResponseInstance = new TransferAgencyOrdersResponse()
    .Successes(Successes)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
