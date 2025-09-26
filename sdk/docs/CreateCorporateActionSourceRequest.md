# com.finbourne.lusid.model.CreateCorporateActionSourceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the corporate action source | [default to String]
**code** | **String** | The code of the corporate action source | [default to String]
**displayName** | **String** | The name of the corporate action source | [default to String]
**description** | **String** | The description of the corporate action source | [optional] [default to String]
**instrumentScopes** | **List&lt;String&gt;** | The list of instrument scopes used as the scope resolution strategy when resolving instruments of upserted corporate actions. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.CreateCorporateActionSourceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> InstrumentScopes = new List<String>();


CreateCorporateActionSourceRequest createCorporateActionSourceRequestInstance = new CreateCorporateActionSourceRequest()
    .Scope(Scope)
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .InstrumentScopes(InstrumentScopes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
