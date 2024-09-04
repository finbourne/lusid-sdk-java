

# CdsCreditEvent

Definition of a credit event for credit default swap (CDS) instruments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultDate** | **OffsetDateTime** | The date of the credit default - i.e. date on which the debt issuer defaulted on its repayment obligation. |  |
|**auctionDate** | **OffsetDateTime** | The date of the credit event auction - i.e. date on which the defaulted debt is sold via auction, and a recovery rate determined. |  [optional] |
|**recoveryRate** | **java.math.BigDecimal** | The fraction of the defaulted debt that can be recovered. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


