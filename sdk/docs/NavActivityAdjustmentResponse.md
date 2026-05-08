# com.finbourne.lusid.model.NavActivityAdjustmentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentType** | **String** | The type of the entity being applied, for example a PortfolioTransaction. Available values: PortfolioTransactionAdjustment, PortfolioSettlementInstructionAdjustment, InstrumentActivityAdjustment, QuoteActivityAdjustment. | [default to String]

```java
import com.finbourne.lusid.model.NavActivityAdjustmentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NavActivityAdjustmentType = "example NavActivityAdjustmentType";


NavActivityAdjustmentResponse navActivityAdjustmentResponseInstance = new NavActivityAdjustmentResponse()
    .NavActivityAdjustmentType(NavActivityAdjustmentType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
