# com.finbourne.lusid.model.PackTransactionType
A transaction type carried by a partnership configuration pack.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The transaction type. | [default to String]
**description** | **String** | A description of the transaction type. | [optional] [default to String]
**debitAccount** | **String** | The account debited. | [default to String]
**creditAccount** | **String** | The account credited. | [default to String]
**direction** | **String** | The direction of the capital movement from the partner&#39;s point of view. Available values: Inflow, Outflow, Neutral. | [default to String]

```java
import com.finbourne.lusid.model.PackTransactionType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
@jakarta.annotation.Nullable String Description = "example Description";
String DebitAccount = "example DebitAccount";
String CreditAccount = "example CreditAccount";
String Direction = "example Direction";


PackTransactionType packTransactionTypeInstance = new PackTransactionType()
    .Type(Type)
    .Description(Description)
    .DebitAccount(DebitAccount)
    .CreditAccount(CreditAccount)
    .Direction(Direction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
