

# StockSplitEvent

A split in the company's shares. Shareholders are given additional company shares based on the terms of the stock split.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** | Date on which the stock split takes effect. |  [optional] |
|**exDate** | **OffsetDateTime** | The first date on which the shares will trade at the post-split price. |  [optional] |
|**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  |  |
|**recordDate** | **OffsetDateTime** | Date you have to be the holder of record in order to receive the additional shares. |  [optional] |
|**announcementDate** | **OffsetDateTime** | Date the stock split was announced. |  [optional] |
|**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price per unit paid in lieu when fractional units can not be distributed. |  [optional] |
|**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of fractional units. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


