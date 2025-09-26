# com.finbourne.lusid.model.CustodianAccountRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The Scope assigned to the Custodian Account, where left blank the parent Portfolio Scope will be used | [optional] [default to String]
**code** | **String** | Unique Code representing the Custodian Account | [default to String]
**status** | **String** | The Account status. Can be Active, Inactive or Deleted. | [optional] [default to String]
**accountNumber** | **String** | The Custodian Account Number | [default to String]
**accountName** | **String** | The identifiable name given to the Custodian Account | [default to String]
**accountingMethod** | **String** | The Accounting method to be used | [default to String]
**currency** | **String** | The Currency for the Account | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Set of unique Custodian Account properties and associated values to store with the Custodian Account. Each property must be from the &#39;CustodianAccount&#39; domain. | [optional] [default to Map<String, Property>]
**custodianIdentifier** | [**TypedResourceId**](TypedResourceId.md) |  | [default to TypedResourceId]
**accountType** | **String** | The Type of the Custodian Account. Can be Margin, Cash or Swap. Defaults to Margin. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CustodianAccountRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Scope = "example Scope";
String Code = "example Code";
@jakarta.annotation.Nullable String Status = "example Status";
String AccountNumber = "example AccountNumber";
String AccountName = "example AccountName";
String AccountingMethod = "example AccountingMethod";
String Currency = "example Currency";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
TypedResourceId CustodianIdentifier = new TypedResourceId();
@jakarta.annotation.Nullable String AccountType = "example AccountType";


CustodianAccountRequest custodianAccountRequestInstance = new CustodianAccountRequest()
    .Scope(Scope)
    .Code(Code)
    .Status(Status)
    .AccountNumber(AccountNumber)
    .AccountName(AccountName)
    .AccountingMethod(AccountingMethod)
    .Currency(Currency)
    .Properties(Properties)
    .CustodianIdentifier(CustodianIdentifier)
    .AccountType(AccountType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
