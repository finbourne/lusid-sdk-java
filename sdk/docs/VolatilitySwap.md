# com.finbourne.lusid.model.VolatilitySwap
LUSID representation of an OTC variance or volatility swap. A single-leg, bullet instrument with no  schedule, no interim cashflows and no accrual. Its market value is supplied by lookup pricing as  Quantity x Notional x Price / PriceDenominator, where the unit price arrives via the quote store  already netted against the strike. The variance/volatility distinction is expressed purely through the  scalar (1 for volatility swaps, 100 for variance swaps) and instrument  properties; it is not a first-class field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument, in which the looked-up price and market value are  denominated. Quotes supplied in a minor unit of this currency (e.g. GBp) are re-denominated  to it by the lookup pricer. | [default to String]
**strike** | **java.math.BigDecimal** | The variance or volatility strike agreed at trade date, stored for reference only.  Not used in valuation or close-out. | [optional] [default to java.math.BigDecimal]
**notional** | **java.math.BigDecimal** | The agreed notional for the swap. The sign conveys direction (a negative notional held long  produces a negative market value). | [default to java.math.BigDecimal]
**priceDenominator** | **Integer** | Scalar divisor applied in the market value calculation:  MktVal &#x3D; Quantity x Notional x Price / PriceDenominator.  1 for volatility swaps (VOLS) and 100 for variance swaps (VARS). Must be positive. | [default to Integer]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**underlying** | **String** | Free-text reference label identifying the underlying index or asset (e.g. &#39;SPX&#39;, &#39;SX5E&#39;, &#39;KOSPI2&#39;).  Reference only; not used in valuation. | [optional] [default to String]

```java
import com.finbourne.lusid.model.VolatilitySwap;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
Integer PriceDenominator = new Integer("100.00");
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
@jakarta.annotation.Nullable String Underlying = "example Underlying";


VolatilitySwap volatilitySwapInstance = new VolatilitySwap()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .Strike(Strike)
    .Notional(Notional)
    .PriceDenominator(PriceDenominator)
    .TimeZoneConventions(TimeZoneConventions)
    .Underlying(Underlying);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
