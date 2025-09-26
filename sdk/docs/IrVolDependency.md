# com.finbourne.lusid.model.IrVolDependency
Economic dependency required to price interest rate products that contain optionality, for example swaptions.  For example, can indicate a dependency on an IrVolCubeData.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The domestic currency of the instrument declaring this dependency. | [default to String]
**volType** | **String** | Volatility type e.g. \&quot;LN\&quot; and \&quot;N\&quot; for log-normal and normal volatility. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.IrVolDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
String VolType = "example VolType";
OffsetDateTime Date = OffsetDateTime.now();


IrVolDependency irVolDependencyInstance = new IrVolDependency()
    .Currency(Currency)
    .VolType(VolType)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
