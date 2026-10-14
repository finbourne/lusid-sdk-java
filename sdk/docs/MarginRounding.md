# com.finbourne.lusid.model.MarginRounding
The increment margin calls are rounded to, and the direction for deliveries and returns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The increment margin calls are rounded to. Must be greater than zero. | [default to java.math.BigDecimal]
**deliveries** | **String** | How amounts we deliver are rounded. One of Up or Nearest. Available values: Up, Down, Nearest. | [default to String]
**returns** | **String** | How amounts we receive back are rounded. One of Down or Nearest. Available values: Up, Down, Nearest. | [default to String]

```java
import com.finbourne.lusid.model.MarginRounding;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Deliveries = "example Deliveries";
String Returns = "example Returns";


MarginRounding marginRoundingInstance = new MarginRounding()
    .Amount(Amount)
    .Deliveries(Deliveries)
    .Returns(Returns);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
