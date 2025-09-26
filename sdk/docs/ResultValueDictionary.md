# com.finbourne.lusid.model.ResultValueDictionary
Result value for a collection of key-value pairs. Used for diagnostics associated to a cash flow, etc.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**elements** | [**Map&lt;String, ResultValue&gt;**](ResultValue.md) | The dictionary elements | [optional] [default to Map<String, ResultValue>]

```java
import com.finbourne.lusid.model.ResultValueDictionary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, ResultValue> Elements = new Map<String, ResultValue>();


ResultValueDictionary resultValueDictionaryInstance = new ResultValueDictionary()
    .Elements(Elements);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
