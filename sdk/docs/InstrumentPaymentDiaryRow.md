

# InstrumentPaymentDiaryRow

An individual row containing details of a single cashflow in the diary.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quantity** | **java.math.BigDecimal** | The quantity (amount) that will be paid. Note that this can be empty if the payment is in the future and a model is used that cannot estimate it. |  [optional] |
|**currency** | **String** | The payment currency of the cash flow. |  [optional] |
|**paymentDate** | **OffsetDateTime** | The date at which the given cash flow is due to be paid. |  [optional] |
|**payOrReceive** | **String** | Does the cash flow belong to the Pay or Receive leg. |  [optional] |
|**accrualStart** | **OffsetDateTime** | The date on which accruals start for this cashflow. |  [optional] |
|**accrualEnd** | **OffsetDateTime** | The date on which accruals end for this cashflow. |  [optional] |
|**cashFlowType** | **String** | The type of cashflow. |  [optional] |
|**isCashFlowDetermined** | **Boolean** | Is the cashflow determined as of the effective date time. |  [optional] |
|**isCashFlowHistoric** | **Boolean** | Has the cashflow been paid, i.e. has it become a historic cashflow, as of the date and time pointed to be effectiveAt. |  [optional] |
|**discountFactor** | **java.math.BigDecimal** | Weighting factor to discount cashflow to the present value. |  [optional] |
|**discountedExpectedCashFlowAmount** | **java.math.BigDecimal** | The expected cashflow amount taking into account the discount factor. |  [optional] |
|**dayCountFraction** | **java.math.BigDecimal** | The day count fraction, if appropriate. |  [optional] |
|**forwardRate** | **java.math.BigDecimal** | Forward rate for cash flow if appropriate. (as in for a rates fixed or floating leg) |  [optional] |
|**resetRate** | **java.math.BigDecimal** | The value of the reset, if any. |  [optional] |
|**spread** | **java.math.BigDecimal** | The spread that exists on the payoff. |  [optional] |



