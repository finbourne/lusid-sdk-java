# com.finbourne.lusid.model.AllocationReceivablesAgeing
What each investor still owes on a booked capital call as of a date, and how late it is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOf** | [**OffsetDateTime**](OffsetDateTime.md) | The date the receivables are aged as of. | [optional] [default to OffsetDateTime]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was due. | [optional] [default to OffsetDateTime]
**outstanding** | **java.math.BigDecimal** | The total still owed across all investor records. | [optional] [default to java.math.BigDecimal]
**receivables** | [**List&lt;AllocationReceivable&gt;**](AllocationReceivable.md) | One entry per investor record that was called. | [optional] [default to List<AllocationReceivable>]

```java
import com.finbourne.lusid.model.AllocationReceivablesAgeing;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsOf = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime DueDate = OffsetDateTime.now();
java.math.BigDecimal Outstanding = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<AllocationReceivable> Receivables = new List<AllocationReceivable>();


AllocationReceivablesAgeing allocationReceivablesAgeingInstance = new AllocationReceivablesAgeing()
    .AsOf(AsOf)
    .DueDate(DueDate)
    .Outstanding(Outstanding)
    .Receivables(Receivables);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
