# com.finbourne.lusid.model.StripBondModelOptions
Model options for StripBond pricing: how a strip's cash receipts are split between income and return of  capital. Set on the VendorModelRule for StripBond under the BondLookupPricer, SimpleStatic or  OverrideOnlyPricer model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stripAccountingChoice** | **String** | How a StripBond&#39;s cash receipts are split between income and return of capital.  Null means CostRecovery: the effective yield is 0, every receipt returns capital until cost is recovered.  QuotedYield reads the strip&#39;s EffectiveYield quote at the parent flow&#39;s ex-date.  CashAsReceived applies no yield: each receipt is booked as the parent paid it, an interest-only strip&#39;s  cash as income and a principal-only strip&#39;s as return of capital.     Supported string (enumeration) values are: [CostRecovery, QuotedYield, CashAsReceived]. | [optional] [default to String]

```java
import com.finbourne.lusid.model.StripBondModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String StripAccountingChoice = "example StripAccountingChoice";


StripBondModelOptions stripBondModelOptionsInstance = new StripBondModelOptions()
    .StripAccountingChoice(StripAccountingChoice);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
