# com.finbourne.lusid.model.ReferenceInstrument
LUSID representation of a reference to another instrument that has already been loaded (e.g. a lookthrough to a portfolio).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The Identifier code | [default to String]
**instrumentIdType** | **String** | The type of the instrument id e.g. LusidInstrument Id | [default to String]
**scope** | **String** | Scope for the instrument (optional) | [default to String]

```java
import com.finbourne.lusid.model.ReferenceInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentId = "example InstrumentId";
String InstrumentIdType = "example InstrumentIdType";
String Scope = "example Scope";


ReferenceInstrument referenceInstrumentInstance = new ReferenceInstrument()
    .InstrumentId(InstrumentId)
    .InstrumentIdType(InstrumentIdType)
    .Scope(Scope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
