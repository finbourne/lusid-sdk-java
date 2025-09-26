# com.finbourne.lusid.model.EquityModelOptions
Model options for equity related pricing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**equityForwardProjectionType** | **String** | Determines how forward equity prices should be projected.     Supported string (enumeration) values are: [FlatForwardCurveFromSpot, EquityCurveByPrices, ForwardProjectedFromRatesCurve]. | [default to String]

```java
import com.finbourne.lusid.model.EquityModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EquityForwardProjectionType = "example EquityForwardProjectionType";


EquityModelOptions equityModelOptionsInstance = new EquityModelOptions()
    .EquityForwardProjectionType(EquityForwardProjectionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
