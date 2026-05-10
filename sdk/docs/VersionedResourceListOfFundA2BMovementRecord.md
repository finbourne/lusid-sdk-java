# com.finbourne.lusid.model.VersionedResourceListOfFundA2BMovementRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;FundA2BMovementRecord&gt;**](FundA2BMovementRecord.md) |  | [default to List<FundA2BMovementRecord>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.VersionedResourceListOfFundA2BMovementRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
List<FundA2BMovementRecord> Values = new List<FundA2BMovementRecord>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


VersionedResourceListOfFundA2BMovementRecord versionedResourceListOfFundA2BMovementRecordInstance = new VersionedResourceListOfFundA2BMovementRecord()
    .Version(Version)
    .Values(Values)
    .Href(Href)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
