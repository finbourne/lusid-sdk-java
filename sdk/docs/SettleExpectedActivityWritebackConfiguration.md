# com.finbourne.lusid.model.SettleExpectedActivityWritebackConfiguration
Suggests settlement instructions where settlement on the origin side confirms expected settlement activity  on the target side. Only valid on a ruleset whose recType is SettlementActivity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mandatoryRuleNames** | [**SettleExpectedActivityRuleNames**](SettleExpectedActivityRuleNames.md) |  | [default to SettleExpectedActivityRuleNames]
**resultPatterns** | [**List&lt;WritebackResultPattern&gt;**](WritebackResultPattern.md) | The combinations of units difference and result cardinality for which writeback is suggested. A combination that is not present never produces a suggestion. Each combination may appear once, and the collection is returned in a canonical order regardless of the order supplied. | [default to List<WritebackResultPattern>]
**writebackType** | **String** | Polymorphic discriminator, naming the change the writeback makes to LUSID. Supported types: SettleExpectedActivity, which is only valid when recType is SettlementActivity. Available values: SettleExpectedActivity. | [default to String]
**targetSide** | **String** | The side the writeback changes, the other being the source of truth. One of: Left, Right. As the writeback changes LUSID, this side must draw on a native LUSID dataset rather than relational data. Available values: Left, Right. | [default to String]

```java
import com.finbourne.lusid.model.SettleExpectedActivityWritebackConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

SettleExpectedActivityRuleNames MandatoryRuleNames = new SettleExpectedActivityRuleNames();
List<WritebackResultPattern> ResultPatterns = new List<WritebackResultPattern>();
String WritebackType = "example WritebackType";
String TargetSide = "example TargetSide";


SettleExpectedActivityWritebackConfiguration settleExpectedActivityWritebackConfigurationInstance = new SettleExpectedActivityWritebackConfiguration()
    .MandatoryRuleNames(MandatoryRuleNames)
    .ResultPatterns(ResultPatterns)
    .WritebackType(WritebackType)
    .TargetSide(TargetSide);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
