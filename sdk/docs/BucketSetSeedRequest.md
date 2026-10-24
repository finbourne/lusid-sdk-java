# com.finbourne.lusid.model.BucketSetSeedRequest
The closing balances to seed for a bucket set on an estimate valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketSetCode** | **String** | The code of the bucket set on the fund configuration to seed. | [default to String]
**classSeeds** | [**List&lt;BucketSetClassSeedRequest&gt;**](BucketSetClassSeedRequest.md) | The bucket set&#39;s closing balances at the valuation point, per share class. They replace everything the bucket set holds up to and including the valuation point. A share class or bucket left out is zero. | [default to List<BucketSetClassSeedRequest>]

```java
import com.finbourne.lusid.model.BucketSetSeedRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BucketSetCode = "example BucketSetCode";
List<BucketSetClassSeedRequest> ClassSeeds = new List<BucketSetClassSeedRequest>();


BucketSetSeedRequest bucketSetSeedRequestInstance = new BucketSetSeedRequest()
    .BucketSetCode(BucketSetCode)
    .ClassSeeds(ClassSeeds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
