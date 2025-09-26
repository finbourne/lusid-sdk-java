# com.finbourne.lusid.model.ResultValue0D
Result value representing a 0D result. These results can be equipped with a unit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **String** | Unit of the result | [optional] [default to String]
**value** | **java.math.BigDecimal** | The value of the result | [optional] [default to java.math.BigDecimal]
**dimension** | **Integer** | The dimension of the result. Can be null if there is no sensible way of defining the dimension. This field should not be  populate by the user on upsertion. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.ResultValue0D;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Units = "example Units";
java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Integer Dimension = new Integer("100.00");


ResultValue0D resultValue0DInstance = new ResultValue0D()
    .Units(Units)
    .Value(Value)
    .Dimension(Dimension);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
