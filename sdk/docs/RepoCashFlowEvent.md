

# RepoCashFlowEvent

Event representing a repurchase agreement cashflow.   For example, cashflow for a partial closure of the   repurchase agreement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entitlementDate** | **OffsetDateTime** | The date on which the counterparties become entitled   to exchange cash as part of a partial closure of the   repurchase agreement. The date must be before or on   the settlement date, and on or before the maturity   date of the repo. This is a required field. |  [optional] |
|**settlementDate** | **OffsetDateTime** | The date on which the exchange of cash is settled.   The date must be on or after the entitlement date,  and on or before the maturity date of the repo.   This is a required field. |  [optional] |
|**cashFlowPerUnit** | **java.math.BigDecimal** | The amount of cash to be exchanged for each unit   of the instrument held on the entitlement date. |  |
|**currency** | **String** | The currency in which the cashflow is paid. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


