# com.finbourne.lusid.model.ResultValue
Base class for representing result values in LUSID.  This base class should not be directly instantiated; each supported ResultValueType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultValueType** | **String** | The available values are: ResultValue, ResultValueDictionary, ResultValue0D, ResultValueDecimal, ResultValueInt, ResultValueString, ResultValueBool, ResultValueCurrency, CashFlowValue, CashFlowValueSet, ResultValueLifeCycleEventValue, ResultValueDateTimeOffset | [default to String]

```java
import com.finbourne.lusid.model.ResultValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ResultValueType = "example ResultValueType";


ResultValue resultValueInstance = new ResultValue()
    .ResultValueType(ResultValueType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
