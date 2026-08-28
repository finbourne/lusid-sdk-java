# com.finbourne.lusid.model.FundInstrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers. Must only point to the same instrument | [default to Map<String, String>]

```java
import com.finbourne.lusid.model.FundInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> InstrumentIdentifiers = new Map<String, String>();


FundInstrument fundInstrumentInstance = new FundInstrument()
    .InstrumentIdentifiers(InstrumentIdentifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
