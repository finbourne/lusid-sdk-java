

# EconomicDependency

Base class for representing economic dependencies.  Economic dependencies are a way of indicating how one concept depends upon another.  For example, when pricing an instrument with a particular model,  that model will declare that it has an EconomicDependency for each bit of market data  that it needs to complete the calculation.  Concretely, a pricing an FxForward will declare a dependency on the exchange rate between the two currencies  at the forward date.                Another example is when data is included in a data-structure only by reference.  Concretely, an object depending on a FlowConvention that is referenced only semantically via a FlowConventionName  will declare a FlowConventionDependency  so that the full data-structure of the referenced FlowConvention can be retrieved.                For deserialization purposes,  this class contains a discriminator EconomicDependencyType to indicate the derived type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dependencyType** | [**DependencyTypeEnum**](#DependencyTypeEnum) | The available values are: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency |  |



## Enum: DependencyTypeEnum

| Name | Value |
|---- | -----|
| OPAQUEDEPENDENCY | &quot;OpaqueDependency&quot; |
| CASHDEPENDENCY | &quot;CashDependency&quot; |
| DISCOUNTINGDEPENDENCY | &quot;DiscountingDependency&quot; |
| EQUITYCURVEDEPENDENCY | &quot;EquityCurveDependency&quot; |
| EQUITYVOLDEPENDENCY | &quot;EquityVolDependency&quot; |
| FXDEPENDENCY | &quot;FxDependency&quot; |
| FXFORWARDSDEPENDENCY | &quot;FxForwardsDependency&quot; |
| FXVOLDEPENDENCY | &quot;FxVolDependency&quot; |
| INDEXPROJECTIONDEPENDENCY | &quot;IndexProjectionDependency&quot; |
| IRVOLDEPENDENCY | &quot;IrVolDependency&quot; |
| QUOTEDEPENDENCY | &quot;QuoteDependency&quot; |
| VENDOR | &quot;Vendor&quot; |
| CALENDARDEPENDENCY | &quot;CalendarDependency&quot; |
| INFLATIONFIXINGDEPENDENCY | &quot;InflationFixingDependency&quot; |



