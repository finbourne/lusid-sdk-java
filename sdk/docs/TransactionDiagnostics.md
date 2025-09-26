# com.finbourne.lusid.model.TransactionDiagnostics
Represents a set of diagnostics per transaction, where applicable.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionDisplayName** | **String** |  | [default to String]
**errorDetails** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.lusid.model.TransactionDiagnostics;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TransactionDisplayName = "example TransactionDisplayName";
List<String> ErrorDetails = new List<String>();


TransactionDiagnostics transactionDiagnosticsInstance = new TransactionDiagnostics()
    .TransactionDisplayName(TransactionDisplayName)
    .ErrorDetails(ErrorDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
