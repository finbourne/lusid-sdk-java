# com.finbourne.lusid.model.RecRunLogEntry
A single run within an instance's run log. All runs share the same effective dates (frozen at  instantiation); each has a different asAt, advanced on re-run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runNumber** | **Integer** | The run number within the instance. Increments with each re-run. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the run happened. | [default to OffsetDateTime]
**supersededAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this run was superseded by a subsequent run. | [optional] [default to OffsetDateTime]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]

```java
import com.finbourne.lusid.model.RecRunLogEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer RunNumber = new Integer("100.00");
OffsetDateTime RunAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SupersededAsAt = OffsetDateTime.now();
RecDatesReconciled DatesReconciled = new RecDatesReconciled();


RecRunLogEntry recRunLogEntryInstance = new RecRunLogEntry()
    .RunNumber(RunNumber)
    .RunAsAt(RunAsAt)
    .SupersededAsAt(SupersededAsAt)
    .DatesReconciled(DatesReconciled);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
