
# ExecutionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | FIX Field 17.  Unique execution identifier. | 
**side** | **String** | FIX Field 54. | 
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | 
**transactionTime** | [**OffsetDateTime**](OffsetDateTime.md) | FIX field 60.  Time the transaction represented by this ExecutionReport occurred. | 
**lastShares** | **Double** | FIX field 32. | 
**lastPx** | **Double** | FIX field 31. | 
**currency** | **String** | FIX field 15. | 



