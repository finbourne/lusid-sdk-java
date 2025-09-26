# com.finbourne.lusid.model.PropertyInterval

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**PropertyValue**](PropertyValue.md) |  | [default to PropertyValue]
**effectiveRange** | [**DateRange**](DateRange.md) |  | [default to DateRange]
**asAtRange** | [**DateRange**](DateRange.md) |  | [default to DateRange]
**status** | **String** | Indicates whether the value is part of the prevailing effective date timeline for the requested asAt date, or whether it has been superseded by correctional activity | [default to String]

```java
import com.finbourne.lusid.model.PropertyInterval;
import java.util.*;
import java.lang.System;
import java.net.URI;

PropertyValue Value = new PropertyValue();
DateRange EffectiveRange = new DateRange();
DateRange AsAtRange = new DateRange();
String Status = "example Status";


PropertyInterval propertyIntervalInstance = new PropertyInterval()
    .Value(Value)
    .EffectiveRange(EffectiveRange)
    .AsAtRange(AsAtRange)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
