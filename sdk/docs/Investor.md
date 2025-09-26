# com.finbourne.lusid.model.Investor
Representation of an Investor on the LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorType** | **String** | The type of the Investor | [optional] [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The identifiers of the Investor | [optional] [default to Map<String, String>]
**entityUniqueId** | **String** | The unique Investor entity identifier | [optional] [default to String]
**person** | [**Person**](Person.md) |  | [optional] [default to Person]
**legalEntity** | [**LegalEntity**](LegalEntity.md) |  | [optional] [default to LegalEntity]

```java
import com.finbourne.lusid.model.Investor;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InvestorType = "example InvestorType";
@jakarta.annotation.Nullable Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
Person Person = new Person();
LegalEntity LegalEntity = new LegalEntity();


Investor investorInstance = new Investor()
    .InvestorType(InvestorType)
    .Identifiers(Identifiers)
    .EntityUniqueId(EntityUniqueId)
    .Person(Person)
    .LegalEntity(LegalEntity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
