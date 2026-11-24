# com.finbourne.lusid.model.PopulateResultProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The property the formula populates. Must be an existing, single-valued property in the RecResult domain, and may appear only once. | [default to String]
**formula** | **String** | The formula gives the value of the property. The value must be of the property&#39;s type. A formula cannot populate an Int property, because its numbers are decimal. A null value means that the property has no value. The formula can read resultType, resultCardinality, resultLifecycle, exception.status, exception.closureType, exception.asAtClosed, exception.asAtClosureInvalidated, review.status, review.decision and review.decisionGroup.groupNumber. It can read the streak: streak.age and streak.countInstances, age and countInstances on streak.differenceStreak and streak.openStreak, streak.predecessor.streakTypes, and the fields of a RecAgedResult on streak.startResult, streak.predecessor.result and each sub-streak&#39;s startResult. An age is a period, which you compare with an ISO 8601 duration such as P5D. On a sub-streak that the predecessor does not extend, the age is zero and the count and startResult are null. A cleared result keeps the streak of its last run, so its ages stop growing. On a result without a streak, every streak field is null. In a comparison, a formula reads a null countInstances, runNumber or firstRunSeen as zero, also on a sub-streak that the predecessor does not extend. For example, streak.countInstances lt 2 is true on a result without a streak. Every other comparison on a null field is false, also inside not (...). The exception is eq when both sides are null. Use exists or not exists to check for the streak first, for example: if(streak not exists) then &#39;First&#39; else if(streak.age lt P2D) then &#39;New&#39; else &#39;Watch&#39;. It reads rules by name as CoreRules[name] and AggregateRules[name]. Each rule has .leftValue, .rightValue and .appliedTolerance.toleranceType. Each aggregate rule also has .difference. You can compare CoreRules[name] with no side by eq, in or startswith. The comparison is true if either side matches. With neq, not in or not startswith, it is true if no side matches. Ordering comparisons must name the side. Comparisons ignore case and accents. | [default to String]
**overwriteManualEditsOnReRun** | **Boolean** | Whether a run replaces a value that a user has set or removed on the property. After a run replaces it, later runs populate it again, even if this flag is then false. Defaults to false. | [optional] [default to Boolean]

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
