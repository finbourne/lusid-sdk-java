

# FeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | [**ResourceId**](ResourceId.md) |  |  |
|**name** | **String** | The name of the Fee. |  |
|**description** | **String** | A description for the Fee. |  [optional] |
|**origin** | **String** | The origin or source of the Fee accrual. |  [optional] |
|**calculationBase** | **String** | The calculation base for the Fee that is calculated using a percentage. |  [optional] |
|**accrualCurrency** | **String** | The accrual currency. |  |
|**treatment** | **String** | The accrual period of the Fee; &#39;Monthly&#39; or &#39;Daily&#39;. |  |
|**totalAnnualAccrualAmount** | **java.math.BigDecimal** | The total accrued amount for the Fee. |  [optional] |
|**feeRatePercentage** | **java.math.BigDecimal** | The fee rate percentage. |  [optional] |
|**payableFrequency** | **String** | The payable frequency for the Fee; &#39;Annually&#39;, &#39;Quarterly&#39; or &#39;Monthly&#39;. |  |
|**businessDayConvention** | **String** | The business day convention to use for Fee calculations on weekends. |  |
|**startDate** | **OffsetDateTime** | The start date of the Fee. |  |
|**endDate** | **OffsetDateTime** | The end date of the Fee. |  [optional] |
|**anchorDate** | [**DayMonth**](DayMonth.md) |  |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Fee properties. These will be from the &#39;Fee&#39; domain. |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |



