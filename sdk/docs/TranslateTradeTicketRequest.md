# com.finbourne.lusid.model.TranslateTradeTicketRequest
A collection of instruments to translate, along with the target dialect to translate into.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickets** | [**Map&lt;String, TradeTicket&gt;**](TradeTicket.md) | The collection of trade tickets to translate.     Each trade ticket should be keyed by a unique correlation id. This id is ephemeral  and is not stored by LUSID. It serves only as a way to easily identify each instrument in the response. | [default to Map<String, TradeTicket>]
**dialect** | **String** | The target dialect that the given instruments should be translated to. | [default to String]

```java
import com.finbourne.lusid.model.TranslateTradeTicketRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, TradeTicket> Tickets = new Map<String, TradeTicket>();
String Dialect = "example Dialect";


TranslateTradeTicketRequest translateTradeTicketRequestInstance = new TranslateTradeTicketRequest()
    .Tickets(Tickets)
    .Dialect(Dialect);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
