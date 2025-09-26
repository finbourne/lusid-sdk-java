# com.finbourne.lusid.model.GroupedResultOfAddressKey
Holder class for a group of results. It consists of a list of columns and values for that column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List&lt;String&gt;** | The columns, or keys, for a particular group of results | [optional] [default to List<String>]
**values** | [**List&lt;ResultValue&gt;**](ResultValue.md) | The values for the list of results | [optional] [default to List<ResultValue>]

```java
import com.finbourne.lusid.model.GroupedResultOfAddressKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> Columns = new List<String>();
@jakarta.annotation.Nullable List<ResultValue> Values = new List<ResultValue>();


GroupedResultOfAddressKey groupedResultOfAddressKeyInstance = new GroupedResultOfAddressKey()
    .Columns(Columns)
    .Values(Values);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
