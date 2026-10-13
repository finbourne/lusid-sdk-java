# com.finbourne.lusid.model.FacilityCommitmentFeeEvent
The commitment fee accrued on the undrawn limit of a fund-level credit facility for a period, at the  commitment-fee rate on the given day-count basis: undrawn x rate x days / basis. A partnership expense that  is allocated to partners like other fund expenses; it never moves a partner's capital balances.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**facilityId** | **String** | The code of the facility on the fund that the event relates to. | [default to String]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The first day of the accrual period. | [optional] [default to OffsetDateTime]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The last day of the accrual period; the date the fee is booked. | [optional] [default to OffsetDateTime]
**undrawnAmount** | **java.math.BigDecimal** | The undrawn limit the fee accrues on, in the facility currency. Must be positive. | [default to java.math.BigDecimal]
**rate** | **java.math.BigDecimal** | The annual commitment-fee rate of the facility as a decimal fraction, e.g. 0.005 for 50bp. | [default to java.math.BigDecimal]
**dayCountConvention** | **String** | The day-count convention the accrual is calculated on, e.g. Act360, Act365 or Thirty360. | [default to String]
**currency** | **String** | The currency of the facility, in which the amount is denominated. | [default to String]

```java
import com.finbourne.lusid.model.FacilityCommitmentFeeEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FacilityId = "example FacilityId";
OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal UndrawnAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
String DayCountConvention = "example DayCountConvention";
String Currency = "example Currency";


FacilityCommitmentFeeEvent facilityCommitmentFeeEventInstance = new FacilityCommitmentFeeEvent()
    .FacilityId(FacilityId)
    .PeriodStart(PeriodStart)
    .Date(Date)
    .UndrawnAmount(UndrawnAmount)
    .Rate(Rate)
    .DayCountConvention(DayCountConvention)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
