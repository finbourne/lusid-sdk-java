# com.finbourne.lusid.model.CarryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carryRate** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**preferredReturnRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**catchUpRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**waterfallType** | **String** | Available values: WholeOfFund, DealByDeal. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CarryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal CarryRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PreferredReturnRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CatchUpRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String WaterfallType = "example WaterfallType";


CarryParameters carryParametersInstance = new CarryParameters()
    .CarryRate(CarryRate)
    .PreferredReturnRate(PreferredReturnRate)
    .CatchUpRate(CatchUpRate)
    .WaterfallType(WaterfallType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
