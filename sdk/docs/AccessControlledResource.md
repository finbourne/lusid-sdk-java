# com.finbourne.lusid.model.AccessControlledResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** |  | [optional] [default to String]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [default to String]
**actions** | [**List&lt;AccessControlledAction&gt;**](AccessControlledAction.md) |  | [default to List<AccessControlledAction>]
**identifierParts** | [**List&lt;IdentifierPartSchema&gt;**](IdentifierPartSchema.md) |  | [optional] [default to List<IdentifierPartSchema>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AccessControlledResource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Application = "example Application";
@jakarta.annotation.Nullable String Name = "example Name";
String Description = "example Description";
List<AccessControlledAction> Actions = new List<AccessControlledAction>();
@jakarta.annotation.Nullable List<IdentifierPartSchema> IdentifierParts = new List<IdentifierPartSchema>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AccessControlledResource accessControlledResourceInstance = new AccessControlledResource()
    .Application(Application)
    .Name(Name)
    .Description(Description)
    .Actions(Actions)
    .IdentifierParts(IdentifierParts)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
