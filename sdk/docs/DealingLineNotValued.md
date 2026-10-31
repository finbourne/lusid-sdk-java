# com.finbourne.lusid.model.DealingLineNotValued
A dealing line read for a swing decision that could not be valued into its share class currency, and why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | The identifier of the dealing order that could not be valued, as scope/code. | [default to String]
**shareClass** | **String** | The share class the order deals in, keyed as the valuation point&#39;s share classes are. | [optional] [default to String]
**currency** | **String** | The currency the order&#39;s amount is in. Absent when the line carries no amount. | [optional] [default to String]
**reason** | **String** | Why the line could not be valued into the share class currency. | [default to String]

```java
import com.finbourne.lusid.model.DealingLineNotValued;
import java.util.*;
import java.lang.System;
import java.net.URI;

String OrderId = "example OrderId";
@jakarta.annotation.Nullable String ShareClass = "example ShareClass";
@jakarta.annotation.Nullable String Currency = "example Currency";
String Reason = "example Reason";


DealingLineNotValued dealingLineNotValuedInstance = new DealingLineNotValued()
    .OrderId(OrderId)
    .ShareClass(ShareClass)
    .Currency(Currency)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
