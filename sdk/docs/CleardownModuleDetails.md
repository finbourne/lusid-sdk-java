# com.finbourne.lusid.model.CleardownModuleDetails
A Cleardown Module request definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Cleardown Module. | [default to String]
**description** | **String** | A description for the Cleardown Module. | [optional] [default to String]
**status** | **String** | The Cleardown Module status. Can be Active or Inactive. Defaults to Active. | [default to String]

```java
import com.finbourne.lusid.model.CleardownModuleDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";


CleardownModuleDetails cleardownModuleDetailsInstance = new CleardownModuleDetails()
    .DisplayName(DisplayName)
    .Description(Description)
    .Status(Status);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
