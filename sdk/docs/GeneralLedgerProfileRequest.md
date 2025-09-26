# com.finbourne.lusid.model.GeneralLedgerProfileRequest
A General Ledger Profile Definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generalLedgerProfileCode** | **String** | The unique code for the General Ledger Profile | [default to String]
**displayName** | **String** | The name of the General Ledger Profile | [default to String]
**description** | **String** | A description for the General Ledger Profile | [optional] [default to String]
**generalLedgerProfileMappings** | [**List&lt;GeneralLedgerProfileMapping&gt;**](GeneralLedgerProfileMapping.md) | Rules for mapping Account or property values to aggregation pattern definitions | [default to List<GeneralLedgerProfileMapping>]

```java
import com.finbourne.lusid.model.GeneralLedgerProfileRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String GeneralLedgerProfileCode = "example GeneralLedgerProfileCode";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<GeneralLedgerProfileMapping> GeneralLedgerProfileMappings = new List<GeneralLedgerProfileMapping>();


GeneralLedgerProfileRequest generalLedgerProfileRequestInstance = new GeneralLedgerProfileRequest()
    .GeneralLedgerProfileCode(GeneralLedgerProfileCode)
    .DisplayName(DisplayName)
    .Description(Description)
    .GeneralLedgerProfileMappings(GeneralLedgerProfileMappings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
