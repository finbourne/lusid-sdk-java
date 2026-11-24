# com.finbourne.lusid.model.IncreaseInValueEvent
Increase in Value Event (INCR) — an increase in the face value of a single security, with the number of  securities in circulation unchanged. No cash is paid. The data on the event chooses its shape: with no new  instrument and no units ratio only the par value changes and nothing is booked; with a new instrument at  1 for 1 the holding moves to the new ISIN like for like; with a new instrument and a units ratio above  1 for 1 the holding is split onto the new ISIN.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the new par value applies. Required when only the par value changes; optional otherwise. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the increase in value was announced. | [optional] [default to OffsetDateTime]
**previousParValue** | **java.math.BigDecimal** | The par value per share before the event. Recorded only: it books nothing and writes no property. | [optional] [default to java.math.BigDecimal]
**newParValue** | **java.math.BigDecimal** | The par value per share after the event. Recorded only: it books nothing and writes no property. | [optional] [default to java.math.BigDecimal]
**parValueCurrency** | **String** | The currency of both par values. | [optional] [default to String]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement date where the holding moves to a new instrument at 1 for 1, when it is required.  Optional where the units ratio is above 1 for 1. Must be null when only the par value changes. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement date where the units ratio is above 1 for 1, when it is required. Must be null otherwise. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the holder receives the units. Required with a units ratio; must be null when only the par  value changes. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [optional] [default to UnitsRatio]
**parValuePropertyKey** | **String** | The key of the instrument property that holds the par value, for example Instrument/Ops/ParValue. It is  left out of the copy of the old instrument&#39;s properties, so the new instrument keeps its own value.  Required where the holding moves to a new instrument at 1 for 1; must be null otherwise. | [optional] [default to String]
**carryRelationships** | **String** | Whether, and in which direction, the old instrument&#39;s relationships are carried onto the new instrument  at 1 for 1: None, Outward or Both. When not supplied, the outward relationships are carried. Must be  null in every other shape. Available values: None, Outward, Both. | [optional] [default to String]

```java
import com.finbourne.lusid.model.IncreaseInValueEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal PreviousParValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NewParValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ParValueCurrency = "example ParValueCurrency";
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PaymentDate = OffsetDateTime.now();
NewInstrument NewInstrument = new NewInstrument();
UnitsRatio UnitsRatio = new UnitsRatio();
@jakarta.annotation.Nullable String ParValuePropertyKey = "example ParValuePropertyKey";
@jakarta.annotation.Nullable String CarryRelationships = "example CarryRelationships";


IncreaseInValueEvent increaseInValueEventInstance = new IncreaseInValueEvent()
    .EffectiveDate(EffectiveDate)
    .AnnouncementDate(AnnouncementDate)
    .PreviousParValue(PreviousParValue)
    .NewParValue(NewParValue)
    .ParValueCurrency(ParValueCurrency)
    .RecordDate(RecordDate)
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .NewInstrument(NewInstrument)
    .UnitsRatio(UnitsRatio)
    .ParValuePropertyKey(ParValuePropertyKey)
    .CarryRelationships(CarryRelationships);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
