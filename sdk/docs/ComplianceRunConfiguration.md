# com.finbourne.lusid.model.ComplianceRunConfiguration
Specification object for the configuration parameters of a compliance run

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preTradeConfiguration** | [**PreTradeConfiguration**](PreTradeConfiguration.md) |  | [default to PreTradeConfiguration]

```java
import com.finbourne.lusid.model.ComplianceRunConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

PreTradeConfiguration PreTradeConfiguration = new PreTradeConfiguration();


ComplianceRunConfiguration complianceRunConfigurationInstance = new ComplianceRunConfiguration()
    .PreTradeConfiguration(PreTradeConfiguration);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
