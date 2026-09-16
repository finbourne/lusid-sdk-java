# com.finbourne.lusid.model.ReverseStressRung
One evaluated factor and what the portfolio was worth under it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scale** | **java.math.BigDecimal** | The factor the scenario&#39;s shifts were multiplied by. | [optional] [default to java.math.BigDecimal]
**value** | **java.math.BigDecimal** | The value of the measure under the scaled scenario. | [optional] [default to java.math.BigDecimal]
**pnl** | **java.math.BigDecimal** | The change from the unstressed value. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ReverseStressRung;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Scale = new java.math.BigDecimal("100.00");
java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
java.math.BigDecimal Pnl = new java.math.BigDecimal("100.00");


ReverseStressRung reverseStressRungInstance = new ReverseStressRung()
    .Scale(Scale)
    .Value(Value)
    .Pnl(Pnl);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
