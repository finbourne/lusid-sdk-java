
# ExecutionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | FIX Field 17.  Unique execution identifier. | 
**side** | **String** | FIX Field 54. | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers. | 
**transactionTime** | [**OffsetDateTime**](OffsetDateTime.md) | FIX field 60.  Time the transaction represented by this ExecutionReport occurred. | 
**orderQty** | **Double** | FIX field 38.  Order quantity. | 
**price** | **Double** | FIX field 44. | 
**currency** | **String** | FIX field 15. | 



