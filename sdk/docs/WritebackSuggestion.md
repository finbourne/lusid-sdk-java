# com.finbourne.lusid.model.WritebackSuggestion
A writeback suggested against a target-side item of a rec result. Polymorphic by WritebackType; each  supported type has a corresponding inherited class carrying the upsertable request it proposes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**writebackType** | **String** | Polymorphic discriminator, carrying the same values as writebackType on the matching ruleset&#39;s writeback configuration. Supported types: SettleExpectedActivity. Available values: SettleExpectedActivity. | [default to String]
**resultPattern** | [**WritebackResultPattern**](WritebackResultPattern.md) |  | [default to WritebackResultPattern]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**settlementInstructionRequest** | [**SettlementInstructionRequest**](SettlementInstructionRequest.md) |  | [default to SettlementInstructionRequest]

```java
import com.finbourne.lusid.model.WritebackSuggestion;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with SettleExpectedActivityWritebackSuggestion WritebackSuggestion
SettleExpectedActivityWritebackSuggestion writebackSuggestion = new SettleExpectedActivityWritebackSuggestion();
writebackSuggestion.setType(SettleExpectedActivityWritebackSuggestion.TypeEnum.SETTLEEXPECTEDACTIVITYWRITEBACKSUGGESTION);
WritebackSuggestion config = new WritebackSuggestion(writebackSuggestion);

```
 See all compatible oneOf types with WritebackSuggestion
* [SettleExpectedActivityWritebackSuggestion](./SettleExpectedActivityWritebackSuggestion.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
