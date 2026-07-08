# com.finbourne.lusid.model.EventInheritance
The information that determines the rules for instrument event inheritance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parentCorporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.lusid.model.EventInheritance;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ParentCorporateActionSourceId = new ResourceId();


EventInheritance eventInheritanceInstance = new EventInheritance()
    .ParentCorporateActionSourceId(ParentCorporateActionSourceId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
