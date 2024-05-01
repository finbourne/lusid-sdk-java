

# CreateRelationshipDefinitionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | **String** | The scope that the relationship definition exists in. |  |
|**code** | **String** | The code of the relationship definition. Together with the scope this uniquely defines the relationship definition. |  |
|**sourceEntityType** | **String** | The entity type of the source entity object. Allowed values are &#39;Portfolio&#39;, &#39;PortfolioGroup&#39;, &#39;Person&#39;, &#39;LegalEntity&#39;, &#39;Instrument&#39; or a custom entity type prefixed with &#39;~&#39;. |  |
|**targetEntityType** | **String** | The entity type of the target entity object. Allowed values are &#39;Portfolio&#39;, &#39;PortfolioGroup&#39;, &#39;Person&#39;, &#39;LegalEntity&#39;, &#39;Instrument&#39; or a custom entity type prefixed with &#39;~&#39;. |  |
|**displayName** | **String** | The display name of the relationship definition. |  |
|**outwardDescription** | **String** | The description to relate source entity object and target entity object. |  |
|**inwardDescription** | **String** | The description to relate target entity object and source entity object. |  |
|**lifeTime** | **String** | Describes how the relationships can change over time. Allowed values are &#39;Perpetual&#39; and &#39;TimeVariant&#39;, defaults to &#39;Perpetual&#39; if not specified. |  [optional] |
|**relationshipCardinality** | **String** | Describes the cardinality of the relationship with a specific source entity object and relationships under this definition. Allowed values are &#39;ManyToMany&#39; and &#39;ManyToOne&#39;, defaults to &#39;ManyToMany&#39; if not specified. |  [optional] |



