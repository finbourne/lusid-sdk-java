# com.finbourne.lusid.model.AssetLeg
The underlying instrument representing one side of the TRS and its pay-receive direction.     Note that TRS currently only supports an asset of Bond or ComplexBond, no other instruments are allowed.  Support for additional instrument types will be added in the future.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]
**payReceive** | **String** | Either Pay or Receive stating direction of the asset in the swap.    Supported string (enumeration) values are: [Pay, Receive]. | [default to String]

```java
import com.finbourne.lusid.model.AssetLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

LusidInstrument Asset = new LusidInstrument();
String PayReceive = "example PayReceive";


AssetLeg assetLegInstance = new AssetLeg()
    .Asset(Asset)
    .PayReceive(PayReceive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
