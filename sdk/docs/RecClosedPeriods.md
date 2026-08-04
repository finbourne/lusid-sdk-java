# com.finbourne.lusid.model.RecClosedPeriods
References to the closed periods created on the left and right timelines when a Closed Period  instance is locked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**RecClosedPeriodReference**](RecClosedPeriodReference.md) |  | [default to RecClosedPeriodReference]
**right** | [**RecClosedPeriodReference**](RecClosedPeriodReference.md) |  | [default to RecClosedPeriodReference]

```java
import com.finbourne.lusid.model.RecClosedPeriods;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecClosedPeriodReference Left = new RecClosedPeriodReference();
RecClosedPeriodReference Right = new RecClosedPeriodReference();


RecClosedPeriods recClosedPeriodsInstance = new RecClosedPeriods()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
