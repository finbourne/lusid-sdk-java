# com.finbourne.lusid.model.VendorDependency
For indicating a dependency on some opaque market data requested by an outside vendor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendorName** | **String** | The name of the outside vendor | [default to String]
**vendorPath** | **List&lt;String&gt;** | The specific dependency path | [default to List<String>]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.VendorDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String VendorName = "example VendorName";
List<String> VendorPath = new List<String>();
OffsetDateTime Date = OffsetDateTime.now();


VendorDependency vendorDependencyInstance = new VendorDependency()
    .VendorName(VendorName)
    .VendorPath(VendorPath)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
