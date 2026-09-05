# com.finbourne.lusid.model.EstimateTransferAgencyOrdersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyOrderEstimateResult&gt;**](TransferAgencyOrderEstimateResult.md) | A dictionary of successfully estimated orders, keyed by the request key. | [optional] [default to Map<String, TransferAgencyOrderEstimateResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed estimates, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.EstimateTransferAgencyOrdersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, TransferAgencyOrderEstimateResult> Successes = new Map<String, TransferAgencyOrderEstimateResult>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


EstimateTransferAgencyOrdersResponse estimateTransferAgencyOrdersResponseInstance = new EstimateTransferAgencyOrdersResponse()
    .Successes(Successes)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
