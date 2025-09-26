# com.finbourne.lusid.model.CreateRelationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceEntityId** | **Map&lt;String, String&gt;** | The identifier of the source entity. | [default to Map<String, String>]
**targetEntityId** | **Map&lt;String, String&gt;** | The identifier of the target entity. | [default to Map<String, String>]

```java
import com.finbourne.lusid.model.CreateRelationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> SourceEntityId = new Map<String, String>();
Map<String, String> TargetEntityId = new Map<String, String>();


CreateRelationRequest createRelationRequestInstance = new CreateRelationRequest()
    .SourceEntityId(SourceEntityId)
    .TargetEntityId(TargetEntityId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
