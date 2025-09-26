# com.finbourne.lusid.model.CounterpartySignatory
The counterpartyAgreement is signed by two parties, one of which is implicitly the LUSID user.  The CounterpartySignatory represents the 'other side' of the agreement.  It comprises a name and identifier for a Legal Entity in LUSID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A user-defined name or label for the counterparty signatory. There is no requirement for this to match the \&quot;displayName\&quot; of the legal entity. | [default to String]
**legalEntityIdentifier** | [**TypedResourceId**](TypedResourceId.md) |  | [default to TypedResourceId]

```java
import com.finbourne.lusid.model.CounterpartySignatory;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
TypedResourceId LegalEntityIdentifier = new TypedResourceId();


CounterpartySignatory counterpartySignatoryInstance = new CounterpartySignatory()
    .Name(Name)
    .LegalEntityIdentifier(LegalEntityIdentifier);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
