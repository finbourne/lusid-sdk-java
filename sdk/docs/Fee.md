

# Fee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**feeCode** | **String** | The code of the Fee. |  [optional] |
|**feeTypeId** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The name of the Fee. |  |
|**description** | **String** | A description for the Fee. |  [optional] |
|**origin** | **String** | The origin or source of the Fee accrual. |  [optional] |
|**calculationBase** | **String** | The calculation base for a Fee that is calculated using a percentage (TotalAnnualAccrualAmount and CalculationBase cannot both be present). When the Fee is a ShareClass Fee (i.e: when ShareClasses contains at least one value), each of the following would be a valid CalculationBase: \&quot;10000.00\&quot;, \&quot;ShareClass.GAV\&quot;, \&quot;ShareClass.GAV - ShareClass.Fees[ShareClassFeeCode1].Amount\&quot;, \&quot;ShareClass.Fees[ShareClassFeeCode1].CalculationBase\&quot;. When the Fee is a NonShareClassSpecific Fee (i.e: when ShareClasses contains no values), each of the following would be a valid CalculationBase: \&quot;10000.00\&quot;, \&quot;GAV\&quot;, \&quot;GAV - Fees[NonClassSpecificFeeCode1].Amount\&quot;, \&quot;Fees[NonClassSpecificFeeCode1].CalculationBase\&quot;.  |  [optional] |
|**accrualCurrency** | **String** | The accrual currency. |  |
|**treatment** | **String** | The accrual period of the Fee; &#39;Monthly&#39; or &#39;Daily&#39;. |  |
|**totalAnnualAccrualAmount** | **java.math.BigDecimal** | The total annual accrued amount for the Fee. (TotalAnnualAccrualAmount and CalculationBase cannot both be present) |  [optional] |
|**feeRatePercentage** | **java.math.BigDecimal** | The fee rate percentage. (Required when CalculationBase is present and not compatible with TotalAnnualAccrualAmount) |  [optional] |
|**payableFrequency** | **String** | The payable frequency for the Fee; &#39;Annually&#39;, &#39;Quarterly&#39; or &#39;Monthly&#39;. |  |
|**businessDayConvention** | **String** | The business day convention to use for Fee calculations on weekends or holidays. Supported string values are: [Previous, P, Following, F, None]. |  |
|**startDate** | **OffsetDateTime** | The start date of the Fee. |  |
|**endDate** | **OffsetDateTime** | The end date of the Fee. |  [optional] |
|**anchorDate** | [**DayMonth**](DayMonth.md) |  |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Fee properties. These will be from the &#39;Fee&#39; domain. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**shareClasses** | **List&lt;String&gt;** | The short codes of the ShareClasses that the Fee should be applied to. Optional: if this is null or empty, then the Fee will be divided between all the ShareClasses of the Fund according to the capital ratio. |  [optional] |
|**navTypeCode** | **String** | When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


