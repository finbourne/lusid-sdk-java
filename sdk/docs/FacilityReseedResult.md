# com.finbourne.lusid.model.FacilityReseedResult
The outcome of re-seeding a Facility's balance from the draws and repayments booked on it, or of a dry run of it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**facilityCode** | **String** | The code of the Facility re-seeded. | [default to String]
**currency** | **String** | The currency of the Facility, which every amount in the result is in. | [default to String]
**dryRun** | **Boolean** | Whether this was a dry run, which writes nothing. | [default to Boolean]
**status** | **String** | The outcome. Available values: Reseeded (the balance was written from the booked draws and repayments), Unchanged (the balance already matched them, so nothing was written), WouldReseed (a dry run that would write the balance), Unattributable (a dry run that found draws or repayments naming the Facility on allocation maps whose structureMemberId is not their member fund; a re-seed is refused with 409 FacilityFlowsUnattributable until the maps are fixed). | [default to String]
**drawnBefore** | **java.math.BigDecimal** | What the stored balance had outstanding before the re-seed. Absent when the Facility had no balance. | [optional] [default to java.math.BigDecimal]
**seedVersionBefore** | **Integer** | The seed rule the stored balance was seeded by before the re-seed; 0 for a balance stored before re-seeding existed, which the first draw or repayment on the Facility re-seeds. Absent when the Facility had no balance. | [optional] [default to Integer]
**drawn** | **java.math.BigDecimal** | What the booked draws and repayments have outstanding, including events still in Booking status: the balance the Facility&#39;s limit is judged on. | [default to java.math.BigDecimal]
**movementCount** | **Integer** | How many draws and repayments are booked on the Facility. | [default to Integer]
**bookingInProgress** | [**List&lt;FacilityReseedFlow&gt;**](FacilityReseedFlow.md) | The draws and repayments of events still in Booking status. They count in the balance and the headroom, are left out of both sides of the payable check as in flight, and are reported with a FacilityBookingInProgress warning. | [default to List<FacilityReseedFlow>]
**unattributableFlows** | [**List&lt;FacilityReseedFlow&gt;**](FacilityReseedFlow.md) | The draws and repayments naming the Facility on allocation maps whose structureMemberId is not their member fund: not a fund, or not the fund the map&#39;s fund structure places it on. Only listed by a dry run; empty otherwise. | [default to List<FacilityReseedFlow>]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the balance was written at, or the asAt a dry run or an unchanged re-seed read at. | [default to OffsetDateTime]
**warnings** | [**List&lt;Warning&gt;**](Warning.md) | Warnings about the re-seed: FacilityBookingInProgress, or FacilityPayableBreak when the payable check finds breaks. | [optional] [default to List<Warning>]
**payableCheck** | [**FacilityPayableCheck**](FacilityPayableCheck.md) |  | [default to FacilityPayableCheck]

```java
import com.finbourne.lusid.model.FacilityReseedResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FacilityCode = "example FacilityCode";
String Currency = "example Currency";
Boolean DryRun = true;
String Status = "example Status";
@jakarta.annotation.Nullable java.math.BigDecimal DrawnBefore = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Integer SeedVersionBefore = new Integer("100.00");
java.math.BigDecimal Drawn = new java.math.BigDecimal("100.00");
Integer MovementCount = new Integer("100.00");
List<FacilityReseedFlow> BookingInProgress = new List<FacilityReseedFlow>();
List<FacilityReseedFlow> UnattributableFlows = new List<FacilityReseedFlow>();
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Warning> Warnings = new List<Warning>();
FacilityPayableCheck PayableCheck = new FacilityPayableCheck();


FacilityReseedResult facilityReseedResultInstance = new FacilityReseedResult()
    .FacilityCode(FacilityCode)
    .Currency(Currency)
    .DryRun(DryRun)
    .Status(Status)
    .DrawnBefore(DrawnBefore)
    .SeedVersionBefore(SeedVersionBefore)
    .Drawn(Drawn)
    .MovementCount(MovementCount)
    .BookingInProgress(BookingInProgress)
    .UnattributableFlows(UnattributableFlows)
    .AsAt(AsAt)
    .Warnings(Warnings)
    .PayableCheck(PayableCheck);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
