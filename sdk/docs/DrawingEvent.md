# com.finbourne.lusid.model.DrawingEvent
Mandatory partial bond redemption (DRAW) where the issuer lottery-selects specific bonds for early redemption.  The affected face amount (AFFB) is the lottery-selected portion of a holding that is redeemed. Because the  lottery selects per holder, AFFB genuinely differs between portfolios holding the same instrument, so it is  supplied per portfolio via an instrument event instruction rather than on the event itself. The event-level  AffectedAmount remains available as an optional fallback applied uniformly to every holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the cash actually flows for the drawn portion of the holding. | [optional] [default to OffsetDateTime]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Lottery Date (&#x3D; Record Date). Holdings are snapshotted at the close of this date to determine the affected balance. | [optional] [default to OffsetDateTime]
**affectedAmount** | **java.math.BigDecimal** | Affected face amount (AFFB) — the lottery-selected portion of the holding that is redeemed, applied uniformly  to every portfolio holding the instrument. Optional: because the lottery selects per holder, AFFB is normally  supplied per portfolio via an instrument event instruction instead. When supplied it must be strictly positive.  A portfolio with neither an instruction nor an event-level value is treated as unaffected (UNAF). | [optional] [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | Redemption price per unit (OFFR / 100). Clean price convention.  Optional: AFFB is typically known before the issuer publishes OFFR, so a null price is permitted on upsert. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | Settlement currency for the redemption. | [default to String]

```java
import com.finbourne.lusid.model.DrawingEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal AffectedAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PricePerUnit = new java.math.BigDecimal("100.00");
String Currency = "example Currency";


DrawingEvent drawingEventInstance = new DrawingEvent()
    .PaymentDate(PaymentDate)
    .EffectiveDate(EffectiveDate)
    .AffectedAmount(AffectedAmount)
    .PricePerUnit(PricePerUnit)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
