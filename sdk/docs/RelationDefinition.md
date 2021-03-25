

# RelationDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  |  [optional]
**relationDefinitionId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**sourceEntityDomain** | **String** | The entity domain of the source entity object. |  [optional]
**targetEntityDomain** | **String** | The entity domain of the target entity object. |  [optional]
**displayName** | **String** | The display name of the relation. |  [optional]
**outwardDescription** | **String** | The description to relate source entity object and target entity object |  [optional]
**inwardDescription** | **String** | The description to relate target entity object and source entity object |  [optional]
**lifeTime** | **String** | Describes how the relations can change over time, allowed values are \&quot;Perpetual\&quot; and \&quot;TimeVariant\&quot; |  [optional]
**constraintStyle** | **String** | Describes the uniqueness and cardinality for relations with a specific source entity object and relations under this definition. Allowed values are \&quot;Property\&quot; and \&quot;Collection\&quot;, defaults to \&quot;Collection\&quot; if not specified. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



