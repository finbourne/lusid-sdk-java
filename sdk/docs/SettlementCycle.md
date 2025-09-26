# com.finbourne.lusid.model.SettlementCycle
The settlement cycle for an instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessDayOffset** | **Integer** |  | [default to Integer]
**calendars** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]

```java
import com.finbourne.lusid.model.SettlementCycle;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer BusinessDayOffset = new Integer("100.00");
List<ResourceId> Calendars = new List<ResourceId>();


SettlementCycle settlementCycleInstance = new SettlementCycle()
    .BusinessDayOffset(BusinessDayOffset)
    .Calendars(Calendars);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
