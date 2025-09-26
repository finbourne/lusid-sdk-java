# com.finbourne.lusid.model.Strategy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keys** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  | [default to List<PerpetualProperty>]
**valueType** | **String** |  | [default to String]
**value** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.Strategy;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PerpetualProperty> Keys = new List<PerpetualProperty>();
String ValueType = "example ValueType";
java.math.BigDecimal Value = new java.math.BigDecimal("100.00");


Strategy strategyInstance = new Strategy()
    .Keys(Keys)
    .ValueType(ValueType)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
