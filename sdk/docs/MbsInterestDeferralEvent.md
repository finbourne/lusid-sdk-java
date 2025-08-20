

# MbsInterestDeferralEvent

Definition of an MBS Interest Deferral Event This is an event that describes the occurence of a cashflow due to unpaid interest that was deferred and capitalised into the outstanding principal balance of a mortgage-backed security.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exDate** | **OffsetDateTime** | The ex date (entitlement date) of the interest payment, usually several weeks prior to the payment date |  [optional] |
|**paymentDate** | **OffsetDateTime** | The payment date of the interest that is deferred and capitalised |  [optional] |
|**currency** | **String** | The currency in which the interest amount is notated |  |
|**interestPerUnit** | **java.math.BigDecimal** | The interest amount to be deferred and capitalised for each unit of the instrument held on the ex date |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


