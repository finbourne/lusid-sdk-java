

# RepurchaseOfferEvent

Representation of a repurchase offer corporate action. Represents an offer by the issuer to repurchase its own shares from a shareholder at a given price.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** | Payment date of the event. |  [optional] |
|**marketDeadlineDate** | **OffsetDateTime** | Date set by the issuer or by an agent of the issuer as the latest date to respond to the offer. Must be before or equal to the PaymentDate. |  [optional] |
|**repurchaseQuantity** | **java.math.BigDecimal** | Quantity of the security to be repurchased. |  |
|**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this event. Only 1 should be provided. |  |
|**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections for this event. Only 1 should be provided. Allows the user to opt out of the offer. |  |
|**tenderOfferElections** | [**List&lt;TenderOfferElection&gt;**](TenderOfferElection.md) | List of possible TenderOfferElections for this event. Only 1 should be provided. |  |
|**prorationRate** | **java.math.BigDecimal** | The fraction used to calculate a proportional adjustment for RepurchaseQuantity when a full period is not used. Defaults to 1 if not set. Must be greater than 0 and less than or equal to 1. |  [optional] |
|**responseDeadlineDate** | **OffsetDateTime** | Date set by the account servicer as the latest date to respond to the offer. Optional. If set, must be before or equal to MarketDeadlineDate. Defaults to MarketDeadlineDate if not set. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


