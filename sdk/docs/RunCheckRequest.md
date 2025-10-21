# com.finbourne.lusid.model.RunCheckRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidEntityDataset** | [**LusidEntityDataset**](LusidEntityDataset.md) |  | [optional] [default to LusidEntityDataset]
**limitIndividualBreachesPerRule** | **Integer** | The maximum number of individual breaches to return per rule. Defaults to 100 if not specified. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.RunCheckRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidEntityDataset LusidEntityDataset = new LusidEntityDataset();
Integer LimitIndividualBreachesPerRule = new Integer("100.00");


RunCheckRequest runCheckRequestInstance = new RunCheckRequest()
    .LusidEntityDataset(LusidEntityDataset)
    .LimitIndividualBreachesPerRule(LimitIndividualBreachesPerRule);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
