# com.finbourne.lusid.model.RecAgedResult
A summary of a rec result in another instance, as at the stamp that first recorded it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the result within its instance, e.g. &#39;Holding-break-1&#39;. With instanceId, it fully qualifies the result. | [default to String]
**instanceId** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**runNumber** | **Integer** | The result&#39;s latest run as at the stamp that first recorded it. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the result&#39;s latest run as at the stamp that first recorded it. | [default to OffsetDateTime]
**firstRunSeen** | **Integer** | The run in which the result was first assigned its id. | [default to Integer]
**asAtFirstSeen** | [**OffsetDateTime**](OffsetDateTime.md) | The runAsAt of the run in which the result first appeared in its instance, the run numbered firstRunSeen. Written once: re-runs leave it unchanged. | [default to OffsetDateTime]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]
**exceptionStatus** | **String** | The result&#39;s exception status as at the stamp that first recorded it: Open or Closed. Available values: Open, Closed. | [default to String]
**closureType** | **String** | The result&#39;s exception closure type as at the stamp that first recorded it. Null while the exception is open. Available values: Cleared, Accepted, ForceMatched. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecAgedResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
RecInstanceId InstanceId = new RecInstanceId();
Integer RunNumber = new Integer("100.00");
OffsetDateTime RunAsAt = OffsetDateTime.now();
Integer FirstRunSeen = new Integer("100.00");
OffsetDateTime AsAtFirstSeen = OffsetDateTime.now();
RecDatesReconciled DatesReconciled = new RecDatesReconciled();
String ExceptionStatus = "example ExceptionStatus";
@jakarta.annotation.Nullable String ClosureType = "example ClosureType";


RecAgedResult recAgedResultInstance = new RecAgedResult()
    .Id(Id)
    .InstanceId(InstanceId)
    .RunNumber(RunNumber)
    .RunAsAt(RunAsAt)
    .FirstRunSeen(FirstRunSeen)
    .AsAtFirstSeen(AsAtFirstSeen)
    .DatesReconciled(DatesReconciled)
    .ExceptionStatus(ExceptionStatus)
    .ClosureType(ClosureType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
