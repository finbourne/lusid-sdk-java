

# FloatingLeg

LUSID representation of a Floating Rate Leg.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount. For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  |
|**legDefinition** | [**LegDefinition**](LegDefinition.md) |  |  |
|**notional** | **java.math.BigDecimal** | Scaling factor to apply to leg quantities. |  |
|**overrides** | [**FixedLegAllOfOverrides**](FixedLegAllOfOverrides.md) |  |  [optional] |
|**capRate** | **java.math.BigDecimal** | The maximum floating rate which a cashflow can accrue. |  [optional] |
|**floorRate** | **java.math.BigDecimal** | The minimum floating rate which a cashflow can accrue. |  [optional] |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


