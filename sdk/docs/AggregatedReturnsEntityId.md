# com.finbourne.lusid.model.AggregatedReturnsEntityId
Identifies an entity whose aggregated (time-weighted) returns are calculated: its scope, code and  type. Mirrors the valuation endpoint's entity identifier. Currently, supports only the  `Portfolio` entity type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]
**entityType** | **String** | Available values: Portfolio. | [default to String]

```java
import com.finbourne.lusid.model.AggregatedReturnsEntityId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
String EntityType = "example EntityType";


AggregatedReturnsEntityId aggregatedReturnsEntityIdInstance = new AggregatedReturnsEntityId()
    .Scope(Scope)
    .Code(Code)
    .EntityType(EntityType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
