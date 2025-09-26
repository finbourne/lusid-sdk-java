# com.finbourne.lusid.model.AppendMarketData
Base class for types containing required data to append to complex market data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | The available values are: AppendFxForwardCurveByQuoteReference, AppendFxForwardCurveData, AppendFxForwardPipsCurveData, AppendFxForwardTenorCurveData, AppendFxForwardTenorPipsCurveData | [default to String]

```java
import com.finbourne.lusid.model.AppendMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MarketDataType = "example MarketDataType";


AppendMarketData appendMarketDataInstance = new AppendMarketData()
    .MarketDataType(MarketDataType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
