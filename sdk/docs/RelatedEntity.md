# com.finbourne.lusid.model.RelatedEntity
Information about the other related entity in the relationship

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity. | [default to String]
**entityId** | **Map&lt;String, String&gt;** | The identifier of the other related entity in the relationship. It contains &#39;scope&#39; and &#39;code&#39; as keys for identifiers of a Portfolio or Portfolio Group, or &#39;idTypeScope&#39;, &#39;idTypeCode&#39;, &#39;code&#39; as keys for identifiers of a Person or Legal entity, or &#39;scope&#39;, &#39;identifierType&#39;, &#39;identifierValue&#39; as keys for identifiers of an Instrument | [default to Map<String, String>]
**displayName** | **String** | The display name of the entity. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties of the entity. This field is empty until further notice. | [optional] [default to Map<String, Property>]
**scope** | **String** | The scope of the identifier | [optional] [default to String]
**lusidUniqueId** | [**LusidUniqueId**](LusidUniqueId.md) |  | [optional] [default to LusidUniqueId]
**identifiers** | [**List&lt;EntityIdentifier&gt;**](EntityIdentifier.md) | The identifiers of the related entity in the relationship. | [default to List<EntityIdentifier>]
**href** | [**URI**](URI.md) | The link to the entity. | [optional] [default to URI]

```java
import com.finbourne.lusid.model.RelatedEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntityType = "example EntityType";
Map<String, String> EntityId = new Map<String, String>();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable String Scope = "example Scope";
LusidUniqueId LusidUniqueId = new LusidUniqueId();
List<EntityIdentifier> Identifiers = new List<EntityIdentifier>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");


RelatedEntity relatedEntityInstance = new RelatedEntity()
    .EntityType(EntityType)
    .EntityId(EntityId)
    .DisplayName(DisplayName)
    .Properties(Properties)
    .Scope(Scope)
    .LusidUniqueId(LusidUniqueId)
    .Identifiers(Identifiers)
    .Href(Href);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
