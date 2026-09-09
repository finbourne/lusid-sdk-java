# com.finbourne.lusid.model.VolSurfaceShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | **String** | The market-data descriptor of the surfaces to shift, not an instrument identifier such as a LUID.  For an equity vol surface this is the underlier code the surface was mastered against (e.g. &#39;TSLA&#39;  for market asset &#39;TSLA/USD/LN&#39;); for an interest rate vol surface it is the currency (e.g. &#39;USD&#39;);  for an FX vol surface it is the currency pair (e.g. &#39;GBP/USD&#39;). The wildcard &#39;EquityVol.*&#39; widens  the shift to every equity vol surface in the valuation; interest rate and FX vol surfaces cannot  be widened, since neither a currency nor a currency pair names a set of instruments. | [default to String]
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**strike** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**expiry** | **String** | The expiry of the surface points the shift applies to, resolved against the valuation  date. A whole number of units, in any case: BD (business day), D, W, M, Q or Qtr, SA  (semi-annual), Y or A - for example \&quot;1BD\&quot;, \&quot;3m\&quot;, \&quot;6M\&quot;, \&quot;1Qtr\&quot;, \&quot;5y\&quot;. Omitted, every  expiry on the surface is shifted. | [optional] [default to String]
**shiftType** | **String** | Available values: Absolute, Relative. | [default to String]

```java
import com.finbourne.lusid.model.VolSurfaceShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Instrument = "example Instrument";
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Expiry = "example Expiry";
String ShiftType = "example ShiftType";


VolSurfaceShiftDefinition volSurfaceShiftDefinitionInstance = new VolSurfaceShiftDefinition()
    .Instrument(Instrument)
    .Amount(Amount)
    .Strike(Strike)
    .Expiry(Expiry)
    .ShiftType(ShiftType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
