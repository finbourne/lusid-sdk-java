# com.finbourne.lusid.model.NewInstrument
Set of identifiers of an existing instrument that will be the subject or distribution of a corporate action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**instrumentScope** | **String** | The scope in which the instrument lies, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**domCcy** | **String** | The domestic currency of the instrument, resolved from the instrument identifiers. | [optional] [readonly] [default to String]

```java
import com.finbourne.lusid.model.NewInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String DomCcy = "example DomCcy";


NewInstrument newInstrumentInstance = new NewInstrument()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .DomCcy(DomCcy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
