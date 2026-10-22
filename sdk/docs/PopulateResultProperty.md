# com.finbourne.lusid.model.PopulateResultProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The property the formula populates. Must be an existing, single-valued property in the RecResult domain, and may appear only once. | [default to String]
**formula** | **String** | The formula gives the value of the property. The value must be of the property&#39;s type. A formula cannot populate an Int property, because its numbers are decimal. A null value means that the property has no value. The formula can read resultType, resultCardinality, resultLifecycle, exception.status, exception.closureType, exception.asAtClosed, exception.asAtClosureInvalidated, review.status, review.decision and review.decisionGroup.groupNumber. It reads rules by name as CoreRules[name] and AggregateRules[name]. Each rule has .leftValue, .rightValue and .appliedTolerance.toleranceType. A numeric aggregate rule also has .difference. You can compare CoreRules[name] with no side by eq, in or startswith. The comparison is true if either side matches. With neq, not in or not startswith, it is true if no side matches. Ordering comparisons must name the side. Comparisons ignore case and accents. | [default to String]
**overwriteManualEditsOnReRun** | **Boolean** | Whether a value edited since the property was last populated is replaced. Defaults to false, so manual edits are kept. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.PopulateResultProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";
String Formula = "example Formula";
@jakarta.annotation.Nullable Boolean OverwriteManualEditsOnReRun = true;


PopulateResultProperty populateResultPropertyInstance = new PopulateResultProperty()
    .PropertyKey(PropertyKey)
    .Formula(Formula)
    .OverwriteManualEditsOnReRun(OverwriteManualEditsOnReRun);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
