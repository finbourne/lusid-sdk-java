# com.finbourne.lusid.model.AggregationType
A list of types, that define the expected output types found from an aggregation request in its result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AggregationType** | [**String**](.md) | **A list of types, that define the expected output types found from an aggregation request in its result.** | [default to String]

```java
import com.finbourne.lusid.model.AggregationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of AggregationType:
AggregationType method = AggregationType.STRING;
AggregationType method = AggregationType.INT;
AggregationType method = AggregationType.DECIMAL;
AggregationType method = AggregationType.DATETIME;
AggregationType method = AggregationType.BOOLEAN;
AggregationType method = AggregationType.RESULTVALUE;
AggregationType method = AggregationType.RESULT0D;
AggregationType method = AggregationType.JSON;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
