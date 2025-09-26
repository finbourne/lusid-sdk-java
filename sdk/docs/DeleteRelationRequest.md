# com.finbourne.lusid.model.DeleteRelationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceEntityId** | **Map&lt;String, String&gt;** | The identifier of the source entity of the relation to be deleted. | [default to Map<String, String>]
**targetEntityId** | **Map&lt;String, String&gt;** | The identifier of the target entity of the relation to be deleted. | [default to Map<String, String>]

```java
import com.finbourne.lusid.model.DeleteRelationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> SourceEntityId = new Map<String, String>();
Map<String, String> TargetEntityId = new Map<String, String>();


DeleteRelationRequest deleteRelationRequestInstance = new DeleteRelationRequest()
    .SourceEntityId(SourceEntityId)
    .TargetEntityId(TargetEntityId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
