# com.finbourne.lusid.model.TaxReturnMemoRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the period, for example the four-digit year. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount, in pounds. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxReturnMemoRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Label = "example Label";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


TaxReturnMemoRow taxReturnMemoRowInstance = new TaxReturnMemoRow()
    .Label(Label)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
