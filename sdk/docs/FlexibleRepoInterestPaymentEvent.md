

# FlexibleRepoInterestPaymentEvent

Definition of FlexibleRepoInterestPaymentEvent, which represents the regular interest payments associated with an open repo contract modelled as a FlexibleRepo.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settlementDate** | **OffsetDateTime** | Settlement date of the interest payment. This is a required field. |  [optional] |
|**entitlementDate** | **OffsetDateTime** | EntitlementDate of the interest payment. This is a required field. |  [optional] |
|**currency** | **String** | Currency of the interest payment. This is a required field. |  |
|**interestPerUnit** | **java.math.BigDecimal** | Interest payment per unit held of the FlexibleRepo. This field is optional. If not specified, the system will not generate a virtual transaction for this event |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


