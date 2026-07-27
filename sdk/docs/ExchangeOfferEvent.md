# com.finbourne.lusid.model.ExchangeOfferEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**eventSource** | **String** |  | [default to String]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) |  | [optional] [default to List<CashOfferElection>]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) |  | [optional] [default to List<SecurityOfferElection>]
**mixedLotConstituentsElections** | [**List&lt;MixedLotConstituentsElection&gt;**](MixedLotConstituentsElection.md) |  | [optional] [default to List<MixedLotConstituentsElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) |  | [optional] [default to List<LapseElection>]
**minPieceSize** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** |  | [optional] [default to String]
**fractionalUnitsRoundingConvention** | **String** | The convention used to round the fractional units entitlement. Defaults to Floor. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**fractionalUnitsDecimalPlaces** | **Integer** | The number of decimal places to round to when FractionalUnitsRoundingConvention is RoundToDecimalPlaces. | [optional] [default to Integer]
**instructionReference** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ExchangeOfferEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
OffsetDateTime SettlementDate = OffsetDateTime.now();
String EventSource = "example EventSource";
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
@jakarta.annotation.Nullable List<SecurityOfferElection> SecurityOfferElections = new List<SecurityOfferElection>();
@jakarta.annotation.Nullable List<MixedLotConstituentsElection> MixedLotConstituentsElections = new List<MixedLotConstituentsElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();
@jakarta.annotation.Nullable java.math.BigDecimal MinPieceSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MinIncrement = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable String FractionalUnitsRoundingConvention = "example FractionalUnitsRoundingConvention";
@jakarta.annotation.Nullable Integer FractionalUnitsDecimalPlaces = new Integer("100.00");
@jakarta.annotation.Nullable String InstructionReference = "example InstructionReference";


ExchangeOfferEvent exchangeOfferEventInstance = new ExchangeOfferEvent()
    .EffectiveDate(EffectiveDate)
    .SettlementDate(SettlementDate)
    .EventSource(EventSource)
    .NewInstrument(NewInstrument)
    .CashOfferElections(CashOfferElections)
    .SecurityOfferElections(SecurityOfferElections)
    .MixedLotConstituentsElections(MixedLotConstituentsElections)
    .LapseElections(LapseElections)
    .MinPieceSize(MinPieceSize)
    .MinIncrement(MinIncrement)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .FractionalUnitsRoundingConvention(FractionalUnitsRoundingConvention)
    .FractionalUnitsDecimalPlaces(FractionalUnitsDecimalPlaces)
    .InstructionReference(InstructionReference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
