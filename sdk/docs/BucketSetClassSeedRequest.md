# com.finbourne.lusid.model.BucketSetClassSeedRequest
One share class's bucket values to seed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** | The short code of the seeded share class. | [default to String]
**buckets** | [**List&lt;BucketSeedValueRequest&gt;**](BucketSeedValueRequest.md) | The seeded buckets of the share class. Only the bucket set&#39;s flow buckets (dealing, P&amp;L and fees) accumulate, so only they can be seeded. | [default to List<BucketSeedValueRequest>]

```java
import com.finbourne.lusid.model.BucketSetClassSeedRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ShareClassShortCode = "example ShareClassShortCode";
List<BucketSeedValueRequest> Buckets = new List<BucketSeedValueRequest>();


BucketSetClassSeedRequest bucketSetClassSeedRequestInstance = new BucketSetClassSeedRequest()
    .ShareClassShortCode(ShareClassShortCode)
    .Buckets(Buckets);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
