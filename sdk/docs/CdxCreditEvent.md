

# CdxCreditEvent

Definition of a credit event for credit default swap index (CDX) instruments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveDate** | **OffsetDateTime** | The date of the credit default - i.e. date on which the debt issuer defaulted on its repayment obligation. |  [optional] |
|**auctionDate** | **OffsetDateTime** | The date of the credit event auction - i.e. date on which the defaulted debt is sold via auction, and a recovery rate determined. |  [optional] |
|**recoveryRate** | **java.math.BigDecimal** | The fraction of the defaulted debt that can be recovered. |  [optional] |
|**constituentWeight** | **java.math.BigDecimal** | The relative weight of the CDX constituent. |  |
|**constituentReference** | **String** | Reference value used to identify the CDX constituent. |  [optional] |
|**paymentDate** | **OffsetDateTime** | The date of the credit event auction settlement. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


