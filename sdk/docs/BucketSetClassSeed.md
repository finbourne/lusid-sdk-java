# com.finbourne.lusid.model.BucketSetClassSeed
One share class's seeded bucket values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** | The short code of the seeded share class. | [default to String]
**buckets** | [**List&lt;BucketSeedValue&gt;**](BucketSeedValue.md) | The seeded buckets of the share class. | [default to List<BucketSeedValue>]

```java
import com.finbourne.lusid.model.BucketSetClassSeed;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ShareClassShortCode = "example ShareClassShortCode";
List<BucketSeedValue> Buckets = new List<BucketSeedValue>();


BucketSetClassSeed bucketSetClassSeedInstance = new BucketSetClassSeed()
    .ShareClassShortCode(ShareClassShortCode)
    .Buckets(Buckets);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
