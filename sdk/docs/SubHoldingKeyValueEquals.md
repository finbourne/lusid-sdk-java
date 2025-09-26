# com.finbourne.lusid.model.SubHoldingKeyValueEquals
A criterion that checks whether a SubHoldingKey Value is equal to the given string value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subHoldingKey** | **String** | The sub holding key whose value will form the left-hand side of the operation | [default to String]
**value** | **String** | The value to be compared against | [default to String]

```java
import com.finbourne.lusid.model.SubHoldingKeyValueEquals;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SubHoldingKey = "example SubHoldingKey";
String Value = "example Value";


SubHoldingKeyValueEquals subHoldingKeyValueEqualsInstance = new SubHoldingKeyValueEquals()
    .SubHoldingKey(SubHoldingKey)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
