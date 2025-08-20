

# CreditPremiumCashFlowEvent

Definition of a credit premium cash flow event. This event describes a premium cashflow for credit default instruments (CDS or CDX).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exDate** | **OffsetDateTime** | The ex-dividend date of the cashflow. |  [optional] |
|**paymentDate** | **OffsetDateTime** | The payment date of the cashflow. |  [optional] |
|**currency** | **String** | The currency in which the cashflow is paid. |  |
|**cashFlowPerUnit** | **java.math.BigDecimal** | The cashflow amount received for each unit of the instrument held on the ex date. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


