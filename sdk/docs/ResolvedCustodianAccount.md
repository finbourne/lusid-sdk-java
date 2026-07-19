# com.finbourne.lusid.model.ResolvedCustodianAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountSelector** | **String** | Available values: From, To. | [optional] [default to String]
**custodianAccount** | [**CustodianAccount**](CustodianAccount.md) |  | [default to CustodianAccount]
**resolutionType** | **String** | Available values: BookingEntry, ContextCustodian, RelatedAccount, PortfolioDefault. | [default to String]

```java
import com.finbourne.lusid.model.ResolvedCustodianAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String AccountSelector = "example AccountSelector";
CustodianAccount CustodianAccount = new CustodianAccount();
String ResolutionType = "example ResolutionType";


ResolvedCustodianAccount resolvedCustodianAccountInstance = new ResolvedCustodianAccount()
    .AccountSelector(AccountSelector)
    .CustodianAccount(CustodianAccount)
    .ResolutionType(ResolutionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
