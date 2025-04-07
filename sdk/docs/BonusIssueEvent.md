

# BonusIssueEvent

Representation of a Bonus Issue corporate action.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**announcementDate** | **OffsetDateTime** | The date the Bonus Issue is announced. |  [optional] |
|**exDate** | **OffsetDateTime** | The ex-date of the Bonus Issue. |  [optional] |
|**recordDate** | **OffsetDateTime** | The record date of the Bonus Issue. |  [optional] |
|**paymentDate** | **OffsetDateTime** | The date the Bonus Issue is executed. |  [optional] |
|**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Optional. Used in calculating cash-in-lieu of fractional shares. |  [optional] |
|**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. |  [optional] |
|**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | Possible SecurityElections for this Bonus Issue event, if any. |  [optional] |
|**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | Possible CashOfferElections for this Bonus Issue event, if any. |  [optional] |
|**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Possible LapseElections for this Bonus Issue event, if any. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


