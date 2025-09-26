# com.finbourne.lusid.model.TransactionMatchingAlternativeId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | An property key (from the &#39;Transaction&#39; domain) that can be used as an alternative to TransactionId when matching transactions to settlement instructions. This property must be pre-defined and must be present on the transaction in order to be used for matching. | [default to String]

```java
import com.finbourne.lusid.model.TransactionMatchingAlternativeId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";


TransactionMatchingAlternativeId transactionMatchingAlternativeIdInstance = new TransactionMatchingAlternativeId()
    .PropertyKey(PropertyKey);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
