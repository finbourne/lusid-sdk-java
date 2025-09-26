# com.finbourne.lusid.model.Membership

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the unique identifier associated with the Custom Data Model. | [default to String]
**code** | **String** | The code of the unique identifier associated with the Custom Data Model. | [default to String]
**displayName** | **String** | The name of the Custom Data Model. | [default to String]

```java
import com.finbourne.lusid.model.Membership;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String DisplayName = "example DisplayName";


Membership membershipInstance = new Membership()
    .Scope(Scope)
    .Code(Code)
    .DisplayName(DisplayName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
