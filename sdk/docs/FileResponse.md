# com.finbourne.lusid.model.FileResponse
Allows a file (represented as a stream) to be returned from an Api call

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileStream** | [**File**](File.md) |  | [optional] [default to File]
**contentType** | **String** |  | [optional] [default to String]
**downloadedFilename** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.FileResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable File @jakarta.annotation.Nullable String ContentType = "example ContentType";
@jakarta.annotation.Nullable String DownloadedFilename = "example DownloadedFilename";


FileResponse fileResponseInstance = new FileResponse()
    .FileStream(FileStream)
    .ContentType(ContentType)
    .DownloadedFilename(DownloadedFilename);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
