# com.finbourne.lusid.model.UpsertResourceRecordRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentScope** | **String** |  | [default to String]
**deploymentCode** | **String** |  | [default to String]
**resourceId** | **String** |  | [default to String]
**format** | **String** |  | [default to String]
**resourceType** | **String** |  | [default to String]
**resourceState** | **Object** |  | [default to Object]
**dependencies** | **List&lt;String&gt;** |  | [default to List<String>]
**trackingState** | **Object** |  | [optional] [default to Object]

```java
import com.finbourne.lusid.model.UpsertResourceRecordRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DeploymentScope = "example DeploymentScope";
String DeploymentCode = "example DeploymentCode";
String ResourceId = "example ResourceId";
String Format = "example Format";
String ResourceType = "example ResourceType";
@jakarta.annotation.Nullable Object List<String> Dependencies = new List<String>();
@jakarta.annotation.Nullable Object 

UpsertResourceRecordRequest upsertResourceRecordRequestInstance = new UpsertResourceRecordRequest()
    .DeploymentScope(DeploymentScope)
    .DeploymentCode(DeploymentCode)
    .ResourceId(ResourceId)
    .Format(Format)
    .ResourceType(ResourceType)
    .ResourceState(ResourceState)
    .Dependencies(Dependencies)
    .TrackingState(TrackingState);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
