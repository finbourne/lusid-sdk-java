

# TransactionConfigurationTypeAlias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The transaction type | 
**description** | **String** | Brief description of the transaction | 
**transactionClass** | **String** | Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut | 
**transactionGroup** | **String** | Group is a set of codes related to a source, or sync | 
**transactionRoles** | [**TransactionRolesEnum**](#TransactionRolesEnum) | . The available values are: None, LongLonger, LongShorter, ShortShorter, Shorter, ShortLonger, Longer, AllRoles | 



## Enum: TransactionRolesEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
LONGLONGER | &quot;LongLonger&quot;
LONGSHORTER | &quot;LongShorter&quot;
SHORTSHORTER | &quot;ShortShorter&quot;
SHORTER | &quot;Shorter&quot;
SHORTLONGER | &quot;ShortLonger&quot;
LONGER | &quot;Longer&quot;
ALLROLES | &quot;AllRoles&quot;



