# com.finbourne.lusid.model.ResourceRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentScope** | **String** | The scope of the deployment this record is part of. | [default to String]
**deploymentCode** | **String** | The code of the deployment this record is part of. | [default to String]
**resourceId** | **String** | The unique identifier of the resource associated with this record. | [default to String]
**format** | **String** | A semver format identifier for the resource record. | [default to String]
**resourceType** | **String** | The type of resource associated with this record. | [default to String]
**resourceState** | **Object** | The state of the resource associated with this record. | [default to Object]
**dependencies** | **List&lt;String&gt;** | A collection of resource identifiers that this resource depends on. | [default to List<String>]
**trackingState** | **Object** | The tracking state of the resource record. | [optional] [default to Object]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the resource record at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ResourceRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DeploymentScope = "example DeploymentScope";
String DeploymentCode = "example DeploymentCode";
String ResourceId = "example ResourceId";
String Format = "example Format";
String ResourceType = "example ResourceType";
@jakarta.annotation.Nullable Object List<String> Dependencies = new List<String>();
@jakarta.annotation.Nullable Object Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ResourceRecord resourceRecordInstance = new ResourceRecord()
    .DeploymentScope(DeploymentScope)
    .DeploymentCode(DeploymentCode)
    .ResourceId(ResourceId)
    .Format(Format)
    .ResourceType(ResourceType)
    .ResourceState(ResourceState)
    .Dependencies(Dependencies)
    .TrackingState(TrackingState)
    .Version(Version)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
