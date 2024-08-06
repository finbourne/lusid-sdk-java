

# SecurityElection

Security election for Events that result in equity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**electionKey** | **String** | Unique key associated to this election. |  |
|**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. |  [optional] |
|**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. |  [optional] |
|**price** | **java.math.BigDecimal** | Price per unit of the security. At least one of UnitsRatio or Price must be provided.  Price must non-zero. |  [optional] |
|**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


