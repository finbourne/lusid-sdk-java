# com.finbourne.lusid.model.ResultValueDateTimeOffset
A simple result for a date time value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**OffsetDateTime**](OffsetDateTime.md) | The value itself | [optional] [default to OffsetDateTime]
**dimension** | **Integer** | The dimension of the result. Can be null if there is no sensible way of defining the dimension. This field should not be  populate by the user on upsertion. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.ResultValueDateTimeOffset;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Value = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer Dimension = new Integer("100.00");


ResultValueDateTimeOffset resultValueDateTimeOffsetInstance = new ResultValueDateTimeOffset()
    .Value(Value)
    .Dimension(Dimension);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
