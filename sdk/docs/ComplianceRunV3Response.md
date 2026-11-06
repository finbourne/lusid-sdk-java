# com.finbourne.lusid.model.ComplianceRunV3Response
The outcome of a V3 compliance run: the result of each rule that was run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleResults** | [**List&lt;ComplianceRuleV3RuleResult&gt;**](ComplianceRuleV3RuleResult.md) |  | [optional] [default to List<ComplianceRuleV3RuleResult>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ComplianceRunV3Response;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ComplianceRuleV3RuleResult> RuleResults = new List<ComplianceRuleV3RuleResult>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ComplianceRunV3Response complianceRunV3ResponseInstance = new ComplianceRunV3Response()
    .RuleResults(RuleResults)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
