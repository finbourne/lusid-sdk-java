# com.finbourne.lusid.model.PostingModuleRequest
A Posting Module request definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Posting Module. | [default to String]
**displayName** | **String** | The name of the Posting Module. | [default to String]
**description** | **String** | A description for the Posting Module. | [optional] [default to String]
**rules** | [**List&lt;PostingModuleRule&gt;**](PostingModuleRule.md) | The Posting Rules that apply for the Posting Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<PostingModuleRule>]

```java
import com.finbourne.lusid.model.PostingModuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<PostingModuleRule> Rules = new List<PostingModuleRule>();


PostingModuleRequest postingModuleRequestInstance = new PostingModuleRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
