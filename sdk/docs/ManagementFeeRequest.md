# com.finbourne.lusid.model.ManagementFeeRequest
The request to calculate a period's management fee for the partners of a partnership fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the fee period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the fee period, inclusive. | [default to OffsetDateTime]
**basis** | **String** | The capital base the fee is charged on. Available values: Auto, CommittedCapital, InvestedCapital. Auto charges on committed capital until the investment period ends and on invested capital after. | [optional] [default to String]
**offsets** | [**List&lt;ManagementFeeOffset&gt;**](ManagementFeeOffset.md) | Fee income received by the manager that offsets the management fee. | [optional] [default to List<ManagementFeeOffset>]
**book** | **Boolean** | When true, the net fee per partner is booked. | [optional] [default to Boolean]
**prepaid** | **Boolean** | When true with book, the period&#39;s fee is booked in advance: the fund prepays each partner&#39;s gross fee per component against the fee payable at the period&#39;s start, and the partnership ledger is not charged. Offsets are not prepaid. Fee runs accruing inside the period then charge the fee against the prepayment, up to its balance and at the prepayment&#39;s rate, and any excess against the payable; an offset arising inside the period reduces the payable, and any part of it above the payable is booked as a receivable from the manager. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ManagementFeeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable String Basis = "example Basis";
@jakarta.annotation.Nullable List<ManagementFeeOffset> Offsets = new List<ManagementFeeOffset>();
Boolean Book = true;
Boolean Prepaid = true;


ManagementFeeRequest managementFeeRequestInstance = new ManagementFeeRequest()
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .Basis(Basis)
    .Offsets(Offsets)
    .Book(Book)
    .Prepaid(Prepaid);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
