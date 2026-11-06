# com.finbourne.lusid.model.CashDistributionFromNonEligibleSecuritiesSalesEvent
Cash distribution from non-eligible securities sales (DRCA). An agent sells the securities that some holders  cannot receive (for example the underlying of a depositary receipt programme) and pays those holders the cash  proceeds. The holder receives one per-unit cash amount on the eligible balance; units and cost do not change.  Mandatory participation only, with exactly one CashElection in one currency at an exchange rate of 1.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the distribution was announced. Optional and informational. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | Exactly one CashElection, with isDeclared, isDefault and isChosen all true, carrying the net cash per unit that settles to the holder after any agent fee. No currency choice, rate breakdown or election-level payment date. | [default to List<CashElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the distribution is not owed to the buying party. The entitlement date and the transaction date. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash proceeds are paid to the holder. The settlement date of the generated transaction. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date positions are struck for entitlement. Required: AMI-SeCo Annex 2 requires a record date for DRCA. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CashDistributionFromNonEligibleSecuritiesSalesEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
List<CashElection> CashElections = new List<CashElection>();
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime RecordDate = OffsetDateTime.now();


CashDistributionFromNonEligibleSecuritiesSalesEvent cashDistributionFromNonEligibleSecuritiesSalesEventInstance = new CashDistributionFromNonEligibleSecuritiesSalesEvent()
    .AnnouncementDate(AnnouncementDate)
    .CashElections(CashElections)
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .RecordDate(RecordDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
