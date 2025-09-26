# com.finbourne.lusid.model.GroupReconciliationDefinitionComparisonRulesetIds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionReconciliation** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**holdingReconciliation** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**valuationReconciliation** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.GroupReconciliationDefinitionComparisonRulesetIds;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TransactionReconciliation = new ResourceId();
ResourceId HoldingReconciliation = new ResourceId();
ResourceId ValuationReconciliation = new ResourceId();


GroupReconciliationDefinitionComparisonRulesetIds groupReconciliationDefinitionComparisonRulesetIdsInstance = new GroupReconciliationDefinitionComparisonRulesetIds()
    .TransactionReconciliation(TransactionReconciliation)
    .HoldingReconciliation(HoldingReconciliation)
    .ValuationReconciliation(ValuationReconciliation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
