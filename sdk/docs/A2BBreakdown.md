# com.finbourne.lusid.model.A2BBreakdown
A2B Breakdown - Shows the total, and each sub-element within an A2B Category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **java.math.BigDecimal** | The total value of all the components within this category. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The currency. Applies to the Total, as well as all the componenents. | [optional] [default to String]
**components** | **Map&lt;String, java.math.BigDecimal&gt;** | The individual components that make up the category. For example, the Start category may have Cost, Unrealised gains and accrued interest components. | [optional] [default to Map<String, java.math.BigDecimal>]

```java
import com.finbourne.lusid.model.A2BBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Total = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> Components = new Map<String, java.math.BigDecimal>();


A2BBreakdown a2BBreakdownInstance = new A2BBreakdown()
    .Total(Total)
    .Currency(Currency)
    .Components(Components);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
