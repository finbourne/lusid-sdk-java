# com.finbourne.lusid.model.BondForwardModelOptions
Model options for bond forward pricing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bondForwardProjectionType** | **String** | Determines how the forward price of the deliverable bond is projected to the settlement date.     Supported string (enumeration) values are: [QuotedContractPrice, ForwardProjectedFromFundingCurve].  Defaults to QuotedContractPrice - the original quote-driven behaviour - when not supplied, so  options persisted before this property existed keep the behaviour they were saved under. | [optional] [default to String]

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
