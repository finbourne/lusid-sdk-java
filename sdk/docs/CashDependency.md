# com.finbourne.lusid.model.CashDependency
For indicating a dependency upon a currency.  E.g. A Bond will declare a CashDependency for its domestic currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The Currency that is depended upon. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CashDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Currency = "example Currency";
OffsetDateTime Date = OffsetDateTime.now();


CashDependency cashDependencyInstance = new CashDependency()
    .Currency(Currency)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
