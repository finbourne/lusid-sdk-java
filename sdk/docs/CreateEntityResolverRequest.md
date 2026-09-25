# com.finbourne.lusid.model.CreateEntityResolverRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**entityType** | **String** | The entity type that a specific resolution configuration is applicable to (e.g. Instrument). | [default to String]
**description** | **String** | Describes what this specific identifier order is used for. | [optional] [default to String]
**identifierMatchingOrder** | [**List&lt;IdentifierForResolution&gt;**](IdentifierForResolution.md) | Ordered collection of related identifier keys that are used to define which identifier takes priority in resolving an entity. | [default to List<IdentifierForResolution>]

```java
import com.finbourne.lusid.model.CreateEntityResolverRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String EntityType = "example EntityType";
@jakarta.annotation.Nullable String Description = "example Description";
List<IdentifierForResolution> IdentifierMatchingOrder = new List<IdentifierForResolution>();


CreateEntityResolverRequest createEntityResolverRequestInstance = new CreateEntityResolverRequest()
    .Id(Id)
    .EntityType(EntityType)
    .Description(Description)
    .IdentifierMatchingOrder(IdentifierMatchingOrder);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
