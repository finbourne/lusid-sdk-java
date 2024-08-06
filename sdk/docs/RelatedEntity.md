

# RelatedEntity

Information about the other related entity in the relationship

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | **String** | The type of the entity. |  |
|**entityId** | **Map&lt;String, String&gt;** | The identifier of the other related entity in the relationship. It contains &#39;scope&#39; and &#39;code&#39; as keys for identifiers of a Portfolio or Portfolio Group, or &#39;idTypeScope&#39;, &#39;idTypeCode&#39;, &#39;code&#39; as keys for identifiers of a Person or Legal entity, or &#39;scope&#39;, &#39;identifierType&#39;, &#39;identifierValue&#39; as keys for identifiers of an Instrument |  |
|**displayName** | **String** | The display name of the entity. |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties of the entity. This field is empty until further notice. |  [optional] |
|**scope** | **String** | The scope of the identifier |  [optional] |
|**lusidUniqueId** | [**LusidUniqueId**](LusidUniqueId.md) |  |  [optional] |
|**identifiers** | [**List&lt;EntityIdentifier&gt;**](EntityIdentifier.md) | The identifiers of the related entity in the relationship. |  |
|**href** | **URI** | The link to the entity. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


