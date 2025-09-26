# com.finbourne.lusid.model.VersionSummaryDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** |  | [optional] [default to String]
**buildVersion** | **String** |  | [optional] [default to String]
**excelVersion** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.VersionSummaryDto;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ApiVersion = "example ApiVersion";
@jakarta.annotation.Nullable String BuildVersion = "example BuildVersion";
@jakarta.annotation.Nullable String ExcelVersion = "example ExcelVersion";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


VersionSummaryDto versionSummaryDtoInstance = new VersionSummaryDto()
    .ApiVersion(ApiVersion)
    .BuildVersion(BuildVersion)
    .ExcelVersion(ExcelVersion)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
