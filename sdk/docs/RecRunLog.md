# com.finbourne.lusid.model.RecRunLog
One rec type's run history within a rec instance: its most recent runs, and the total number of runs those  were taken from.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runCount** | **Integer** | The total number of runs of this rec type, which is not necessarily the number returned. A value greater than ten means runs has been truncated; the runs beyond it remain retrievable from previousRuns on the rec type&#39;s result set. | [default to Integer]
**runs** | [**List&lt;RecRunLogEntry&gt;**](RecRunLogEntry.md) | The ten most recent runs of this rec type, ordered by run number descending, so the current run is always the first entry. Exactly one entry has a null supersededAsAt. | [default to List<RecRunLogEntry>]

```java
import com.finbourne.lusid.model.RecRunLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer RunCount = new Integer("100.00");
List<RecRunLogEntry> Runs = new List<RecRunLogEntry>();


RecRunLog recRunLogInstance = new RecRunLog()
    .RunCount(RunCount)
    .Runs(Runs);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
