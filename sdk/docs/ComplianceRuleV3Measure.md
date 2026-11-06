# com.finbourne.lusid.model.ComplianceRuleV3Measure
How a rule reduces its filtered (and optionally grouped) subject rows to the single number a check is  applied to: a metric field, the aggregate combining its values, and what it is expressed relative to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **String** |  | [optional] [default to String]
**aggregate** | **String** | Available values: Sum, Min, Max, Average, Count, CountDistinct, WeightedSum, SumAbsolute. | [default to String]
**denominator** | **String** | Available values: None, PortfolioValue, GrossValue, NetValue, FilteredSubsetTotal, GroupNav, GroupGrossExposure, GroupFilteredSubsetTotal. | [optional] [default to String]
**denominatorMetric** | **String** |  | [optional] [default to String]
**weightMetric** | **String** |  | [optional] [default to String]
**denominatorProperty** | **String** |  | [optional] [default to String]
**filter** | [**ComplianceRuleV3FilterNode**](ComplianceRuleV3FilterNode.md) |  | [optional] [default to ComplianceRuleV3FilterNode]

```java
import com.finbourne.lusid.model.ComplianceRuleV3Measure;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Metric = "example Metric";
String Aggregate = "example Aggregate";
@jakarta.annotation.Nullable String Denominator = "example Denominator";
@jakarta.annotation.Nullable String DenominatorMetric = "example DenominatorMetric";
@jakarta.annotation.Nullable String WeightMetric = "example WeightMetric";
@jakarta.annotation.Nullable String DenominatorProperty = "example DenominatorProperty";
ComplianceRuleV3FilterNode Filter = new ComplianceRuleV3FilterNode();


ComplianceRuleV3Measure complianceRuleV3MeasureInstance = new ComplianceRuleV3Measure()
    .Metric(Metric)
    .Aggregate(Aggregate)
    .Denominator(Denominator)
    .DenominatorMetric(DenominatorMetric)
    .WeightMetric(WeightMetric)
    .DenominatorProperty(DenominatorProperty)
    .Filter(Filter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
