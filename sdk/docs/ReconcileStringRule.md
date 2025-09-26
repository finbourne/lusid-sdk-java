# com.finbourne.lusid.model.ReconcileStringRule
Comparison of string values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparisonType** | **String** | The available values are: Exact, Contains, CaseInsensitive, ContainsAnyCase, IsOneOf, IsOneOfCaseInsensitive | [default to String]
**oneOfCandidates** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | For cases of \&quot;IsOneOf\&quot; or \&quot;IsOneOfCaseInsensitive\&quot;, a mapping from the left hand to side to lists of  equivalent alternative values on the right hand side.  Fuzzy matching of strings against one of a set. There can be cases where systems \&quot;A\&quot; and \&quot;B\&quot; might use different terms for the same logical entity. A common case would be  comparison of something like a day count fraction where some convention like the \&quot;actual 365\&quot; convention might be represented as one of [\&quot;A365\&quot;, \&quot;Act365\&quot;, \&quot;Actual365\&quot;] or similar.  This is to allow this kind of fuzzy matching of values. Note that as this is exhaustive comparison across sets it will be slow and should therefore be used sparingly. | [optional] [default to Map<String, List<String>>]
**appliesTo** | [**AggregateSpec**](AggregateSpec.md) |  | [default to AggregateSpec]

```java
import com.finbourne.lusid.model.ReconcileStringRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ComparisonType = "example ComparisonType";
@jakarta.annotation.Nullable Map<String, List<String>> OneOfCandidates = new Map<String, List<String>>();
AggregateSpec AppliesTo = new AggregateSpec();


ReconcileStringRule reconcileStringRuleInstance = new ReconcileStringRule()
    .ComparisonType(ComparisonType)
    .OneOfCandidates(OneOfCandidates)
    .AppliesTo(AppliesTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
