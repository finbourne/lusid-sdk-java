# com.finbourne.lusid.model.BucketSetSeed
The closing balances seeded for a bucket set on a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketSetCode** | **String** | The code of the seeded bucket set on the fund configuration. | [default to String]
**classSeeds** | [**List&lt;BucketSetClassSeed&gt;**](BucketSetClassSeed.md) | The bucket set&#39;s seeded closing balances at the valuation point, per share class. They replace everything the bucket set holds up to and including the valuation point. A share class or bucket not listed is zero. | [default to List<BucketSetClassSeed>]

```java
import com.finbourne.lusid.model.BucketSetSeed;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BucketSetCode = "example BucketSetCode";
List<BucketSetClassSeed> ClassSeeds = new List<BucketSetClassSeed>();


BucketSetSeed bucketSetSeedInstance = new BucketSetSeed()
    .BucketSetCode(BucketSetCode)
    .ClassSeeds(ClassSeeds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
