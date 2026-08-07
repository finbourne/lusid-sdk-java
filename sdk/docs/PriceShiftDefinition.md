# com.finbourne.lusid.model.PriceShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | **String** | A single instrument identifier this shift applies to. Exactly one of Instrument and Filter  must be supplied. | [optional] [default to String]
**filter** | **String** | A LUSID filter expression over the instrument entity - fields and properties - selecting which  instruments&#39; quotes the shift applies to, e.g.  \&quot;assetClass eq &#39;Bond&#39; and properties[Instrument/Issuer/Name] eq &#39;X&#39;\&quot;.  Exactly one of Instrument and Filter must be supplied. | [optional] [default to String]
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**shiftType** | **String** | Available values: Absolute, Relative, Percentage. | [default to String]
**quoteType** | **String** | Available values: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PriceShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Instrument = "example Instrument";
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String ShiftType = "example ShiftType";
@jakarta.annotation.Nullable String QuoteType = "example QuoteType";


PriceShiftDefinition priceShiftDefinitionInstance = new PriceShiftDefinition()
    .Instrument(Instrument)
    .Filter(Filter)
    .Amount(Amount)
    .ShiftType(ShiftType)
    .QuoteType(QuoteType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
