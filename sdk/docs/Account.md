# com.finbourne.lusid.model.Account
An account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Account. | [default to String]
**description** | **String** | A description for the Account. | [optional] [default to String]
**type** | **String** | The Account type. Can have the values: Asset/Liabilities/Income/Expense/Capital/Revenue. | [default to String]
**status** | **String** | The Account status. Can be Active, Inactive or Deleted. The available values are: Active, Inactive, Deleted | [default to String]
**control** | **String** | This allows users to specify whether this a protected Account that prevents direct manual journal adjustment. Can have the values: System/ManualIt will default to “Manual”. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Account. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.Account;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String Description = "example Description";
String Type = "example Type";
String Status = "example Status";
@jakarta.annotation.Nullable String Control = "example Control";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


Account accountInstance = new Account()
    .Code(Code)
    .Description(Description)
    .Type(Type)
    .Status(Status)
    .Control(Control)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
