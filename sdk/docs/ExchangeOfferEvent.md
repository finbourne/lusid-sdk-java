# com.finbourne.lusid.model.ExchangeOfferEvent
Exchange Offer Event (EXOF).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**eventSource** | **String** |  | [default to String]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this exchange offer event (CASH).    - The event requires at least one election of any type.    - If ParticipationType is Mandatory, CashOfferElection is not permitted.    - If ParticipationType is MandatoryWithChoices or Voluntary, at most one CashOfferElection may be supplied.    - Exactly one election on the event must be the default, and at most one may be chosen. | [optional] [default to List<CashOfferElection>]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this exchange offer event (SECU).    - The event requires at least one election of any type.    - Any number of SecurityOfferElections may be supplied.    - A NewInstrument is required on the event when this list is non-empty.    - Exactly one election on the event must be the default, and at most one may be chosen.    - If ParticipationType is Mandatory, the event must carry exactly one election in total; if MandatoryWithChoices, at least two. | [optional] [default to List<SecurityOfferElection>]
**mixedLotConstituentsElections** | [**List&lt;MixedLotConstituentsElection&gt;**](MixedLotConstituentsElection.md) | List of possible MixedLotConstituentsElections for this exchange offer event.    - The event requires at least one election of any type.    - Any number of MixedLotConstituentsElections may be supplied, up to a limit of 100 entries.    - Exactly one election on the event must be the default, and at most one may be chosen.    - If ParticipationType is Mandatory, the event must carry exactly one election in total; if MandatoryWithChoices, at least two. | [optional] [default to List<MixedLotConstituentsElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections for this exchange offer event (NOAC).    - The event requires at least one election of any type.    - If ParticipationType is Mandatory, LapseElection is not permitted.    - If ParticipationType is MandatoryWithChoices, any number of LapseElections may be supplied, but none of them may be the default.    - If ParticipationType is Voluntary, at most one LapseElection may be supplied. | [optional] [default to List<LapseElection>]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this exchange offer event (CASE).    - The event requires at least one election of any type.    - Any number of CashAndSecurityOfferElections may be supplied.    - Exactly one election on the event must be the default, and at most one may be chosen.    - If ParticipationType is Mandatory, the event must carry exactly one election in total; if MandatoryWithChoices, at least two. | [optional] [default to List<CashAndSecurityOfferElection>]
**consentAndExchangeElections** | [**List&lt;ConsentAndExchangeElection&gt;**](ConsentAndExchangeElection.md) | List of possible ConsentAndExchangeElections for this exchange offer event (CEXC).    - The event requires at least one election of any type.    - Any number of ConsentAndExchangeElections may be supplied.    - Exactly one election on the event must be the default, and at most one may be chosen.    - If ParticipationType is Mandatory, the event must carry exactly one election in total; if MandatoryWithChoices, at least two. | [optional] [default to List<ConsentAndExchangeElection>]
**abstainElections** | [**List&lt;AbstainElection&gt;**](AbstainElection.md) | List of possible AbstainElections for this exchange offer event (ABST).    - The event requires at least one election of any type.    - Any number of AbstainElections may be supplied.    - Exactly one election on the event must be the default, and at most one may be chosen.    - If ParticipationType is Mandatory, the event must carry exactly one election in total; if MandatoryWithChoices, at least two. | [optional] [default to List<AbstainElection>]
**unknownProceedsElections** | [**List&lt;UnknownProceedsElection&gt;**](UnknownProceedsElection.md) | List of possible UnknownProceedsElections for this exchange offer event (UNKNOWN).    - The event requires at least one election of any type.    - Any number of UnknownProceedsElections may be supplied.    - Exactly one election on the event must be the default, and at most one may be chosen.    - If ParticipationType is Mandatory, the event must carry exactly one election in total; if MandatoryWithChoices, at least two. | [optional] [default to List<UnknownProceedsElection>]
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
@jakarta.annotation.Nullable List<CashAndSecurityOfferElection> CashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@jakarta.annotation.Nullable List<ConsentAndExchangeElection> ConsentAndExchangeElections = new List<ConsentAndExchangeElection>();
@jakarta.annotation.Nullable List<AbstainElection> AbstainElections = new List<AbstainElection>();
@jakarta.annotation.Nullable List<UnknownProceedsElection> UnknownProceedsElections = new List<UnknownProceedsElection>();
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
    .CashAndSecurityOfferElections(CashAndSecurityOfferElections)
    .ConsentAndExchangeElections(ConsentAndExchangeElections)
    .AbstainElections(AbstainElections)
    .UnknownProceedsElections(UnknownProceedsElections)
    .MinPieceSize(MinPieceSize)
    .MinIncrement(MinIncrement)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .FractionalUnitsRoundingConvention(FractionalUnitsRoundingConvention)
    .FractionalUnitsDecimalPlaces(FractionalUnitsDecimalPlaces)
    .InstructionReference(InstructionReference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
