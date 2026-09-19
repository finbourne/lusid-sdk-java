# com.finbourne.lusid.model.RecLinkKey
One item key that established a link between two rec results: the key name and the identifier value both  results' items carried for it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key name: holdingId or transactionId. | [default to String]
**value** | **String** | The identifier value both results&#39; items carried under the key. | [default to String]

```java
import com.finbourne.lusid.model.RecLinkKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Value = "example Value";


RecLinkKey recLinkKeyInstance = new RecLinkKey()
    .Key(Key)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
