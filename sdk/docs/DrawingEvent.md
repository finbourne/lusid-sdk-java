# com.finbourne.lusid.model.DrawingEvent
Mandatory partial bond redemption (DRAW) where the issuer lottery-selects specific bonds for early redemption.  The affected face amount (AFFB) is pre-determined externally from the vendor notification and supplied on the event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the cash actually flows for the drawn portion of the holding. | [optional] [default to OffsetDateTime]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Lottery Date (&#x3D; Record Date). Holdings are snapshotted at the close of this date to determine the affected balance. | [optional] [default to OffsetDateTime]
**affectedAmount** | **java.math.BigDecimal** | Affected face amount (AFFB) — the lottery-selected portion of the holding that is redeemed. Must be strictly positive. | [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | Redemption price per unit (OFFR / 100). Clean price convention.  Optional: AFFB is typically known before the issuer publishes OFFR, so a null price is permitted on upsert. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | Settlement currency for the redemption. | [default to String]

```java
import com.finbourne.lusid.model.DrawingEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime EffectiveDate = OffsetDateTime.now();
java.math.BigDecimal AffectedAmount = new java.math.BigDecimal("100.00");
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
