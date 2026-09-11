# com.finbourne.lusid.model.BondForwardModelOptions
Model options for bond forward pricing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bondForwardProjectionType** | **String** | Determines how the forward price of the deliverable bond is projected to the settlement date.     Supported string (enumeration) values are: [QuotedContractPrice, ForwardProjectedFromFundingCurve,  DeliverableSpreadAnchoredToQuote].  Defaults to QuotedContractPrice - the original quote-driven behaviour - when not supplied, so  options persisted before this property existed keep the behaviour they were saved under.     ForwardProjectedFromFundingCurve carries the deliverable&#39;s quoted dirty spot to settlement on the  discount curve. DeliverableSpreadAnchoredToQuote does the same carry but models that spot as well,  off the spread anchored for the deliverable in the base market, which is what gives the forward  the deliverable&#39;s own curve delta rather than only the carry&#39;s - the larger of the two terms. It  requires the deliverable to be a mastered Bond or ComplexBond settling in the forward&#39;s own  currency, and a credit-spread curve or ZSpread quote to be resolvable for it. | [optional] [default to String]

```java
import com.finbourne.lusid.model.BondForwardModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String BondForwardProjectionType = "example BondForwardProjectionType";


BondForwardModelOptions bondForwardModelOptionsInstance = new BondForwardModelOptions()
    .BondForwardProjectionType(BondForwardProjectionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
