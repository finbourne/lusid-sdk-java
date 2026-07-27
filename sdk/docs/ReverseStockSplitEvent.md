# com.finbourne.lusid.model.ReverseStockSplitEvent
A reverse split in the company's shares. Shareholders have their number of shares reduced based on the terms of the stock split.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the stock split takes effect. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first date on which the shares will trade at the post-split price. | [optional] [default to OffsetDateTime]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to have their shares merged. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the reverse stock split was announced. | [optional] [default to OffsetDateTime]
**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of fractionalUnits. | [optional] [default to String]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractionalUnits. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsRoundingConvention** | **String** | The convention used to round the fractional units entitlement. Defaults to Floor. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**fractionalUnitsDecimalPlaces** | **Integer** | The number of decimal places to round to when FractionalUnitsRoundingConvention is RoundToDecimalPlaces. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.ReverseStockSplitEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
UnitsRatio UnitsRatio = new UnitsRatio();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsRoundingConvention = "example FractionalUnitsRoundingConvention";
@jakarta.annotation.Nullable Integer FractionalUnitsDecimalPlaces = new Integer("100.00");


ReverseStockSplitEvent reverseStockSplitEventInstance = new ReverseStockSplitEvent()
    .PaymentDate(PaymentDate)
    .ExDate(ExDate)
    .UnitsRatio(UnitsRatio)
    .RecordDate(RecordDate)
    .AnnouncementDate(AnnouncementDate)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsRoundingConvention(FractionalUnitsRoundingConvention)
    .FractionalUnitsDecimalPlaces(FractionalUnitsDecimalPlaces);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
