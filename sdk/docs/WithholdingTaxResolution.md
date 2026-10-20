# com.finbourne.lusid.model.WithholdingTaxResolution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resolutionStatus** | **String** | Match or NoMatch: the status booking stamps on a transaction. | [default to String]
**matchedRule** | [**WithholdingTaxMatchedRule**](WithholdingTaxMatchedRule.md) |  | [optional] [default to WithholdingTaxMatchedRule]
**rateTiers** | [**WithholdingTaxRateTiers**](WithholdingTaxRateTiers.md) |  | [optional] [default to WithholdingTaxRateTiers]
**rasFlags** | [**WithholdingTaxReliefAtSourceFlags**](WithholdingTaxReliefAtSourceFlags.md) |  | [optional] [default to WithholdingTaxReliefAtSourceFlags]
**derivedSplit** | [**WithholdingTaxRateSplit**](WithholdingTaxRateSplit.md) |  | [optional] [default to WithholdingTaxRateSplit]
**provenance** | [**WithholdingTaxResolutionProvenance**](WithholdingTaxResolutionProvenance.md) |  | [optional] [default to WithholdingTaxResolutionProvenance]
**resolvedDimensions** | **Map&lt;String, String&gt;** | Each dimension of either dataset, with the value used. Null where there is no value. | [default to Map<String, String>]
**isWhatIf** | **Boolean** | False when the saved configuration&#39;s datasets and source order are used as they are. True when a dataset or the source order differs from the configuration&#39;s, or when no configuration was given. | [default to Boolean]
**unresolvedDimensions** | [**Map&lt;String, WithholdingTaxUnresolvedDimension&gt;**](WithholdingTaxUnresolvedDimension.md) | Each dimension that booking reads from the transaction, portfolio or fund, that dimensions does not supply, and that a couldAlsoMatch entry needs. It is null, so only rows blank on it match. Empty in Raw mode. | [default to Map<String, WithholdingTaxUnresolvedDimension>]
**couldAlsoMatch** | [**List&lt;WithholdingTaxAlternativeMatch&gt;**](WithholdingTaxAlternativeMatch.md) | Each other row that booking would choose with its own values for the unresolved dimensions, fewest values first, up to the limit. Where one entry&#39;s values include another&#39;s, the one with more values applies. | [default to List<WithholdingTaxAlternativeMatch>]
**hasMoreAlternatives** | **Boolean** | True when the limit stopped the lookup before it tried every combination of values, so couldAlsoMatch may miss rows. Ask again with a higher limit. | [default to Boolean]

```java
import com.finbourne.lusid.model.WithholdingTaxResolution;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ResolutionStatus = "example ResolutionStatus";
WithholdingTaxMatchedRule MatchedRule = new WithholdingTaxMatchedRule();
WithholdingTaxRateTiers RateTiers = new WithholdingTaxRateTiers();
WithholdingTaxReliefAtSourceFlags RasFlags = new WithholdingTaxReliefAtSourceFlags();
WithholdingTaxRateSplit DerivedSplit = new WithholdingTaxRateSplit();
WithholdingTaxResolutionProvenance Provenance = new WithholdingTaxResolutionProvenance();
Map<String, String> ResolvedDimensions = new Map<String, String>();
Boolean IsWhatIf = true;
Map<String, WithholdingTaxUnresolvedDimension> UnresolvedDimensions = new Map<String, WithholdingTaxUnresolvedDimension>();
List<WithholdingTaxAlternativeMatch> CouldAlsoMatch = new List<WithholdingTaxAlternativeMatch>();
Boolean HasMoreAlternatives = true;


WithholdingTaxResolution withholdingTaxResolutionInstance = new WithholdingTaxResolution()
    .ResolutionStatus(ResolutionStatus)
    .MatchedRule(MatchedRule)
    .RateTiers(RateTiers)
    .RasFlags(RasFlags)
    .DerivedSplit(DerivedSplit)
    .Provenance(Provenance)
    .ResolvedDimensions(ResolvedDimensions)
    .IsWhatIf(IsWhatIf)
    .UnresolvedDimensions(UnresolvedDimensions)
    .CouldAlsoMatch(CouldAlsoMatch)
    .HasMoreAlternatives(HasMoreAlternatives);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
