# com.finbourne.lusid.model.DataScope

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | [**Client**](Client.md) |  | [optional] [default to Client]
**scope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.DataScope;
import java.util.*;
import java.lang.System;
import java.net.URI;

Client Client = new Client();
@jakarta.annotation.Nullable String Scope = "example Scope";


DataScope dataScopeInstance = new DataScope()
    .Client(Client)
    .Scope(Scope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
