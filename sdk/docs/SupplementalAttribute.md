# com.finbourne.lusid.model.SupplementalAttribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The reference name of the supplemental attribute. | [default to String]
**leftFormula** | **String** | Derivation formula evaluated against the left side of the reconciliation. | [default to String]
**rightFormula** | **String** | Derivation formula evaluated against the right side of the reconciliation. | [default to String]

```java
import com.finbourne.lusid.model.SupplementalAttribute;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AttributeName = "example AttributeName";
String LeftFormula = "example LeftFormula";
String RightFormula = "example RightFormula";


SupplementalAttribute supplementalAttributeInstance = new SupplementalAttribute()
    .AttributeName(AttributeName)
    .LeftFormula(LeftFormula)
    .RightFormula(RightFormula);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
