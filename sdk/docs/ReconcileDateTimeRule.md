# com.finbourne.lusid.model.ReconcileDateTimeRule
Comparison of date time values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparisonType** | **String** | The available values are: Exact, AbsoluteDifference | [default to String]
**tolerance** | **java.math.BigDecimal** | For a numeric type only (i.e. decimal, integer, date or datetime offset possibly controversially), this is the quantity used in the comparison.  The units of the tolerance must be set appropriately for the item being compared.  For a number such as a currency or amount that will be a simple quantity, for a DateTime or DateTimeOffset it should be days. If fewer than a single day then this should be  passed as a fraction. | [optional] [default to java.math.BigDecimal]
**appliesTo** | [**AggregateSpec**](AggregateSpec.md) |  | [default to AggregateSpec]

```java
import com.finbourne.lusid.model.ReconcileDateTimeRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ComparisonType = "example ComparisonType";
java.math.BigDecimal Tolerance = new java.math.BigDecimal("100.00");
AggregateSpec AppliesTo = new AggregateSpec();


ReconcileDateTimeRule reconcileDateTimeRuleInstance = new ReconcileDateTimeRule()
    .ComparisonType(ComparisonType)
    .Tolerance(Tolerance)
    .AppliesTo(AppliesTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
