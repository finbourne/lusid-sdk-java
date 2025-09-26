# com.finbourne.lusid.model.CreateAmortisationRuleSetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreateAmortisationRuleSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


CreateAmortisationRuleSetRequest createAmortisationRuleSetRequestInstance = new CreateAmortisationRuleSetRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
