# com.finbourne.lusid.model.CustodianEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**accountSelector** | **String** | Available values: From, To. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CustodianEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId AccountId = new ResourceId();
@jakarta.annotation.Nullable String AccountSelector = "example AccountSelector";


CustodianEntry custodianEntryInstance = new CustodianEntry()
    .AccountId(AccountId)
    .AccountSelector(AccountSelector);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
