# com.finbourne.lusid.model.RequestedChanges

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeCount** | **Integer** | Number of attributes staged change applies to | [optional] [default to Integer]
**attributeNames** | **List&lt;String&gt;** | Names of the attributes the staged change applies to. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.RequestedChanges;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer AttributeCount = new Integer("100.00");
@jakarta.annotation.Nullable List<String> AttributeNames = new List<String>();


RequestedChanges requestedChangesInstance = new RequestedChanges()
    .AttributeCount(AttributeCount)
    .AttributeNames(AttributeNames);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
