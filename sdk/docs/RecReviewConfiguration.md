# com.finbourne.lusid.model.RecReviewConfiguration
How the results of a rec definition's runs are reviewed and approved: what needs reviewing, when the  reviewer may submit, and who has to approve the submission.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**openExceptions** | [**RecReviewRequirementRule**](RecReviewRequirementRule.md) |  | [optional] [default to RecReviewRequirementRule]
**closedExceptions** | [**RecReviewRequirementRule**](RecReviewRequirementRule.md) |  | [optional] [default to RecReviewRequirementRule]
**matches** | [**RecReviewRequirementRule**](RecReviewRequirementRule.md) |  | [optional] [default to RecReviewRequirementRule]
**reviewSubmission** | [**RecReviewSubmission**](RecReviewSubmission.md) |  | [optional] [default to RecReviewSubmission]
**requiredApprovals** | [**List&lt;RecReviewRequiredApproval&gt;**](RecReviewRequiredApproval.md) | The approvals a submitted review has to collect. All are required and may be given in any order, and no user may give more than one of them. Empty means no approvals are required and the reviewer self-approves on submission. | [optional] [default to List<RecReviewRequiredApproval>]

```java
import com.finbourne.lusid.model.RecReviewConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecReviewRequirementRule OpenExceptions = new RecReviewRequirementRule();
RecReviewRequirementRule ClosedExceptions = new RecReviewRequirementRule();
RecReviewRequirementRule Matches = new RecReviewRequirementRule();
RecReviewSubmission ReviewSubmission = new RecReviewSubmission();
@jakarta.annotation.Nullable List<RecReviewRequiredApproval> RequiredApprovals = new List<RecReviewRequiredApproval>();


RecReviewConfiguration recReviewConfigurationInstance = new RecReviewConfiguration()
    .OpenExceptions(OpenExceptions)
    .ClosedExceptions(ClosedExceptions)
    .Matches(Matches)
    .ReviewSubmission(ReviewSubmission)
    .RequiredApprovals(RequiredApprovals);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
