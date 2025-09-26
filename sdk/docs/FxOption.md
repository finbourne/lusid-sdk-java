# com.finbourne.lusid.model.FxOption
LUSID representation of an FX Option.  Including Vanilla, American, European, and Digital (Binary) options.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**domAmount** | **java.math.BigDecimal** | The Amount of DomCcy that will be exchanged if the option is exercised.  This amount should be a positive number, with the Call/Put flag used to indicate direction.  The corresponding amount of FgnCcy that will be exchanged is this amount times the strike.  Note there is no rounding performed on this computed value.  This is an optional field, if not set the option ContractSize will default to 1. | [optional] [default to java.math.BigDecimal]
**fgnCcy** | **String** | The foreign currency of the FX. | [default to String]
**fgnAmount** | **java.math.BigDecimal** | For a vanilla FxOption contract, FgnAmount cannot be set.  In case of a digital FxOption (IsPayoffDigital&#x3D;&#x3D;true)  a payoff (if the option is in the money) can be either  in domestic or in foreign currency - for the latter  FgnAmount must be set.  Note: It is invalid to have FgnAmount and DomAmount  at the same time. | [optional] [default to java.math.BigDecimal]
**strike** | **java.math.BigDecimal** | The strike of the option. | [optional] [default to java.math.BigDecimal]
**barriers** | [**List&lt;Barrier&gt;**](Barrier.md) | For a barrier option the list should not be empty. Up to two barriers are supported.  An option cannot be at the same time barrier- and touch-option.  One (or both) of the lists must be empty. | [optional] [default to List<Barrier>]
**exerciseType** | **String** | Type of optionality that is present; European, American.    Supported string (enumeration) values are: [European, American].  Defaults to \&quot;European\&quot; if not set. | [optional] [default to String]
**isCallNotPut** | **Boolean** | True if the option is a call, false if the option is a put. | [default to Boolean]
**isDeliveryNotCash** | **Boolean** | True if the option delivers the FX underlying, False if the option is settled in cash. | [default to Boolean]
**isPayoffDigital** | **Boolean** | By default IsPayoffDigital is false. If IsPayoffDigital&#x3D;true,  the option is &#39;digital&#39;, and the option payoff is 0 or 1 unit of currency,  instead of a vanilla CallPayoff&#x3D;max(spot-strike,0) or PutPayoff&#x3D;max(strike-spot,0). | [optional] [default to Boolean]
**optionMaturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the option. | [default to OffsetDateTime]
**optionSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the option. | [default to OffsetDateTime]
**payoutStyle** | **String** | PayoutStyle for touch options.     For options without touch optionality, payoutStyle should not be set.  For options with touch optionality (where the touches data has been set), payoutStyle must be defined and cannot be None.    Supported string (enumeration) values are: [Deferred, Immediate].  Defaults to \&quot;None\&quot; if not set. | [optional] [default to String]
**premium** | [**Premium**](Premium.md) |  | [optional] [default to Premium]
**touches** | [**List&lt;Touch&gt;**](Touch.md) | For a touch option the list should not be empty. Up to two touches are supported.  An option cannot be at the same time barrier- and touch-option.  One (or both) of the lists must be empty. | [optional] [default to List<Touch>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.FxOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable java.math.BigDecimal DomAmount = new java.math.BigDecimal("100.00");
String FgnCcy = "example FgnCcy";
@jakarta.annotation.Nullable java.math.BigDecimal FgnAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<Barrier> Barriers = new List<Barrier>();
@jakarta.annotation.Nullable String ExerciseType = "example ExerciseType";
Boolean IsCallNotPut = true;
Boolean IsDeliveryNotCash = true;
Boolean IsPayoffDigital = true;
OffsetDateTime OptionMaturityDate = OffsetDateTime.now();
OffsetDateTime OptionSettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String PayoutStyle = "example PayoutStyle";
Premium Premium = new Premium();
@jakarta.annotation.Nullable List<Touch> Touches = new List<Touch>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


FxOption fxOptionInstance = new FxOption()
    .StartDate(StartDate)
    .DomCcy(DomCcy)
    .DomAmount(DomAmount)
    .FgnCcy(FgnCcy)
    .FgnAmount(FgnAmount)
    .Strike(Strike)
    .Barriers(Barriers)
    .ExerciseType(ExerciseType)
    .IsCallNotPut(IsCallNotPut)
    .IsDeliveryNotCash(IsDeliveryNotCash)
    .IsPayoffDigital(IsPayoffDigital)
    .OptionMaturityDate(OptionMaturityDate)
    .OptionSettlementDate(OptionSettlementDate)
    .PayoutStyle(PayoutStyle)
    .Premium(Premium)
    .Touches(Touches)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
