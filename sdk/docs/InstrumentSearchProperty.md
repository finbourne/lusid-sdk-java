# com.finbourne.lusid.model.InstrumentSearchProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The property key of instrument property to search for. This will be from the &#39;Instrument&#39; domain and will take the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Isin&#39; or &#39;Instrument/MyScope/AssetClass&#39;. | [default to String]
**value** | **String** | The value of the property e.g. &#39;US0378331005&#39; or &#39;Equity&#39;. | [default to String]

```java
import com.finbourne.lusid.model.InstrumentSearchProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Value = "example Value";


InstrumentSearchProperty instrumentSearchPropertyInstance = new InstrumentSearchProperty()
    .Key(Key)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
