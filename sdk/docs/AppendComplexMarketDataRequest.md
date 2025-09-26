# com.finbourne.lusid.model.AppendComplexMarketDataRequest
The details of the point to be appended to a complex market data item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataId** | [**ComplexMarketDataId**](ComplexMarketDataId.md) |  | [default to ComplexMarketDataId]
**appendMarketData** | [**AppendMarketData**](AppendMarketData.md) |  | [default to AppendMarketData]

```java
import com.finbourne.lusid.model.AppendComplexMarketDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ComplexMarketDataId MarketDataId = new ComplexMarketDataId();
AppendMarketData AppendMarketData = new AppendMarketData();


AppendComplexMarketDataRequest appendComplexMarketDataRequestInstance = new AppendComplexMarketDataRequest()
    .MarketDataId(MarketDataId)
    .AppendMarketData(AppendMarketData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
