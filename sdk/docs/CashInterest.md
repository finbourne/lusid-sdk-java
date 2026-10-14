# com.finbourne.lusid.model.CashInterest
Interest accrued on posted cash.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **String** | The name of the rate index. | [default to String]
**spreadBps** | **Integer** | The spread over the index, in basis points. | [default to Integer]

```java
import com.finbourne.lusid.model.CashInterest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Index = "example Index";
Integer SpreadBps = new Integer("100.00");


CashInterest cashInterestInstance = new CashInterest()
    .Index(Index)
    .SpreadBps(SpreadBps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
