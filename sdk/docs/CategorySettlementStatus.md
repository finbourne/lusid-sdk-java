# com.finbourne.lusid.model.CategorySettlementStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The Status of the settlement category - &#39;Settled&#39;, &#39;Part Settled&#39; or &#39;Unsettled&#39;. | [default to String]
**isOverdue** | **Boolean** | Whether the category has any overdue movements | [default to Boolean]
**problems** | [**List&lt;SettlementProblem&gt;**](SettlementProblem.md) | Instruction level detail of rejected or invalid settlement instructions | [default to List<SettlementProblem>]

```java
import com.finbourne.lusid.model.CategorySettlementStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
Boolean IsOverdue = true;
List<SettlementProblem> Problems = new List<SettlementProblem>();


CategorySettlementStatus categorySettlementStatusInstance = new CategorySettlementStatus()
    .Status(Status)
    .IsOverdue(IsOverdue)
    .Problems(Problems);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
