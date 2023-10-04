

# AggregatedReturn

A list of Aggregated Returns.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveAt** | **OffsetDateTime** | The effectiveAt for the return. |  |
|**endOfPeriod** | **OffsetDateTime** | The end of period date. For the monthly period this will be the Month End Date. |  |
|**openingMarketValue** | **java.math.BigDecimal** | The opening market value. |  [optional] |
|**closingMarketValue** | **java.math.BigDecimal** | The closing market value. |  [optional] |
|**metricsValue** | **Map&lt;String, java.math.BigDecimal&gt;** | The value for the specified metric. |  |
|**frequency** | **String** | Show the aggregated output returns on a Daily or Monthly period. |  [optional] |
|**compositeMembers** | **Integer** | The number of members in the Composite on the given day. |  [optional] |
|**compositeMembersWithoutReturn** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing Composite members which post no return on the given day. |  [optional] |
|**warnings** | **List&lt;String&gt;** | List of the warnings about the calculation of the aggregated return. |  [optional] |



