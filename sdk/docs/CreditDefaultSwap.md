# com.finbourne.lusid.model.CreditDefaultSwap
LUSID representation of a Credit Default Swap (CDS).     This instrument has multiple legs, to see how legs are used in LUSID see [knowledge base article KA-02252](https://support.lusid.com/knowledgebase/article/KA-02252).     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | ProtectionLeg | Cash flows occurring in the case of default. |  | 2 | PremiumLeg | The premium payments made by the protection buyer. |  | 3 | AdditionalPayments | Cash flows relating to any additional payments (optional). |

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticker** | **String** | A ticker to uniquely specify the entity against which the CDS is written. Defaults to \&quot;DefaultCDSTicker\&quot;. | [optional] [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**flowConventions** | [**CdsFlowConventions**](CdsFlowConventions.md) |  | [optional] [default to CdsFlowConventions]
**couponRate** | **java.math.BigDecimal** | The coupon rate paid on each payment date of the premium leg as a fraction of 100 percent, e.g. \&quot;0.05\&quot; meaning 500 basis points or 5%.  For a standard corporate CDS (North American) this must be either 100bps or 500bps. | [default to java.math.BigDecimal]
**conventionName** | [**FlowConventionName**](FlowConventionName.md) |  | [optional] [default to FlowConventionName]
**notional** | **java.math.BigDecimal** | The notional protected by the Credit Default Swap | [optional] [default to java.math.BigDecimal]
**protectionDetailSpecification** | [**CdsProtectionDetailSpecification**](CdsProtectionDetailSpecification.md) |  | [optional] [default to CdsProtectionDetailSpecification]
**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. | [optional] [default to List<AdditionalPayment>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.CreditDefaultSwap;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Ticker = "example Ticker";
OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
CdsFlowConventions FlowConventions = new CdsFlowConventions();
java.math.BigDecimal CouponRate = new java.math.BigDecimal("100.00");
FlowConventionName ConventionName = new FlowConventionName();
@jakarta.annotation.Nullable java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
CdsProtectionDetailSpecification ProtectionDetailSpecification = new CdsProtectionDetailSpecification();
@jakarta.annotation.Nullable List<AdditionalPayment> AdditionalPayments = new List<AdditionalPayment>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


CreditDefaultSwap creditDefaultSwapInstance = new CreditDefaultSwap()
    .Ticker(Ticker)
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .FlowConventions(FlowConventions)
    .CouponRate(CouponRate)
    .ConventionName(ConventionName)
    .Notional(Notional)
    .ProtectionDetailSpecification(ProtectionDetailSpecification)
    .AdditionalPayments(AdditionalPayments)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
