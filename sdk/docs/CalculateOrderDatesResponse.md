# com.finbourne.lusid.model.CalculateOrderDatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TransferAgencyDates&gt;**](TransferAgencyDates.md) | A dictionary of successful date calculations, keyed by the request key. | [optional] [default to Map<String, TransferAgencyDates>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | A dictionary of failed date calculations, keyed by the request key, containing the error details of any failures that occurred during the calculation. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CalculateOrderDatesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, TransferAgencyDates> Successes = new Map<String, TransferAgencyDates>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CalculateOrderDatesResponse calculateOrderDatesResponseInstance = new CalculateOrderDatesResponse()
    .Successes(Successes)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
