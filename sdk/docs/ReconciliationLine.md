# com.finbourne.lusid.model.ReconciliationLine
In evaluating a left and right hand side holding or valuation set, two data records result. These are then compared based on a set of  rules. This results in either a match or failure to match. If there is a match both left and right will be present, otherwise one will not.  A difference will be present if a match was calculated.  The options used in comparison may result in elision of results where an exact or tolerable match is made.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **Map&lt;String, Object&gt;** | Left hand side of the comparison | [optional] [default to Map<String, Object>]
**right** | **Map&lt;String, Object&gt;** | Right hand side of the comparison | [optional] [default to Map<String, Object>]
**difference** | **Map&lt;String, Object&gt;** | Difference between LHS and RHS of comparison | [optional] [default to Map<String, Object>]
**resultComparison** | **Map&lt;String, Object&gt;** | The logical or semantic description of the difference, e.g. \&quot;Matches\&quot; or \&quot;MatchesWithTolerance\&quot; or \&quot;Failed\&quot;. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.lusid.model.ReconciliationLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, Object> Left = new Map<String, Object>();
@jakarta.annotation.Nullable Map<String, Object> Right = new Map<String, Object>();
@jakarta.annotation.Nullable Map<String, Object> Difference = new Map<String, Object>();
@jakarta.annotation.Nullable Map<String, Object> ResultComparison = new Map<String, Object>();


ReconciliationLine reconciliationLineInstance = new ReconciliationLine()
    .Left(Left)
    .Right(Right)
    .Difference(Difference)
    .ResultComparison(ResultComparison);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
