# com.finbourne.lusid.model.PaymentInstructionsResponse
The response from upserting a set of Payment Instructions. Each request key from the  incoming map appears in exactly one of Successes or Failed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, PaymentInstruction&gt;**](PaymentInstruction.md) | The Payment Instructions that were created or updated successfully, keyed by the ephemeral request key supplied by the caller. | [optional] [default to Map<String, PaymentInstruction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | Details of the requests that failed, keyed by the ephemeral request key supplied by the caller. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PaymentInstructionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, PaymentInstruction> Successes = new Map<String, PaymentInstruction>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PaymentInstructionsResponse paymentInstructionsResponseInstance = new PaymentInstructionsResponse()
    .Successes(Successes)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
