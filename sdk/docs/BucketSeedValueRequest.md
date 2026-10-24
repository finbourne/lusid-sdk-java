# com.finbourne.lusid.model.BucketSeedValueRequest
One bucket's cumulative value to seed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The identifier of the seeded bucket. | [default to String]
**absoluteValue** | **java.math.BigDecimal** | The bucket&#39;s cumulative value at the valuation point, in the fund currency. It is trusted input: nothing reconciles it to the share class NAV. | [default to java.math.BigDecimal]
**perUnitValue** | **java.math.BigDecimal** | The bucket&#39;s cumulative value per unit in issue. It is stored rounded to the share class&#39;s price precision. When omitted on a unitised bucket it is the absolute value over the share class&#39;s units in issue at the valuation point. Must be omitted on a bucket that is not unitised. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BucketSeedValueRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BucketId = "example BucketId";
java.math.BigDecimal AbsoluteValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PerUnitValue = new java.math.BigDecimal("100.00");


BucketSeedValueRequest bucketSeedValueRequestInstance = new BucketSeedValueRequest()
    .BucketId(BucketId)
    .AbsoluteValue(AbsoluteValue)
    .PerUnitValue(PerUnitValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
