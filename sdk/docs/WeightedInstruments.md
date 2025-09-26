# com.finbourne.lusid.model.WeightedInstruments
Class that models a set of instruments of which each has some quantity and can be identified by a unique label.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instruments** | [**List&lt;WeightedInstrument&gt;**](WeightedInstrument.md) | The instruments that are held in the set. | [default to List<WeightedInstrument>]

```java
import com.finbourne.lusid.model.WeightedInstruments;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<WeightedInstrument> Instruments = new List<WeightedInstrument>();


WeightedInstruments weightedInstrumentsInstance = new WeightedInstruments()
    .Instruments(Instruments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
