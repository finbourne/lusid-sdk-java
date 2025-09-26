# com.finbourne.lusid.model.TypedResourceId
Represents the user-defined identifier for a Legal Entity or Person.  Users can define their own, scoped identifiers for Legal Entities and Persons using identifier properties.  For example,  when used to identify a Person, the identifier defined by Person/myScope/username would be represented as   {   \"idTypeScope\": \"myScope\",   \"idTypeCode\": \"username\",   \"code\": \"john_doe_001\"   }

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idTypeScope** | **String** | The scope of the identifier&#39;s (property) definition. | [default to String]
**idTypeCode** | **String** | The code of identifier&#39;s (property) definition. This describes what the identifier represents.  For a Person this might be a username, nationalInsuranceNumber or similar.  For a Legal Entity, this might be a registeredCompanyNumber or LEI. | [default to String]
**code** | **String** | The value of the user-defined identifier in respect of the entity. | [default to String]

```java
import com.finbourne.lusid.model.TypedResourceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IdTypeScope = "example IdTypeScope";
String IdTypeCode = "example IdTypeCode";
String Code = "example Code";


TypedResourceId typedResourceIdInstance = new TypedResourceId()
    .IdTypeScope(IdTypeScope)
    .IdTypeCode(IdTypeCode)
    .Code(Code);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
