# com.finbourne.lusid.model.CleardownModuleRequest
A Cleardown Module request definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Cleardown Module. | [default to String]
**displayName** | **String** | The name of the Cleardown Module. | [default to String]
**description** | **String** | A description for the Cleardown Module. | [optional] [default to String]
**rules** | [**List&lt;CleardownModuleRule&gt;**](CleardownModuleRule.md) | The Cleardown Rules that apply for the Cleardown Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<CleardownModuleRule>]

```java
import com.finbourne.lusid.model.CleardownModuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<CleardownModuleRule> Rules = new List<CleardownModuleRule>();


CleardownModuleRequest cleardownModuleRequestInstance = new CleardownModuleRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
