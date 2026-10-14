# com.finbourne.lusid.model.ManagementFeeResult
The outcome of a management fee calculation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the fee period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the fee period, inclusive. | [default to OffsetDateTime]
**basis** | **String** | The capital base the fee is charged on. Available values: Auto, CommittedCapital, InvestedCapital. Auto charges on committed capital until the investment period ends and on invested capital after. | [default to String]
**lines** | [**List&lt;ManagementFeeLine&gt;**](ManagementFeeLine.md) | The fee per partner. | [default to List<ManagementFeeLine>]
**totals** | [**ManagementFeeTotals**](ManagementFeeTotals.md) |  | [default to ManagementFeeTotals]
**bookedTransactionIds** | **List&lt;String&gt;** | The identifiers of the transactions booked, if any. | [default to List<String>]

```java
import com.finbourne.lusid.model.ManagementFeeResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
OffsetDateTime PeriodStart = OffsetDateTime.now();
OffsetDateTime PeriodEnd = OffsetDateTime.now();
String Basis = "example Basis";
List<ManagementFeeLine> Lines = new List<ManagementFeeLine>();
ManagementFeeTotals Totals = new ManagementFeeTotals();
List<String> BookedTransactionIds = new List<String>();


ManagementFeeResult managementFeeResultInstance = new ManagementFeeResult()
    .FundId(FundId)
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .Basis(Basis)
    .Lines(Lines)
    .Totals(Totals)
    .BookedTransactionIds(BookedTransactionIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
