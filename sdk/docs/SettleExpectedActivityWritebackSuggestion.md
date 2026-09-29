# com.finbourne.lusid.model.SettleExpectedActivityWritebackSuggestion
Suggests a settlement instruction that settles the expected activity of the target item, using the  settlement confirmed by the origin item on the other side of the result. The request is upsertable as-is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultPattern** | [**WritebackResultPattern**](WritebackResultPattern.md) |  | [default to WritebackResultPattern]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**settlementInstructionRequest** | [**SettlementInstructionRequest**](SettlementInstructionRequest.md) |  | [default to SettlementInstructionRequest]
**writebackType** | **String** | Polymorphic discriminator, carrying the same values as writebackType on the matching ruleset&#39;s writeback configuration. Supported types: SettleExpectedActivity. Available values: SettleExpectedActivity. | [default to String]

```java
import com.finbourne.lusid.model.SettleExpectedActivityWritebackSuggestion;
import java.util.*;
import java.lang.System;
import java.net.URI;

WritebackResultPattern ResultPattern = new WritebackResultPattern();
ResourceId PortfolioId = new ResourceId();
SettlementInstructionRequest SettlementInstructionRequest = new SettlementInstructionRequest();
String WritebackType = "example WritebackType";


SettleExpectedActivityWritebackSuggestion settleExpectedActivityWritebackSuggestionInstance = new SettleExpectedActivityWritebackSuggestion()
    .ResultPattern(ResultPattern)
    .PortfolioId(PortfolioId)
    .SettlementInstructionRequest(SettlementInstructionRequest)
    .WritebackType(WritebackType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
