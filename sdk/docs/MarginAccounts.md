# com.finbourne.lusid.model.MarginAccounts
The custodian account each party's collateral is held in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wePost** | **String** | The code of the custodian account, within each applicable portfolio, that holds collateral we post. Empty means collateral we post is not held in a custodian account the item knows of. | [optional] [default to String]
**theyPost** | **String** | The code of the custodian account, within each applicable portfolio, that holds collateral the counterparty posts. Empty means collateral they post is not held in a custodian account the item knows of. | [optional] [default to String]

```java
import com.finbourne.lusid.model.MarginAccounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String WePost = "example WePost";
@jakarta.annotation.Nullable String TheyPost = "example TheyPost";


MarginAccounts marginAccountsInstance = new MarginAccounts()
    .WePost(WePost)
    .TheyPost(TheyPost);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
