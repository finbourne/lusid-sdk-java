

# ExecutionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | The unique identifier of the Execution Report (8) message as assigned by sell-side. FIX field 17. | 
**side** | **String** | The side of the order. FIX field 54. | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the execution to a unique instrument. | 
**transactionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of execution/order creation. FIX field 60. | 
**lastShares** | **Double** | Quantity (e.g. shares) bought/sold on this (last) fill. FIX field 32. | 
**lastPx** | **Double** | Price of this (last) fill. FIX field 31. | 
**currency** | **String** | The currency used for the price. FIX field 15. | 



