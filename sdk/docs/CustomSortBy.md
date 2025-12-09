# com.finbourne.lusid.model.CustomSortBy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The name of the field to sort by. | [default to String]
**priorityValues** | **List&lt;String&gt;** | An optional list of priority field values to sort by, in the order they should be prioritized. | [optional] [default to List<String>]
**remainderOrder** | **String** | The sorting direction for the remaining field values. Either ascending (ASC) or descending (DESC). | [default to String]

```java
import com.finbourne.lusid.model.CustomSortBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FieldName = "example FieldName";
@jakarta.annotation.Nullable List<String> PriorityValues = new List<String>();
String RemainderOrder = "example RemainderOrder";


CustomSortBy customSortByInstance = new CustomSortBy()
    .FieldName(FieldName)
    .PriorityValues(PriorityValues)
    .RemainderOrder(RemainderOrder);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
