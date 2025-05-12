

# ReturnsEntity

Returns entity, used for configuring the calculation of aggregated returns.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**recipeId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**recipeEntity** | **String** | Entity a recipe is retrieved from for use in the aggregated returns calculation. Either RecipeId or RecipeEntity must be specified. |  [optional] |
|**feeHandling** | **String** | Configures how fees are handled in the aggregated returns calculation. |  [optional] |
|**flowHandling** | **String** | Configures how flows are handled in the aggregated returns calculation. |  [optional] |
|**businessCalendar** | **String** | Calendar used in the aggregated returns calculation. |  [optional] |
|**handleFlowDiscrepancy** | **String** | Configures handling for the case where net flows do not match the sum of tagged flows. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


