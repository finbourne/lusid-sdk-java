# com.finbourne.lusid.model.WritebackResultPattern
One combination of units difference and result cardinality for which writeback is suggested. A combination  that is not configured never produces a suggestion, even where the reconciliation has crossed the items  successfully. The collection is a set, and is returned in a canonical order regardless of the order supplied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unitsDifference** | **String** | How the origin units compare to the target units, on a literal comparison rather than on the result type. One of: Exact, ShortWithinTolerance, ShortBeyondTolerance, LongWithinTolerance. LongBeyondTolerance is reported on results but cannot be configured. Available values: Exact, ShortWithinTolerance, ShortBeyondTolerance, LongWithinTolerance, LongBeyondTolerance. | [default to String]
**resultCardinality** | **String** | The item cardinality of the result, read left to right. One of: OneToOne, OneToMany, ManyToOne. ManyToMany is not supported. Available values: OneToOne, OneToMany, ManyToOne, ManyToMany, OneToNone, ManyToNone, NoneToOne, NoneToMany, NoneToNone. | [default to String]
**useTargetUnits** | **Boolean** | Which side supplies the units where the two sides do not agree exactly. When false, the units come from the origin and any difference is left outstanding on the target; when true, they come from the target, which is written back in full. Defaults to false. Must be true for LongWithinTolerance, and cannot be true for ShortBeyondTolerance. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.WritebackResultPattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

String UnitsDifference = "example UnitsDifference";
String ResultCardinality = "example ResultCardinality";
Boolean UseTargetUnits = true;


WritebackResultPattern writebackResultPatternInstance = new WritebackResultPattern()
    .UnitsDifference(UnitsDifference)
    .ResultCardinality(ResultCardinality)
    .UseTargetUnits(UseTargetUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
