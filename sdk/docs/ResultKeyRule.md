# com.finbourne.lusid.model.ResultKeyRule
Base class for representing result key rules in LUSID, which describe how to resolve (unit) result data.  This base class should not be directly instantiated; each supported ResultKeyRuleType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultKeyRuleType** | **String** | The available values are: Invalid, ResultDataKeyRule, PortfolioResultDataKeyRule | [default to String]

```java
import com.finbourne.lusid.model.ResultKeyRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ResultKeyRuleType = "example ResultKeyRuleType";


ResultKeyRule resultKeyRuleInstance = new ResultKeyRule()
    .ResultKeyRuleType(ResultKeyRuleType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
