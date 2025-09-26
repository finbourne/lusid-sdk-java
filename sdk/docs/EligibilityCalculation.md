# com.finbourne.lusid.model.EligibilityCalculation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlementDate** | **String** |  | [default to String]
**eligibleUnits** | **String** |  | [default to String]
**dateModifiableByInstruction** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.EligibilityCalculation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EntitlementDate = "example EntitlementDate";
String EligibleUnits = "example EligibleUnits";
Boolean DateModifiableByInstruction = true;


EligibilityCalculation eligibilityCalculationInstance = new EligibilityCalculation()
    .EntitlementDate(EntitlementDate)
    .EligibleUnits(EligibleUnits)
    .DateModifiableByInstruction(DateModifiableByInstruction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
