# com.finbourne.lusid.model.CashFlowEvent
Definition of a CashFlow event.  This is an event that describes the occurence of a cashflow and associated information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cashFlowValue** | [**CashFlowValue**](CashFlowValue.md) |  | [default to CashFlowValue]
**eventType** | **String** | What type of internal event does this represent; coupon, principal, premium etc. | [readonly] [default to String]

```java
import com.finbourne.lusid.model.CashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

CashFlowValue CashFlowValue = new CashFlowValue();
String EventType = "example EventType";


CashFlowEvent cashFlowEventInstance = new CashFlowEvent()
    .CashFlowValue(CashFlowValue)
    .EventType(EventType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
