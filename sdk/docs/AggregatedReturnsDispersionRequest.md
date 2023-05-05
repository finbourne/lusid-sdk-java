

# AggregatedReturnsDispersionRequest

The request used in the AggregatedReturnsDispersionMetric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toEffectiveAt** | **String** | The end date for when the you want the dispersion to be calculated. |  [optional]
**yearsCount** | **Integer** | For how many years to calculate the dispersion. Default to 10. |  [optional]
**returnIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Scope and code of the returns. |  [optional]
**recipeId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**compositeMethod** | **String** | The method used to calculate the Portfolio performance: Equal/Asset. |  [optional]
**alternativeInceptionDate** | **String** | Optional - either a date, or the key for a portfolio property containing a date. If provided, the given date will override the inception date for this request. |  [optional]



