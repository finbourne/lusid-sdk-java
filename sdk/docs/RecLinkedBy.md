# com.finbourne.lusid.model.RecLinkedBy
The item pairings a link between two rec results was established on, per side.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**List&lt;RecResultLinkKey&gt;**](RecResultLinkKey.md) | The pairings between the two results&#39; left-side items, one entry per pairing. May be empty. | [default to List<RecResultLinkKey>]
**right** | [**List&lt;RecResultLinkKey&gt;**](RecResultLinkKey.md) | The pairings between the two results&#39; right-side items, one entry per pairing. May be empty. | [default to List<RecResultLinkKey>]

```java
import com.finbourne.lusid.model.RecLinkedBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<RecResultLinkKey> Left = new List<RecResultLinkKey>();
List<RecResultLinkKey> Right = new List<RecResultLinkKey>();


RecLinkedBy recLinkedByInstance = new RecLinkedBy()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
