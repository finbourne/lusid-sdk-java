# com.finbourne.lusid.model.AccountHolder
An Account Holder of an Investment Account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | A client-defined key used to identify the Account Holder, unique within the Investment Account | [optional] [default to String]
**scope** | **String** | The scope in which the Investor Record lies. | [optional] [default to String]
**identifiers** | **Map&lt;String, String&gt;** | Single Account Holder identifier that should target the desired Investor Record. | [optional] [default to Map<String, String>]
**entityUniqueId** | **String** | The unique InvestorRecord entity identifier | [optional] [default to String]
**investorRecord** | [**InvestorRecord**](InvestorRecord.md) |  | [optional] [default to InvestorRecord]

```java
import com.finbourne.lusid.model.AccountHolder;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Key = "example Key";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
InvestorRecord InvestorRecord = new InvestorRecord();


AccountHolder accountHolderInstance = new AccountHolder()
    .Key(Key)
    .Scope(Scope)
    .Identifiers(Identifiers)
    .EntityUniqueId(EntityUniqueId)
    .InvestorRecord(InvestorRecord);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
