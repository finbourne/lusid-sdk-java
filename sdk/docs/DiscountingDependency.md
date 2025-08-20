

# DiscountingDependency

For indicating a dependency on discounting for a given currency. E.g Valuing a Bond with the Discounting model will declare a DiscountingDependency for the domestic currency of the bond to account for the time-value of the future cashFlows of the bond.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The currency that needs to be discounted. |  |
|**date** | **OffsetDateTime** | The effectiveDate of the entity that this is a dependency for. Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


