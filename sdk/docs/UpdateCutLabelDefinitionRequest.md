# com.finbourne.lusid.model.UpdateCutLabelDefinitionRequest
This request specifies a new Cut Label Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]
**cutLocalTime** | [**CutLocalTime**](CutLocalTime.md) |  | [default to CutLocalTime]
**timeZone** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.UpdateCutLabelDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
CutLocalTime CutLocalTime = new CutLocalTime();
String TimeZone = "example TimeZone";


UpdateCutLabelDefinitionRequest updateCutLabelDefinitionRequestInstance = new UpdateCutLabelDefinitionRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .CutLocalTime(CutLocalTime)
    .TimeZone(TimeZone);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
