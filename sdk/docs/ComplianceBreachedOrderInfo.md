# com.finbourne.lusid.model.ComplianceBreachedOrderInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**listRuleResult** | [**List&lt;ComplianceRuleResult&gt;**](ComplianceRuleResult.md) | The Rule Results for a particular compliance run | [default to List<ComplianceRuleResult>]

```java
import com.finbourne.lusid.model.ComplianceBreachedOrderInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
List<ComplianceRuleResult> ListRuleResult = new List<ComplianceRuleResult>();


ComplianceBreachedOrderInfo complianceBreachedOrderInfoInstance = new ComplianceBreachedOrderInfo()
    .OrderId(OrderId)
    .ListRuleResult(ListRuleResult);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
