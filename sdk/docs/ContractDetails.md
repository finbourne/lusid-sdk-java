# com.finbourne.lusid.model.ContractDetails
Set of identifiers of an existing FlexibleLoan contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier - readonly field, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**instrumentScope** | **String** | The scope in which the FlexibleLoan instrument lies - readonly field, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**instrumentName** | **String** | The name of the FlexibleLoan instrument - readonly field, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**domCcy** | **String** | The domestic currency of the instrument - readonly field, resolved from the instrument identifiers. | [optional] [readonly] [default to String]

```java
import com.finbourne.lusid.model.ContractDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable String DomCcy = "example DomCcy";


ContractDetails contractDetailsInstance = new ContractDetails()
    .Identifiers(Identifiers)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .InstrumentName(InstrumentName)
    .DomCcy(DomCcy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
