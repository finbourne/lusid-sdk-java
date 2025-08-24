

# FlexibleRepoCollateralEvent

Definition of FlexibleRepoCollateralEvent which represents a single collateral transfer as part of a repo contract  modelled as a FlexibleRepo, either as part of the purchase leg or repurchase leg, or any early closure.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settlementDate** | **OffsetDateTime** | Date at which the transfer of units settles. This is a required field. |  [optional] |
|**entitlementDate** | **OffsetDateTime** | Date at which the recipient of the collateral is entitled to the units being transferred. This is a required field. |  [optional] |
|**amount** | **java.math.BigDecimal** | The total amount of collateral being transferred as part of the repo contract.  Signed to indicate direction of transfer. This is a required field. |  |
|**collateralInstrument** | [**NewInstrument**](NewInstrument.md) |  |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


