# com.finbourne.lusid.model.DecoratedComplianceRunSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**details** | [**List&lt;ComplianceRuleResultDetail&gt;**](ComplianceRuleResultDetail.md) |  | [default to List<ComplianceRuleResultDetail>]

```java
import com.finbourne.lusid.model.DecoratedComplianceRunSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RunId = new ResourceId();
List<ComplianceRuleResultDetail> Details = new List<ComplianceRuleResultDetail>();


DecoratedComplianceRunSummary decoratedComplianceRunSummaryInstance = new DecoratedComplianceRunSummary()
    .RunId(RunId)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
