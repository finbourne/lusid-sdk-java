# com.finbourne.lusid.model.TransactionTypeDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the TransactionType was resolved. If the portfolio has a TransactionTypeScope, this will have been used. Otherwise the default scope will have been used. | [default to String]
**source** | **String** | The source in which the TransactionType was resolved. | [default to String]
**type** | **String** | The resolved TransactionType. More information on TransactionType resolution can be found at https://support.lusid.com/docs/how-does-lusid-resolve-transactions-to-transaction-types | [default to String]

```java
import com.finbourne.lusid.model.TransactionTypeDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Source = "example Source";
String Type = "example Type";


TransactionTypeDetails transactionTypeDetailsInstance = new TransactionTypeDetails()
    .Scope(Scope)
    .Source(Source)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
