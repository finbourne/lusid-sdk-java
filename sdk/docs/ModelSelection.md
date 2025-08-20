

# ModelSelection

The combination of a library to use and a model in that library that defines which pricing code will evaluate instruments having a particular type/class. This allows us to control the model type and library for a given instrument.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**library** | [**LibraryEnum**](#LibraryEnum) | The available values are: Lusid, RefinitivQps, RefinitivTracsWeb, VolMaster, IsdaCds, YieldBook, LusidCalc |  |
|**model** | [**ModelEnum**](#ModelEnum) | The available values are: SimpleStatic, Discounting, VendorDefault, BlackScholes, ConstantTimeValueOfMoney, Bachelier, ForwardWithPoints, ForwardWithPointsUndiscounted, ForwardSpecifiedRate, ForwardSpecifiedRateUndiscounted, IndexNav, IndexPrice, InlinedIndex, ForwardFromCurve, ForwardFromCurveUndiscounted, BlackScholesDigital, BjerksundStensland1993, BondLookupPricer, FlexibleLoanPricer, CdsLookupPricer, LoanFacilityPricer |  |



## Enum: LibraryEnum

| Name | Value |
|---- | -----|
| LUSID | &quot;Lusid&quot; |
| REFINITIVQPS | &quot;RefinitivQps&quot; |
| REFINITIVTRACSWEB | &quot;RefinitivTracsWeb&quot; |
| VOLMASTER | &quot;VolMaster&quot; |
| ISDACDS | &quot;IsdaCds&quot; |
| YIELDBOOK | &quot;YieldBook&quot; |
| LUSIDCALC | &quot;LusidCalc&quot; |



## Enum: ModelEnum

| Name | Value |
|---- | -----|
| SIMPLESTATIC | &quot;SimpleStatic&quot; |
| DISCOUNTING | &quot;Discounting&quot; |
| VENDORDEFAULT | &quot;VendorDefault&quot; |
| BLACKSCHOLES | &quot;BlackScholes&quot; |
| CONSTANTTIMEVALUEOFMONEY | &quot;ConstantTimeValueOfMoney&quot; |
| BACHELIER | &quot;Bachelier&quot; |
| FORWARDWITHPOINTS | &quot;ForwardWithPoints&quot; |
| FORWARDWITHPOINTSUNDISCOUNTED | &quot;ForwardWithPointsUndiscounted&quot; |
| FORWARDSPECIFIEDRATE | &quot;ForwardSpecifiedRate&quot; |
| FORWARDSPECIFIEDRATEUNDISCOUNTED | &quot;ForwardSpecifiedRateUndiscounted&quot; |
| INDEXNAV | &quot;IndexNav&quot; |
| INDEXPRICE | &quot;IndexPrice&quot; |
| INLINEDINDEX | &quot;InlinedIndex&quot; |
| FORWARDFROMCURVE | &quot;ForwardFromCurve&quot; |
| FORWARDFROMCURVEUNDISCOUNTED | &quot;ForwardFromCurveUndiscounted&quot; |
| BLACKSCHOLESDIGITAL | &quot;BlackScholesDigital&quot; |
| BJERKSUNDSTENSLAND1993 | &quot;BjerksundStensland1993&quot; |
| BONDLOOKUPPRICER | &quot;BondLookupPricer&quot; |
| FLEXIBLELOANPRICER | &quot;FlexibleLoanPricer&quot; |
| CDSLOOKUPPRICER | &quot;CdsLookupPricer&quot; |
| LOANFACILITYPRICER | &quot;LoanFacilityPricer&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


