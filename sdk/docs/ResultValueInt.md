# com.finbourne.lusid.model.ResultValueInt
A simple result type which holds an integer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **Integer** | The value itself | [optional] [default to Integer]
**dimension** | **Integer** | The dimension of the result. Can be null if there is no sensible way of defining the dimension. This field should not be  populate by the user on upsertion. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.ResultValueInt;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Value = new Integer("100.00");
@jakarta.annotation.Nullable Integer Dimension = new Integer("100.00");


ResultValueInt resultValueIntInstance = new ResultValueInt()
    .Value(Value)
    .Dimension(Dimension);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
