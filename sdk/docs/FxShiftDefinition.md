# com.finbourne.lusid.model.FxShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyPair** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**shiftType** | **String** | Available values: Absolute, Relative, Percentage. | [default to String]

```java
import com.finbourne.lusid.model.FxShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CurrencyPair = "example CurrencyPair";
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String ShiftType = "example ShiftType";


FxShiftDefinition fxShiftDefinitionInstance = new FxShiftDefinition()
    .CurrencyPair(CurrencyPair)
    .Amount(Amount)
    .ShiftType(ShiftType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
