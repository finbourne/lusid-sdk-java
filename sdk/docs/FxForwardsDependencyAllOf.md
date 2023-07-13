

# FxForwardsDependencyAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domesticCurrency** | **String** | DomesticCurrency is the first currency in a currency pair quote e.g. eur-gbp, eur is the domestic currency. | 
**foreignCurrency** | **String** | ForeignCurrency is the second currency in a currency pair quote e.g. eur-gbp, gbp is the foreign currency. | 
**curveType** | **String** | Used to describe the format in which the curve is expressed  e.g. FxFwdCurve (general term to describe any representation), TenorFxFwdCurve, PipsFxFwdCurve. | 
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



