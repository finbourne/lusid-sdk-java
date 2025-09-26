# com.finbourne.lusid.model.UpdateRelationshipDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the relation. | [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object. | [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object. | [default to String]

```java
import com.finbourne.lusid.model.UpdateRelationshipDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
String OutwardDescription = "example OutwardDescription";
String InwardDescription = "example InwardDescription";


UpdateRelationshipDefinitionRequest updateRelationshipDefinitionRequestInstance = new UpdateRelationshipDefinitionRequest()
    .DisplayName(DisplayName)
    .OutwardDescription(OutwardDescription)
    .InwardDescription(InwardDescription);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
