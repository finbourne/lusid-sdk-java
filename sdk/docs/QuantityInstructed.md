# com.finbourne.lusid.model.QuantityInstructed
The quantity of the event that was instructed, represented either as a percentage of the overall holdings or the number of units instructed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of quantity instructed, either Percentage or Units. | [default to String]
**amount** | **java.math.BigDecimal** | The actual amount instructed. For Type Percentage, this is between 0 and 100. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.QuantityInstructed;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


QuantityInstructed quantityInstructedInstance = new QuantityInstructed()
    .Type(Type)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
