

# MappingRule

An individual mapping rule, for mapping between a left and right field/property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**left** | **String** | The name of the field/property in the left resource (e.g. a transaction) |  [optional] |
|**right** | **String** | The name of the field/property in the right resource (e.g. a transaction) |  [optional] |
|**comparisonType** | **String** | The type of comparison to be performed |  [optional] |
|**comparisonValue** | **java.math.BigDecimal** | The (optional) value used with Finbourne.WebApi.Interface.Dto.Mappings.MappingRule.ComparisonType |  [optional] |
|**weight** | **java.math.BigDecimal** | A factor used to influence the importance of this item. |  [optional] |
|**mappedStrings** | [**List&lt;MappedString&gt;**](MappedString.md) | The (optional) value used to map string values. |  [optional] |
|**isCaseSensitive** | **Boolean** | Should string comparisons take case into account, defaults to &#x60;false&#x60;. |  [optional] |



