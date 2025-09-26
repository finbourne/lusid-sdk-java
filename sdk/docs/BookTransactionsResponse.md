# com.finbourne.lusid.model.BookTransactionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, Transaction&gt;**](Transaction.md) |  | [optional] [default to Map<String, Transaction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) |  | [optional] [default to Map<String, ErrorDetail>]

```java
import com.finbourne.lusid.model.BookTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, Transaction> Values = new Map<String, Transaction>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();


BookTransactionsResponse bookTransactionsResponseInstance = new BookTransactionsResponse()
    .Values(Values)
    .Failed(Failed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
