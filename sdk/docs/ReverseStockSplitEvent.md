

# ReverseStockSplitEvent

A reverse split in the company's shares. Shareholders have their number of shares reduced based on the terms of the stock split.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentDate** | **OffsetDateTime** | Date on which the stock split takes effect. |  |
|**exDate** | **OffsetDateTime** | The first date on which the shares will trade at the post-split price. |  |
|**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  |  |
|**recordDate** | **OffsetDateTime** | Date you have to be the holder of record in order to have their shares merged. |  [optional] |
|**announcementDate** | **OffsetDateTime** | Date the reverse stock split was announced. |  [optional] |



