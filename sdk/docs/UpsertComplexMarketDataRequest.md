# com.finbourne.lusid.model.UpsertComplexMarketDataRequest
The details of the complex market data item to upsert into Lusid.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataId** | [**ComplexMarketDataId**](ComplexMarketDataId.md) |  | [default to ComplexMarketDataId]
**marketData** | [**ComplexMarketData**](ComplexMarketData.md) |  | [default to ComplexMarketData]

```java
import com.finbourne.lusid.model.UpsertComplexMarketDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ComplexMarketDataId MarketDataId = new ComplexMarketDataId();
ComplexMarketData MarketData = new ComplexMarketData();


UpsertComplexMarketDataRequest upsertComplexMarketDataRequestInstance = new UpsertComplexMarketDataRequest()
    .MarketDataId(MarketDataId)
    .MarketData(MarketData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
