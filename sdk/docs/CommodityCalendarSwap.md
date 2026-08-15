# com.finbourne.lusid.model.CommodityCalendarSwap
LUSID representation of an OTC bilateral commodity calendar swap.  The swap is a strip of periodic commodity forwards struck at a single strike, cash-settled at each  period end against a calendar-average commodity price, with the position amortising as each period  settles. Its present value is Quantity x Price, where the price is supplied externally pre-netted  (the calendar average minus strike) via the quote store. LUSID calculates no analytics for this  instrument, and it can only be priced by lookup pricing. The periodic settlement schedule is  currently stored and validated only; only the maturity lifecycle event is generated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**strike** | **java.math.BigDecimal** | Agreed price per unit at trade inception. Reference only - not used in the market value  calculation, which consumes the pre-netted price from the quote store. | [optional] [default to java.math.BigDecimal]
**commodityCalendarSchedule** | [**CommodityCalendarSchedule**](CommodityCalendarSchedule.md) |  | [default to CommodityCalendarSchedule]
**deliveryType** | **String** | Whether the swap settles in cash or through physical delivery of the underlying.  Only cash settlement is supported.     Supported string (enumeration) values are: [Cash, Physical]. Available values: Cash, Physical. | [default to String]
**quantityPerPeriod** | **java.math.BigDecimal** | The notional commodity quantity referenced by each settlement period. The initial holding is  this quantity multiplied by the number of periods, stepping down by this quantity as each  period settles. | [default to java.math.BigDecimal]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]

```java
import com.finbourne.lusid.model.CommodityCalendarSwap;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
CommodityCalendarSchedule CommodityCalendarSchedule = new CommodityCalendarSchedule();
String DeliveryType = "example DeliveryType";
java.math.BigDecimal QuantityPerPeriod = new java.math.BigDecimal("100.00");
LusidInstrument Underlying = new LusidInstrument();


CommodityCalendarSwap commodityCalendarSwapInstance = new CommodityCalendarSwap()
    .DomCcy(DomCcy)
    .Strike(Strike)
    .CommodityCalendarSchedule(CommodityCalendarSchedule)
    .DeliveryType(DeliveryType)
    .QuantityPerPeriod(QuantityPerPeriod)
    .Underlying(Underlying);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
