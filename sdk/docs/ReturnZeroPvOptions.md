# com.finbourne.lusid.model.ReturnZeroPvOptions
Options to indicate which errors to ignore when performing valuation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentMatured** | **Boolean** | Indicates whether attempting to value an instrument after its maturity date should produce a failure (false)  or a zero PV (true). | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ReturnZeroPvOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean InstrumentMatured = true;


ReturnZeroPvOptions returnZeroPvOptionsInstance = new ReturnZeroPvOptions()
    .InstrumentMatured(InstrumentMatured);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
