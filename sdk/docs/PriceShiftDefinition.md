# com.finbourne.lusid.model.PriceShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**shiftType** | **String** | Available values: Absolute, Relative, Percentage. | [default to String]
**quoteType** | **String** | Available values: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PriceShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Instrument = "example Instrument";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String ShiftType = "example ShiftType";
@jakarta.annotation.Nullable String QuoteType = "example QuoteType";


PriceShiftDefinition priceShiftDefinitionInstance = new PriceShiftDefinition()
    .Instrument(Instrument)
    .Amount(Amount)
    .ShiftType(ShiftType)
    .QuoteType(QuoteType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
