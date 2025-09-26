# com.finbourne.lusid.model.TransactionDateWindows

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | Transaction Date Window for the left side of a reconciliation | [default to String]
**right** | **String** | Transaction Date Window for the right side of a reconciliation | [default to String]

```java
import com.finbourne.lusid.model.TransactionDateWindows;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Left = "example Left";
String Right = "example Right";


TransactionDateWindows transactionDateWindowsInstance = new TransactionDateWindows()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
