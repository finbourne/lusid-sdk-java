

# RepoPartialClosureEvent

Event representing the partial closure of a repurchase  agreement. Each event reduces the outstanding notional  and generates a corresponding receive-leg cashflow. The  final maturity cashflow is adjusted accordingly.  If multiple events are created, their effects compound.  Once the total repaid amount reaches the original purchase  price, no further receive-leg cashflows are generated. Any  event exceeding the remaining notional is marked with a  diagnostic to indicate it is invalid due to excessive repayment.  For example, for a repo with a 5% rate, 1% haircut and  collateral value of 100 (purchase price = 99), a partial  closure of cash amount 10 followed by one of 100 results in  only the first event producing a cashflow. The second,  exceeding the remaining balance, is ignored and flagged  with a diagnostic. The remaining balance is settled at  maturity of the repurchase agreement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entitlementDate** | **OffsetDateTime** | The date on which the counterparties become entitled  to exchange cash as part of a partial closure of the  repurchase agreement. The date must be before or on  the settlement date, and on or before the maturity  date of the repo. This is a required field. |  [optional] |
|**settlementDate** | **OffsetDateTime** | The date on which the exchange of cash is settled.  The date must be on or after the entitlement date, and on or before the maturity date of the repo.  This is a required field. |  [optional] |
|**cashAmount** | **java.math.BigDecimal** | The amount of cash to be exchanged as part of  a partial closure of the repurchase agreement. It cannot be more than the initial amount of  cash at the start of the repo. |  [optional] |
|**cashPercentage** | **java.math.BigDecimal** | Represents the proportion of cash exchanged, as  a value between 0 and 1, relative to the total  cash involved in the repurchase agreement. This value adjusts with each partial closure,  because the total cash amount is reduced. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


