# com.finbourne.lusid.model.PostingModuleDetails
A posting Module request definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Posting Module. | [default to String]
**description** | **String** | A description for the Posting Module. | [optional] [default to String]
**status** | **String** | The Posting Module status. Can be Active or Inactive. Defaults to Active. | [default to String]

```java
import com.finbourne.lusid.model.PostingModuleDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";


PostingModuleDetails postingModuleDetailsInstance = new PostingModuleDetails()
    .DisplayName(DisplayName)
    .Description(Description)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
