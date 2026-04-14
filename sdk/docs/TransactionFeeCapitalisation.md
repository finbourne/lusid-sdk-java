# com.finbourne.lusid.model.TransactionFeeCapitalisation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capitalisation** | **String** | Whether the transaction fee should be capitalised, not capitalised, or conditionally capitalised. The allowed values are Capitalised, NonCapitalised, Conditional. | [optional] [default to String]
**capitalisedCondition** | **String** | The condition that determines whether the fee is capitalised when applied to the transaction. Required only when Capitalisation is &#39;Conditional&#39;. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransactionFeeCapitalisation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Capitalisation = "example Capitalisation";
@jakarta.annotation.Nullable String CapitalisedCondition = "example CapitalisedCondition";


TransactionFeeCapitalisation transactionFeeCapitalisationInstance = new TransactionFeeCapitalisation()
    .Capitalisation(Capitalisation)
    .CapitalisedCondition(CapitalisedCondition);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
