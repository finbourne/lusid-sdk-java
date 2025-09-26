# com.finbourne.lusid.model.CreateCutLabelDefinitionRequest
This request specifies a new Cut Label Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]
**cutLocalTime** | [**CutLocalTime**](CutLocalTime.md) |  | [default to CutLocalTime]
**timeZone** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.CreateCutLabelDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
CutLocalTime CutLocalTime = new CutLocalTime();
String TimeZone = "example TimeZone";


CreateCutLabelDefinitionRequest createCutLabelDefinitionRequestInstance = new CreateCutLabelDefinitionRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .CutLocalTime(CutLocalTime)
    .TimeZone(TimeZone);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
