# com.finbourne.lusid.model.PropertyValueEquals
A criterion that checks whether a Property Value is equal to the given string value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The property key whose value will form the left-hand side of the operation | [default to String]
**value** | **String** | The value to be compared against | [default to String]

```java
import com.finbourne.lusid.model.PropertyValueEquals;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";
String Value = "example Value";


PropertyValueEquals propertyValueEqualsInstance = new PropertyValueEquals()
    .PropertyKey(PropertyKey)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
