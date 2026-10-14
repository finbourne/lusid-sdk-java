# com.finbourne.lusid.model.CarryAccrualLine
One partner's line on a carry accrual.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the amount belongs to. | [default to String]
**previousCarryToDate** | **java.math.BigDecimal** | The cumulative carry already on the books for the partner. | [default to java.math.BigDecimal]
**carryToDate** | **java.math.BigDecimal** | The cumulative carry the partner has earned to the period end. | [default to java.math.BigDecimal]
**delta** | **java.math.BigDecimal** | The accrual booked: the carry to date less what was already on the books. | [default to java.math.BigDecimal]
**clawbackExposure** | **java.math.BigDecimal** | The carry that would have to be returned if the fund liquidated at the period end. | [default to java.math.BigDecimal]
**status** | **String** | What happened to the line. Available values: Unchanged, Accrued, Released. | [default to String]

```java
import com.finbourne.lusid.model.CarryAccrualLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal PreviousCarryToDate = new java.math.BigDecimal("100.00");
java.math.BigDecimal CarryToDate = new java.math.BigDecimal("100.00");
java.math.BigDecimal Delta = new java.math.BigDecimal("100.00");
java.math.BigDecimal ClawbackExposure = new java.math.BigDecimal("100.00");
String Status = "example Status";


CarryAccrualLine carryAccrualLineInstance = new CarryAccrualLine()
    .InvestorRecordId(InvestorRecordId)
    .PreviousCarryToDate(PreviousCarryToDate)
    .CarryToDate(CarryToDate)
    .Delta(Delta)
    .ClawbackExposure(ClawbackExposure)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
