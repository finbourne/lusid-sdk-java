# com.finbourne.lusid.model.CollateralInstrument
Wrapper for one instrument in a larger collateral basket, as part of a repurchase agreement modelled as a FlexibleRepo.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **java.math.BigDecimal** | The amount of the instrument in the basket for this repurchase agreement. | [default to java.math.BigDecimal]
**instrument** | [**MasteredInstrument**](MasteredInstrument.md) |  | [default to MasteredInstrument]

```java
import com.finbourne.lusid.model.CollateralInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
MasteredInstrument Instrument = new MasteredInstrument();


CollateralInstrument collateralInstrumentInstance = new CollateralInstrument()
    .Units(Units)
    .Instrument(Instrument);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
