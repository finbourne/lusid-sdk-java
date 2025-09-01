

# CapletFloorletCashFlowEvent

Definition of a cap or floor (or collar) cash flow event.  This is an event that describes the occurence of a caplet or floorlet payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entitlementDate** | **OffsetDateTime** | Ex-Dividend / entitlement date of the cashflow payment.  Required field. |  [optional] |
|**paymentDate** | **OffsetDateTime** | Payment date of the cashflow payment  Required field. |  [optional] |
|**currency** | **String** | Currency of the cashflow payment |  |
|**cashFlowPerUnit** | **java.math.BigDecimal** | The total payment per unit of the held instrument, if entitled.  Not required. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


