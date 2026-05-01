# com.finbourne.lusid.model.OrderGraphBlockOrderDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**complianceState** | **String** | The compliance state of this order. Available values: Pending, Failed, Passed, ManuallyApproved, PartiallyOverridden, Warning. | [default to String]
**approvalState** | **String** | The approval state of this order. Available values: Pending, Rejected, Approved. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioName** | **String** | The name of the order&#39;s referenced Portfolio. | [optional] [default to String]
**orderApprovalTaskId** | **String** | The task id associated with the approval state of the order. | [optional] [default to String]
**orderApprovalTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**nonPassingComplianceRuleResults** | [**List&lt;ContributionToNonPassingRuleDetail&gt;**](ContributionToNonPassingRuleDetail.md) | The details of compliance rules in non-passing states. | [optional] [default to List<ContributionToNonPassingRuleDetail>]

```java
import com.finbourne.lusid.model.OrderGraphBlockOrderDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String ComplianceState = "example ComplianceState";
String ApprovalState = "example ApprovalState";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String PortfolioName = "example PortfolioName";
@jakarta.annotation.Nullable String OrderApprovalTaskId = "example OrderApprovalTaskId";
ResourceId OrderApprovalTaskDefinitionId = new ResourceId();
@jakarta.annotation.Nullable List<ContributionToNonPassingRuleDetail> NonPassingComplianceRuleResults = new List<ContributionToNonPassingRuleDetail>();


OrderGraphBlockOrderDetail orderGraphBlockOrderDetailInstance = new OrderGraphBlockOrderDetail()
    .Id(Id)
    .ComplianceState(ComplianceState)
    .ApprovalState(ApprovalState)
    .PortfolioId(PortfolioId)
    .PortfolioName(PortfolioName)
    .OrderApprovalTaskId(OrderApprovalTaskId)
    .OrderApprovalTaskDefinitionId(OrderApprovalTaskDefinitionId)
    .NonPassingComplianceRuleResults(NonPassingComplianceRuleResults);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
