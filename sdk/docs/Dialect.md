# com.finbourne.lusid.model.Dialect
The language/format of a translatable entity. Entities can be LUSID native or external and the Dialect describes  1) the system that understands the entity and  2) applicable validation for the entity, in the form of a schema.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**DialectId**](DialectId.md) |  | [default to DialectId]
**schema** | [**DialectSchema**](DialectSchema.md) |  | [default to DialectSchema]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.Dialect;
import java.util.*;
import java.lang.System;
import java.net.URI;

DialectId Id = new DialectId();
DialectSchema Schema = new DialectSchema();
Version Version = new Version();


Dialect dialectInstance = new Dialect()
    .Id(Id)
    .Schema(Schema)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
