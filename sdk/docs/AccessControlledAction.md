# com.finbourne.lusid.model.AccessControlledAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  | [default to String]
**action** | [**ActionId**](ActionId.md) |  | [default to ActionId]
**limitedSet** | [**List&lt;IdSelectorDefinition&gt;**](IdSelectorDefinition.md) |  | [optional] [default to List<IdSelectorDefinition>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AccessControlledAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Description = "example Description";
ActionId Action = new ActionId();
@jakarta.annotation.Nullable List<IdSelectorDefinition> LimitedSet = new List<IdSelectorDefinition>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AccessControlledAction accessControlledActionInstance = new AccessControlledAction()
    .Description(Description)
    .Action(Action)
    .LimitedSet(LimitedSet)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
