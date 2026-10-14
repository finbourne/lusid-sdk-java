# com.finbourne.lusid.model.ProcessingGroupNextScheduledDetails
The next scheduled occurrence of a Processing Group: the next execution date after the requested date,  together with the executed (resolved) contents of the reference list the Processing Group operates over.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextScheduleDate** | [**OffsetDateTime**](OffsetDateTime.md) | The next execution date strictly after the requested date. | [optional] [default to OffsetDateTime]
**resolvedReferenceList** | [**ReferenceList**](ReferenceList.md) |  | [optional] [default to ReferenceList]

```java
import com.finbourne.lusid.model.ProcessingGroupNextScheduledDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime NextScheduleDate = OffsetDateTime.now();
ReferenceList ResolvedReferenceList = new ReferenceList();


ProcessingGroupNextScheduledDetails processingGroupNextScheduledDetailsInstance = new ProcessingGroupNextScheduledDetails()
    .NextScheduleDate(NextScheduleDate)
    .ResolvedReferenceList(ResolvedReferenceList);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
