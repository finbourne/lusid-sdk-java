# com.finbourne.lusid.model.AcceptMarginCallRequest
Accepts a margin call, at its default agreed amount or the amount given.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreedAmount** | **java.math.BigDecimal** | The amount to accept. Optional when the call is matched or within tolerance, when our call or the counterparty&#39;s demand is taken; required when the demand breaks tolerance or has not been recorded. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AcceptMarginCallRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal AgreedAmount = new java.math.BigDecimal("100.00");


AcceptMarginCallRequest acceptMarginCallRequestInstance = new AcceptMarginCallRequest()
    .AgreedAmount(AgreedAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
