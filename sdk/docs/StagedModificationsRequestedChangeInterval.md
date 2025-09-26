# com.finbourne.lusid.model.StagedModificationsRequestedChangeInterval

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | Name of the property the change applies to. | [optional] [default to String]
**effectiveRange** | [**StagedModificationEffectiveRange**](StagedModificationEffectiveRange.md) |  | [optional] [default to StagedModificationEffectiveRange]
**previousValue** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**newValue** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**asAtBasis** | **String** | Whether the change represents the modification when the request was made or the modification as it would be at the latest time. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.StagedModificationsRequestedChangeInterval;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String AttributeName = "example AttributeName";
StagedModificationEffectiveRange EffectiveRange = new StagedModificationEffectiveRange();
PropertyValue PreviousValue = new PropertyValue();
PropertyValue NewValue = new PropertyValue();
@jakarta.annotation.Nullable String AsAtBasis = "example AsAtBasis";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


StagedModificationsRequestedChangeInterval stagedModificationsRequestedChangeIntervalInstance = new StagedModificationsRequestedChangeInterval()
    .AttributeName(AttributeName)
    .EffectiveRange(EffectiveRange)
    .PreviousValue(PreviousValue)
    .NewValue(NewValue)
    .AsAtBasis(AsAtBasis)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
