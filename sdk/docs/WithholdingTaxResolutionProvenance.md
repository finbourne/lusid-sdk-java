# com.finbourne.lusid.model.WithholdingTaxResolutionProvenance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchScore** | **java.math.BigDecimal** | The share of the main dataset&#39;s dimensions that the row matches, from 0 to 1. Null on an anomaly match. | [optional] [default to java.math.BigDecimal]
**matchedFieldCount** | **Integer** | The number of the main dataset&#39;s dimensions that the row matches. Null on an anomaly match. | [optional] [default to Integer]
**sourceFilterApplied** | **String** | The rule source level that matched. Null when no source priority applies. | [optional] [default to String]
**tieBroken** | **Boolean** | True when another row matched as well as the winner, so the tie-break order chose: the latest effective date, then the rule id. | [default to Boolean]

```java
import com.finbourne.lusid.model.WithholdingTaxResolutionProvenance;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal MatchScore = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Integer MatchedFieldCount = new Integer("100.00");
@jakarta.annotation.Nullable String SourceFilterApplied = "example SourceFilterApplied";
Boolean TieBroken = true;


WithholdingTaxResolutionProvenance withholdingTaxResolutionProvenanceInstance = new WithholdingTaxResolutionProvenance()
    .MatchScore(MatchScore)
    .MatchedFieldCount(MatchedFieldCount)
    .SourceFilterApplied(SourceFilterApplied)
    .TieBroken(TieBroken);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
