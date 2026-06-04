# com.finbourne.lusid.model.SecurityOfferConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**minPieceSize** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SecurityOfferConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

NewInstrument NewInstrument = new NewInstrument();
UnitsRatio UnitsRatio = new UnitsRatio();
OffsetDateTime SettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal MinPieceSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MinIncrement = new java.math.BigDecimal("100.00");


SecurityOfferConstituent securityOfferConstituentInstance = new SecurityOfferConstituent()
    .NewInstrument(NewInstrument)
    .UnitsRatio(UnitsRatio)
    .SettlementDate(SettlementDate)
    .MinPieceSize(MinPieceSize)
    .MinIncrement(MinIncrement);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
