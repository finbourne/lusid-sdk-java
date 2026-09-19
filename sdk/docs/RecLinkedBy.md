# com.finbourne.lusid.model.RecLinkedBy
The item keys a link between two rec results was established on, per side.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**List&lt;RecLinkKey&gt;**](RecLinkKey.md) | The keys shared by the two results&#39; left-side items. May be empty. | [default to List<RecLinkKey>]
**right** | [**List&lt;RecLinkKey&gt;**](RecLinkKey.md) | The keys shared by the two results&#39; right-side items. May be empty. | [default to List<RecLinkKey>]

```java
import com.finbourne.lusid.model.RecLinkedBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<RecLinkKey> Left = new List<RecLinkKey>();
List<RecLinkKey> Right = new List<RecLinkKey>();


RecLinkedBy recLinkedByInstance = new RecLinkedBy()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
