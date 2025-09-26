# com.finbourne.lusid.model.StagingRuleApprovalCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requiredApprovals** | **Integer** |  | [optional] [default to Integer]
**decidingUser** | **String** |  | [optional] [default to String]
**stagingUserCanDecide** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.StagingRuleApprovalCriteria;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Integer RequiredApprovals = new Integer("100.00");
@jakarta.annotation.Nullable String DecidingUser = "example DecidingUser";
@jakarta.annotation.Nullable Boolean StagingUserCanDecide = true;


StagingRuleApprovalCriteria stagingRuleApprovalCriteriaInstance = new StagingRuleApprovalCriteria()
    .RequiredApprovals(RequiredApprovals)
    .DecidingUser(DecidingUser)
    .StagingUserCanDecide(StagingUserCanDecide);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
