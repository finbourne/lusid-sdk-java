# com.finbourne.lusid.model.SetTransactionConfigurationAlias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**transactionClass** | **String** |  | [default to String]
**transactionRole** | **String** |  | [default to String]
**isDefault** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.SetTransactionConfigurationAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Description = "example Description";
String TransactionClass = "example TransactionClass";
String TransactionRole = "example TransactionRole";
Boolean IsDefault = true;


SetTransactionConfigurationAlias setTransactionConfigurationAliasInstance = new SetTransactionConfigurationAlias()
    .Type(Type)
    .Description(Description)
    .TransactionClass(TransactionClass)
    .TransactionRole(TransactionRole)
    .IsDefault(IsDefault);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
