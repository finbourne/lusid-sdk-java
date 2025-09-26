# com.finbourne.lusid.model.GroupReconciliationReviewStatuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countPending** | **Integer** | The number of comparison results of reviewStatus \&quot;Pending\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkPending** | [**Link**](Link.md) |  | [default to Link]
**countReviewed** | **Integer** | The number of comparison results of reviewStatus \&quot;Reviewed\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkReviewed** | [**Link**](Link.md) |  | [default to Link]
**countMatched** | **Integer** | The number of comparison results of reviewStatus \&quot;Matched\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkMatched** | [**Link**](Link.md) |  | [default to Link]
**countInvalid** | **Integer** | The number of comparison results of reviewStatus \&quot;Invalid\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkInvalid** | [**Link**](Link.md) |  | [default to Link]

```java
import com.finbourne.lusid.model.GroupReconciliationReviewStatuses;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer CountPending = new Integer("100.00");
Link LinkPending = new Link();
Integer CountReviewed = new Integer("100.00");
Link LinkReviewed = new Link();
Integer CountMatched = new Integer("100.00");
Link LinkMatched = new Link();
Integer CountInvalid = new Integer("100.00");
Link LinkInvalid = new Link();


GroupReconciliationReviewStatuses groupReconciliationReviewStatusesInstance = new GroupReconciliationReviewStatuses()
    .CountPending(CountPending)
    .LinkPending(LinkPending)
    .CountReviewed(CountReviewed)
    .LinkReviewed(LinkReviewed)
    .CountMatched(CountMatched)
    .LinkMatched(LinkMatched)
    .CountInvalid(CountInvalid)
    .LinkInvalid(LinkInvalid);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
