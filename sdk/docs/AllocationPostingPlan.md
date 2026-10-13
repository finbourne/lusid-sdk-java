# com.finbourne.lusid.model.AllocationPostingPlan
Everything booking an Allocation Event writes, in write order: the investors' lines, the roll-ups above them and  the fund side. Returned by a dry run, so a caller sees exactly what a booking would post before it does.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lpSide** | [**List&lt;AllocationPostingLpLine&gt;**](AllocationPostingLpLine.md) | The instrument events written on each investor&#39;s commitment line, one per component. | [optional] [default to List<AllocationPostingLpLine>]
**rollUps** | [**List&lt;AllocationPostingRollUp&gt;**](AllocationPostingRollUp.md) | The roll-ups written on each vehicle&#39;s line on the register above it, summing the lines beneath. | [optional] [default to List<AllocationPostingRollUp>]
**fundSide** | [**List&lt;AllocationPostingFundLine&gt;**](AllocationPostingFundLine.md) | The transactions written on the fund&#39;s own books. | [optional] [default to List<AllocationPostingFundLine>]
**counts** | [**AllocationPostingCounts**](AllocationPostingCounts.md) |  | [optional] [default to AllocationPostingCounts]
**warnings** | [**List&lt;AllocationEventBookingWarning&gt;**](AllocationEventBookingWarning.md) | The validation rules the booking would be allowed to proceed through under the map&#39;s policy. | [optional] [default to List<AllocationEventBookingWarning>]

```java
import com.finbourne.lusid.model.AllocationPostingPlan;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<AllocationPostingLpLine> LpSide = new List<AllocationPostingLpLine>();
@jakarta.annotation.Nullable List<AllocationPostingRollUp> RollUps = new List<AllocationPostingRollUp>();
@jakarta.annotation.Nullable List<AllocationPostingFundLine> FundSide = new List<AllocationPostingFundLine>();
AllocationPostingCounts Counts = new AllocationPostingCounts();
@jakarta.annotation.Nullable List<AllocationEventBookingWarning> Warnings = new List<AllocationEventBookingWarning>();


AllocationPostingPlan allocationPostingPlanInstance = new AllocationPostingPlan()
    .LpSide(LpSide)
    .RollUps(RollUps)
    .FundSide(FundSide)
    .Counts(Counts)
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
