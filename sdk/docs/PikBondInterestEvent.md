# com.finbourne.lusid.model.PikBondInterestEvent
Definition of a PIK Bond Interest Event  This is an event that describes the paid-in-kind portion of a coupon period on a  Payment-in-Kind ComplexBond that is settled by delivering units of another instrument, rather  than in cash or by capitalising the amount into the bond's current face. The interest amount is  converted to units of the deliverable at the delivery price and added to the deliverable's  holding as a new tax lot; the paying bond's own units and current face are unchanged.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the interest | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the securities are delivered | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency in which the interest amount is expressed | [default to String]
**couponPerUnit** | **java.math.BigDecimal** | The interest amount, in cash terms, per unit of the held bond&#39;s current face | [optional] [default to java.math.BigDecimal]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**deliveryPrice** | **java.math.BigDecimal** | The clean price the deliverable is delivered at, as a percentage of its nominal per unit  following bond market convention: 100 is par and 98.5 is a one-and-a-half point discount.  This is not a cash amount per unit. Null is par. It governs how many units the interest  amount buys, not how much face each of those units carries. | [optional] [default to java.math.BigDecimal]
**deliveredContractSize** | **java.math.BigDecimal** | The deliverable&#39;s nominal per unit - its contract size. Null is 1. | [optional] [default to java.math.BigDecimal]
**deliveredCurrentFacePerUnit** | **java.math.BigDecimal** | The current face each delivered unit carries. Null falls back to DeliveredContractSize;  supply it for a seasoned note whose face has already amortised away from its contract size.  When both are absent the delivered lot carries no current face, which is how a deliverable  that is not current-face-based, such as an equity, is expressed. | [optional] [default to java.math.BigDecimal]
**deliveredAccruedPerUnit** | **java.math.BigDecimal** | Interest accrued on the deliverable per delivered unit, settled alongside the clean price  when a seasoned note is delivered mid-period. Null is a fresh issue with nothing accrued. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsRoundingConvention** | **String** | The convention used to round the units entitlement. Defaults to Floor.     Supported string (enumeration) values are: [Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BankerRounding]. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**fractionalUnitsDecimalPlaces** | **Integer** | The number of decimal places to round to when FractionalUnitsRoundingConvention is RoundToDecimalPlaces. | [optional] [default to Integer]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of the units that could not be delivered. Supplying it, together  with FractionalUnitsCashCurrency, is what settles the undelivered fraction in cash; leave  both absent and the fraction is simply not paid. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of the undelivered fraction. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PikBondInterestEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal CouponPerUnit = new java.math.BigDecimal("100.00");
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable java.math.BigDecimal DeliveryPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DeliveredContractSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DeliveredCurrentFacePerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DeliveredAccruedPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsRoundingConvention = "example FractionalUnitsRoundingConvention";
@jakarta.annotation.Nullable Integer FractionalUnitsDecimalPlaces = new Integer("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";


PikBondInterestEvent pikBondInterestEventInstance = new PikBondInterestEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .CouponPerUnit(CouponPerUnit)
    .NewInstrument(NewInstrument)
    .DeliveryPrice(DeliveryPrice)
    .DeliveredContractSize(DeliveredContractSize)
    .DeliveredCurrentFacePerUnit(DeliveredCurrentFacePerUnit)
    .DeliveredAccruedPerUnit(DeliveredAccruedPerUnit)
    .FractionalUnitsRoundingConvention(FractionalUnitsRoundingConvention)
    .FractionalUnitsDecimalPlaces(FractionalUnitsDecimalPlaces)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
