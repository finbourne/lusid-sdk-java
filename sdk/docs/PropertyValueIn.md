# com.finbourne.lusid.model.PropertyValueIn
A criterion that checks whether a Property Value is equal to one of the given string values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The property key whose value will form the left-hand side of the operation | [default to String]
**value** | **List&lt;String&gt;** | The value to be compared against | [default to List<String>]

```java
import com.finbourne.lusid.model.PropertyValueIn;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";
List<String> Value = new List<String>();


PropertyValueIn propertyValueInInstance = new PropertyValueIn()
    .PropertyKey(PropertyKey)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
