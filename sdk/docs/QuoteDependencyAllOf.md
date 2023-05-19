

# QuoteDependencyAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketIdentifier** | **String** | Type of the code identifying the asset, e.g. ISIN or CUSIP | 
**code** | **String** | The code identifying the corresponding equity, e.g. US0378331005 if the MarketIdentifier was set to ISIN | 
**date** | **OffsetDateTime** | The effectiveAt of the quote for the identified entity. | 
**dependencyType** | [**DependencyTypeEnum**](#DependencyTypeEnum) | The available values are: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor | 



## Enum: DependencyTypeEnum

Name | Value
---- | -----
OPAQUEDEPENDENCY | &quot;OpaqueDependency&quot;
CASHDEPENDENCY | &quot;CashDependency&quot;
DISCOUNTINGDEPENDENCY | &quot;DiscountingDependency&quot;
EQUITYCURVEDEPENDENCY | &quot;EquityCurveDependency&quot;
EQUITYVOLDEPENDENCY | &quot;EquityVolDependency&quot;
FXDEPENDENCY | &quot;FxDependency&quot;
FXFORWARDSDEPENDENCY | &quot;FxForwardsDependency&quot;
FXVOLDEPENDENCY | &quot;FxVolDependency&quot;
INDEXPROJECTIONDEPENDENCY | &quot;IndexProjectionDependency&quot;
IRVOLDEPENDENCY | &quot;IrVolDependency&quot;
QUOTEDEPENDENCY | &quot;QuoteDependency&quot;
VENDOR | &quot;Vendor&quot;



