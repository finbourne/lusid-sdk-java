

# TenderEvent

Tender Event (TEND).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**announcementDate** | **OffsetDateTime** | The date the tender is announced. |  [optional] |
|**exDate** | **OffsetDateTime** | The ex date (entitlement date) of the event. |  |
|**recordDate** | **OffsetDateTime** | Date you have to be the holder of record in order to participate in the tender. |  [optional] |
|**paymentDate** | **OffsetDateTime** | The payment date of the event. |  |
|**newInstrument** | [**NewInstrument**](NewInstrument.md) |  |  |
|**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractionalUnits. |  [optional] |
|**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of fractionalUnits. |  [optional] |
|**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this event. |  [optional] |
|**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this event. |  [optional] |
|**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this event. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


