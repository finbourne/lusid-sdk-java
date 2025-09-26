# com.finbourne.lusid.model.SetPersonIdentifiersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Identifiers to set for a Person. Identifiers not included in the request will not be amended. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.SetPersonIdentifiersRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, Property> Identifiers = new Map<String, Property>();


SetPersonIdentifiersRequest setPersonIdentifiersRequestInstance = new SetPersonIdentifiersRequest()
    .Identifiers(Identifiers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
