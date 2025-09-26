# com.finbourne.lusid.model.MembershipAndStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Describes whether the entity is still a valid member of the data model. | [default to String]
**scope** | **String** | The scope of the unique identifier associated with the Custom Data Model. | [default to String]
**code** | **String** | The code of the unique identifier associated with the Custom Data Model. | [default to String]
**displayName** | **String** | The name of the Custom Data Model. | [default to String]

```java
import com.finbourne.lusid.model.MembershipAndStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
String Scope = "example Scope";
String Code = "example Code";
String DisplayName = "example DisplayName";


MembershipAndStatus membershipAndStatusInstance = new MembershipAndStatus()
    .Status(Status)
    .Scope(Scope)
    .Code(Code)
    .DisplayName(DisplayName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
