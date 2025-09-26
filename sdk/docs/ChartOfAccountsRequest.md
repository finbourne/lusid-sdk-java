# com.finbourne.lusid.model.ChartOfAccountsRequest
The request used to create a chart of account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Chart of Accounts. | [default to String]
**displayName** | **String** | The name of the Chart of Account. | [optional] [default to String]
**description** | **String** | A description of the Chart of Accounts. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Chart of Accounts. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.ChartOfAccountsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


ChartOfAccountsRequest chartOfAccountsRequestInstance = new ChartOfAccountsRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
