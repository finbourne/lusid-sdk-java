# com.finbourne.lusid.model.ComplianceRunInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The unique identifier of a compliance run | [default to String]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time the compliance run was launched (e.g. button pressed). Currently it is also both the as at and effective at time in whichthe rule set and portfolio data (including any pending trades if the run is pretrade) is taken for the caluation, although it may be possible to run compliance for historical effective at and as at dates in the future. | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time the compliance run calculation was completed | [default to OffsetDateTime]
**schedule** | **String** | Whether the compliance run was pre or post trade | [default to String]
**allRulesPassed** | **Boolean** | True if all rules passed, for all the portfolios they were assigned to | [default to Boolean]
**hasResults** | **Boolean** | False when no results have been returned eg. when no rules exist | [default to Boolean]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | Legacy AsAt time for backwards compatibility | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ComplianceRunInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RunId = "example RunId";
OffsetDateTime InstigatedAt = OffsetDateTime.now();
OffsetDateTime CompletedAt = OffsetDateTime.now();
String Schedule = "example Schedule";
Boolean AllRulesPassed = true;
Boolean HasResults = true;
OffsetDateTime AsAt = OffsetDateTime.now();


ComplianceRunInfo complianceRunInfoInstance = new ComplianceRunInfo()
    .RunId(RunId)
    .InstigatedAt(InstigatedAt)
    .CompletedAt(CompletedAt)
    .Schedule(Schedule)
    .AllRulesPassed(AllRulesPassed)
    .HasResults(HasResults)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
