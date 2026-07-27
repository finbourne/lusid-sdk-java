# com.finbourne.lusid.model.IntermediateSecuritiesDistributionEvent
IntermediateSecuritiesDistribution event (RHDI), representing the distribution of securities.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. The date the spin-off is announced. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first date on which the holder of record has entitled ownership of the new shares. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. Date you have to be the holder of record in order to receive the additional shares. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the distribution of shares takes place. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**costFactor** | **java.math.BigDecimal** | Optional. The fraction of cost that is transferred from the existing shares to the new shares. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Optional. Used in calculating cash-in-lieu of fractional shares. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. | [optional] [default to String]
**fractionalUnitsRoundingConvention** | **String** | The convention used to round the fractional units entitlement. Defaults to Floor. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**fractionalUnitsDecimalPlaces** | **Integer** | The number of decimal places to round to when FractionalUnitsRoundingConvention is RoundToDecimalPlaces. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.IntermediateSecuritiesDistributionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
NewInstrument NewInstrument = new NewInstrument();
UnitsRatio UnitsRatio = new UnitsRatio();
@jakarta.annotation.Nullable java.math.BigDecimal CostFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable String FractionalUnitsRoundingConvention = "example FractionalUnitsRoundingConvention";
@jakarta.annotation.Nullable Integer FractionalUnitsDecimalPlaces = new Integer("100.00");


IntermediateSecuritiesDistributionEvent intermediateSecuritiesDistributionEventInstance = new IntermediateSecuritiesDistributionEvent()
    .AnnouncementDate(AnnouncementDate)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .NewInstrument(NewInstrument)
    .UnitsRatio(UnitsRatio)
    .CostFactor(CostFactor)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .FractionalUnitsRoundingConvention(FractionalUnitsRoundingConvention)
    .FractionalUnitsDecimalPlaces(FractionalUnitsDecimalPlaces);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
