# com.finbourne.lusid.model.ManagementFeePrepaidSplit
One partner line's prepaid management fee period, as a re-split found it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prepaidRunId** | **String** | The fee run that prepaid the period. | [default to String]
**investorRecordId** | **String** | The investor record the fee belongs to. | [default to String]
**commitmentLineId** | **String** | The partner&#39;s register line. | [default to String]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the prepaid period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the prepaid period, inclusive. | [default to OffsetDateTime]
**wasStale** | **Boolean** | Whether the split the fund&#39;s books held between the fee payable and the receivable from the manager was out of date: deriving it again from the prepayment, the accruals and the payments to the manager changed it. | [default to Boolean]
**isCurrent** | **Boolean** | Whether the split the fund&#39;s books now hold is the one derived from the period&#39;s prepayment, accruals and payments to the manager. False only on a dry run over an out of date split. | [default to Boolean]
**paymentTransactionIds** | **List&lt;String&gt;** | The payments to the manager in the period booked or amended since its split was last derived. A cancelled payment cannot be named. | [default to List<String>]

```java
import com.finbourne.lusid.model.ManagementFeePrepaidSplit;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PrepaidRunId = "example PrepaidRunId";
String InvestorRecordId = "example InvestorRecordId";
String CommitmentLineId = "example CommitmentLineId";
OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
Boolean WasStale = true;
Boolean IsCurrent = true;
List<String> PaymentTransactionIds = new List<String>();


ManagementFeePrepaidSplit managementFeePrepaidSplitInstance = new ManagementFeePrepaidSplit()
    .PrepaidRunId(PrepaidRunId)
    .InvestorRecordId(InvestorRecordId)
    .CommitmentLineId(CommitmentLineId)
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .WasStale(WasStale)
    .IsCurrent(IsCurrent)
    .PaymentTransactionIds(PaymentTransactionIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
