# com.finbourne.lusid.model.FxRateSchedule
Schedule to define fx conversion of cashflows on complex bonds. If an fx schedule is defined then  on payment schedule generation the coupon and principal payoffs will be wrapped in an fx rate payoff method.  Either the fx rate is predefined (fixed) or relies on fx resets (floating).  Used in representation of dual currency bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]
**fxConversionTypes** | **List&lt;String&gt;** | List of flags to indicate if coupon payments, principal payments or both are converted | [optional] [default to List<String>]
**rate** | **java.math.BigDecimal** | FxRate used to convert payments. Assumed to be in units of the ToCurrency so conversion is paymentAmount x fxRate | [optional] [default to java.math.BigDecimal]
**toCurrency** | **String** | Currency that payments are converted to | [optional] [default to String]

```java
import com.finbourne.lusid.model.FxRateSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

FlowConventions FlowConventions = new FlowConventions();
@jakarta.annotation.Nullable List<String> FxConversionTypes = new List<String>();
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ToCurrency = "example ToCurrency";


FxRateSchedule fxRateScheduleInstance = new FxRateSchedule()
    .FlowConventions(FlowConventions)
    .FxConversionTypes(FxConversionTypes)
    .Rate(Rate)
    .ToCurrency(ToCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
