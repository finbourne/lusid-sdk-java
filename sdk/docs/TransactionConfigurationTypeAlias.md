# com.finbourne.lusid.model.TransactionConfigurationTypeAlias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The transaction type | [default to String]
**description** | **String** | Brief description of the transaction | [default to String]
**transactionClass** | **String** | Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut | [default to String]
**transactionGroup** | **String** | Group is a set of codes related to a source, or sync. DEPRECATED: This field will be removed, use &#x60;Source&#x60; instead | [optional] [default to String]
**source** | **String** | Used to group a set of transaction types | [optional] [default to String]
**transactionRoles** | **String** | . The available values are: None, LongLonger, LongShorter, ShortShorter, Shorter, ShortLonger, Longer, AllRoles | [default to String]
**isDefault** | **Boolean** | IsDefault is a flag that denotes the default alias for a source. There can only be, at most, one per source. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.TransactionConfigurationTypeAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Description = "example Description";
String TransactionClass = "example TransactionClass";
@jakarta.annotation.Nullable String TransactionGroup = "example TransactionGroup";
@jakarta.annotation.Nullable String Source = "example Source";
String TransactionRoles = "example TransactionRoles";
Boolean IsDefault = true;


TransactionConfigurationTypeAlias transactionConfigurationTypeAliasInstance = new TransactionConfigurationTypeAlias()
    .Type(Type)
    .Description(Description)
    .TransactionClass(TransactionClass)
    .TransactionGroup(TransactionGroup)
    .Source(Source)
    .TransactionRoles(TransactionRoles)
    .IsDefault(IsDefault);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
