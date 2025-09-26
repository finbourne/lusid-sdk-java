# com.finbourne.lusid.model.InstrumentModels
Supported pricing models for an instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The unique LUSID Instrument Identifier (LUID) of the instrument. | [optional] [default to String]
**supportedModels** | **List&lt;String&gt;** | The pricing models supported by the instrument e.g. &#39;Discounting&#39;. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.InstrumentModels;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable List<String> SupportedModels = new List<String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


InstrumentModels instrumentModelsInstance = new InstrumentModels()
    .InstrumentId(InstrumentId)
    .SupportedModels(SupportedModels)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
