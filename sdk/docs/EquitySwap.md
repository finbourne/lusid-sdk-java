# com.finbourne.lusid.model.EquitySwap
LUSID representation of an Equity Swap.     This instrument has multiple legs, to see how legs are used in LUSID see [knowledge base article KA-02252](https://support.lusid.com/knowledgebase/article/KA-02252).     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | EquityLeg | Cash flows relating to the performance of the underlying equity. |  | 2 | FundingLeg | The funding leg of the swap. |  | 3 | EquityDividendLeg | Cash flows relating to dividend payments on the underlying equity (optional). |  | 4 | AdditionalPayments | Cash flows relating to any additional payments (optional). |

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the EquitySwap. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**code** | **String** | The code of the underlying. | [default to String]
**equityFlowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**fundingLeg** | [**InstrumentLeg**](InstrumentLeg.md) |  | [default to InstrumentLeg]
**includeDividends** | **Boolean** | Dividend inclusion flag, if true dividends are included in the equity leg (total return). | [default to Boolean]
**initialPrice** | **java.math.BigDecimal** | The initial equity price of the Equity Swap. | [default to java.math.BigDecimal]
**notionalReset** | **Boolean** | Notional reset flag, if true the notional of the funding leg is reset at the start of every  coupon to match the value of the equity leg (equity price at start of coupon times quantity). | [default to Boolean]
**quantity** | **java.math.BigDecimal** | The quantity or number of shares in the Equity Swap. | [default to java.math.BigDecimal]
**underlyingIdentifier** | **String** | External market codes and identifiers for the EquitySwap, e.g. RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode]. | [default to String]
**equitySwapDividendPaymentTiming** | **String** | Determines how the payment of dividends is handled for the equity swap.  Defaults to paying at the next Equity coupon date.     Supported string (enumeration) values are: [PayAtNextEquityCouponDate, PayAtMaturityOfSwap, PayAtNextFundingLegCouponDate, PayAtPaymentDateOfDividendEvent]. | [optional] [default to String]
**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven equity swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. | [optional] [default to List<AdditionalPayment>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.EquitySwap;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String Code = "example Code";
FlowConventions EquityFlowConventions = new FlowConventions();
InstrumentLeg FundingLeg = new InstrumentLeg();
Boolean IncludeDividends = true;
java.math.BigDecimal InitialPrice = new java.math.BigDecimal("100.00");
Boolean NotionalReset = true;
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
String UnderlyingIdentifier = "example UnderlyingIdentifier";
@jakarta.annotation.Nullable String EquitySwapDividendPaymentTiming = "example EquitySwapDividendPaymentTiming";
@jakarta.annotation.Nullable List<AdditionalPayment> AdditionalPayments = new List<AdditionalPayment>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


EquitySwap equitySwapInstance = new EquitySwap()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .Code(Code)
    .EquityFlowConventions(EquityFlowConventions)
    .FundingLeg(FundingLeg)
    .IncludeDividends(IncludeDividends)
    .InitialPrice(InitialPrice)
    .NotionalReset(NotionalReset)
    .Quantity(Quantity)
    .UnderlyingIdentifier(UnderlyingIdentifier)
    .EquitySwapDividendPaymentTiming(EquitySwapDividendPaymentTiming)
    .AdditionalPayments(AdditionalPayments)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
