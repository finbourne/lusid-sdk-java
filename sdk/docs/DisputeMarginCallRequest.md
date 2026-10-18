# com.finbourne.lusid.model.DisputeMarginCallRequest
Disputes a margin call: moves the agreed amount now and leaves the rest of the demand in dispute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreedAmount** | **java.math.BigDecimal** | The amount to move now; the rest of the counterparty&#39;s demand is left in dispute. | [default to java.math.BigDecimal]
**reason** | **String** | Why the call is disputed. | [default to String]
**owner** | **String** | Who owns the dispute. Defaults to the caller if not specified. | [optional] [default to String]

```java
import com.finbourne.lusid.model.DisputeMarginCallRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal AgreedAmount = new java.math.BigDecimal("100.00");
String Reason = "example Reason";
@jakarta.annotation.Nullable String Owner = "example Owner";


DisputeMarginCallRequest disputeMarginCallRequestInstance = new DisputeMarginCallRequest()
    .AgreedAmount(AgreedAmount)
    .Reason(Reason)
    .Owner(Owner);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
