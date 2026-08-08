# com.finbourne.lusid.model.BucketingSchedule
A schedule for dates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenor** | **String** | Rolling tenor | [optional] [default to String]
**rollDirection** | **String** | Optional direction in which the bucketing dates are rolled out from the schedule tenor.  Supported string (enumeration) values are: [ForwardFromStart, BackwardFromEnd].  If absent (and StubType is also absent), the pre-existing date generation behaviour is used. Available values: ForwardFromStart, BackwardFromEnd. | [optional] [default to String]
**stubType** | **String** | Optional treatment of the irregular (stub) period when the window length is not an exact multiple of the tenor.  Supported string (enumeration) values are: [ShortStub, LongStub].  If absent (and RollDirection is also absent), the pre-existing date generation behaviour is used. Available values: ShortStub, LongStub. | [optional] [default to String]

```java
import com.finbourne.lusid.model.BucketingSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Tenor = "example Tenor";
@jakarta.annotation.Nullable String RollDirection = "example RollDirection";
@jakarta.annotation.Nullable String StubType = "example StubType";


BucketingSchedule bucketingScheduleInstance = new BucketingSchedule()
    .Tenor(Tenor)
    .RollDirection(RollDirection)
    .StubType(StubType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
