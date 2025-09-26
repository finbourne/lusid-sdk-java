# com.finbourne.lusid.model.FxLinkedNotionalSchedule
Schedule for notional changes based on the change in FX rate.  Used in the representation of a resettable cross currency interest rate swap.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fxConventions** | [**FxConventions**](FxConventions.md) |  | [default to FxConventions]
**varyingNotionalCurrency** | **String** | The currency of the varying notional amount. | [default to String]
**varyingNotionalFixingDates** | [**RelativeDateOffset**](RelativeDateOffset.md) |  | [default to RelativeDateOffset]
**varyingNotionalInterimExchangePaymentDates** | [**RelativeDateOffset**](RelativeDateOffset.md) |  | [optional] [default to RelativeDateOffset]

```java
import com.finbourne.lusid.model.FxLinkedNotionalSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

FxConventions FxConventions = new FxConventions();
String VaryingNotionalCurrency = "example VaryingNotionalCurrency";
RelativeDateOffset VaryingNotionalFixingDates = new RelativeDateOffset();
RelativeDateOffset VaryingNotionalInterimExchangePaymentDates = new RelativeDateOffset();


FxLinkedNotionalSchedule fxLinkedNotionalScheduleInstance = new FxLinkedNotionalSchedule()
    .FxConventions(FxConventions)
    .VaryingNotionalCurrency(VaryingNotionalCurrency)
    .VaryingNotionalFixingDates(VaryingNotionalFixingDates)
    .VaryingNotionalInterimExchangePaymentDates(VaryingNotionalInterimExchangePaymentDates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
