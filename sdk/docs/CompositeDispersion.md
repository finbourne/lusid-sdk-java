

# CompositeDispersion

A list of Dispersion calculations for the given years.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveAt** | **OffsetDateTime** | The date for which dipsersion calculation has been done. This should be 31 Dec for each given year. |  |
|**dispersionCalculation** | **java.math.BigDecimal** | The result for the dispersion calculation on the given effectiveAt. |  |
|**variance** | **java.math.BigDecimal** | The variance on the given effectiveAt. |  |
|**firstQuartile** | **java.math.BigDecimal** | First Quartile (Q1) &#x3D; (lower quartile) &#x3D; the middle of the bottom half of the returns. |  |
|**thirdQuartile** | **java.math.BigDecimal** | Third Quartile (Q3) &#x3D; (higher quartile) &#x3D; the middle of the top half of the returns. |  |
|**range** | **java.math.BigDecimal** | Highest return - Lowest return. |  |
|**constituentsInScope** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing Composite members which are part of the dispersion calcualtion. |  [optional] |
|**constituentsExcluded** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing the Composite members which are not part of the dispersion calculation |  [optional] |



