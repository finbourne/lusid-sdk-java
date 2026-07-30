# com.finbourne.lusid.model.RecRequiredApproval
An approval slot required for a result set, passed through from the rec definition's review configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalCode** | **String** | Client-defined identifier for the approval slot (e.g. &#39;Desk&#39;, &#39;Risk&#39;). | [default to String]
**description** | **String** | Human-readable label for the approval slot. | [optional] [default to String]
**currentUserCanDecide** | **Boolean** | Whether the calling user may decide this approval slot, pre-evaluated at request time. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.RecRequiredApproval;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ApprovalCode = "example ApprovalCode";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean CurrentUserCanDecide = true;


RecRequiredApproval recRequiredApprovalInstance = new RecRequiredApproval()
    .ApprovalCode(ApprovalCode)
    .Description(Description)
    .CurrentUserCanDecide(CurrentUserCanDecide);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
