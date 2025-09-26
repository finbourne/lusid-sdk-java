# com.finbourne.lusid.model.GroupReconciliationDefinitionPortfolioEntityIds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | Portfolio Entity Id of the left side of a reconciliation | [default to List<PortfolioEntityId>]
**right** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | Portfolio Entity Id of the right side of a reconciliation | [default to List<PortfolioEntityId>]

```java
import com.finbourne.lusid.model.GroupReconciliationDefinitionPortfolioEntityIds;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PortfolioEntityId> Left = new List<PortfolioEntityId>();
List<PortfolioEntityId> Right = new List<PortfolioEntityId>();


GroupReconciliationDefinitionPortfolioEntityIds groupReconciliationDefinitionPortfolioEntityIdsInstance = new GroupReconciliationDefinitionPortfolioEntityIds()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
