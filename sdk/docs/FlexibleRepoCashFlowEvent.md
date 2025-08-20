

# FlexibleRepoCashFlowEvent

Definition of FlexibleRepoCashFlowEvent which represents a cash transfer as part of a repo contract modelled as a FlexibleRepo, either as part of the purchase leg or repurchase leg, or any early closure.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settlementDate** | **OffsetDateTime** | Date that the cash payment settles. This is a required field. |  [optional] |
|**entitlementDate** | **OffsetDateTime** | Date the recipient of the cash payment is entitled to receive the cash. This is a required field. |  [optional] |
|**currency** | **String** | Currency of the payment. This is a required field. |  |
|**cashFlowPerUnit** | **java.math.BigDecimal** | Amount of cash to be paid per unit of the instrument. This amount is signed to indicate direction of the payment, i.e. as part of the purchase leg vs the repurchase leg. This field is optional. If not specified, the system will not generate a virtual transaction for this event. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


