# com.finbourne.lusid.model.BucketBorderConfiguration
Configuration determining how the borders of bucket intervals behave when allocating cash flows to buckets.  When supplied, cash flows are bucketed into intervals defined by the bucketing dates rather than being  rounded to the nearest bucketing date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startInclusive** | **Boolean** | Is the start of the first bucket interval inclusive of its start date. Defaults to true. | [optional] [default to Boolean]
**endInclusive** | **Boolean** | Is the end of the last bucket interval inclusive of its end date. Defaults to false. | [optional] [default to Boolean]
**boundaryBelongsTo** | **String** | For boundaries shared by two adjacent intervals, which interval a cash flow falling exactly on the  boundary belongs to. Supported string (enumeration) values are: [Earlier, Later]. Defaults to &#39;Earlier&#39;. Available values: Earlier, Later. | [optional] [default to String]

```java
import com.finbourne.lusid.model.BucketBorderConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean StartInclusive = true;
Boolean EndInclusive = true;
@jakarta.annotation.Nullable String BoundaryBelongsTo = "example BoundaryBelongsTo";


BucketBorderConfiguration bucketBorderConfigurationInstance = new BucketBorderConfiguration()
    .StartInclusive(StartInclusive)
    .EndInclusive(EndInclusive)
    .BoundaryBelongsTo(BoundaryBelongsTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
