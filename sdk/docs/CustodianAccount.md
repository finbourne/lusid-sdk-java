# com.finbourne.lusid.model.CustodianAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**status** | **String** | The Account status. Can be Active, Inactive or Deleted. | [default to String]
**accountNumber** | **String** | The Custodian Account Number | [default to String]
**accountName** | **String** | The identifiable name given to the Custodian Account | [default to String]
**accountingMethod** | **String** | The Accounting method to be used | [default to String]
**currency** | **String** | The Currency for the Account | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Set of unique Custodian Account properties and associated values to store with the Custodian Account. Each property must be from the &#39;CustodianAccount&#39; domain. | [optional] [default to Map<String, Property>]
**custodian** | [**LegalEntity**](LegalEntity.md) |  | [default to LegalEntity]
**accountType** | **String** | The Type of the Custodian Account. Can be Margin, Cash or Swap. Defaults to Margin. | [default to String]

```java
import com.finbourne.lusid.model.CustodianAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId CustodianAccountId = new ResourceId();
String Status = "example Status";
String AccountNumber = "example AccountNumber";
String AccountName = "example AccountName";
String AccountingMethod = "example AccountingMethod";
String Currency = "example Currency";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
LegalEntity Custodian = new LegalEntity();
String AccountType = "example AccountType";


CustodianAccount custodianAccountInstance = new CustodianAccount()
    .CustodianAccountId(CustodianAccountId)
    .Status(Status)
    .AccountNumber(AccountNumber)
    .AccountName(AccountName)
    .AccountingMethod(AccountingMethod)
    .Currency(Currency)
    .Properties(Properties)
    .Custodian(Custodian)
    .AccountType(AccountType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
