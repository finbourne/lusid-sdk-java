# com.finbourne.lusid.model.DialectSchema
A schema that a given document must obey. A representation of the validation of a particular Dialect,  in a given language.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of schema this represents | [default to String]
**body** | **String** | The body of the schema | [optional] [default to String]

```java
import com.finbourne.lusid.model.DialectSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
@jakarta.annotation.Nullable String Body = "example Body";


DialectSchema dialectSchemaInstance = new DialectSchema()
    .Type(Type)
    .Body(Body);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
