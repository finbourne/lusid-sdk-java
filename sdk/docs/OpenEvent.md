# com.finbourne.lusid.model.OpenEvent
The opening of an instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchorDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on the which the instrument was opened. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.OpenEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AnchorDate = OffsetDateTime.now();


OpenEvent openEventInstance = new OpenEvent()
    .AnchorDate(AnchorDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
