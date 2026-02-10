# com.finbourne.lusid.model.SettlementConfigurationMethodOverride

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | Property Key to override the settlement method. Allowed values: &#39;Automatic&#39;, &#39;Instructed&#39; and &#39;Default&#39;, property key must be in the &#39;Transaction&#39; domain. For a derived property keys, the derivation formula should resolve one of the of the allowed values. &#39;Default&#39; will be treated the same as no or an invalid derived value, will fall back to use the regular settlement method. | [default to String]

```java
import com.finbourne.lusid.model.SettlementConfigurationMethodOverride;
import java.util.*;
import java.lang.System;
import java.net.URI;

String PropertyKey = "example PropertyKey";


SettlementConfigurationMethodOverride settlementConfigurationMethodOverrideInstance = new SettlementConfigurationMethodOverride()
    .PropertyKey(PropertyKey);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
