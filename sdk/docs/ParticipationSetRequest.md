# com.finbourne.lusid.model.ParticipationSetRequest
A request to create or update multiple Participations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;ParticipationRequest&gt;**](ParticipationRequest.md) | A collection of ParticipationRequests. | [optional] [default to List<ParticipationRequest>]

```java
import com.finbourne.lusid.model.ParticipationSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ParticipationRequest> Requests = new List<ParticipationRequest>();


ParticipationSetRequest participationSetRequestInstance = new ParticipationSetRequest()
    .Requests(Requests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
