# com.finbourne.lusid.model.BucketSeedValue
One bucket's seeded cumulative value, as stored.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The identifier of the seeded bucket. | [default to String]
**absoluteValue** | **java.math.BigDecimal** | The bucket&#39;s seeded cumulative value at the valuation point, in the fund currency. | [default to java.math.BigDecimal]
**perUnitValue** | **java.math.BigDecimal** | The per-unit value given with the seed, unrounded. Omitted where none was given, in which case the valuation point reads it off the share class&#39;s units in issue. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BucketSeedValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BucketId = "example BucketId";
java.math.BigDecimal AbsoluteValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PerUnitValue = new java.math.BigDecimal("100.00");


BucketSeedValue bucketSeedValueInstance = new BucketSeedValue()
    .BucketId(BucketId)
    .AbsoluteValue(AbsoluteValue)
    .PerUnitValue(PerUnitValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
