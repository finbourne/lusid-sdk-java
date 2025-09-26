# com.finbourne.lusid.model.CreateRelationshipDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the relationship definition exists in. | [default to String]
**code** | **String** | The code of the relationship definition. Together with the scope this uniquely defines the relationship definition. | [default to String]
**sourceEntityType** | **String** | The entity type of the source entity object. Allowed values are &#39;Portfolio&#39;, &#39;PortfolioGroup&#39;, &#39;Person&#39;, &#39;LegalEntity&#39;, &#39;Instrument&#39; or a custom entity type prefixed with &#39;~&#39;. | [default to String]
**targetEntityType** | **String** | The entity type of the target entity object. Allowed values are &#39;Portfolio&#39;, &#39;PortfolioGroup&#39;, &#39;Person&#39;, &#39;LegalEntity&#39;, &#39;Instrument&#39; or a custom entity type prefixed with &#39;~&#39;. | [default to String]
**displayName** | **String** | The display name of the relationship definition. | [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object. | [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object. | [default to String]
**lifeTime** | **String** | Describes how the relationships can change over time. Allowed values are &#39;Perpetual&#39; and &#39;TimeVariant&#39;, defaults to &#39;Perpetual&#39; if not specified. | [optional] [default to String]
**relationshipCardinality** | **String** | Describes the cardinality of the relationship with a specific source entity object and relationships under this definition. Allowed values are &#39;ManyToMany&#39; and &#39;ManyToOne&#39;, defaults to &#39;ManyToMany&#39; if not specified. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreateRelationshipDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String SourceEntityType = "example SourceEntityType";
String TargetEntityType = "example TargetEntityType";
String DisplayName = "example DisplayName";
String OutwardDescription = "example OutwardDescription";
String InwardDescription = "example InwardDescription";
@jakarta.annotation.Nullable String LifeTime = "example LifeTime";
@jakarta.annotation.Nullable String RelationshipCardinality = "example RelationshipCardinality";


CreateRelationshipDefinitionRequest createRelationshipDefinitionRequestInstance = new CreateRelationshipDefinitionRequest()
    .Scope(Scope)
    .Code(Code)
    .SourceEntityType(SourceEntityType)
    .TargetEntityType(TargetEntityType)
    .DisplayName(DisplayName)
    .OutwardDescription(OutwardDescription)
    .InwardDescription(InwardDescription)
    .LifeTime(LifeTime)
    .RelationshipCardinality(RelationshipCardinality);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
