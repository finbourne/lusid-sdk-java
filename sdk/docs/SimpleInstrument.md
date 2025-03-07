

# SimpleInstrument

LUSID representation of a Simple Instrument, used as a basic definition of a generic instrument.  No analytics can be obtained for this.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  [optional] |
|**domCcy** | **String** | The domestic currency. |  |
|**assetClass** | [**AssetClassEnum**](#AssetClassEnum) | The available values are: InterestRates, FX, Inflation, Equities, Credit, Commodities, Money, Unknown |  |
|**fgnCcys** | **List&lt;String&gt;** | The set of foreign currencies, if any (optional). |  [optional] |
|**simpleInstrumentType** | **String** | The Instrument type of the simple instrument. |  |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |



## Enum: AssetClassEnum

| Name | Value |
|---- | -----|
| INTERESTRATES | &quot;InterestRates&quot; |
| FX | &quot;FX&quot; |
| INFLATION | &quot;Inflation&quot; |
| EQUITIES | &quot;Equities&quot; |
| CREDIT | &quot;Credit&quot; |
| COMMODITIES | &quot;Commodities&quot; |
| MONEY | &quot;Money&quot; |
| UNKNOWN | &quot;Unknown&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


