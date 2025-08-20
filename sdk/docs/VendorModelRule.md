

# VendorModelRule

A rule that identifies the set of preferences to be used for a given library, model and instrument type. There can be many such rules, though only the first found for a given combination would be used.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**supplier** | [**SupplierEnum**](#SupplierEnum) | The available values are: Lusid, RefinitivQps, RefinitivTracsWeb, VolMaster, IsdaCds, YieldBook, LusidCalc |  |
|**modelName** | **String** | The vendor library model name |  |
|**instrumentType** | **String** | The vendor library instrument type |  |
|**parameters** | **String** | THIS FIELD IS DEPRECATED - use ModelOptions The set of opaque model parameters, provided as a Json object, that is a string object which will internally be converted to a dictionary of string to object. Note that this is not intended as the final form of this object. It will be replaced with a more structured object as the set of parameters that are possible is better understood. |  [optional] |
|**modelOptions** | [**ModelOptions**](ModelOptions.md) |  |  [optional] |
|**instrumentId** | **String** | This field should generally not be required. It indicates a specific case where there is a particular need to make a rule apply to only a single instrument specified by an identifier on that instrument such as its LUID. One particular example would be to control the behaviour of a look-through portfolio scaling methodology, such as where there is a mixture of indices and credit-debit portfolios where scaling on the sum of valuation would be deemed incorrectly for one set but desired in general. |  [optional] |
|**addressKeyFilters** | [**List&lt;AddressKeyFilter&gt;**](AddressKeyFilter.md) | Condition for model selection. If a condition is satisfied the default model for valuation is overridden (for that instrument). |  [optional] |



## Enum: SupplierEnum

| Name | Value |
|---- | -----|
| LUSID | &quot;Lusid&quot; |
| REFINITIVQPS | &quot;RefinitivQps&quot; |
| REFINITIVTRACSWEB | &quot;RefinitivTracsWeb&quot; |
| VOLMASTER | &quot;VolMaster&quot; |
| ISDACDS | &quot;IsdaCds&quot; |
| YIELDBOOK | &quot;YieldBook&quot; |
| LUSIDCALC | &quot;LusidCalc&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


