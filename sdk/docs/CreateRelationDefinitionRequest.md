# com.finbourne.lusid.model.CreateRelationDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the relation exists in. | [default to String]
**code** | **String** | The code of the relation. Together with the scope this uniquely defines the relation. | [default to String]
**sourceEntityDomain** | **String** | The entity domain of the source entity object must be, allowed values are \&quot;Portfolio\&quot; and \&quot;Person\&quot; | [default to String]
**targetEntityDomain** | **String** | The entity domain of the target entity object must be, allowed values are \&quot;Portfolio\&quot; and \&quot;Person\&quot; | [default to String]
**displayName** | **String** | The display name of the relation. | [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object. | [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object. | [default to String]
**lifeTime** | **String** | Describes how the relations can change over time, allowed values are \&quot;Perpetual\&quot; and \&quot;TimeVariant\&quot; | [optional] [default to String]
**constraintStyle** | **String** | Describes the uniqueness and cardinality for relations with a specific source entity object and relations under this definition. Allowed values are \&quot;Property\&quot; and \&quot;Collection\&quot;, defaults to \&quot;Collection\&quot; if not specified. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreateRelationDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String SourceEntityDomain = "example SourceEntityDomain";
String TargetEntityDomain = "example TargetEntityDomain";
String DisplayName = "example DisplayName";
String OutwardDescription = "example OutwardDescription";
String InwardDescription = "example InwardDescription";
@jakarta.annotation.Nullable String LifeTime = "example LifeTime";
@jakarta.annotation.Nullable String ConstraintStyle = "example ConstraintStyle";


CreateRelationDefinitionRequest createRelationDefinitionRequestInstance = new CreateRelationDefinitionRequest()
    .Scope(Scope)
    .Code(Code)
    .SourceEntityDomain(SourceEntityDomain)
    .TargetEntityDomain(TargetEntityDomain)
    .DisplayName(DisplayName)
    .OutwardDescription(OutwardDescription)
    .InwardDescription(InwardDescription)
    .LifeTime(LifeTime)
    .ConstraintStyle(ConstraintStyle);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
