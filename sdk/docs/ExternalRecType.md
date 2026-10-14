# com.finbourne.lusid.model.ExternalRecType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name for this external reconciliation describing source data. | [default to String]
**temporality** | **String** | How the reconciliation reads its data: PointInTime (the latest state as at the instance&#39;s effectiveAt, the default) or Activity (everything effective across the instance&#39;s activity window). Available values: PointInTime, Activity. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ExternalRecType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable String Temporality = "example Temporality";


ExternalRecType externalRecTypeInstance = new ExternalRecType()
    .Name(Name)
    .Temporality(Temporality);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
