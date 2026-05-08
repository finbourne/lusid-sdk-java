# com.finbourne.lusid.model.PortfolioSettlementInstructionAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentSource** | **String** | The post closed activity source of the given entity, for example Manual. Available values: Undefined, Manual, Auto. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**portfolioScope** | **String** | The portfolio scope of the given entity | [default to String]
**portfolioCode** | **String** | The portfolio code of the given entity | [default to String]
**settlementInstructionId** | **String** | The settlement instruction Id of the SettlementInstruction being adjusted | [default to String]

```java
import com.finbourne.lusid.model.PortfolioSettlementInstructionAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NavActivityAdjustmentSource = "example NavActivityAdjustmentSource";
OffsetDateTime AsAt = OffsetDateTime.now();
String PortfolioScope = "example PortfolioScope";
String PortfolioCode = "example PortfolioCode";
String SettlementInstructionId = "example SettlementInstructionId";


PortfolioSettlementInstructionAdjustment portfolioSettlementInstructionAdjustmentInstance = new PortfolioSettlementInstructionAdjustment()
    .NavActivityAdjustmentSource(NavActivityAdjustmentSource)
    .AsAt(AsAt)
    .PortfolioScope(PortfolioScope)
    .PortfolioCode(PortfolioCode)
    .SettlementInstructionId(SettlementInstructionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
