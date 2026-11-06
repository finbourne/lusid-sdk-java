# com.finbourne.lusid.model.SupplementalAttributeValues
A supplemental attribute value carried on a rec result for context. Does not contribute to matching.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The name of the supplemental attribute. | [default to String]
**leftValue** | **String** | The left-side value: the value the left items agree on, or \&quot;[multiple values]\&quot; where they do not. Null where the left side has no items. | [optional] [default to String]
**rightValue** | **String** | The right-side value: the value the right items agree on, or \&quot;[multiple values]\&quot; where they do not. Null where the right side has no items. | [optional] [default to String]

```java
import com.finbourne.lusid.model.SupplementalAttributeValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AttributeName = "example AttributeName";
@jakarta.annotation.Nullable String LeftValue = "example LeftValue";
@jakarta.annotation.Nullable String RightValue = "example RightValue";


SupplementalAttributeValues supplementalAttributeValuesInstance = new SupplementalAttributeValues()
    .AttributeName(AttributeName)
    .LeftValue(LeftValue)
    .RightValue(RightValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
