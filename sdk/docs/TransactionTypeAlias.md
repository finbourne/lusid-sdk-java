# com.finbourne.lusid.model.TransactionTypeAlias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The transaction type | [default to String]
**description** | **String** | Brief description of the transaction | [default to String]
**transactionClass** | **String** | Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut | [default to String]
**transactionRoles** | **String** | Transactions role within a class. E.g. Increase a long position | [default to String]
**isDefault** | **Boolean** | IsDefault is a flag that denotes the default alias for a source. There can only be, at most, one per source. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.TransactionTypeAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Description = "example Description";
String TransactionClass = "example TransactionClass";
String TransactionRoles = "example TransactionRoles";
Boolean IsDefault = true;


TransactionTypeAlias transactionTypeAliasInstance = new TransactionTypeAlias()
    .Type(Type)
    .Description(Description)
    .TransactionClass(TransactionClass)
    .TransactionRoles(TransactionRoles)
    .IsDefault(IsDefault);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
