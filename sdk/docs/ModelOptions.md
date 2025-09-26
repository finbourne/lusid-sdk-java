# com.finbourne.lusid.model.ModelOptions
Base class for representing model options in LUSID, which provide config for instrument analytics.  This base class should not be directly instantiated; each supported ModelOptionsType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | The available values are: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions | [default to String]

```java
import com.finbourne.lusid.model.ModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ModelOptionsType = "example ModelOptionsType";


ModelOptions modelOptionsInstance = new ModelOptions()
    .ModelOptionsType(ModelOptionsType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
