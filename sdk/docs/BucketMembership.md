# com.finbourne.lusid.model.BucketMembership
The bucket a Journal Entry Line was assigned to within one of a Fund Configuration's bucket sets.  Computed when the lines are read, from the bucket set definitions in force at that point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketSetCode** | **String** | The code of the bucket set that produced this classification. | [optional] [default to String]
**bucketId** | **String** | The id of the bucket within that bucket set the line was assigned to, following the same first-match-wins waterfall used at valuation. One of the reserved &#39;_unmatched_dealing&#39;, &#39;_unmatched_fees&#39; or &#39;_unmatched_pnl&#39; ids when the line matched no bucket&#39;s filter in the set. | [optional] [default to String]

```java
import com.finbourne.lusid.model.BucketMembership;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String BucketSetCode = "example BucketSetCode";
@jakarta.annotation.Nullable String BucketId = "example BucketId";


BucketMembership bucketMembershipInstance = new BucketMembership()
    .BucketSetCode(BucketSetCode)
    .BucketId(BucketId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
