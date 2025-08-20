

# AmortisationEvent

Definition of an Amortisation event. This is an event that describes the occurence of amortisation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amountReduced** | **java.math.BigDecimal** | The amount reduced in this amortisation event. That is, the difference between the previous notional amount and the current notional amount as set in this event. |  |
|**domCcy** | **String** | Domestic currency of the originating instrument |  |
|**payReceive** | **String** | Is this event in relation to the Pay or Receive leg |  |
|**paymentDate** | **OffsetDateTime** | The date the principal payment is to be made. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


