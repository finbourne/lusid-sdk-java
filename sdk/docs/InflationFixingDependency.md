# com.finbourne.lusid.model.InflationFixingDependency
For indicating a dependency upon an inflation fixing

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The Type of fixing (index, ratio or assumption) | [default to String]
**code** | **String** | The Code of the fixing, typically the index name | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt of the inflation fixing | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.InflationFixingDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Code = "example Code";
OffsetDateTime Date = OffsetDateTime.now();


InflationFixingDependency inflationFixingDependencyInstance = new InflationFixingDependency()
    .Type(Type)
    .Code(Code)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
