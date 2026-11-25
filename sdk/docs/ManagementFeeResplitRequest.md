# com.finbourne.lusid.model.ManagementFeeResplitRequest
The request to re-split a partnership fund's prepaid management fee periods between the fee payable and the  receivable from the manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the window to re-split, exclusive: every prepaid period whose window meets it is re-split. Defaults to the fund&#39;s earliest prepaid period. | [optional] [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the window to re-split, inclusive. Defaults to the latest prepaid period. | [optional] [default to OffsetDateTime]
**dryRun** | **Boolean** | When true, nothing is written and the response says which prepaid periods&#39; splits are out of date. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ManagementFeeResplitRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime PeriodStart = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PeriodEnd = OffsetDateTime.now();
Boolean DryRun = true;


ManagementFeeResplitRequest managementFeeResplitRequestInstance = new ManagementFeeResplitRequest()
    .PeriodStart(PeriodStart)
    .PeriodEnd(PeriodEnd)
    .DryRun(DryRun);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
