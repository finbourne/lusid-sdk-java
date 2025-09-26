# com.finbourne.lusid.model.ComplianceRunInfoV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** |  | [default to String]
**instigatedBy** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.ComplianceRunInfoV2;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RunId = new ResourceId();
OffsetDateTime InstigatedAt = OffsetDateTime.now();
OffsetDateTime CompletedAt = OffsetDateTime.now();
String Schedule = "example Schedule";
String InstigatedBy = "example InstigatedBy";


ComplianceRunInfoV2 complianceRunInfoV2Instance = new ComplianceRunInfoV2()
    .RunId(RunId)
    .InstigatedAt(InstigatedAt)
    .CompletedAt(CompletedAt)
    .Schedule(Schedule)
    .InstigatedBy(InstigatedBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
