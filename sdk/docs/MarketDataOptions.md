# com.finbourne.lusid.model.MarketDataOptions
Base class for representing market data options in LUSID.  Abstractly, these are any options that one should be able to specify for ComplexMarketData entities.  For example, CurveOptions allows one to decide how the data provided in a discountFactorCurve is interpolated.  This base class should not be directly instantiated;  each supported MarketDataOptionsType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataOptionsType** | **String** | The available values are: CurveOptions | [default to String]

```java
import com.finbourne.lusid.model.MarketDataOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MarketDataOptionsType = "example MarketDataOptionsType";


MarketDataOptions marketDataOptionsInstance = new MarketDataOptions()
    .MarketDataOptionsType(MarketDataOptionsType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
