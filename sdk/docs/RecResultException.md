# com.finbourne.lusid.model.RecResultException
The exception lifecycle of a rec result. Present only for exception result types  (Break, PartialMatch, PartialCross); null for Match and Cross.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Whether the exception is Open or Closed. Available values: Open, Closed. | [default to String]
**closureType** | **String** | How the exception was closed. Non-null only when status is Closed. Available values: Cleared, Accepted, ForceMatched. | [optional] [default to String]
**asAtClosed** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt of the transaction that closed the exception. Non-null only when status is Closed. | [optional] [default to OffsetDateTime]
**asAtClosureInvalidated** | [**OffsetDateTime**](OffsetDateTime.md) | First-failure bookmark: the asAt at which a judgement closure&#39;s validity condition first failed against the latest run&#39;s data. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecResultException;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
@jakarta.annotation.Nullable String ClosureType = "example ClosureType";
@jakarta.annotation.Nullable OffsetDateTime AsAtClosed = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAtClosureInvalidated = OffsetDateTime.now();


RecResultException recResultExceptionInstance = new RecResultException()
    .Status(Status)
    .ClosureType(ClosureType)
    .AsAtClosed(AsAtClosed)
    .AsAtClosureInvalidated(AsAtClosureInvalidated);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
