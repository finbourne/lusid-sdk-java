# com.finbourne.lusid.model.ReconciliationId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**DataScope**](DataScope.md) |  | [optional] [default to DataScope]
**identifier** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReconciliationId;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataScope Scope = new DataScope();
@jakarta.annotation.Nullable String Identifier = "example Identifier";


ReconciliationId reconciliationIdInstance = new ReconciliationId()
    .Scope(Scope)
    .Identifier(Identifier);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
