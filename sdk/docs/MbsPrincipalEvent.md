

# MbsPrincipalEvent

Definition of an MBS Principal Event This is an event that describes the occurence of a cashflow due to a mortgage-backed security principal payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exDate** | **OffsetDateTime** | The ex date (entitlement date) of the principal payment, usually several weeks prior to the payment date |  [optional] |
|**paymentDate** | **OffsetDateTime** | The payment date of the principal |  [optional] |
|**currency** | **String** | The currency in which the principal is paid |  |
|**principalPerUnit** | **java.math.BigDecimal** | The principal amount received for each unit of the instrument held on the ex date |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


