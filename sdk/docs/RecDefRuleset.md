# com.finbourne.lusid.model.RecDefRuleset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recType** | **String** | The type of reconciliation this entry configures. Must be valid for the definitionType, and must match the reconciliationType of the referenced matching ruleset. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**matchingRulesetId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**relationalDataFilter** | **String** | Selects the slice of the relational dataset this definition draws from, e.g. \&quot;custodian eq &#39;NT&#39;\&quot;. Only permitted when the referenced ruleset declares a relational side, and combined with AND at run time with that ruleset&#39;s own filter for the side. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecDefRuleset;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RecType = "example RecType";
ResourceId MatchingRulesetId = new ResourceId();
@jakarta.annotation.Nullable String RelationalDataFilter = "example RelationalDataFilter";


RecDefRuleset recDefRulesetInstance = new RecDefRuleset()
    .RecType(RecType)
    .MatchingRulesetId(MatchingRulesetId)
    .RelationalDataFilter(RelationalDataFilter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
