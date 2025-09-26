# com.finbourne.lusid.model.ResultValueDecimal
A simple result for a decimal value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** | The value itself | [optional] [default to java.math.BigDecimal]
**dimension** | **Integer** | The dimension of the result. Can be null if there is no sensible way of defining the dimension. This field should not be  populate by the user on upsertion. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.ResultValueDecimal;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Integer Dimension = new Integer("100.00");


ResultValueDecimal resultValueDecimalInstance = new ResultValueDecimal()
    .Value(Value)
    .Dimension(Dimension);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
