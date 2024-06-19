

# Fee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**feeCode** | **String** | The code of the Fee. |  [optional] |
|**feeType** | [**ResourceId**](ResourceId.md) |  |  |
|**name** | **String** | The name of the Fee. |  |
|**description** | **String** | A description for the Fee. |  [optional] |
|**origin** | **String** | The origin or source of the Fee accrual. |  [optional] |
|**calculationBase** | **String** | The calculation base for the Fee that is calculated using a percentage. (TotalAnnualAccrualAmount and CalculationBase cannot both be present) |  [optional] |
|**accrualCurrency** | **String** | The accrual currency. |  |
|**treatment** | **String** | The accrual period of the Fee; &#39;Monthly&#39; or &#39;Daily&#39;. |  |
|**totalAnnualAccrualAmount** | **java.math.BigDecimal** | The total annual accrued amount for the Fee. (TotalAnnualAccrualAmount and CalculationBase cannot both be present) |  [optional] |
|**feeRatePercentage** | **java.math.BigDecimal** | The fee rate percentage. (Required when CalculationBase is present and not compatible with TotalAnnualAccrualAmount) |  [optional] |
|**payableFrequency** | **String** | The payable frequency for the Fee; &#39;Annually&#39;, &#39;Quarterly&#39; or &#39;Monthly&#39;. |  |
|**businessDayConvention** | **String** | The business day convention to use for Fee calculations on weekends. |  |
|**startDate** | **OffsetDateTime** | The start date of the Fee. |  |
|**endDate** | **OffsetDateTime** | The end date of the Fee. |  [optional] |
|**anchorDate** | [**DayMonth**](DayMonth.md) |  |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Fee properties. These will be from the &#39;Fee&#39; domain. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



