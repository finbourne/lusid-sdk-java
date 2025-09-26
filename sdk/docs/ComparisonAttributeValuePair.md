# com.finbourne.lusid.model.ComparisonAttributeValuePair

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | Comparison rule attribute name. | [default to String]
**value** | **String** | Computed value for the comparison rule attribute. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ComparisonAttributeValuePair;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AttributeName = "example AttributeName";
@jakarta.annotation.Nullable String Value = "example Value";


ComparisonAttributeValuePair comparisonAttributeValuePairInstance = new ComparisonAttributeValuePair()
    .AttributeName(AttributeName)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
