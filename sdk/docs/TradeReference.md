# com.finbourne.lusid.model.TradeReference

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**holdingId** | **String** | The holding the trade&#39;s line was valued from. | [default to String]

```java
import com.finbourne.lusid.model.TradeReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
String HoldingId = "example HoldingId";


TradeReference tradeReferenceInstance = new TradeReference()
    .PortfolioId(PortfolioId)
    .HoldingId(HoldingId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
