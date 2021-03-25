

# CreateRelationDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the relation exists in. | 
**code** | **String** | The code of the relation. Together with the scope this uniquely defines the relation. | 
**sourceEntityDomain** | **String** | The entity domain of the source entity object must be, allowed values are \&quot;Portfolio\&quot; and \&quot;Person\&quot; | 
**targetEntityDomain** | **String** | The entity domain of the target entity object must be, allowed values are \&quot;Portfolio\&quot; and \&quot;Person\&quot; | 
**displayName** | **String** | The display name of the relation. | 
**outwardDescription** | **String** | The description to relate source entity object and target entity object. | 
**inwardDescription** | **String** | The description to relate target entity object and source entity object. | 
**lifeTime** | **String** | Describes how the relations can change over time, allowed values are \&quot;Perpetual\&quot; and \&quot;TimeVariant\&quot; |  [optional]
**constraintStyle** | **String** | Describes the uniqueness and cardinality for relations with a specific source entity object and relations under this definition. Allowed values are \&quot;Property\&quot; and \&quot;Collection\&quot;, defaults to \&quot;Collection\&quot; if not specified. |  [optional]



