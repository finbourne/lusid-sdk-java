# com.finbourne.lusid.model.UpsertExternalDealingEstimatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, UpsertExternalDealingEstimateResult&gt;**](UpsertExternalDealingEstimateResult.md) | A dictionary of successfully loaded sets, keyed by the request key. | [optional] [default to Map<String, UpsertExternalDealingEstimateResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of sets that could not be loaded, keyed by the request key, containing error details. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertExternalDealingEstimatesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, UpsertExternalDealingEstimateResult> Successes = new Map<String, UpsertExternalDealingEstimateResult>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertExternalDealingEstimatesResponse upsertExternalDealingEstimatesResponseInstance = new UpsertExternalDealingEstimatesResponse()
    .Successes(Successes)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
