# com.finbourne.lusid.model.StockSplitEvent
A split in the company's shares. Shareholders are given additional company shares based on the terms of the stock split.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the stock split takes effect. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first date on which the shares will trade at the post-split price. | [optional] [default to OffsetDateTime]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to receive the additional shares. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the stock split was announced. | [optional] [default to OffsetDateTime]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price per unit paid in lieu when fractional units can not be distributed. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of fractional units. | [optional] [default to String]

```java
import com.finbourne.lusid.model.StockSplitEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
UnitsRatio UnitsRatio = new UnitsRatio();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";


StockSplitEvent stockSplitEventInstance = new StockSplitEvent()
    .PaymentDate(PaymentDate)
    .ExDate(ExDate)
    .UnitsRatio(UnitsRatio)
    .RecordDate(RecordDate)
    .AnnouncementDate(AnnouncementDate)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
