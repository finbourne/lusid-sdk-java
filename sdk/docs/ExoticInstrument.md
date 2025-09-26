# com.finbourne.lusid.model.ExoticInstrument
LUSID representation of a generic OTC Exotic Instrument that is not fully defined within other LUSID models.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentFormat** | [**InstrumentDefinitionFormat**](InstrumentDefinitionFormat.md) |  | [default to InstrumentDefinitionFormat]
**content** | **String** | The original document received into the system. This format could potentially be anything though is most likely to be either Json or Xml. In the case where no other  interface is supported it is possible to fall back onto this.  For example, a trade from an external client system. This may be recognized internally by Lusid or simply passed through to another vendor system. | [default to String]

```java
import com.finbourne.lusid.model.ExoticInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

InstrumentDefinitionFormat InstrumentFormat = new InstrumentDefinitionFormat();
String Content = "example Content";


ExoticInstrument exoticInstrumentInstance = new ExoticInstrument()
    .InstrumentFormat(InstrumentFormat)
    .Content(Content);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
