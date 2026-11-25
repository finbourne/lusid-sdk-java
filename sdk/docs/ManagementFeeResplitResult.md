# com.finbourne.lusid.model.ManagementFeeResplitResult
What a re-split of a partnership fund's prepaid management fee periods found and wrote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**periods** | [**List&lt;ManagementFeePrepaidSplit&gt;**](ManagementFeePrepaidSplit.md) | Every partner line&#39;s prepaid period the re-split read, in date order. | [default to List<ManagementFeePrepaidSplit>]
**writtenTransactionIds** | **List&lt;String&gt;** | The fee transactions the re-split wrote in the fund&#39;s own books, new or replaced. Empty on a dry run, and when no split changed. | [default to List<String>]
**cancelledTransactionIds** | **List&lt;String&gt;** | The fee transactions the re-split cancelled in the fund&#39;s own books. Empty on a dry run, and when no split changed. | [default to List<String>]
**warnings** | **List&lt;String&gt;** | What the re-split noticed but did not refuse, each starting with its code: on a dry run each out of date split (FeePrepaidSplitStale), and a payment to the manager in a currency other than the fee&#39;s (FeePaymentCurrencyIgnored). Absent when there is nothing to warn of. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ManagementFeeResplitResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
List<ManagementFeePrepaidSplit> Periods = new List<ManagementFeePrepaidSplit>();
List<String> WrittenTransactionIds = new List<String>();
List<String> CancelledTransactionIds = new List<String>();
@jakarta.annotation.Nullable List<String> Warnings = new List<String>();


ManagementFeeResplitResult managementFeeResplitResultInstance = new ManagementFeeResplitResult()
    .FundId(FundId)
    .Periods(Periods)
    .WrittenTransactionIds(WrittenTransactionIds)
    .CancelledTransactionIds(CancelledTransactionIds)
    .Warnings(Warnings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
