# com.finbourne.lusid.model.ElectionSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionType** | **String** |  | [default to String]
**cardinality** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**referencedAs** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.lusid.model.ElectionSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionType = "example ElectionType";
Map<String, String> Cardinality = new Map<String, String>();
List<String> ReferencedAs = new List<String>();


ElectionSpecification electionSpecificationInstance = new ElectionSpecification()
    .ElectionType(ElectionType)
    .Cardinality(Cardinality)
    .ReferencedAs(ReferencedAs);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
