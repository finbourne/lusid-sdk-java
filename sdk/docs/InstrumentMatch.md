# com.finbourne.lusid.model.InstrumentMatch
A collection of instrument search results

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**masteredInstruments** | [**List&lt;InstrumentDefinition&gt;**](InstrumentDefinition.md) | The collection of instruments found by the search which have been mastered within LUSID. | [optional] [default to List<InstrumentDefinition>]
**externalInstruments** | [**List&lt;InstrumentDefinition&gt;**](InstrumentDefinition.md) | The collection of instruments found by the search which have not been mastered within LUSID and instead found via OpenFIGI. | [optional] [default to List<InstrumentDefinition>]

```java
import com.finbourne.lusid.model.InstrumentMatch;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<InstrumentDefinition> MasteredInstruments = new List<InstrumentDefinition>();
@jakarta.annotation.Nullable List<InstrumentDefinition> ExternalInstruments = new List<InstrumentDefinition>();


InstrumentMatch instrumentMatchInstance = new InstrumentMatch()
    .MasteredInstruments(MasteredInstruments)
    .ExternalInstruments(ExternalInstruments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
