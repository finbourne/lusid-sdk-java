# com.finbourne.lusid.model.AddressKeyAlias
An address key alias that maps a short alias key to a real key with options.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the alias | [default to String]
**code** | **String** | The code of the alias | [default to String]
**aliasKey** | **String** | The alias address key, must start with \&quot;Alias/\&quot; prefix (e.g., \&quot;Alias/DailyNZPnL\&quot;) | [default to String]
**realKey** | **String** | The real address key this alias resolves to (e.g., \&quot;ProfitAndLoss/Total\&quot;). Must NOT start with \&quot;Alias/\&quot;. | [default to String]
**options** | **Map&lt;String, String&gt;** | Options to apply when resolving the alias (e.g., {\&quot;Window\&quot;:\&quot;Daily\&quot;,\&quot;TimeZone\&quot;:\&quot;NZ\&quot;}) | [optional] [default to Map<String, String>]
**displayName** | **String** | Human-readable display name | [optional] [default to String]
**description** | **String** | Description of the alias | [optional] [default to String]

```java
import com.finbourne.lusid.model.AddressKeyAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String AliasKey = "example AliasKey";
String RealKey = "example RealKey";
@jakarta.annotation.Nullable Map<String, String> Options = new Map<String, String>();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


AddressKeyAlias addressKeyAliasInstance = new AddressKeyAlias()
    .Scope(Scope)
    .Code(Code)
    .AliasKey(AliasKey)
    .RealKey(RealKey)
    .Options(Options)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
