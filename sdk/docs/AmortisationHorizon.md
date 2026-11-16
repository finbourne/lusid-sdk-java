# com.finbourne.lusid.model.AmortisationHorizon
The redemption a bond's cost is amortised towards, chosen per tax lot by whether the lot is held at a premium  (cost per unit above par) or a discount. Each value is one of Maturity, NextCall, NextPut or YieldToWorst and  defaults to Maturity. NextCall strikes a lot to its next call where the call price is below the lot's carrying  value, else to maturity until that call passes, so a discount lot is never struck to a call at or above par.  NextPut strikes to the next put at its price. YieldToWorst strikes to whichever call or the maturity gives the  lowest yield from the lot's cost.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**premium** | **String** | Available values: Maturity, NextCall, NextPut, YieldToWorst. | [optional] [default to String]
**discount** | **String** | Available values: Maturity, NextCall, NextPut, YieldToWorst. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AmortisationHorizon;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Premium = "example Premium";
@jakarta.annotation.Nullable String Discount = "example Discount";


AmortisationHorizon amortisationHorizonInstance = new AmortisationHorizon()
    .Premium(Premium)
    .Discount(Discount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
