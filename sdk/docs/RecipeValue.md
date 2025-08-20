

# RecipeValue

Recipe value represents a data that is then used to perform an atomic operation which is then used in composition of Configuration Recipe. This object either includes the data itself (in json form or as simple string) or is a reference where the data can be obtained from (from a Configuration Recipe say). Only one field is to be populated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asJson** | **String** | Field to allow providing a potentially complex json value. |  [optional] |
|**asString** | **String** | For simple value, a single input value, note complex nested objects are not allowed here. |  [optional] |
|**fromRecipe** | [**FromRecipe**](FromRecipe.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


