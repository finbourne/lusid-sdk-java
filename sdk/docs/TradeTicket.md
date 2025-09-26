# com.finbourne.lusid.model.TradeTicket
The base class for representing a Trade Ticket in LUSID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradeTicketType** | **String** | The available values are: LusidTradeTicket, ExternalTradeTicket | [default to String]

```java
import com.finbourne.lusid.model.TradeTicket;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TradeTicketType = "example TradeTicketType";


TradeTicket tradeTicketInstance = new TradeTicket()
    .TradeTicketType(TradeTicketType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
