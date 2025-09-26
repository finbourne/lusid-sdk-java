# com.finbourne.lusid.model.GeneratedEventDiagnostics
Represents a set of diagnostics per generatedEvent, where applicable.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventId** | **String** |  | [default to String]
**type** | **String** |  | [default to String]
**detail** | **String** |  | [default to String]
**errorDetails** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.lusid.model.GeneratedEventDiagnostics;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentEventId = "example InstrumentEventId";
String Type = "example Type";
String Detail = "example Detail";
List<String> ErrorDetails = new List<String>();


GeneratedEventDiagnostics generatedEventDiagnosticsInstance = new GeneratedEventDiagnostics()
    .InstrumentEventId(InstrumentEventId)
    .Type(Type)
    .Detail(Detail)
    .ErrorDetails(ErrorDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
