
# MarketOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultSupplier** | [**DefaultSupplierEnum**](#DefaultSupplierEnum) | The default supplier of data. This controls which &#39;dialect&#39; is used to find particular market data. e.g. one supplier might address data by RIC, another by PermId |  [optional]
**defaultInstrumentCodeType** | [**DefaultInstrumentCodeTypeEnum**](#DefaultInstrumentCodeTypeEnum) | When instrument quotes are searched for, what identifier should be used by default |  [optional]
**defaultScope** | **String** | For default rules, which scope should data be searched for in |  [optional]


<a name="DefaultSupplierEnum"></a>
## Enum: DefaultSupplierEnum
Name | Value
---- | -----
DATASCOPE | &quot;DataScope&quot;
LUSID | &quot;Lusid&quot;


<a name="DefaultInstrumentCodeTypeEnum"></a>
## Enum: DefaultInstrumentCodeTypeEnum
Name | Value
---- | -----
LUSIDINSTRUMENTID | &quot;LusidInstrumentId&quot;
FIGI | &quot;Figi&quot;
RIC | &quot;RIC&quot;
QUOTEPERMID | &quot;QuotePermId&quot;
ISIN | &quot;Isin&quot;
CURRENCYPAIR | &quot;CurrencyPair&quot;



