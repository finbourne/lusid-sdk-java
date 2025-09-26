# com.finbourne.lusid.model.StagingRuleMatchCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionIn** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**requestingUser** | **String** |  | [optional] [default to String]
**entityAttributes** | **String** |  | [optional] [default to String]
**changedAttributeNameIn** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.StagingRuleMatchCriteria;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> ActionIn = new List<String>();
@jakarta.annotation.Nullable String RequestingUser = "example RequestingUser";
@jakarta.annotation.Nullable String EntityAttributes = "example EntityAttributes";
@jakarta.annotation.Nullable List<String> ChangedAttributeNameIn = new List<String>();


StagingRuleMatchCriteria stagingRuleMatchCriteriaInstance = new StagingRuleMatchCriteria()
    .ActionIn(ActionIn)
    .RequestingUser(RequestingUser)
    .EntityAttributes(EntityAttributes)
    .ChangedAttributeNameIn(ChangedAttributeNameIn);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
