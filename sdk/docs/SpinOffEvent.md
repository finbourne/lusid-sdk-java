

# SpinOffEvent

Spin-off event (SOFF), representing the distribution of securities issued by another company.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**announcementDate** | **OffsetDateTime** | Optional. The date the spin-off is announced. |  [optional] |
|**exDate** | **OffsetDateTime** | The first date on which the holder of record has entitled ownership of the new shares. |  |
|**recordDate** | **OffsetDateTime** | Optional. Date you have to be the holder of record in order to receive the additional shares. |  [optional] |
|**paymentDate** | **OffsetDateTime** | Date on which the distribution of shares takes place. |  |
|**newInstrument** | [**NewInstrument**](NewInstrument.md) |  |  |
|**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  |  |
|**costFactor** | **java.math.BigDecimal** | Optional. The fraction of cost that is transferred from the existing shares to the new shares. |  [optional] |
|**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Optional. Used in calculating cash-in-lieu of fractional shares. |  [optional] |
|**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. |  [optional] |



