# com.finbourne.lusid.model.FieldValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** |  | [default to String]
**fields** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**numericFields** | **Map&lt;String, java.math.BigDecimal&gt;** |  | [optional] [default to Map<String, java.math.BigDecimal>]

```java
import com.finbourne.lusid.model.FieldValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Value = "example Value";
@jakarta.annotation.Nullable Map<String, String> Fields = new Map<String, String>();
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> NumericFields = new Map<String, java.math.BigDecimal>();


FieldValue fieldValueInstance = new FieldValue()
    .Value(Value)
    .Fields(Fields)
    .NumericFields(NumericFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
