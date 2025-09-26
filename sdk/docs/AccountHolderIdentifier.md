# com.finbourne.lusid.model.AccountHolderIdentifier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | A client-defined key used to identify the Account Holder, unique within the Investment Account | [default to String]
**scope** | **String** | The scope in which the Investor Record lies. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | Single Account Holder identifier that should target the desired Investor Record. | [default to Map<String, String>]

```java
import com.finbourne.lusid.model.AccountHolderIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Scope = "example Scope";
Map<String, String> Identifiers = new Map<String, String>();


AccountHolderIdentifier accountHolderIdentifierInstance = new AccountHolderIdentifier()
    .Key(Key)
    .Scope(Scope)
    .Identifiers(Identifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
