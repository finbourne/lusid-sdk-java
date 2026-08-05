# com.finbourne.lusid.model.CommodityForward
LUSID representation of an OTC bilateral commodity forward.  The forward settles as a single bullet at MaturityDate. Its present value is  Quantity x Price, where the price is supplied externally pre-netted (the current forward  price minus strike) via the quote store. LUSID calculates no analytics for this instrument, and it  can only be priced by lookup pricing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**strike** | **java.math.BigDecimal** | Agreed forward price at trade inception. Reference only — not used in the market value calculation,  which consumes the pre-netted price from the quote store. | [optional] [default to java.math.BigDecimal]
**deliveryType** | **String** | Whether the forward settles in cash or through physical delivery of the underlying.     Supported string (enumeration) values are: [Cash, Physical]. Available values: Cash, Physical. | [default to String]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]

```java
import com.finbourne.lusid.model.CommodityForward;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
String DeliveryType = "example DeliveryType";
LusidInstrument Underlying = new LusidInstrument();


CommodityForward commodityForwardInstance = new CommodityForward()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .Strike(Strike)
    .DeliveryType(DeliveryType)
    .Underlying(Underlying);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
