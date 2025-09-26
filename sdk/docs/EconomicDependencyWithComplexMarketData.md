# com.finbourne.lusid.model.EconomicDependencyWithComplexMarketData
Container class pairing economic dependency and complex market data (i.e. discounting curves, etc.)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**economicDependency** | [**EconomicDependency**](EconomicDependency.md) |  | [default to EconomicDependency]
**complexMarketData** | [**ComplexMarketData**](ComplexMarketData.md) |  | [default to ComplexMarketData]

```java
import com.finbourne.lusid.model.EconomicDependencyWithComplexMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

EconomicDependency EconomicDependency = new EconomicDependency();
ComplexMarketData ComplexMarketData = new ComplexMarketData();


EconomicDependencyWithComplexMarketData economicDependencyWithComplexMarketDataInstance = new EconomicDependencyWithComplexMarketData()
    .EconomicDependency(EconomicDependency)
    .ComplexMarketData(ComplexMarketData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
