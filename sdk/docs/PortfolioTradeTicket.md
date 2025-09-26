# com.finbourne.lusid.model.PortfolioTradeTicket
Response for querying trade tickets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourcePortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**tradeTicket** | [**LusidTradeTicket**](LusidTradeTicket.md) |  | [optional] [default to LusidTradeTicket]

```java
import com.finbourne.lusid.model.PortfolioTradeTicket;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId SourcePortfolioId = new ResourceId();
LusidTradeTicket TradeTicket = new LusidTradeTicket();


PortfolioTradeTicket portfolioTradeTicketInstance = new PortfolioTradeTicket()
    .SourcePortfolioId(SourcePortfolioId)
    .TradeTicket(TradeTicket);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
