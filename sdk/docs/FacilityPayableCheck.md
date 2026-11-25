# com.finbourne.lusid.model.FacilityPayableCheck
A Facility's principal balance checked against the facility payable in the Fund's journal, at every date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The outcome. Available values: Agrees (the principal balance equals the payable at every date), Differs (they differ on at least one date, listed in differences, or payable lines name the Facility in another currency, listed in otherCurrencyLines), NotAvailable (the Fund&#39;s journal could not be read; see reason). | [default to String]
**payableAccounts** | **List&lt;String&gt;** | The general ledger accounts the Fund&#39;s posting rules mapped the Facility&#39;s principal lines to. | [default to List<String>]
**balance** | **java.math.BigDecimal** | The Facility&#39;s principal balance after its last movement, events in Booking status left out. | [default to java.math.BigDecimal]
**payable** | **java.math.BigDecimal** | The principal on the facility payable naming the Facility after its last line, the lines of events in Booking status left out. | [default to java.math.BigDecimal]
**differences** | [**List&lt;FacilityPayableDifference&gt;**](FacilityPayableDifference.md) | Every date on which the principal balance and the payable differ, each as it stands at the end of that date. | [default to List<FacilityPayableDifference>]
**inFlightLines** | [**List&lt;FacilityPayableLine&gt;**](FacilityPayableLine.md) | The payable lines of events still in Booking status, left out of the comparison as their movements are. | [default to List<FacilityPayableLine>]
**unexplainedLines** | [**List&lt;FacilityPayableLine&gt;**](FacilityPayableLine.md) | Principal lines naming the Facility that no facility event or allocation event booked, such as hand-keyed principal. They are in the comparison, so they show as differences. | [default to List<FacilityPayableLine>]
**unattributedLines** | [**List&lt;FacilityPayableLine&gt;**](FacilityPayableLine.md) | Principal lines of the Fund that name no Facility, so no Facility&#39;s balance carries them. Listed as breaks; they are not compared. | [default to List<FacilityPayableLine>]
**reason** | **String** | Why the check could not be made, when the status is NotAvailable; or, otherwise, that the Fund&#39;s journal could not be read to the asAt and was read only to the Facility&#39;s last movement, so a payable line after it is not seen. | [optional] [default to String]
**otherCurrencyLines** | [**List&lt;FacilityPayableLine&gt;**](FacilityPayableLine.md) | Principal lines naming the Facility in a currency other than the Facility&#39;s. A Facility is drawn and repaid in its own currency, so they are not converted or compared, and make the status Differs. | [default to List<FacilityPayableLine>]

```java
import com.finbourne.lusid.model.FacilityPayableCheck;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
List<String> PayableAccounts = new List<String>();
java.math.BigDecimal Balance = new java.math.BigDecimal("100.00");
java.math.BigDecimal Payable = new java.math.BigDecimal("100.00");
List<FacilityPayableDifference> Differences = new List<FacilityPayableDifference>();
List<FacilityPayableLine> InFlightLines = new List<FacilityPayableLine>();
List<FacilityPayableLine> UnexplainedLines = new List<FacilityPayableLine>();
List<FacilityPayableLine> UnattributedLines = new List<FacilityPayableLine>();
@jakarta.annotation.Nullable String Reason = "example Reason";
List<FacilityPayableLine> OtherCurrencyLines = new List<FacilityPayableLine>();


FacilityPayableCheck facilityPayableCheckInstance = new FacilityPayableCheck()
    .Status(Status)
    .PayableAccounts(PayableAccounts)
    .Balance(Balance)
    .Payable(Payable)
    .Differences(Differences)
    .InFlightLines(InFlightLines)
    .UnexplainedLines(UnexplainedLines)
    .UnattributedLines(UnattributedLines)
    .Reason(Reason)
    .OtherCurrencyLines(OtherCurrencyLines);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
