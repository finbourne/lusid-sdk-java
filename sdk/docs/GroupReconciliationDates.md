# com.finbourne.lusid.model.GroupReconciliationDates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**GroupReconciliationDatePair**](GroupReconciliationDatePair.md) |  | [optional] [default to GroupReconciliationDatePair]
**right** | [**GroupReconciliationDatePair**](GroupReconciliationDatePair.md) |  | [optional] [default to GroupReconciliationDatePair]

```java
import com.finbourne.lusid.model.GroupReconciliationDates;
import java.util.*;
import java.lang.System;
import java.net.URI;

GroupReconciliationDatePair Left = new GroupReconciliationDatePair();
GroupReconciliationDatePair Right = new GroupReconciliationDatePair();


GroupReconciliationDates groupReconciliationDatesInstance = new GroupReconciliationDates()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
