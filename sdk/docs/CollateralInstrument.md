# com.finbourne.lusid.model.CollateralInstrument
Wrapper for one instrument in a larger collateral basket, as part of a repurchase agreement modelled as a FlexibleRepo.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **java.math.BigDecimal** | The amount of the instrument in the basket for this repurchase agreement. | [default to java.math.BigDecimal]
**instrument** | [**MasteredInstrument**](MasteredInstrument.md) |  | [default to MasteredInstrument]
**collateralStartDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date from which the instrument is held as collateral for this repurchase agreement.  Read only: an instrument upsert cannot set or change it. An existing value must be sent back unchanged.  When not set, the instrument is held from the StartDate of the FlexibleRepo. | [optional] [default to OffsetDateTime]
**collateralEndDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the instrument stops being held as collateral for this repurchase agreement.  Read only: an instrument upsert cannot set or change it. An existing value must be sent back unchanged.  When not set, the instrument is held until the MaturityDate of the FlexibleRepo. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CollateralInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
MasteredInstrument Instrument = new MasteredInstrument();
@jakarta.annotation.Nullable OffsetDateTime CollateralStartDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime CollateralEndDate = OffsetDateTime.now();


CollateralInstrument collateralInstrumentInstance = new CollateralInstrument()
    .Units(Units)
    .Instrument(Instrument)
    .CollateralStartDate(CollateralStartDate)
    .CollateralEndDate(CollateralEndDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
