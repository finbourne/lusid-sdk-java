# com.finbourne.lusid.model.RecDefCurrencies

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The currency used on the left side of the reconciliation. Required when the left side has portfolio sources; must be null when it draws on relational data. | [optional] [default to String]
**right** | **String** | The currency used on the right side of the reconciliation. Required when the right side has portfolio sources; must be null when it draws on relational data. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecDefCurrencies;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Left = "example Left";
@jakarta.annotation.Nullable String Right = "example Right";


RecDefCurrencies recDefCurrenciesInstance = new RecDefCurrencies()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
