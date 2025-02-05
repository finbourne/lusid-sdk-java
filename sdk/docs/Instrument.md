

# Instrument

A list of instruments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**scope** | **String** | The scope in which the instrument lies. |  [optional] |
|**lusidInstrumentId** | **String** | The unique LUSID Instrument Identifier (LUID) of the instrument. |  |
|**version** | [**Version**](Version.md) |  |  |
|**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  |  [optional] |
|**name** | **String** | The name of the instrument. |  |
|**identifiers** | **Map&lt;String, String&gt;** | The set of identifiers that can be used to identify the instrument. |  |
|**properties** | [**List&lt;Property&gt;**](Property.md) | The requested instrument properties. These will be from the &#39;Instrument&#39; domain. |  [optional] |
|**lookthroughPortfolio** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**instrumentDefinition** | [**LusidInstrument**](LusidInstrument.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of of the instrument at the asAt datetime of this version of the instrument definition. The available values are: Active, Inactive, Deleted |  |
|**assetClass** | [**AssetClassEnum**](#AssetClassEnum) | The nominal asset class of the instrument, e.g. InterestRates, FX, Inflation, Equities, Credit, Commodities, etc. The available values are: InterestRates, FX, Inflation, Equities, Credit, Commodities, Money, Unknown |  [optional] |
|**domCcy** | **String** | The domestic currency, meaning the currency in which the instrument would typically be expected to pay cashflows, e.g. a share in AAPL being USD. |  [optional] |
|**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the instrument. |  [optional] |
|**settlementCycle** | [**SettlementCycle**](SettlementCycle.md) |  |  [optional] |
|**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |
| DELETED | &quot;Deleted&quot; |



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


