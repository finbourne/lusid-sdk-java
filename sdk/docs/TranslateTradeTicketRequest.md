

# TranslateTradeTicketRequest

A collection of instruments to translate, along with the target dialect to translate into.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tickets** | [**Map&lt;String, TradeTicket&gt;**](TradeTicket.md) | The collection of trade tickets to translate.     Each trade ticket should be keyed by a unique correlation id. This id is ephemeral  and is not stored by LUSID. It serves only as a way to easily identify each instrument in the response. |  |
|**dialect** | **String** | The target dialect that the given instruments should be translated to. |  |



