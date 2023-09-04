

# CashFlowLineage

Lineage for cash flow value

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentType** | **String** | The instrument type of the instrument to which the cash flow belongs to. When upserting CashFlowValues, this  should be null. |  [optional] |
|**cashFlowType** | **String** | The cashflow type.When upserting CashFlowValues, this should be null, or one of [Unknown, Coupon, Notional,  Premium, Principal, Protection, Cash] |  [optional] |
|**instrumentId** | **String** | The LUID of the instrument to which the cash flow belongs to. When upserting this should be null. |  [optional] |
|**legId** | **String** | The leg id to which the cash flow belongs to. |  [optional] |
|**sourceTransactionId** | **String** | The source transaction of the instrument to which the cash flow belongs to. When upserting this should be null |  [optional] |
|**payReceive** | **String** | Does the cash flow belong to the Pay or Receive leg. When upserting this should either be null or one of [Pay, Receive, NotApplicable] |  [optional] |



