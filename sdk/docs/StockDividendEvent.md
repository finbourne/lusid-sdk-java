

# StockDividendEvent

A payment to shareholders that consists of additional shares rather than cash.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**announcementDate** | **OffsetDateTime** | Date on which the dividend was announced / declared. |  [optional] |
|**exDate** | **OffsetDateTime** | The first business day on which the dividend is not owed to the buying party.  Typically this is T-1 from the RecordDate. |  |
|**paymentDate** | **OffsetDateTime** | The date the company pays out dividends to shareholders. |  |
|**recordDate** | **OffsetDateTime** | Date you have to be the holder of record in order to participate in the tender. |  [optional] |
|**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractionalUnits. |  [optional] |
|**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of fractionalUnits. |  [optional] |
|**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


