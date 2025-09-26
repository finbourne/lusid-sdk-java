# com.finbourne.lusid.model.LusidUniqueId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type for the LUSID unique id, this will depend on the type of entity found, for instance &#39;Instrument&#39; would have a value of &#39;LusidInstrumentId&#39; | [default to String]
**value** | **String** | The value for the LUSID unique id | [default to String]

```java
import com.finbourne.lusid.model.LusidUniqueId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Value = "example Value";


LusidUniqueId lusidUniqueIdInstance = new LusidUniqueId()
    .Type(Type)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
