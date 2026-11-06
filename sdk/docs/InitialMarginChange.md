# com.finbourne.lusid.model.InitialMarginChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wePostBefore** | **java.math.BigDecimal** | What we must post to the set today, after the threshold. | [default to java.math.BigDecimal]
**wePostAfter** | **java.math.BigDecimal** | What we would post to the set after the move, after the threshold. | [default to java.math.BigDecimal]
**theyPostBefore** | **java.math.BigDecimal** | What the counterparty must post today. Null where the run does not know it, as under SIMM without their sensitivities. | [optional] [default to java.math.BigDecimal]
**theyPostAfter** | **java.math.BigDecimal** | What the counterparty would post after the move. Null where the run does not know it. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.InitialMarginChange;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal WePostBefore = new java.math.BigDecimal("100.00");
java.math.BigDecimal WePostAfter = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal TheyPostBefore = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal TheyPostAfter = new java.math.BigDecimal("100.00");


InitialMarginChange initialMarginChangeInstance = new InitialMarginChange()
    .WePostBefore(WePostBefore)
    .WePostAfter(WePostAfter)
    .TheyPostBefore(TheyPostBefore)
    .TheyPostAfter(TheyPostAfter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
