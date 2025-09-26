# com.finbourne.lusid.model.DialectId
Unique identifier of a given Dialect

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The Scope of the dialect. | [default to String]
**vendor** | **String** | The vendor of the dialect, the entity that created it. e.g. ISDA, FINBOURNE. | [default to String]
**sourceSystem** | **String** | The source system of the dialect, the system that understands it. e.g. LUSID, QuantLib. | [default to String]
**version** | **String** | The semantic version of the dialect: MAJOR.MINOR.PATCH. | [default to String]
**serialisationFormat** | **String** | The serialisation format of a document in this dialect. e.g. JSON, XML. | [default to String]
**entityType** | **String** | The type of entity this dialect describes e.g. Instrument. | [default to String]

```java
import com.finbourne.lusid.model.DialectId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Vendor = "example Vendor";
String SourceSystem = "example SourceSystem";
String Version = "example Version";
String SerialisationFormat = "example SerialisationFormat";
String EntityType = "example EntityType";


DialectId dialectIdInstance = new DialectId()
    .Scope(Scope)
    .Vendor(Vendor)
    .SourceSystem(SourceSystem)
    .Version(Version)
    .SerialisationFormat(SerialisationFormat)
    .EntityType(EntityType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
