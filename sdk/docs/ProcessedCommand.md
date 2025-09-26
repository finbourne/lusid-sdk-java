# com.finbourne.lusid.model.ProcessedCommand
The list of commands.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the command issued. | [default to String]
**path** | **String** | The unique identifier for the command including the request id. | [optional] [default to String]
**userId** | [**User**](User.md) |  | [default to User]
**processedTime** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime that the events published by the processing of this command were committed to LUSID. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ProcessedCommand;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Description = "example Description";
@jakarta.annotation.Nullable String Path = "example Path";
User UserId = new User();
OffsetDateTime ProcessedTime = OffsetDateTime.now();


ProcessedCommand processedCommandInstance = new ProcessedCommand()
    .Description(Description)
    .Path(Path)
    .UserId(UserId)
    .ProcessedTime(ProcessedTime);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
