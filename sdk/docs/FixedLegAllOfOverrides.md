# com.finbourne.lusid.model.FixedLegAllOfOverrides
Any overriding data for notionals, spreads or rates that would affect generation of a leg.  This supports the case where an amortisation schedule is given but otherwise generation is allowed as usual.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amortization** | **List&lt;java.math.BigDecimal&gt;** |  | [optional] [default to List<java.math.BigDecimal>]
**spreads** | **List&lt;java.math.BigDecimal&gt;** |  | [optional] [default to List<java.math.BigDecimal>]

```java
import com.finbourne.lusid.model.FixedLegAllOfOverrides;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<java.math.BigDecimal> Amortization = new List<java.math.BigDecimal>();
List<java.math.BigDecimal> Spreads = new List<java.math.BigDecimal>();


FixedLegAllOfOverrides fixedLegAllOfOverridesInstance = new FixedLegAllOfOverrides()
    .Amortization(Amortization)
    .Spreads(Spreads);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
