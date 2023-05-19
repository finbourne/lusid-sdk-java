

# EquityVolDependencyAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code identifying the corresponding equity, e.g. US0378331005 if the MarketIdentifier was set to ISIN | 
**domesticCurrency** | **String** | The domestic currency of the instrument declaring this dependency. | 
**volType** | **String** | Volatility type e.g. \&quot;LN\&quot; and \&quot;N\&quot; for log-normal and normal volatility. | 
**date** | **OffsetDateTime** | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | 
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



