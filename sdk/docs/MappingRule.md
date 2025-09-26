# com.finbourne.lusid.model.MappingRule
An individual mapping rule, for mapping between a left and right field/property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The name of the field/property in the left resource (e.g. a transaction) | [optional] [default to String]
**right** | **String** | The name of the field/property in the right resource (e.g. a transaction) | [optional] [default to String]
**comparisonType** | **String** | The type of comparison to be performed | [optional] [default to String]
**comparisonValue** | **java.math.BigDecimal** | The (optional) value used with ComparisonType. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | A factor used to influence the importance of this item. | [optional] [default to java.math.BigDecimal]
**mappedStrings** | [**List&lt;MappedString&gt;**](MappedString.md) | The (optional) value used to map string values. | [optional] [default to List<MappedString>]
**isCaseSensitive** | **Boolean** | Should string comparisons take case into account, defaults to &#x60;false&#x60;. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.MappingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Left = "example Left";
@jakarta.annotation.Nullable String Right = "example Right";
@jakarta.annotation.Nullable String ComparisonType = "example ComparisonType";
@jakarta.annotation.Nullable java.math.BigDecimal ComparisonValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<MappedString> MappedStrings = new List<MappedString>();
Boolean IsCaseSensitive = true;


MappingRule mappingRuleInstance = new MappingRule()
    .Left(Left)
    .Right(Right)
    .ComparisonType(ComparisonType)
    .ComparisonValue(ComparisonValue)
    .Weight(Weight)
    .MappedStrings(MappedStrings)
    .IsCaseSensitive(IsCaseSensitive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
