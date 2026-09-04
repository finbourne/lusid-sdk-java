# com.finbourne.lusid.model.ModelOptionShiftMode
How a model option shift's amount is applied to the option's configured value:  Absolute adds the amount in the option's own units (0.0010 moves a volatility of  0.008 to 0.009 - ten basis points of annualised volatility), Relative adds the  configured value times the amount (0.1 raises the value by ten percent).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ModelOptionShiftMode** | [**String**](.md) | **How a model option shift&#39;s amount is applied to the option&#39;s configured value:  Absolute adds the amount in the option&#39;s own units (0.0010 moves a volatility of  0.008 to 0.009 - ten basis points of annualised volatility), Relative adds the  configured value times the amount (0.1 raises the value by ten percent).** | [default to String]

```java
import com.finbourne.lusid.model.ModelOptionShiftMode;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of ModelOptionShiftMode:
ModelOptionShiftMode method = ModelOptionShiftMode.ABSOLUTE;
ModelOptionShiftMode method = ModelOptionShiftMode.RELATIVE;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
