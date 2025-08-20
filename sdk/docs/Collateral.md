

# Collateral

Representation of the collateral of a repurchase agreement, along with related details of the agreement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buyerReceivesCashflows** | **Boolean** | Does the buyer of the FlexibleRepo receive the cashflows from any collateral instruments, or do they get paid to the seller. |  |
|**buyerReceivesCorporateActionPayments** | **Boolean** | Does the buyer of the FlexibleRepo receive any dividend or cash payments as the result of a corporate action on any of the collateral instruments, or are these amounts paid to the seller. Referred to as \&quot;manufactured payments\&quot; in the UK, and valid only under a repo with GMRA in Europe |  |
|**collateralInstruments** | [**List&lt;CollateralInstrument&gt;**](CollateralInstrument.md) | List of any collateral instruments. |  [optional] |
|**collateralValue** | **java.math.BigDecimal** | Total value of the collateral before any margin or haircut applied. Can be provided instead of PurchasePrice, so that PurchasePrice can be inferred from the CollateralValue and one of Haircut or Margin. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


