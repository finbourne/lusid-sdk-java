# com.finbourne.lusid.model.GroupReconciliationFilters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The filters for the left-side portfolio or portfolio group related data. | [optional] [default to String]
**right** | **String** | The filters for the right-side portfolio or portfolio group related data. | [optional] [default to String]

```java
import com.finbourne.lusid.model.GroupReconciliationFilters;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Left = "example Left";
@jakarta.annotation.Nullable String Right = "example Right";


GroupReconciliationFilters groupReconciliationFiltersInstance = new GroupReconciliationFilters()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
