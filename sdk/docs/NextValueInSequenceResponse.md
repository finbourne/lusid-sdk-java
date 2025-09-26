# com.finbourne.lusid.model.NextValueInSequenceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **List&lt;String&gt;** | The next set of values for the specified Sequence. | [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.NextValueInSequenceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> Values = new List<String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


NextValueInSequenceResponse nextValueInSequenceResponseInstance = new NextValueInSequenceResponse()
    .Values(Values)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
