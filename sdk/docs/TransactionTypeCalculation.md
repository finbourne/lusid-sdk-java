# com.finbourne.lusid.model.TransactionTypeCalculation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of calculation to perform | [default to String]
**side** | **String** | The side to which the calculation is applied | [optional] [default to String]
**formula** | **String** | The formula used to derive the total consideration amount when it is not provided on the transaction | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransactionTypeCalculation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
@jakarta.annotation.Nullable String Side = "example Side";
@jakarta.annotation.Nullable String Formula = "example Formula";


TransactionTypeCalculation transactionTypeCalculationInstance = new TransactionTypeCalculation()
    .Type(Type)
    .Side(Side)
    .Formula(Formula);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
