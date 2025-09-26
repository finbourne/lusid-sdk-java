# com.finbourne.lusid.model.ListComplexMarketDataWithMetaDataResponse
Wraps a ComplexMarketData object with information that was retrieved from storage with it.  In particular,  the scope that the data was stored in,  and an object identifying the market data in that scope.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the listed ComplexMarketData entity is stored in. | [optional] [default to String]
**marketDataId** | [**ComplexMarketDataId**](ComplexMarketDataId.md) |  | [optional] [default to ComplexMarketDataId]
**marketData** | [**ComplexMarketData**](ComplexMarketData.md) |  | [optional] [default to ComplexMarketData]

```java
import com.finbourne.lusid.model.ListComplexMarketDataWithMetaDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Scope = "example Scope";
ComplexMarketDataId MarketDataId = new ComplexMarketDataId();
ComplexMarketData MarketData = new ComplexMarketData();


ListComplexMarketDataWithMetaDataResponse listComplexMarketDataWithMetaDataResponseInstance = new ListComplexMarketDataWithMetaDataResponse()
    .Scope(Scope)
    .MarketDataId(MarketDataId)
    .MarketData(MarketData);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
