# com.finbourne.lusid.model.PackAccount
An account on a partnership configuration pack's chart of accounts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The account code. | [default to String]
**name** | **String** | The account name. | [default to String]
**type** | **String** | The account type: Asset, Liability, Capital, Income or Expense. | [default to String]

```java
import com.finbourne.lusid.model.PackAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Name = "example Name";
String Type = "example Type";


PackAccount packAccountInstance = new PackAccount()
    .Code(Code)
    .Name(Name)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
