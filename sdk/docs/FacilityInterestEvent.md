# com.finbourne.lusid.model.FacilityInterestEvent
Interest accrued on the drawn balance of a fund-level credit facility for a period, at the facility rate  on the given day-count basis: outstanding x rate x days / basis. A partnership expense that is allocated  to partners like other fund expenses; it never moves a partner's capital balances.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**facilityId** | **String** | The code of the facility on the fund that the event relates to. | [default to String]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The first day of the accrual period. | [optional] [default to OffsetDateTime]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The last day of the accrual period; the date the interest is booked. | [optional] [default to OffsetDateTime]
**outstanding** | **java.math.BigDecimal** | The drawn balance the interest accrues on, in the facility currency. Must be positive. | [default to java.math.BigDecimal]
**rate** | **java.math.BigDecimal** | The annual interest rate of the facility (reference rate plus margin) as a decimal fraction, e.g. 0.06 for 6%. | [default to java.math.BigDecimal]
**dayCountConvention** | **String** | The day-count convention the accrual is calculated on, e.g. Act360, Act365 or Thirty360. | [default to String]
**currency** | **String** | The currency of the facility, in which the amount is denominated. | [default to String]

```java
import com.finbourne.lusid.model.FacilityInterestEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FacilityId = "example FacilityId";
OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Outstanding = new java.math.BigDecimal("100.00");
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
String DayCountConvention = "example DayCountConvention";
String Currency = "example Currency";


FacilityInterestEvent facilityInterestEventInstance = new FacilityInterestEvent()
    .FacilityId(FacilityId)
    .PeriodStart(PeriodStart)
    .Date(Date)
    .Outstanding(Outstanding)
    .Rate(Rate)
    .DayCountConvention(DayCountConvention)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
