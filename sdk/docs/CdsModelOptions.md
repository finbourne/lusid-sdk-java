# com.finbourne.lusid.model.CdsModelOptions
Model options for credit default instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useFactorsForCurrentNotional** | **Boolean** | Determines if calculations that use current notional apply use a constituent weight factor from a quote representing a default. | [default to Boolean]

```java
import com.finbourne.lusid.model.CdsModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean UseFactorsForCurrentNotional = true;


CdsModelOptions cdsModelOptionsInstance = new CdsModelOptions()
    .UseFactorsForCurrentNotional(UseFactorsForCurrentNotional);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
