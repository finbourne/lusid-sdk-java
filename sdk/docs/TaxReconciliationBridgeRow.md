# com.finbourne.lusid.model.TaxReconciliationBridgeRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the period, for example the four-digit year. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount, in pounds. | [optional] [default to java.math.BigDecimal]
**runningTotal** | **java.math.BigDecimal** | The running total after this step of the bridge. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxReconciliationBridgeRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Label = "example Label";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal RunningTotal = new java.math.BigDecimal("100.00");


TaxReconciliationBridgeRow taxReconciliationBridgeRowInstance = new TaxReconciliationBridgeRow()
    .Label(Label)
    .Amount(Amount)
    .RunningTotal(RunningTotal);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
