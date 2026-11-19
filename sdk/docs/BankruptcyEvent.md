# com.finbourne.lusid.model.BankruptcyEvent
A Bankruptcy (BRUP) event recording the legal status of a company unable to meet its financial  obligations. With no elections it is a pure informational marker, generating no transactions and  having no position impact. It may also carry a ballot: one CashOfferElection per option that pays  cash, one LapseElection per option that pays nothing, and one MixedLotConstituentsElection per option that  delivers new securities, cash, or both and removes the original position.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the bankruptcy filing or court ruling. | [optional] [default to OffsetDateTime]
**notificationType** | **String** | Notification type: NEWM (new announcement), REPL (replacement/correction), or CANC (proceedings dismissed). Available values: NEWM, REPL, CANC. | [default to String]
**claimFilingDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Date by which creditors must file a proof of claim. Optional — null when not applicable.  If provided, overrides EffectiveDate as the settle date of the resulting virtual transactions. | [optional] [default to OffsetDateTime]
**narrative** | **String** | Free-text detail: court, jurisdiction, trustee, plan reference. Optional. | [optional] [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date of the cash leg. Required when a CashOfferElection is offered, and accepted  but unused otherwise — inbound ballot notifications populate a pay date on pure votes that  settle no cash. | [optional] [default to OffsetDateTime]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | One election per ballot option that pays cash, keyed \&quot;{OptionNumber}-{OptionCode}\&quot;, for  example \&quot;1-CASH\&quot;. Each election&#39;s CashOfferPrice is per eligible unit, not per 1000 of face.  Defaults to an empty list. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | One election per ballot option that pays nothing — consent granted with no fee, consent  denied, abstain, or no action — keyed \&quot;{OptionNumber}-{OptionCode}\&quot;, for example \&quot;6-NOAC\&quot;.  Keys are free-form because a real ballot carries CONY twice and CONN twice. Defaults to an  empty list. | [optional] [default to List<LapseElection>]
**mixedLotConstituentsElections** | [**List&lt;MixedLotConstituentsElection&gt;**](MixedLotConstituentsElection.md) | List of possible mixed lot options for this event, if any. Each election removes the original position  and delivers one or more distinct new securities and/or cash legs of its own, each with its own  settlement date. The event has no event-level NewInstrument: every security constituent carries its own.  Defaults to an empty list. | [optional] [default to List<MixedLotConstituentsElection>]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractional units. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of fractional units. | [optional] [default to String]
**fractionalUnitsRoundingConvention** | **String** | The convention used to round the fractional units entitlement. Defaults to Floor. BuyUp is not supported. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**fractionalUnitsDecimalPlaces** | **Integer** | The number of decimal places to round to when FractionalUnitsRoundingConvention is RoundToDecimalPlaces. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.BankruptcyEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
String NotificationType = "example NotificationType";
@jakarta.annotation.Nullable OffsetDateTime ClaimFilingDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable String Narrative = "example Narrative";
@jakarta.annotation.Nullable OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();
@jakarta.annotation.Nullable List<MixedLotConstituentsElection> MixedLotConstituentsElections = new List<MixedLotConstituentsElection>();
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable String FractionalUnitsRoundingConvention = "example FractionalUnitsRoundingConvention";
@jakarta.annotation.Nullable Integer FractionalUnitsDecimalPlaces = new Integer("100.00");


BankruptcyEvent bankruptcyEventInstance = new BankruptcyEvent()
    .EffectiveDate(EffectiveDate)
    .NotificationType(NotificationType)
    .ClaimFilingDeadline(ClaimFilingDeadline)
    .Narrative(Narrative)
    .PaymentDate(PaymentDate)
    .CashOfferElections(CashOfferElections)
    .LapseElections(LapseElections)
    .MixedLotConstituentsElections(MixedLotConstituentsElections)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .FractionalUnitsRoundingConvention(FractionalUnitsRoundingConvention)
    .FractionalUnitsDecimalPlaces(FractionalUnitsDecimalPlaces);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
