

# MergerEvent

Merger Event (MRGR).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**announcementDate** | **OffsetDateTime** | The date the merger is announced. |  [optional] |
|**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this merger event |  [optional] |
|**cashElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this merger event |  [optional] |
|**exDate** | **OffsetDateTime** | The first date on which the holder of record of the original shares has entitled ownership of the new shares. |  |
|**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. |  [optional] |
|**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Optional. Used in calculating cash-in-lieu of fractional shares. |  [optional] |
|**newInstrument** | [**NewInstrument**](NewInstrument.md) |  |  |
|**paymentDate** | **OffsetDateTime** | Date on which the merger takes place. |  |
|**recordDate** | **OffsetDateTime** | Optional. Date you have to be the holder of record of the original shares in order to receive the new shares. |  [optional] |
|**securityElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this merger event |  [optional] |



