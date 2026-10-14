# com.finbourne.lusid.model.CounterpartyIdentifier
The legal entity a collateral agreement is made with.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idTypeScope** | **String** | The scope of the identifier type, e.g. the scope of the LEI identifier. | [default to String]
**idTypeCode** | **String** | The code of the identifier type, e.g. LEI. | [default to String]
**code** | **String** | The value of the identifier. | [default to String]

```java
import com.finbourne.lusid.model.CounterpartyIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IdTypeScope = "example IdTypeScope";
String IdTypeCode = "example IdTypeCode";
String Code = "example Code";


CounterpartyIdentifier counterpartyIdentifierInstance = new CounterpartyIdentifier()
    .IdTypeScope(IdTypeScope)
    .IdTypeCode(IdTypeCode)
    .Code(Code);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
