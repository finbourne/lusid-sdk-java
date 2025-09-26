# com.finbourne.lusid.model.InterestRateSwap
LUSID representation of an Interest Rate Swap, including:     generate justfile test_sdk Vanilla (single currency fixed-float non-amortising)   generate justfile test_sdk CrossCurrency (>1 currency is used by the swap legs)   generate justfile test_sdk Basis (single currency, floating-floating legs of different tenors)   generate justfile test_sdk Amortising (the swap has 1+ leg with amortised notional)     This instrument has multiple legs, to see how legs are used in LUSID see [knowledge base article KA-02252](https://support.lusid.com/knowledgebase/article/KA-02252).     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | Pay/Receive | Cash flows representing the pay/receive leg. |  | 2 | Receive/Pay | Cash flows representing the receive/pay leg. |  | 3 | AdditionalPayments | Cash flows relating to any additional payments (optional). |

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**isNonDeliverable** | **Boolean** | Is the contract an IRS of \&quot;Non-Deliverable\&quot; type, meaning a single payment in the settlement currency based on the difference between  the fixed and floating rates.  Defaults to false if not set. | [optional] [default to Boolean]
**legs** | [**List&lt;InstrumentLeg&gt;**](InstrumentLeg.md) | The set of instrument legs that define the swap instrument, these should be FloatingLeg or FixedLeg. | [default to List<InstrumentLeg>]
**settlementCcy** | **String** | Settlement currency if IRS is non-deliverable. | [optional] [default to String]
**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven fixed-floating swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. | [optional] [default to List<AdditionalPayment>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.InterestRateSwap;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
Boolean IsNonDeliverable = true;
List<InstrumentLeg> Legs = new List<InstrumentLeg>();
@jakarta.annotation.Nullable String SettlementCcy = "example SettlementCcy";
@jakarta.annotation.Nullable List<AdditionalPayment> AdditionalPayments = new List<AdditionalPayment>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


InterestRateSwap interestRateSwapInstance = new InterestRateSwap()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .IsNonDeliverable(IsNonDeliverable)
    .Legs(Legs)
    .SettlementCcy(SettlementCcy)
    .AdditionalPayments(AdditionalPayments)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
