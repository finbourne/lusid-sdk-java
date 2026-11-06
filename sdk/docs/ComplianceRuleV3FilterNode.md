# com.finbourne.lusid.model.ComplianceRuleV3FilterNode
A node in a rule's filter tree: either a group combining child nodes with all/any, or a leaf condition.  The concrete kind is named by the FilterNodeType property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterNodeType** | **String** | Available values: ComplianceRuleV3FilterGroup, ComplianceRuleV3FilterCondition. | [default to String]

```java
import com.finbourne.lusid.model.ComplianceRuleV3FilterNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FilterNodeType = "example FilterNodeType";


ComplianceRuleV3FilterNode complianceRuleV3FilterNodeInstance = new ComplianceRuleV3FilterNode()
    .FilterNodeType(FilterNodeType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
