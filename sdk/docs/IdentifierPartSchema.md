# com.finbourne.lusid.model.IdentifierPartSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** |  | [default to Integer]
**name** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**required** | **Boolean** |  | [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.IdentifierPartSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Index = new Integer("100.00");
String Name = "example Name";
String DisplayName = "example DisplayName";
String Description = "example Description";
Boolean Required = true;
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


IdentifierPartSchema identifierPartSchemaInstance = new IdentifierPartSchema()
    .Index(Index)
    .Name(Name)
    .DisplayName(DisplayName)
    .Description(Description)
    .Required(Required)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
