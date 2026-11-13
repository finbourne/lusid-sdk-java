# com.finbourne.lusid.model.ComplianceComparison
A single leaf comparison the check criterion made, re-evaluated for this group. A result of null is a comparison the  group held no data for (the criterion short-circuited past it).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predicate** | **String** |  | [default to String]
**left** | [**ComplianceComparisonOperand**](ComplianceComparisonOperand.md) |  | [default to ComplianceComparisonOperand]
**operator** | **String** |  | [default to String]
**right** | [**ComplianceComparisonOperand**](ComplianceComparisonOperand.md) |  | [default to ComplianceComparisonOperand]
**passed** | **Boolean** | Whether this leaf met its criterion for the group: true where it held, false for a breaching leaf. Absent for a  comparison the group carried no data for (the criterion short-circuited past it). | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ComplianceComparison;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Predicate = "example Predicate";
ComplianceComparisonOperand Left = new ComplianceComparisonOperand();
String Operator = "example Operator";
ComplianceComparisonOperand Right = new ComplianceComparisonOperand();
@jakarta.annotation.Nullable Boolean Passed = true;


ComplianceComparison complianceComparisonInstance = new ComplianceComparison()
    .Predicate(Predicate)
    .Left(Left)
    .Operator(Operator)
    .Right(Right)
    .Passed(Passed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
