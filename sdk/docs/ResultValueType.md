# com.finbourne.lusid.model.ResultValueType
Enum of possible result value type. Used discriminate the result values

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResultValueType** | [**String**](.md) | **Enum of possible result value type. Used discriminate the result values** | [default to String]

```java
import com.finbourne.lusid.model.ResultValueType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of ResultValueType:
ResultValueType method = ResultValueType.RESULTVALUE;
ResultValueType method = ResultValueType.RESULTVALUEDICTIONARY;
ResultValueType method = ResultValueType.RESULTVALUE0D;
ResultValueType method = ResultValueType.RESULTVALUEDECIMAL;
ResultValueType method = ResultValueType.RESULTVALUEINT;
ResultValueType method = ResultValueType.RESULTVALUESTRING;
ResultValueType method = ResultValueType.RESULTVALUEBOOL;
ResultValueType method = ResultValueType.RESULTVALUECURRENCY;
ResultValueType method = ResultValueType.CASHFLOWVALUE;
ResultValueType method = ResultValueType.CASHFLOWVALUESET;
ResultValueType method = ResultValueType.RESULTVALUELIFECYCLEEVENTVALUE;
ResultValueType method = ResultValueType.RESULTVALUEDATETIMEOFFSET;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
