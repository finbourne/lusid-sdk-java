

# TransactionConfigurationTypeAlias


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The transaction type |  |
|**description** | **String** | Brief description of the transaction |  |
|**transactionClass** | **String** | Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut |  |
|**transactionGroup** | **String** | Group is a set of codes related to a source, or sync. DEPRECATED: This field will be removed, use &#x60;Source&#x60; instead |  [optional] |
|**source** | **String** | Used to group a set of transaction types |  [optional] |
|**transactionRoles** | [**TransactionRolesEnum**](#TransactionRolesEnum) | . The available values are: None, LongLonger, LongShorter, ShortShorter, Shorter, ShortLonger, Longer, AllRoles |  |
|**isDefault** | **Boolean** | IsDefault is a flag that denotes the default alias for a source. There can only be, at most, one per source. |  [optional] |



## Enum: TransactionRolesEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| LONGLONGER | &quot;LongLonger&quot; |
| LONGSHORTER | &quot;LongShorter&quot; |
| SHORTSHORTER | &quot;ShortShorter&quot; |
| SHORTER | &quot;Shorter&quot; |
| SHORTLONGER | &quot;ShortLonger&quot; |
| LONGER | &quot;Longer&quot; |
| ALLROLES | &quot;AllRoles&quot; |



